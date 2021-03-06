SUMMARY = "GNOME terminal emulator"
HOMEPAGE = "https://wiki.gnome.org/Apps/Terminal"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"

DEPENDS = "intltool-native dconf gconf glib-2.0 util-linux gsettings-desktop-schemas glib-2.0-native vte libpcre gtk+3 vala-native libxml2-native desktop-file-utils-native yelp-tools-native paxctl-native"

do_install_append() {
    install -m 644 ${WORKDIR}/citadel.desktop ${D}${datadir}/applications
    paxctl -cm ${D}${libexecdir}/gnome-terminal-server
}

FILES_${PN} += "\
    ${libdir}/systemd/user \
    ${datadir}/help/sv/gnome-terminal \
    ${datadir}/dbus-1/services \
    ${datadir}/glib-2.0/schemas \
    ${datadir}/metainfo \
"

FILES_${PN}-doc += "\
    ${datadir}/help \
"

# python3native is needed to run itstool during build
inherit gettext gnome python3native
SRC_URI += "file://citadel.desktop"

EXTRA_OECONF = "--disable-search-provider --without-nautilus-extension --disable-gterminal"

