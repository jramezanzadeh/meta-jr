require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "jr (yocto based embedded linux)"

IMAGE_FEATURES += "splash package-management ssh-server-openssh hwcodecs"

#Include psplsh defined in meta-jr layer
SPLASH = "psplash-jrlogo"

# Add QT to the image
IMAGE_INSTALL:append = " packagegroup-qt6-modules"
IMAGE_INSTALL:append = " qtcharts-examples"

IMAGE_INSTALL:append = " glibc-utils"
IMAGE_INSTALL:append = " fontconfig fontconfig-utils ttf-dejavu-common ttf-dejavu-sans"

IMAGE_LINGUAS = "en-us"

#QemuBoot memory
QB_MEM = "-m 512"

#TODO: do we need to set?
#IMAGE_ROOTFS_SIZE
#IMAGE_ROOTFS_EXTRA_SPACE