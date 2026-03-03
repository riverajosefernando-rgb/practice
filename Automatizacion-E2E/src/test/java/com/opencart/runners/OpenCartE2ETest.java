package com.opencart.runners;

import com.opencart.config.CustomWebDriver;
import com.opencart.tasks.AddProductsToCart;
import com.opencart.tasks.GoToCheckout;
import com.opencart.tasks.CompleteCheckoutAsGuest;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class OpenCartE2ETest {

    WebDriver driver;
    Actor user = Actor.named("Cliente");

    @Before
    public void setUp() {
        driver = CustomWebDriver.chromeDriver();
        user.can(BrowseTheWeb.with(driver));
    }

    @Test
    public void should_complete_purchase_flow() {

        user.attemptsTo(
                Open.url("http://opencart.abstracta.us/"),
                AddProductsToCart.twoProducts(),
                GoToCheckout.process(),
                CompleteCheckoutAsGuest.perform()
        );
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}