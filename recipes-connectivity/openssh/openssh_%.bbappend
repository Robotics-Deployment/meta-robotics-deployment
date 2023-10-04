FILESEXTRAPATHS:prepend := "${THISDIR}/conf:"
SRC_URI += "file://sshd_config"

do_install:append() {
    install -m 0644 ${WORKDIR}/sshd_config ${D}${sysconfdir}/ssh/sshd_config
}
