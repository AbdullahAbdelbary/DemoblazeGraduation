package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected String baseUrl = "https://www.demoblaze.com/#"; // 🔥 Website URL here

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(baseUrl); // ✅ Open website before tests
    }

    @AfterClass
    public void tearDown() {
        driver.quit(); // ✅ Close browser after tests
    }
}