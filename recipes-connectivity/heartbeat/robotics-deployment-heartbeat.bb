DESCRIPTION = "Robotics Deployment Embedded Heartbeat"
FILESEXTRAPATHS:prepend := "${THISDIR}/conf:"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/Robotics-Deployment/embedded.git;protocol=https;branch=main"
SRC_URI += "file://robotics-deployment-heartbeat.service"

SRCREV = "5ff10342f9b8b873ac1b9c42c30901cc6f8da55e"
S = "${WORKDIR}/git/rdembedded"

inherit cargo
inherit systemd

SRC_URI[addr2line-0.21.0.sha256sum] = "8a30b2e23b9e17a9f90641c7ab1549cd9b44f296d3ccbf309d2863cfe398a0cb"
SRC_URI[adler-1.0.2.sha256sum] = "f26201604c87b1e01bd3d98f8d5d9a8fcbb815e8cedb41ffccbeb4bf593a35fe"
SRC_URI[anyhow-1.0.75.sha256sum] = "a4668cab20f66d8d020e1fbc0ebe47217433c1b6c8f2040faf858554e394ace6"
SRC_URI[atomic-0.5.3.sha256sum] = "c59bdb34bc650a32731b31bd8f0829cc15d24a708ee31559e0bb34f2bc320cba"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[backtrace-0.3.69.sha256sum] = "2089b7e3f35b9dd2d0ed921ead4f6d318c27680d4a5bd167b3ee120edb105837"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bitflags-2.4.0.sha256sum] = "b4682ae6287fcf752ecaabbfcc7b6f9b72aa33933dc23a554d853aea8eea8635"
SRC_URI[bytes-1.5.0.sha256sum] = "a2bd12c1caf447e69cd4528f47f94d203fd2582878ecb9e9465484c4148a8223"
SRC_URI[cc-1.0.83.sha256sum] = "f1174fb0b6ec23863f8b971027804a42614e347eafb0a95bf0b12cdae21fc4d0"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[equivalent-1.0.1.sha256sum] = "5443807d6dff69373d433ab9ef5378ad8df50ca6298caf15de6e52e24aaf54d5"
SRC_URI[getrandom-0.2.10.sha256sum] = "be4136b2a15dd319360be1c07d9933517ccf0be8f16bf62a3bee4f0d618df427"
SRC_URI[gimli-0.28.0.sha256sum] = "6fb8d784f27acf97159b40fc4db5ecd8aa23b9ad5ef69cdd136d3bc80665f0c0"
SRC_URI[hashbrown-0.14.1.sha256sum] = "7dfda62a12f55daeae5015f81b0baea145391cb4520f86c248fc615d72640d12"
SRC_URI[hermit-abi-0.3.3.sha256sum] = "d77f7ec81a6d05a3abb01ab6eb7590f6083d08449fe5a1c8b1e620283546ccb7"
SRC_URI[indexmap-2.0.2.sha256sum] = "8adf3ddd720272c6ea8bf59463c04e0f93d0bbf7c5439b691bca2987e0270897"
SRC_URI[itoa-1.0.9.sha256sum] = "af150ab688ff2122fcef229be89cb50dd66af9e01a4ff320cc137eecc9bacc38"
SRC_URI[libc-0.2.149.sha256sum] = "a08173bc88b7955d1b3145aa561539096c421ac8debde8cbc3612ec635fee29b"
SRC_URI[lock_api-0.4.10.sha256sum] = "c1cc9717a20b1bb222f333e6a92fd32f7d8a18ddc5a3191a11af45dcbf4dcd16"
SRC_URI[memchr-2.6.4.sha256sum] = "f665ee40bc4a3c5590afb1e9677db74a508659dfd71e126420da8274909a0167"
SRC_URI[miniz_oxide-0.7.1.sha256sum] = "e7810e0be55b428ada41041c41f32c9f1a42817901b4ccf45fa3d4b6561e74c7"
SRC_URI[mio-0.8.8.sha256sum] = "927a765cd3fc26206e66b296465fa9d3e5ab003e651c1b3c060e7956d96b19d2"
SRC_URI[nix-0.27.1.sha256sum] = "2eb04e9c688eff1c89d72b407f168cf79bb9e867a9d3323ed6c01519eb9cc053"
SRC_URI[num_cpus-1.16.0.sha256sum] = "4161fcb6d602d4d2081af7c3a45852d875a03dd337a6bfdd6e06407b61342a43"
SRC_URI[object-0.32.1.sha256sum] = "9cf5f9dd3933bd50a9e1f149ec995f39ae2c496d31fd772c1fd45ebc27e902b0"
SRC_URI[parking_lot-0.12.1.sha256sum] = "3742b2c103b9f06bc9fff0a37ff4912935851bee6d36f3c02bcc755bcfec228f"
SRC_URI[parking_lot_core-0.9.8.sha256sum] = "93f00c865fe7cabf650081affecd3871070f26767e7b2070a3ffae14c654b447"
SRC_URI[pin-project-lite-0.2.13.sha256sum] = "8afb450f006bf6385ca15ef45d71d2288452bc3683ce2e2cacc0d18e4be60b58"
SRC_URI[proc-macro2-1.0.69.sha256sum] = "134c189feb4956b20f6f547d2cf727d4c0fe06722b20a0eec87ed445a97f92da"
SRC_URI[quote-1.0.33.sha256sum] = "5267fca4496028628a95160fc423a33e8b2e6af8a5302579e322e4b520293cae"
SRC_URI[redox_syscall-0.3.5.sha256sum] = "567664f262709473930a4bf9e51bf2ebf3348f2e748ccc50dea20646858f8f29"
SRC_URI[rustc-demangle-0.1.23.sha256sum] = "d626bb9dae77e28219937af045c257c28bfd3f69333c512553507f5f9798cb76"
SRC_URI[ryu-1.0.15.sha256sum] = "1ad4cc8da4ef723ed60bced201181d83791ad433213d8c24efffda1eec85d741"
SRC_URI[scopeguard-1.2.0.sha256sum] = "94143f37725109f92c262ed2cf5e59bce7498c01bcc1502d7b9afe439a4e9f49"
SRC_URI[serde-1.0.188.sha256sum] = "cf9e0fcba69a370eed61bcf2b728575f726b50b55cba78064753d708ddc7549e"
SRC_URI[serde_derive-1.0.188.sha256sum] = "4eca7ac642d82aa35b60049a6eccb4be6be75e599bd2e9adb5f875a737654af2"
SRC_URI[serde_yaml-0.9.25.sha256sum] = "1a49e178e4452f45cb61d0cd8cebc1b0fafd3e41929e996cef79aa3aca91f574"
SRC_URI[signal-hook-registry-1.4.1.sha256sum] = "d8229b473baa5980ac72ef434c4415e70c4b5e71b423043adb4ba059f89c99a1"
SRC_URI[smallvec-1.11.1.sha256sum] = "942b4a808e05215192e39f4ab80813e599068285906cc91aa64f923db842bd5a"
SRC_URI[socket2-0.5.4.sha256sum] = "4031e820eb552adee9295814c0ced9e5cf38ddf1e8b7d566d6de8e2538ea989e"
SRC_URI[syn-2.0.38.sha256sum] = "e96b79aaa137db8f61e26363a0c9b47d8b4ec75da28b7d1d614c2303e232408b"
SRC_URI[tokio-macros-2.1.0.sha256sum] = "630bdcf245f78637c13ec01ffae6187cca34625e8c63150d424b59e55af2675e"
SRC_URI[tokio-1.33.0.sha256sum] = "4f38200e3ef7995e5ef13baec2f432a6da0aa9ac495b2c0e8f3b7eec2c92d653"
SRC_URI[unicode-ident-1.0.12.sha256sum] = "3354b9ac3fae1ff6755cb6db53683adb661634f67557942dea4facebec0fee4b"
SRC_URI[unsafe-libyaml-0.2.9.sha256sum] = "f28467d3e1d3c6586d8f25fa243f544f5800fec42d97032474e17222c2b75cfa"
SRC_URI[uuid-1.4.1.sha256sum] = "79daa5ed5740825c40b389c5e50312b9c86df53fccd33f281df655642b43869d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-targets-0.48.5.sha256sum] = "9a2fa6e2155d7247be68c096456083145c183cbbbc2764150dda45a87197940c"
SRC_URI[windows_aarch64_gnullvm-0.48.5.sha256sum] = "2b38e32f0abccf9987a4e3079dfb67dcd799fb61361e53e2882c3cbaf0d905d8"
SRC_URI[windows_aarch64_msvc-0.48.5.sha256sum] = "dc35310971f3b2dbbf3f0690a219f40e2d9afcf64f9ab7cc1be722937c26b4bc"
SRC_URI[windows_i686_gnu-0.48.5.sha256sum] = "a75915e7def60c94dcef72200b9a8e58e5091744960da64ec734a6c6e9b3743e"
SRC_URI[windows_i686_msvc-0.48.5.sha256sum] = "8f55c233f70c4b27f66c523580f78f1004e8b5a8b659e05a4eb49d4166cca406"
SRC_URI[windows_x86_64_gnu-0.48.5.sha256sum] = "53d40abd2583d23e4718fddf1ebec84dbff8381c07cae67ff7768bbf19c6718e"
SRC_URI[windows_x86_64_gnullvm-0.48.5.sha256sum] = "0b7b52767868a23d5bab768e390dc5f5c55825b6d30b86c844ff2dc7414044cc"
SRC_URI[windows_x86_64_msvc-0.48.5.sha256sum] = "ed94fce61571a4006852b7389a063ab983c02eb1bb37b47f8272ce92d06d9538"

SRC_URI += " \
    crate://crates.io/addr2line/0.21.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/anyhow/1.0.75 \
    crate://crates.io/atomic/0.5.3 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.69 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.4.0 \
    crate://crates.io/bytes/1.5.0 \
    crate://crates.io/cc/1.0.83 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/getrandom/0.2.10 \
    crate://crates.io/gimli/0.28.0 \
    crate://crates.io/hashbrown/0.14.1 \
    crate://crates.io/hermit-abi/0.3.3 \
    crate://crates.io/indexmap/2.0.2 \
    crate://crates.io/itoa/1.0.9 \
    crate://crates.io/libc/0.2.149 \
    crate://crates.io/lock_api/0.4.10 \
    crate://crates.io/memchr/2.6.4 \
    crate://crates.io/miniz_oxide/0.7.1 \
    crate://crates.io/mio/0.8.8 \
    crate://crates.io/nix/0.27.1 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/object/0.32.1 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.8 \
    crate://crates.io/pin-project-lite/0.2.13 \
    crate://crates.io/proc-macro2/1.0.69 \
    crate://crates.io/quote/1.0.33 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/ryu/1.0.15 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/serde/1.0.188 \
    crate://crates.io/serde_derive/1.0.188 \
    crate://crates.io/serde_yaml/0.9.25 \
    crate://crates.io/signal-hook-registry/1.4.1 \
    crate://crates.io/smallvec/1.11.1 \
    crate://crates.io/socket2/0.5.4 \
    crate://crates.io/syn/2.0.38 \
    crate://crates.io/tokio-macros/2.1.0 \
    crate://crates.io/tokio/1.33.0 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/unsafe-libyaml/0.2.9 \
    crate://crates.io/uuid/1.4.1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
"

RDEPENDS_${PN} += " \
    openssl \
"

SYSTEMD_PACKAGES += "${PN}"
SYSTEMD_SERVICE:${PN} = "robotics-deployment-heartbeat.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"

do_install:append() {
    install -d ${D}${sysconfdir}/robotics-deployment-heartbeat
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/robotics-deployment-heartbeat.service ${D}${systemd_unitdir}/system/
}