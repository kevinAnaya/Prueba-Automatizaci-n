package com.co.utest.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage4 {

    public static final Target TXT_PASSWORD = Target.the("save password")
            .locatedBy("//input[@id='password']");

    public static final Target TXT_PASSWORD_CONFIRM = Target.the("save password confirm")
            .locatedBy("//input[@id='confirmPassword']");

    public static final Target BTN_CHECKBOX_1 = Target.the("save checkbox 1")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label");

    public static final Target BTN_CHECKBOX_2 = Target.the("save checkbox 2")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]");

    public static final Target BTN_CHECKBOX_3 = Target.the("save checkbox 3")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]");

    public static final Target BTN_COMPLETE = Target.the("save btn complete")
            .locatedBy("//*[@id=\"laddaBtn\"]");
}
