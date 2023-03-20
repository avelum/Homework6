package StepObject;
import PageObject.HomePage;
public class HomePageSteps extends HomePage {
    public HomePageSteps searchForItem(String item) {
        searchBox.setValue(item);
        searchButton.click();
        return this;
    }
}
