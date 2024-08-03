package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Fitpeo
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://fitpeo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Revenue Calculator")).click();
        Thread.sleep(2000);
        WebElement slider=driver.findElement(By.xpath("//div[@class='MuiBox-root css-79elbk']"));
        Point p=slider.getLocation();
        int x=p.getX();
        int y=p.getY();
        System.out.println(x);
        System.out.println(y);
        JavascriptExecutor jse= driver;
        jse.executeScript("window.scrollBy("+x+","+y+")");
        Thread.sleep(3000);
        WebElement redslider=driver.findElement(By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-sy3s50']"));
        Actions a=new Actions(driver);
        a.dragAndDropBy(redslider, 95,0).perform();
        Thread.sleep(2000);
        
        WebElement text=driver.findElement(By.xpath("//input[@id=':r0:']"));
       Thread.sleep(2000);
       Actions a1=new Actions(driver);
        a1.dragAndDropBy(redslider, -40,0).perform();
     // Thread.sleep(2000);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     // WebElement checkbox=driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3' and @type='checkbox' ])[1]"));
     // WebElement checkbox=driver.findElement(By.xpath("(//div[@class='MuiBox-root css-7ztaza'])[1]"));
      WebElement checkbox=driver.findElement(By.xpath("(//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-1s3unkt'])[1]"));
      Point p1=checkbox.getLocation();
      int x1=p1.getX();
      int y1=p1.getY();
      System.out.println(x1);
      System.out.println(y1);
      JavascriptExecutor jse1= driver;
      jse1.executeScript("window.scrollBy("+x1+","+y1+")");
      Thread.sleep(2000);
      //WebElement checkbox51=driver.findElement(By.xpath("//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium Mui-checked MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-qb7d53']"));
      WebElement checkbox36=driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[5]"));
      checkbox36.click();
      WebElement checkbox14=driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[6]"));
      checkbox14.click();
      
      WebElement checkbox15=driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[8]"));
      
      checkbox15.click();
        WebElement reccuring_reimbursement=driver.findElement(By.xpath("(//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-regular css-1lnu3ao']/p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'])[4]"));
       Assert.assertEquals(8445, reccuring_reimbursement); 
        
       // driver.close();
	}

}