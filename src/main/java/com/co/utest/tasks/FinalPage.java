package com.co.utest.tasks;

import net.serenitybdd.screenplay.targets.Target;

public class FinalPage {

    public static final Target TXT_WELCOME_MESSAGE = Target.the("save the welccome message")
            .locatedBy("//h1");

}
