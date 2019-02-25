package Test.steps.serenity;

import Test.pages.GoogleTranslatePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class EndUserSteps {
    GoogleTranslatePage googleTranslatePage;

    @Step
    public void openGoogleTranslatePage() {
        googleTranslatePage.open();
    }

    @Step
    public void switchTranslationLang() {
        googleTranslatePage.switchTranslationLang();
    }

    @Step
    public void enterTextForTranslation(String text) {
        googleTranslatePage.enterTextForTranslation(text);
    }

    @Step
    public void should_see_translation(String translation) {
        assertThat(googleTranslatePage.getTargetText(), is(equalTo(translation)));
    }

    @Step
    public void check_source_char_count(String charCount) {
        assertThat(googleTranslatePage.getSourceText().length(), is(equalTo(Integer.parseInt(charCount))));
    }

    @Step
    public void should_see_source_definition(String definition) {
        assertThat(googleTranslatePage.getDefinitions(), hasItem(containsString(definition)));
    }
}