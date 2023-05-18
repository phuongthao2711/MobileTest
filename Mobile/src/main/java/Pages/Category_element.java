package Pages;

import org.openqa.selenium.By;

public class Category_element {
    public By home_garden = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.banggood.client:id/primary_cate_list']//android.widget.TextView[@text='Home and Garden']");
    public By home_decor = By.xpath("//android.widget.TextView[@text='Home Decor']");

    public By filter = By.id("com.banggood.client:id/slide_filter_entry");
    public By price_min = By.id("com.banggood.client:id/edit_price_min");
    public By price_max = By.id("com.banggood.client:id/edit_price_max");

    public By btn_done = By.id("com.banggood.client:id/btn_done");

    //firstitem(203,618)
    public By item_name = By.xpath("//android.widget.LinearLayout[1]/android.widget.ImageView");
    public By item_price = By.id("com.banggood.client:id/tv_product_price");

}
