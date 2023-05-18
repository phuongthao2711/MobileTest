package StepDefinition;

import Pages.Account_element;
import Pages.Category_element;
import Pages.Home_element;
import Pages.HotCategories_element;
import Tests.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class MyStepDef {
    Common common = new Common();
    Home_element homeElement = new Home_element();
    Category_element categoryElement = new Category_element();
    HotCategories_element hotCategoriesElement = new HotCategories_element();
    Account_element accountElement = new Account_element();

    //Scenario 1: Verify product in Category
    @Given("Open Banggood Easy Online Shopping App")
    public void open_banggood_easy_online_shopping_app() throws MalformedURLException {
        common.setUp();
    }
    @When("user click to the Category on footer menu")
    public void user_click_to_the_category_on_footer_menu() {
        common.click(homeElement.category);
    }
    @When("user scroll and click to Home and Garden in Left menu")
    public void user_scroll_and_click_to_home_and_garden_in_left_menu() {
        common.click(categoryElement.home_garden);
    }
    @When("user click to the Home Decor")
    public void user_click_to_the_home_decor() {
        common.click(categoryElement.home_decor);
    }
    @When("user lick to the Filter")
    public void user_lick_to_the_filter() {
        common.click(categoryElement.filter);
    }
    @When("user input price from {int} to {int}")
    public void user_input_price_from_to(Integer int1, Integer int2) {
        common.sendKeys(categoryElement.price_min, "20");
        common.sendKeys(categoryElement.price_max, "30");
    }
    @When("user click Done")
    public void user_click_done() {
        common.click(categoryElement.btn_done);
    }
    @When("user click first product")
    public void user_click_first_product() {
        common.tapByCoordinnates(203, 618);
    }
    @Then("product name, product price should be displayed")
    public void product_should_be_displayed() {
        common.isDisplayed(categoryElement.item_name);
//        common.isDisplayed(categoryElement.item_price);
        common.equals(categoryElement.item_price, "20");
    }

    //Scenario 2: Verify product in Hot Categories
    @Given("Banggood Easy Online Shopping App is opened")
    public void banggood_easy_online_shopping_app_is_opened() throws MalformedURLException {
        common.setUp();
    }
    @When("user scroll to Hot Categories")
    public void user_scroll_to_hot_categories() throws InterruptedException {
        Thread.sleep(7000);
        common.findAndDisplayElement(homeElement.hot_categories, 123);
    }
    @When("user click to the first category")
    public void user_click_to_the_first_category() {
        common.click(homeElement.first_cate);
    }
    @When("user click to the first product")
    public void user_click_to_the_first_product() {
        common.tapByCoordinnates(203, 618);
    }
    @Then("The product detail page should be displayed: Product name, product price, Buy now button")
    public void the_product_detail_page_should_be_displayed_product_name_product_price_buy_now_button() {
        common.isDisplayed(hotCategoriesElement.item_name);
        common.isDisplayed(hotCategoriesElement.item_price);
        common.isDisplayed(hotCategoriesElement.btn_buynow);
        common.isDisplayed(hotCategoriesElement.btn_add);
    }

    //Add to Cart button
    @Given("user click to Cart button")
    public void user_click_to_cart_button() {
        common.click(hotCategoriesElement.btn_add);
    }
    @When("user click to Add to Cart button")
    public void user_click_to_add_to_cart_button() {
        common.click(hotCategoriesElement.btn_cart);
    }
    @When("user click to Cart icon on footer")
    public void user_click_to_cart_icon_on_footer() {
        common.click(hotCategoriesElement.cart_icon);
    }
    @Then("product name, product size, product price and quantity should be dislayed")
    public void product_name_product_size_product_price_and_quantity_should_be_dislayed() {
        common.isDisplayed(hotCategoriesElement.item_name);
        common.isDisplayed(hotCategoriesElement.item_price);
        common.isDisplayed(hotCategoriesElement.item_size);
        common.isDisplayed(hotCategoriesElement.item_quantity);
    }


    //Scenario 3: Verify the login screen
    @Given("Open Banggood App")
    public void open_banggood_app() throws MalformedURLException {
        common.setUp();
    }
    @When("user click Account on footer menu")
    public void user_click_account_on_footer_menu() {
        common.click(homeElement.account);
    }
    @When("user click View All Order")
    public void user_click_view_all_order() {
        common.click(accountElement.view_all);
    }
    @Then("the login screen should be displayed with: Email, password and Sign In button")
    public void the_login_screen_should_be_displayed_with_email_password_and_sign_in_button() {
        common.isDisplayed(accountElement.email);
        common.isDisplayed(accountElement.password);
        common.isDisplayed(accountElement.btn_sign);
    }

}
