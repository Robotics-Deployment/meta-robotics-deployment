DESCRIPTION = "Robotics Deployment Embedded Heartbeat"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

inherit python3native
DEPENDS = "python3-requests-native"

SRC_URI = ""
SRC_URI[sha256sum] = ""
SRC_URI[md5sum] = ""

COMPATIBLE_HOST = "(aarch64|x86_64).*-linux"

python() {
    import requests
    import json
    import hashlib

    def fetch_latest_github_release():
        url = "https://api.github.com/repos/Robotics-Deployment/embedded/releases/latest"
        response = requests.get(url)
        if response.status_code == 200:
            release_data = json.loads(response.text)
            for asset in release_data['assets']:
                if "rdembedded-" + d.getVar('TARGET_ARCH') in asset['browser_download_url']:
                    return asset['browser_download_url']
        return None

    def calculate_checksums(file_content):
        md5 = hashlib.md5()
        sha256 = hashlib.sha256()

        md5.update(file_content)
        sha256.update(file_content)

        return md5.hexdigest(), sha256.hexdigest()

    latest_url = fetch_latest_github_release()
    if latest_url:
        d.setVar('SRC_URI', latest_url)

        # Download the file to calculate checksums
        response = requests.get(latest_url)
        if response.status_code == 200:
            md5sum, sha256sum = calculate_checksums(response.content)
            d.setVar('SRC_URI[md5sum]', md5sum)
            d.setVar('SRC_URI[sha256sum]', sha256sum)
}

do_compile() {
    :
}

do_install() {
    # Install the executable to the target directory
    install -d ${D}${bindir}
    install -m 0755 rdembedded-${TARGET_ARCH} ${D}${bindir}/rdembedded
}