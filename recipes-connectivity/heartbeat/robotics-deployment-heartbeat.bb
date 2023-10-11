DESCRIPTION = "Robotics Deployment Embedded Heartbeat"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "curl-native"

SRC_URI = ""
SRC_URI[sha256sum] = ""
SRC_URI[md5sum] = ""

COMPATIBLE_HOST = "(aarch64|x86_64).*-linux"

# Skip checksums and fetch latest binary.
#TODO: update to static fetch and yocto-based compile once we have a stable release
do_fetch() {
    latest_url=$(/usr/bin/curl -s "https://api.github.com/repos/Robotics-Deployment/embedded/releases/latest" \
                 | grep '"browser_download_url":' \
                 | sed -E 's/.*"browser_download_url": "([^"]+)".*/\1/' \
                 | grep "rdembedded-${TARGET_ARCH}")
    license_url=$(/usr/bin/curl -s "https://api.github.com/repos/Robotics-Deployment/embedded/releases/latest" \
                 | grep '"browser_download_url":' \
                 | sed -E 's/.*"browser_download_url": "([^"]+)".*/\1/' \
                 | grep "LICENSE")
    wget -O ${WORKDIR}/rdembedded-${TARGET_ARCH} ${latest_url}
    wget -O ${WORKDIR}/LICENSE ${license_url}
}

do_compile() {
    :
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/rdembedded-${TARGET_ARCH} ${D}${bindir}/rdembedded
}