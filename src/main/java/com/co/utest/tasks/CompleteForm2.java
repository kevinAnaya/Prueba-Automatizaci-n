package com.co.utest.tasks;

import com.co.utest.userinterfaces.RegisterPage2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class CompleteForm2 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                (Click.on(RegisterPage2.BTN_NEXT))
        );
    }

    public static CompleteForm2 enterForm2(){

        return Tasks.instrumented(CompleteForm2.class);
    }
}
