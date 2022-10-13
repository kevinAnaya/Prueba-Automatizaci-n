package com.co.utest.tasks;


import com.co.utest.userinterfaces.InitialPage;
import com.co.utest.userinterfaces.RegisterPage1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class CompleteForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(InitialPage.BTN_JOIN_TODAY),
                (Enter.theValue("kevin").into(RegisterPage1.TXT_FIRST_NAME)),
                (Enter.theValue("Anaya").into(RegisterPage1.TXT_LAST_NAME)),
                (Enter.theValue("kevi@correo.com").into(RegisterPage1.TXT_EMAIL)),
                (Click.on(RegisterPage1.TABLE_BIRTHDAY_DATE)),
                (SelectFromOptions.byValue("number:1").from(RegisterPage1.TABLE_BIRTHDAY_DATE)),
                (Click.on(RegisterPage1.SELECT_BIRTHDAY_DAY)),
                (SelectFromOptions.byValue("number:28").from(RegisterPage1.SELECT_BIRTHDAY_DAY)),
                (Click.on(RegisterPage1.SELECT_BIRTHDAY_YEAR)),
                (SelectFromOptions.byValue("number:1997").from(RegisterPage1.SELECT_BIRTHDAY_YEAR)),
                (Click.on(RegisterPage1.LIST_LANGUAGE)),
                (Enter.theValue("Spanish").into(RegisterPage1.TXT_LANGUAGES).thenHit(Keys.ENTER)),
                (Click.on(RegisterPage1.BTN_NEXT))
        );
    }

    public static CompleteForm enterForm(){
        return Tasks.instrumented(CompleteForm.class);
    }
}
