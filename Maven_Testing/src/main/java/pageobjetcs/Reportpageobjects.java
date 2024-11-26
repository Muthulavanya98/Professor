package pageobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Reportpageobjects {
    public WebDriver driver;

    public Reportpageobjects(WebDriver newdriver){
        driver = newdriver;
        PageFactory.initElements(newdriver, this);
    }

    public WebElement email(){
        WebElement email = driver.findElement(By.id("email"));
        return email;
    }
    public void enteremail(){
        email().sendKeys("qatester@glintinc.com");
    }
    public WebElement continuebtn(){
        WebElement btn = driver.findElement(By.xpath("//button[@class='btnCta glintButton']"));
        return btn;
    }
    public void clickcontinuebtn(){
        continuebtn().click();
    }
    public WebElement clientbtn(){
        WebElement btn = driver.findElement(By.id("clientUuid"));
        return btn;
    }
    public void enterclientbtn(){
        clientbtn().sendKeys("qa20230121");
    }
    public WebElement password(){
        WebElement btn = driver.findElement(By.id("password"));
        return btn;
    }
    public void enterpassword(){
        password().sendKeys("Dem0@pass2");
    }
    public WebElement reportheading(){
        WebElement btn = driver.findElement(By.linkText("Reports"));
        return btn;
    }
    public void clickreportheading(){
        reportheading().click();
    }
    public WebElement report(){
        WebElement btn = driver.findElement(By.xpath("//span[text()='Engagement test']"));
        return btn;
    }
    public void clickreport(){
        report().click();
    }
    public WebElement responserate(){
        WebElement btn = driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]"));
        return btn;
    }
    public void clickresponserate(){
        responserate().click();
    }

}
