package cc;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swag {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement user = driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        String cartCount = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).getText();
        
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
        String product = "Sauce Labs Backpack";
        
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Harini");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Perananthan");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("9787");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        System.out.println("PRODUCT NAME: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
        System.out.println("PRODUCT PRICE: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
        
    } 
}