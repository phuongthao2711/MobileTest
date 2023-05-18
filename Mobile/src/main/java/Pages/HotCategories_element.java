package Pages;

import org.openqa.selenium.By;

public class HotCategories_element {
    public By item_price = By.id("com.banggood.client:id/tv_product_price");
    public By item_name = By.id("com.banggood.client:id/tv_product_name");
    public By btn_buynow = By.id("com.banggood.client:id/btn_slide_buy");
    public By btn_add = By.id("com.banggood.client:id/btn_slide_cart");

    //after click to Add cart
    public By btn_cart = By.id("com.banggood.client:id/btn_cart");
    public By cart_icon = By.xpath("//android.widget.FrameLayout[@resource-id='com.banggood.client:id/cv_slide_cart']");
    public By item_size = By.id("com.banggood.client:id/tv_product_options");
    public By item_quantity = By.id("com.banggood.client:id/edit_qty");

}
