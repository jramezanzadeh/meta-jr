FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " file://run-main-app.sh"

do_install:append(){
    #Add main application to init scripts
    install -m 0755    ${WORKDIR}/run-main-app.sh		${D}${sysconfdir}/init.d
    update-rc.d -r ${D} run-main-app.sh start 99 5 .
    # Remove banner.sh from init scripts
    rm ${D}${sysconfdir}/init.d/banner.sh
    update-rc.d -r ${D} banner.sh remove
} 