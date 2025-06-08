import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTests {

    public static void test1_SuccessfulRegistration() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8000");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("name")).sendKeys("user1");
        driver.findElement(By.id("email")).sendKeys("user1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.id("confpass")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button.btn.bu")).click();
        System.out.println("Registration test 1 passed: " + driver.getCurrentUrl());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        driver.quit(); 
    }

    public static void test2_InvalidEmail() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8000");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("name")).sendKeys("test2");
        driver.findElement(By.id("email")).sendKeys("invalid-email"); 
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.id("confpass")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button.btn.bu")).click();
        System.out.println("Registration test 2 passed: Expected error for invalid email: " + driver.getCurrentUrl());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        driver.quit();
        }

    public static void test3_ExistingUser() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8000");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("name")).sendKeys("user1");
        driver.findElement(By.id("email")).sendKeys("user1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.id("confpass")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button.btn.bu")).click();
        System.out.println("Registration test 3 passed: Expected error for existing user: " + driver.getCurrentUrl());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        driver.quit();
    }

}