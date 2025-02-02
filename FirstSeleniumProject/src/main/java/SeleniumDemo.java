import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SeleniumDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        findLoginPageElement(driver);
        driver.quit();
    }

    private static void findExceptionPageElements(WebDriver driver) {
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        // Find elements for Selenium WebDriver link
        WebElement beginnerProgramLink = driver.findElement(By.linkText("Selenium WebDriver with Java for beginners program"));
        WebElement beginnerProgramPartialLink = driver.findElement(By.partialLinkText("Selenium WebDriver"));

        // Find WebElement for input fields using tag, class name and xpath, css
        WebElement inputByTag = driver.findElement(By.tagName("input"));
        WebElement inputByClassName = driver.findElement(By.className("input-field"));
        WebElement inputByXpath = driver.findElement(By.xpath("//input[@class='input-field']"));
        WebElement inputByCss = driver.findElement(By.cssSelector("input.input-field"));        // OR ("input[class='input-field']"))

        // Create a list of WebElements for all buttons using tag
        List<WebElement> allButtons = driver.findElements(By.tagName("input"));

        //Identify both buttons using id, css, xpath , name
        WebElement editButton = driver.findElement(By.id("edit_btn"));
        WebElement editButtonCss = driver.findElement(By.cssSelector("button[id='edit_btn']"));
        WebElement editButtonXpath = driver.findElement(By.xpath("//button[@id='edit_btn']"));

        WebElement saveButton = driver.findElement(By.id("add_btn"));
        WebElement saveButtonCss = driver.findElement(By.cssSelector("button[id='add_btn']"));
        WebElement saveButtonXpath = driver.findElement(By.xpath("//button[@id='add_btn']"));

    }


    private static void findLoginPageElement(WebDriver driver) {

        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement userInputName= driver.findElement(By.id("username"));
        userInputName.sendKeys("anyname");
//        WebElement userInputNameXpath = driver.findElement(By.xpath("//input[@name='username']"));
//        WebElement userInputNameCss = driver.findElement(By.cssSelector("input[name='username']"));

        WebElement passwordInputFiled = driver.findElement(By.id("password"));
        passwordInputFiled.sendKeys("anypassword");
//        WebElement passwordInputFiledXpath = driver.findElement(By.xpath("//input[@name='password']"));
//        WebElement passwordInputFiledCss = driver.findElement(By.cssSelector("input[name='password']"));

        WebElement signInButton = driver.findElement(By.className("btn"));
        signInButton.isEnabled();
        signInButton.click();
//        WebElement signInButtonXpath = driver.findElement(By.xpath("//button[@id='submit']"));
//        WebElement signInButtonCss = driver.findElement(By.cssSelector("button[id='submit']"));

//        List<WebElement> inputFields = driver.findElements(By.tagName("input"));
//
//        WebElement linkTextLocator = driver.findElement(By.linkText("Practice Test Automation."));
//        WebElement linkPartialTextLocator = driver.findElement(By.partialLinkText("Practice Test"));
//
//        WebElement passwordFieldBelowUsername = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("username")));
//        WebElement privacyPolicyLink = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.partialLinkText("Practice Test")));
    }

    private static String chromeTest(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }

    private static String fireFoxTest(String url) {
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }
}
