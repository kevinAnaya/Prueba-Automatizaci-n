package com.co.utest.questions;

import com.co.utest.tasks.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationMassage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FinalPage.TXT_WELCOME_MESSAGE).viewedBy(actor).asString();
    }

    public static ValidationMassage compare(){
        return new ValidationMassage();
    }
}
