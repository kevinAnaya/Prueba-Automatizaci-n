package com.co.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InitialPage {

    public static final Target BTN_JOIN_TODAY = Target.the("save btn to register")
            .locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
}
