import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;

public class FooClass {
    public Browser getBrowser() {
        return Playwright.create().chromium().launch();
    }
}
