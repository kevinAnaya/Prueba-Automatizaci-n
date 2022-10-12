package com.co.utest.tasks;

import com.co.utest.userinterfaces.RegisterPage3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class CompleteForm3 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage3.SELECT_LANGUAGE),
                (Enter.theValue("Spanish").into(RegisterPage3.TXT_LANGUAGE).thenHit(Keys.ENTER)),
                (Click.on(RegisterPage3.SELECT_MOVILE_DEVICE)),
                (Enter.theValue("Samsung").into(RegisterPage3.TXT_MOVILE_DEVICE).thenHit(Keys.ENTER)),
                (Click.on(RegisterPage3.SELECT_MODEL)),
                (Enter.theValue("Galaxy").into(RegisterPage3.TXT_MODEL).thenHit(Keys.ENTER)),
                (Click.on(RegisterPage3.SELECT_OS_MOVILE)),
                (Enter.theValue("Android 2.0").into(RegisterPage3.TXT_OS).thenHit(Keys.ENTER)),
                (Click.on(RegisterPage3.BTN_NEXT))
        );
    }

    public static CompleteForm3 enterForm3(){

        return Tasks.instrumented(CompleteForm3.class);
    }
}
