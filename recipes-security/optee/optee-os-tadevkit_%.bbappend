FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRCREV = "2a5b1d1232f582056184367fb58a425ac7478ec6"

PV = "4.0.0+git${SRCPV}"

OPTEEMACHINE = "sam"

DEPENDS:append = " dtc-native"

COMPATIBLE_MACHINE = "(sama5d27-som1-ek-optee-sd)"
