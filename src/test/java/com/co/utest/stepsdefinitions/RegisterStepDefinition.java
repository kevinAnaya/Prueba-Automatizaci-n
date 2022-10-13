package com.co.utest.stepsdefinitions;

import com.co.utest.questions.ValidationMassage;
import com.co.utest.tasks.CompleteForm;
import com.co.utest.tasks.CompleteForm2;
import com.co.utest.tasks.CompleteForm3;
import com.co.utest.tasks.CompleteForm4;
import com.co.utest.utils.Constans;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class RegisterStepDefinition {

    //utilizamos el chromedriver
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage((Cast.ofStandardActors()));
        OnStage.theActorCalled("Kevin");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^he user is in the web page$")
    public void heUserIsInTheWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com/"));
    }


    @When("^the user his register$")
    public void theUserHisRegister() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteForm.enterForm());
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteForm2.enterForm2());
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteForm3.enterForm3());
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteForm4.enterForm4());
    }

    @Then("^the user could see a successful register message$")
    public void theUserCouldSeeASuccessfulRegisterMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationMassage.compare()
        , Matchers.is(Constans.TXT_WOLCOME)
        ));
    }

}
