package co.com.devco.googlesuite.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GoogleSearchStepDefinitions {

	@Before
	public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
	}

}
