package com.co.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField;

public class RegisterPage1 {

    public static final Target TXT_FIRST_NAME = Target.the("save the first name")
            .locatedBy("//input[@id='firstName']");

    public static final Target TXT_LAST_NAME = Target.the("save the last name")
            .locatedBy("//input[@id='lastName']");

    public static final Target TXT_EMAIL = Target.the("save the email")
            .locatedBy("//input[@name='email']");

    public static final Target TABLE_BIRTHDAY_DATE = Target.the("save table of birthday ")
            .locatedBy("//select[@id='birthMonth']");

    public static final Target SELECT_BIRTHDAY_DAY = Target.the("save the select day")
            .locatedBy("//select[@id='birthDay']");

    public static final Target SELECT_BIRTHDAY_YEAR = Target.the("save the select year")
            .locatedBy("//select[@id='birthYear']");

    public static final Target LIST_LANGUAGE = Target.the("save the list languaje")
            .locatedBy("//div[@id='languages']");

    public static final Target TXT_LANGUAGES = Target.the("save the language name")
            .locatedBy("//input[@type='search']");

    public static final Target BTN_NEXT = Target.the("save the btn next")
            .locatedBy("//a[@class='btn btn-blue']");

}
