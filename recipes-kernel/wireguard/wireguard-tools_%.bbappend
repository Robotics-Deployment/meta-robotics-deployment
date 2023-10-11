FILESEXTRAPATHS:prepend := "${THISDIR}/conf:"
SRC_URI += "file://wireguard.service"

inherit systemd

SYSTEMD_PACKAGES += "${PN}"
SYSTEMD_SERVICE:${PN} = "wireguard.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"

do_install:append() {
    install -d ${D}${sysconfdir}/wireguard
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/wireguard.service ${D}${systemd_unitdir}/system/
}