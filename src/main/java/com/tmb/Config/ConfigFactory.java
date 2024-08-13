package com.tmb.Config;

public final  class ConfigFactory {   //No one can extend this class

    private ConfigFactory(){}   //No one can create the object for this class


    public static FrameworkConfig getconfig(){

        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}
