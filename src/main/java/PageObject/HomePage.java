package PageObject;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
public class HomePage {
    public static SelenideElement searchBox = $("#twotabsearchtextbox");
    public SelenideElement searchButton = $("#nav-search-submit-button");
}