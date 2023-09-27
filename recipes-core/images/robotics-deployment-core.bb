# robotics-deployment-core.bb

require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Robotics Deployment core packages to be installed for all target platforms"
LICENSE = "MIT"

IMAGE_INSTALL:append = " chrony openssh docker-ce docker-compose"
