This README file contains information on the contents of the meta-robotics-deployment layer.

Use of this layer requires the following layers:


```bitbake
#### _conf/bblayers.conf_

# POKY_BBLAYERS_CONF_VERSION is increased each time build/conf/bblayers.conf
# changes incompatibly
POKY_BBLAYERS_CONF_VERSION = "2"

BBPATH = "${TOPDIR}"
BBFILES ?= ""

BBLAYERS ?= " \
  ${TOPDIR}/../meta \
  ${TOPDIR}/../meta-poky \
  ${TOPDIR}/../meta-yocto-bsp \
  ${TOPDIR}/../sources/meta-raspberrypi \
  ${TOPDIR}/../sources/meta-openembedded/meta-oe \
  ${TOPDIR}/../sources/meta-openembedded/meta-filesystems \
  ${TOPDIR}/../sources/meta-openembedded/meta-python \
  ${TOPDIR}/../sources/meta-openembedded/meta-networking \
  ${TOPDIR}/../sources/meta-virtualization \
  ${TOPDIR}/../sources/meta-robotics-deployment \
  "
```

```bitbake
#### _conf/local.conf_

MACHINE ??= "qemux86-64"
# MACHINE ??= "raspberrypi4-64"
DISTRO ?= "robotics-deployment"
EXTRA_IMAGE_FEATURES ?= "debug-tweaks"
USER_CLASSES ?= "buildstats"
PATCHRESOLVE = "noop"
BB_DISKMON_DIRS ??= "\
    STOPTASKS,${TMPDIR},1G,100K \
    STOPTASKS,${DL_DIR},1G,100K \
    STOPTASKS,${SSTATE_DIR},1G,100K \
    STOPTASKS,/tmp,100M,100K \
    HALT,${TMPDIR},100M,1K \
    HALT,${DL_DIR},100M,1K \
    HALT,${SSTATE_DIR},100M,1K \
    HALT,/tmp,10M,1K"
PACKAGECONFIG:append:pn-qemu-system-native = " sdl"
CONF_VERSION = "2"
```

---

### Function

This layer provides a robotics-deployment distro for the Yocto Project. It adds a minimal layer of packages to make the device
manageable through a cloud interface.

```yaml
packages:
  podman:
  podman-compose:
  openssh:
  wireguard:
```

---

### Goal

A minimal footprint in packages, cpu and memory usage, while providing a secure and manageable device capable or running any containerized workload.

---

### Support

Please submit any patches against the meta-robotics-deployment layer to the mailing list (deniz@roboticsdeployment.com)
and cc: the maintainer:

Maintainer: Deniz Hofmeister: deniz@roboticsdeployment.com
