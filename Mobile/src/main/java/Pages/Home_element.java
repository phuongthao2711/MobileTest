package Pages;

import org.openqa.selenium.By;

public class Home_element {
    public By ad = By.id("com.banggood.client:id/iv_close");
    public By category = By.id("com.banggood.client:id/main_tab_category");
    public By hot_categories = By.xpath("//android.widget.TextView[@text='Hot Categories']");
    public By first_cate = By.xpath("//android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView");

    public By account = By.id("com.banggood.client:id/main_tab_account");


}
