import StepObject.HomePageSteps;
import Utils.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.HomPageData.*;
public class HomePageTest extends ChromeRunner {
    @Test
    public void searchforitem() {
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps.searchForItem(item);
        Assert.assertTrue(homePageSteps.searchButton.isDisplayed());
    }
}