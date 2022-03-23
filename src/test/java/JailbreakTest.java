import com.microsoft.playwright.Browser;
import manifold.ext.rt.api.Jailbreak;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JailbreakTest {

    @Test
    public void test() {
        // the first time this runs it takes a few minutes
        // because the browsers/drivers are downloaded.
        // after that it will be quick.
        Browser browser = new FooClass().getBrowser();

        String name = ((com.microsoft.playwright.impl.@Jailbreak BrowserImpl) browser).name();
        Assertions.assertEquals("chromium", name);
    }
}
