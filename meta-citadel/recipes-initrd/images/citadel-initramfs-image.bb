DESCRIPTION = "Image for rootfs"

NO_RECOMMENDATIONS = "1"

PACKAGE_INSTALL = "\
    citadel-initramfs \
    base-passwd \
    busybox \
    kbd \
    keymaps \
    systemd-initrd \
    linux-firmware-i915 \
    kernel-module-arc4 \
    kernel-module-ansi-cprng \
    kernel-module-apple-bl \
    kernel-module-apple-gmux \
    kernel-module-applesmc \
    kernel-module-appletouch \
    kernel-module-bcm5974 \
    kernel-module-ccm \
    kernel-module-cmac \
    kernel-module-crc32-pclmul \
    kernel-module-crc32c-intel \
    kernel-module-crct10dif-pclmul \
    kernel-module-ecdh-generic \
    kernel-module-ehci-platform \
    kernel-module-ghash-clmulni-intel \
    kernel-module-hid-a4tech \
    kernel-module-hid-apple \
    kernel-module-hid-alps \
    kernel-module-hid-asus \
    kernel-module-hid-aureal \
    kernel-module-hid-belkin \
    kernel-module-hid-cherry \
    kernel-module-hid-cmedia \
    kernel-module-hid-corsair \
    kernel-module-hid-elecom \
    kernel-module-hid-elo \
    kernel-module-hid-ezkey \
    kernel-module-hid-gt683r \
    kernel-module-hid-keytouch \
    kernel-module-hid-kye \
    kernel-module-hid-led \
    kernel-module-hid-lenovo \
    kernel-module-hid-logitech \
    kernel-module-hid-logitech-dj \
    kernel-module-hid-logitech-hidpp \
    kernel-module-hid-microsoft \
    kernel-module-hid-monterey \
    kernel-module-hid-multitouch \
    kernel-module-hid-ortek \
    kernel-module-hid-penmount \
    kernel-module-hid-plantronics \
    kernel-module-hid-primax \
    kernel-module-hid-rmi \
    kernel-module-hid-roccat \
    kernel-module-hid-roccat-arvo \
    kernel-module-hid-roccat-common \
    kernel-module-hid-roccat-isku \
    kernel-module-hid-roccat-kone \
    kernel-module-hid-roccat-koneplus \
    kernel-module-hid-roccat-konepure \
    kernel-module-hid-roccat-kovaplus \
    kernel-module-hid-roccat-lua \
    kernel-module-hid-roccat-pyra \
    kernel-module-hid-roccat-ryos \
    kernel-module-hid-roccat-savu \
    kernel-module-hid-saitek \
    kernel-module-hid-sensor-hub \
    kernel-module-hid-speedlink \
    kernel-module-hid-uclogic \
    kernel-module-i2c-hid \
    kernel-module-intel-hid \
    kernel-module-intel-ish-ipc \
    kernel-module-intel-ishtp \
    kernel-module-intel-ishtp-hid \
    kernel-module-intel-rng \
    kernel-module-msi-wmi \
    kernel-module-mxm-wmi \
    kernel-module-radeon \
    kernel-module-radeonfb \
    kernel-module-rmi-core \
    kernel-module-seed \
    kernel-module-serio-raw \
    kernel-module-snd \
    kernel-module-soundcore \
    kernel-module-wmi \
    kernel-module-xhci-plat-hcd \
    liberation-fonts \
    plymouth \
"

SYSTEMD_DEFAULT_TARGET = "initrd.target"
#IMAGE_FEATURES = ""
#IMAGE_FEATURES_append = " empty-root-password"
export IMAGE_BASENAME = "citadel-initramfs-image"
IMAGE_LINGUAS = ""

LICENSE = "MIT"

INITRAMFS_MAXSIZE = "512000"

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
inherit core-image

IMAGE_ROOTFS_SIZE = "8192"
IMAGE_ROOTFS_EXTRA_SPACE = "0"
