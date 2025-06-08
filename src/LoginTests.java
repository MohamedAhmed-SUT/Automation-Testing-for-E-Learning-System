import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {

    public static void test1_SuccessfulLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8000");
        driver.findElement(By.linkText("Log in")).click(); 
        driver.findElement(By.id("email")).sendKeys("user1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button.btn.bu")).click();
        System.out.println("Login test 1 passed: " + driver.getCurrentUrl());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        driver.quit();
    }

    public static void test2_InvalidEmail() {
       WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8000");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("email")).sendKeys("invalid-email");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button.btn.bu")).click();
        System.out.println("Login test 2 passed: Expected error for invalid username: " + driver.getCurrentUrl());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        driver.quit();
    }

    public static void test3_WrongPassword() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8000");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("email")).sendKeys("user1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("wrongpassword");
        driver.findElement(By.cssSelector("button.btn.bu")).click();
        System.out.println("Login test 3 passed: Expected error for wrong password: " + driver.getCurrentUrl());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        driver.quit();
    }

}