SUMMARY = "Microchip WILC devices firmware files for use with Linux kernel"
SECTION = "kernel"
LICENSE = "MICROCHIP_FW"

LIC_FILES_CHKSUM = "file://LICENSE.wilc_fw;beginline=6;md5=e1a0446d046c966a27276cf8e728f687"

SRCREV = "ab40db5d41f4c9cd9b74a922d7f781bb07f0610b"
SRC_URI = "git://github.com/linux4wilc/firmware.git;protocol=https;branch=master"
S = "${WORKDIR}/git"

inherit allarch

do_install() {
	install -d ${D}${nonarch_base_libdir}/firmware/mchp/
	cp -r ${S}/* ${D}${nonarch_base_libdir}/firmware/mchp/

	# remove unneeded file
	rm -f ${D}${nonarch_base_libdir}/firmware/mchp/README.md
	rm -f ${D}${nonarch_base_libdir}/firmware/mchp/LICENSE.wilc_fw
	chmod -x ${D}${nonarch_base_libdir}/firmware/mchp/*
}

FILES:${PN} += " \
	${nonarch_base_libdir}/firmware/mchp/wilc*.bin \
	"

# TODO: use ALTERNATIVE like in "linux-firmware" package
