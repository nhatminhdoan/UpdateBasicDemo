package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.SetUpDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUpDriver {
  //private static SetUpDriver setupDriver;
    
    private static WebDriver driver;
    public final static int TIMEOUT = 10;
       
     public SetUpDriver() {
        driver = setUpDriver();
     }      
               
    public static void openPage(String url) {
        driver.get(url);
    }
           
    public static WebDriver getDriver() {
        return driver;              
    }
       
    public static WebDriver setUpDriver() {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
        return driver;
    }
       
    public static void tearDown() {
            
        if(driver!=null) {
             driver.close();
             driver.quit();
        }
            
      // setupDriver = null;
   } 
}
