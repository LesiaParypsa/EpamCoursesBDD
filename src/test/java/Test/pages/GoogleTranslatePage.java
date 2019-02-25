package Test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://translate.google.com/")
public class GoogleTranslatePage extends PageObject {

    @FindBy(xpath = "//div[@class=\"sl-sugg\"]//div[@id=\"sugg-item-en\"]")
    private WebElementFacade sourceLang;

    @FindBy(xpath = "//div[@class=\"tl-sugg\"]//div[@id=\"sugg-item-uk\"]")
    private WebElementFacade targetLang;

    @FindBy(xpath = "//*[@id=\"source\"]")
    private WebElementFacade sourceInput;

    @FindBy(xpath = "//span[@class=\"gt-card-ttl-txt\"]")
    private WebElementFacade sourceText;

    @FindBy(xpath = "//span[@class=\"tlid-translation translation\"]")
    private WebElementFacade targetText;

    public void switchTranslationLang() {
        sourceLang.click();
        targetLang.click();
    }

    public void enterTextForTranslation(String text) {
        sourceInput.typeAndEnter(text);
    }

    public String getSourceText() {
        return sourceText.getText();
    }

    public String getTargetText() {
        return targetText.getText();
    }

    public List<String> getDefinitions() {
        return  findAll(By.xpath("//div[@class=\"gt-def-row\"]")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
}