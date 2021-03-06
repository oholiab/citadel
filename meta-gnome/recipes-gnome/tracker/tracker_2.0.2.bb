SUMMARY = "Desktop search engine and metadata storage system"
HOMEPAGE = "https://wiki.gnome.org/Projects/Tracker"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=506ab4920510c723c01689e212f41404 \
                    file://COPYING.GPL;md5=ee31012bf90e7b8c108c69f197f3e3a4 \
                    file://COPYING.LGPL;md5=2d5025d4aa3495befef8f17206a5b0a1 \
                    file://src/libtracker-miner/COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
                    file://src/libtracker-common/COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
                    file://src/libtracker-data/COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
                    file://docs/reference/COPYING;md5=f51a5100c17af6bae00735cd791e1fcc"

SRC_URI = "http://ftp.gnome.org/pub/gnome/sources/tracker/2.0/tracker-${PV}.tar.xz \
           file://0001-assume-sqlite-built-threadsafe-and-with-fts5.patch \
           "
SRC_URI[md5sum] = "25d8c102a2cdc63e434a2bbbdf9f7d3d"
SRC_URI[sha256sum] = "ece71a56c29151a76fc1b6e43c15dd1b657b37162dc948fa2487faf5ddb47fda"

DEPENDS = "intltool-native libunistring sqlite3 dbus upower networkmanager bash-completion glib-2.0-native libsoup-2.4 libxml2 json-glib"


FILES_${PN} += "\
    ${libdir}/systemd/user/tracker-store.service \
    ${libdir}/tracker-2.0 \
    ${datadir}/glib-2.0/schemas \
    ${datadir}/bash-completion/completions \
    ${datadir}/dbus-1/services \
"

FILES_${PN}-dev += "\
    ${datadir}/vala/vapi \
"
FILES_${PN}-staticdev += "\
    ${libdir}/tracker-2.0/libtracker-data.a \
    ${libdir}/tracker-2.0/libtracker-common.a \
"
INSANE_SKIP_${PN} += "dev-so"

inherit gettext pkgconfig pythonnative autotools 

EXTRA_OECONF = "--enable-minimal --disable-introspection"

