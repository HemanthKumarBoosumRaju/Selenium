package part1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FirstSeleniumTest {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        // open url https://www.youtube.com/
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        // check title
        String webpageTitle=driver.getTitle();

        //if(webpageTitle.equals("YouTube")) System.out.println("Web page Title Test Passed");
        //else System.out.println("Web page Title Test not Passed");

        //name attribute
        //driver.findElement(By.name("search")).sendKeys("Mac");

        //search something via name att and to click enter
        //driver.findElement(By.name("search")).sendKeys("Mac"+ Keys.ENTER);

        //id attribute
        //boolean logoDisplaystatus = driver.findElement(By.id("logo")).isDisplayed();
        //System.out.println(logoDisplaystatus);

        //linktext & partialLinkText
        //driver.findElement(By.linkText("Tablets")).click();
        //driver.findElement(By.partialLinkText("Table")).click();

        //className
        //List< WebElement> listsOfHeaderElement=driver.findElements(By.className("list-inline"));
        //System.out.println("the no of header elements is "+listsOfHeaderElement.size());
        //if(listsOfHeaderElement.size()==5) System.out.println("Test passed there are 4 elements in header");
        //else System.out.println("Test not passed");

        //tagName
        // finding all hyperlinks by tag "a" in <a>
        //List<WebElement> listOfHyperlinks=driver.findElements(By.tagName("a"));
        //int noOfHyperlinks= listOfHyperlinks.size();
        //System.out.println(noOfHyperlinks);



    }
}
