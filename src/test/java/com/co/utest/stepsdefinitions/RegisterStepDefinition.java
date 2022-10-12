package com.co.utest.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
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

    }

    @Then("^the user could see a successful register message$")
    public void theUserCouldSeeASuccessfulRegisterMessage() {

    }

}
