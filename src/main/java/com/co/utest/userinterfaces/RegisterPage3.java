package com.co.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage3 {

    public static final Target SELECT_LANGUAGE = Target.the("save the language of pc")
            .locatedBy("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span");

    public static final Target TXT_LANGUAGE = Target.the("save txt language")
            .locatedBy("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]");

    public static final Target SELECT_MOVILE_DEVICE = Target.the("save name movile device")
            .locatedBy("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span");

    public static final Target TXT_MOVILE_DEVICE = Target.the("save txt movile device")
            .locatedBy("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]");

    public static final Target SELECT_MODEL = Target.the("save the device model")
            .locatedBy("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]");

    public static final Target TXT_MODEL = Target.the("save txt model")
            .locatedBy("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]");

    public static final Target SELECT_OS_MOVILE = Target.the("save the os")
            .locatedBy("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span");

    public static final Target TXT_OS = Target.the("save txt os")
            .locatedBy("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]");

    public static final Target BTN_NEXT = Target.the("save btn next")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a");
}
