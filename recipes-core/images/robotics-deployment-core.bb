# robotics-deployment-core.bb

require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Robotics Deployment core packages to be installed for all target platforms"
LICENSE = "MIT"

IMAGE_INSTALL:append = " wireguard-tools chrony openssh nano podman podman-compose podman-tui"
