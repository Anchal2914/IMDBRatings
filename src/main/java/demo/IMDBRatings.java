package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class IMDBRatings {
    ChromeDriver driver;
    public IMDBRatings()
    {
        System.out.println("Constructor: IMDBRatings");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        driver.close();
        driver.quit();
    }

    
    public  void ratings() throws InterruptedException{
        System.out.println("Start Test case: IMDBRatings");

        // Navigate to URL  https://www.imdb.com/chart/top
        driver.get("https://www.imdb.com/chart/top");

        // Locate sort by dropdown Using Locator "ID" id="lister-sort-by-options"
        WebElement sortByDropdown = driver.findElement(By.id("lister-sort-by-options"));

        // click sort by dropdown Using Locator "ID" id="lister-sort-by-options".click()
        sortByDropdown.click();
        Thread.sleep(2000);

        // locate IMDB rating option from dropdown Using Locator "XPath" //*[@id="lister-sort-by-options"]/option[2]
        WebElement ImdbratingOption = driver.findElement(By.xpath("//*[@id='lister-sort-by-options']/option[2]"));

        // click IMDB rating option from dropdown Using Locator "XPath" //*[@id="lister-sort-by-options"]/option[2].click()
        ImdbratingOption.click();
        Thread.sleep(2000);

        // Locate 1st movie Using Locator "XPath" //*[@id="main"]/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/a
        WebElement highRatedMovie = driver.findElement(By.xpath("//*[@id='main']/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/a"));
        
        // get text "1st movie" Using Locator "XPath" //*[@id="main"]/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/a.getText()
        System.out.println("Highest rated movie name is: " + highRatedMovie.getText());

        // locate total movies in the list Using Locator "XPath" //*[@id="main"]/div/span/div[1]/div/div[3]/div/div/div[2]/span
        WebElement totalMoviesCount = driver.findElement(By.xpath("//*[@id='main']/div/span/div[1]/div/div[3]/div/div/div[2]/span"));

        // get count of total movies Using Locator "XPath" //*[@id="main"]/div/span/div[1]/div/div[3]/div/div/div[2]/span.getText()
        System.out.println("Total movies included in the table are: " + totalMoviesCount.getText());

        // click sort by dropdown Using Locator "ID" id="lister-sort-by-options".click()
        sortByDropdown.click();
        Thread.sleep(2000);

        // locate Release Date option from dropdown Using Locator "XPath" //*[@id="lister-sort-by-options"]/option[3]
        WebElement releaseDateOption = driver.findElement(By.xpath("//*[@id='lister-sort-by-options']/option[3]"));
        
        // clcik Release Date option from dropdown Using Locator "XPath" //*[@id="lister-sort-by-options"]/option[3].click()
        releaseDateOption.click();
        Thread.sleep(2000);

        // locate last movie  Using Locator "XPath" //*[@id="main"]/div/span/div[1]/div/div[3]/table/tbody/tr[250]/td[2]/a
        WebElement oldestMovieName = driver.findElement(By.xpath("//*[@id='main']/div/span/div[1]/div/div[3]/table/tbody/tr[250]/td[2]/a"));
        
        // get text "last movie" Using Locator "XPath" //*[@id="main"]/div/span/div[1]/div/div[3]/table/tbody/tr[250]/td[2]/a.getText()
        System.out.println("Oldest movie name is: " + oldestMovieName.getText());

        // Locate 1st movie Using Locator "XPath" //*[@id="main"]/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/a
        WebElement recentMovieName = driver.findElement(By.xpath("//*[@id='main']/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/a"));
        
        // get text "1st movie" Using Locator "XPath" //*[@id="main"]/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/a.getText()
        System.out.println("Latest movie name is: " + recentMovieName.getText());

        // click sort by dropdown Using Locator "ID" id="lister-sort-by-options".click()
        sortByDropdown.click();
        Thread.sleep(2000);

        // locate No of ratings option from dropdown Using Locator "XPath" //*[@id="lister-sort-by-options"]/option[4]
        WebElement noOfRatingOption = driver.findElement(By.xpath("//*[@id='lister-sort-by-options']/option[4]"));
        
        // click No of ratings option from dropdown Using Locator "XPath" //*[@id="lister-sort-by-options"]/option[4].click()
        noOfRatingOption.click();
        Thread.sleep(2000);

        // Locate 1st movie Using Locator "XPath" //*[@id="main"]/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/a
        WebElement mostRatingMovieName = driver.findElement(By.xpath("//*[@id='main']/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/a"));
        
        // get text "1st movie" Using Locator "XPath" //*[@id="main"]/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/a.getText()
        System.out.println("Movie has the most user ratings is: " + mostRatingMovieName.getText());
        
        System.out.println("end Test case: IMDBRatings");
    }


}
