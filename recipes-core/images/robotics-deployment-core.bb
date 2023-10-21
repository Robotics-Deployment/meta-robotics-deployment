# robotics-deployment-core.bb

require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Robotics Deployment core packages to be installed for all target platforms"
LICENSE = "MIT"

IMAGE_INSTALL:append = " iproute2 iptables bash zfs cri-o bridge-utils wireguard-tools chrony openssh nano python3-json python3-dotenv python3-logging podman podman-compose podman-tui"
IMAGE_INSTALL:append:aarch64 = " kernel-module-bridge"

IMAGE_INSTALL:append = " robotics-deployment-heartbeat"