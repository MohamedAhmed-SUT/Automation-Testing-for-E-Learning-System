import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserCreationTests  {

    public static void test1_SuccessfulUserCreation() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8012/e_learning-main/public/user");
        driver.findElement(By.id("email")).sendKeys("jun695228@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button.btn.bu")).click();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/button")).click();
        driver.findElement(By.id("name")).sendKeys("user_test");  
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("password")).sendKeys("password_test"); 
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/form/div[2]/button")).click();
        System.out.println("User Creation test 1 passed: " + driver.getCurrentUrl());
        // driver.quit();
    }

    public static void test2_InvalidEmailFormat() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8012/e_learning-main/public/user");
        driver.findElement(By.id("email")).sendKeys("jun695228@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button.btn.bu")).click();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/button")).click();
        driver.findElement(By.id("name")).sendKeys("user_test2");  
        driver.findElement(By.id("email")).sendKeys("test_gmail.com");
        driver.findElement(By.id("password")).sendKeys("password_test"); 
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/form/div[2]/button")).click();
        System.out.println("User Creation test 2 passed: " + driver.getCurrentUrl());
        // driver.quit();

    }

    public static void test3_EmailAlreadyExists() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8012/e_learning-main/public/user");
        driver.findElement(By.id("email")).sendKeys("jun695228@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button.btn.bu")).click();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/button")).click();
        driver.findElement(By.id("name")).sendKeys("user_test");
        driver.findElement(By.id("email")).sendKeys("user1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/form/div[2]/button")).click();
        System.out.println("User Creation test 3 passed: " + driver.getCurrentUrl());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        driver.quit();
    }
}