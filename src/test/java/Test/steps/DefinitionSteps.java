package Test.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import Test.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the google translate page")
    public void openedGoogleTranslatePage() {
        endUser.openGoogleTranslatePage();
    }

    @Given("selected languages from 'английский' to 'украинский'")
    public void switchTranslationLang() {
        endUser.switchTranslationLang();
    }

    @When("the user looks up the translation of the word '$definition'")
    public void enterTextForTranslation(String definition) {
        endUser.enterTextForTranslation(definition);
    }

    @Then("they should see the translation '$translation'")
    public void should_see_translation(String translation) {
        endUser.should_see_translation(translation);
    }

    @Then("number of characters must be '$charCount'")
    public void check_source_char_count(String charCount) {
        endUser.check_source_char_count(charCount);
    }

    @Then("they should see the definition '$definition'")
    public void should_see_source_definition(String definition) {
        endUser.should_see_source_definition(definition);
    }
}
