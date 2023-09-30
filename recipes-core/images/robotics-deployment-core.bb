# robotics-deployment-core.bb

require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Robotics Deployment core packages to be installed for all target platforms"
LICENSE = "MIT"
IMAGE_ROOTFS_EXTRA_SPACE = "10485760"
IMAGE_INSTALL:append = " wireguard-tools chrony openssh nano python3-json python3-dotenv python3-logging podman podman-compose"
