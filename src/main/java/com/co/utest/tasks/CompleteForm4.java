package com.co.utest.tasks;

import com.co.utest.interactions.Wait;
import com.co.utest.userinterfaces.RegisterPage4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteForm4 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("5UP3R53CR3TP455*#abc").into(RegisterPage4.TXT_PASSWORD),
                (Enter.theValue("5UP3R53CR3TP455*#abc").into(RegisterPage4.TXT_PASSWORD_CONFIRM)),
                (Click.on(RegisterPage4.BTN_CHECKBOX_1)),
                (Click.on(RegisterPage4.BTN_CHECKBOX_2)),
                (Click.on(RegisterPage4.BTN_CHECKBOX_3)),
                (Click.on(RegisterPage4.BTN_COMPLETE)),
                Wait.waitOn()
        );
    }

    public static CompleteForm4 enterForm4(){

        return Tasks.instrumented(CompleteForm4.class);
    }
}
