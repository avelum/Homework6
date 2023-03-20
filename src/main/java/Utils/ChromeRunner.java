package Utils;
import com.codeborne.selenide.Selenide;
import jdk.internal.misc.ThreadFlock;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;
public class ChromeRunner {
    @BeforeMethod
    public void setUp() {
        open("https://www.amazon.com/");
    }
    @AfterMethod
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}



