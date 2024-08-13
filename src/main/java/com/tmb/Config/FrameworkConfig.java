package com.tmb.Config;

import org.aeonbits.owner.Config;


@Config.Sources(value = "file:${user.dir}/src/test/resources/Properties/config.properties")
public interface FrameworkConfig extends Config {

    long timeout();
    String appurl();
    String browser();
    String runmode();
    String remoteurl();



}
