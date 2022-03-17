import com.microsoft.playwright.Playwright;
import manifold.ext.rt.api.Jailbreak;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JailbreakTest {

    @Test
    public void test() {
        // the first time this runs it takes a few minutes
        // because the browsers/drivers are downloaded.
        // after that it will be quick.
        var browser = Playwright.create().chromium().launch();

        // manifold jailbreak test
        // builds correctly but doesn't work in intellij
        com.microsoft.playwright.impl. @Jailbreak BrowserImpl br = null;

        // jailbreak casting

//        String name = ((com.microsoft.playwright.impl. @Jailbreak BrowserImpl)browser).name();
//        Assertions.assertEquals("chromium", name);
    }
}
