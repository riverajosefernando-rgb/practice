package com.opencart.stepdefinitions;

import com.opencart.config.CustomWebDriver;
import com.opencart.constants.CustomerData;
import com.opencart.models.Customer;
import com.opencart.models.Product;
import com.opencart.questions.OrderConfirmationMessage;
import com.opencart.tasks.AddProductByName;
import com.opencart.tasks.AddProductByPosition;
import com.opencart.tasks.CompleteGuestCheckout;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.hamcrest.Matchers.containsString;

public class OpenCartStepDefinitions {

    private Actor user;
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = CustomWebDriver.chromeDriver();
        user = Actor.named("Customer");
        user.can(BrowseTheWeb.with(driver));
    }

    @Given("the user opens the home page")
    public void openHomePage() {
        user.attemptsTo(
                Open.url("http://opencart.abstracta.us/")
        );
    }

    @When("the user adds the product in position {int}")
    public void addProductByPosition(int position) {
        user.attemptsTo(
                AddProductByPosition.number(position)
        );
    }

    @When("the user adds the product with name:")
    public void addProductByName(Product product) {
        user.attemptsTo(
                AddProductByName.called(product)
        );
    }

    @When("the user adds the following products:")
    public void addProducts(List<Product> products) {

        products.forEach(product ->
                user.attemptsTo(
                        AddProductByName.called(product)
                )
        );
    }

    @When("the user proceeds to checkout as guest")
    public void proceedToCheckout() {

        Customer customer = new Customer();
        customer.setFirstName(CustomerData.FIRST_NAME);
        customer.setLastName(CustomerData.LAST_NAME);
        customer.setEmail(CustomerData.EMAIL);
        customer.setTelephone(CustomerData.TELEPHONE);
        customer.setAddress(CustomerData.ADDRESS);
        customer.setCity(CustomerData.CITY);
        customer.setPostCode(CustomerData.POST_CODE);

        user.attemptsTo(
                CompleteGuestCheckout.with(customer)
        );
    }

    @Then("the user should see the order confirmation message")
    public void validateOrderConfirmation() {

        user.should(
                GivenWhenThen.seeThat(
                        OrderConfirmationMessage.text(),
                        containsString("Your order has been placed!")
                )
        );
    }


    @Then("the user should see the order confirmation {string}")
    public void validateOrderConfirmation(String expectedMessage) {

        user.should(
                GivenWhenThen.seeThat(
                        OrderConfirmationMessage.text(),
                        containsString(expectedMessage)
                )
        );
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}