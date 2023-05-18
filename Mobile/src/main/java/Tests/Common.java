package Tests;

import Core.AppiumBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import static io.appium.java_client.touch.offset.PointOption.point;

public class Common extends AppiumBase {
    public void click(By by){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.click();
    }
    public void clear(By by){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.clear();
    }

    //Verify Element is Displayed
    public void isDisplayed(By by){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Assert.assertTrue(element.isDisplayed());
    }

    // senKeys to Element
    public void sendKeys(By by, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.sendKeys(value);
    }
    public void sendKey(By by, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.sendKeys(value, Keys.ENTER);
    }

    // switchTo_Window_byIndex
    public void switchTo_Window_byIndex(int index){
        ArrayList<String> window = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(window.get(index));
    }
    // convert String to Int
    public int convertStrToInt(String text){
        int number = Integer.parseInt(text);
        return number;
    }
    public void equals(By by, String value){
        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Assert.assertEquals(element.getText(),value);
    }
    public void getCookie(){
        Set<Cookie> listCookie= driver.manage().getCookies();
        System.out.println("This is cookie size: "+listCookie.size());

        for(Cookie cookie: listCookie){
            System.out.println("This is list cookie: "+cookie.getName());
        }
    }
    public void actions(By by){
        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Actions actions=new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    public void findAndDisplayElement(By by, int x) throws InterruptedException {
        for(int i=0; i<=10; i++){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            System.out.println(i);
            try {
                while (wait.until(ExpectedConditions.numberOfElementsToBe(by,0)).size()==0){
                    scrollDown(x);
                }
            }catch (TimeoutException timeoutException){
                wait.until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
                break;
            }

//            if(wait.until(ExpectedConditions.numberOfElementsToBe(by,1)).size()==0){
//                scrollDown(x);
//            }else {
//                System.out.println(i);
//                wait.until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
//                break;
//            }
        }
    }

    public void tapByCoordinnates(int x, int y) {
        TouchAction action = new TouchAction<>(driver);
        action.tap(PointOption.point(x, y)).perform();
    }

    public void scrollDown(int x) { //x define: left/right sidebar, center content
        //get screen size
        Dimension screen = driver.manage().window().getSize();
        //set coordinates
        int startY = (int) (screen.height * 0.8);
        int endY = (int) (screen.height * 0.2);

        swipe(x, startY, x, endY);
    }
    public void swipe(int startX, int startY, int endX, int endY) {
        new TouchAction<>(driver).longPress(point(startX, startY))
                .moveTo(point(endX, endY)).release().perform();
    }
    public void scroll(By by, int x) throws InterruptedException {
        for(int i=0; i<=10; i++){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            System.out.println(i);
            try {
                while (wait.until(ExpectedConditions.numberOfElementsToBe(by,0)).size()==0){
                    scrollDown(x);
                }
            }catch (TimeoutException timeoutException){
                wait.until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
                break;
            }

//            if(wait.until(ExpectedConditions.numberOfElementsToBe(by,1)).size()==0){
//                scrollDown(x);
//            }else {
//                System.out.println(i);
//                wait.until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
//                break;
//            }
        }
    }
}
