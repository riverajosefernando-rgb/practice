package com.opencart.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    public static final Target CHECKOUT_BUTTON =
            Target.the("Botón Checkout")
                    .located(By.linkText("Checkout"));

    public static final Target GUEST_CHECKOUT =
            Target.the("Guest checkout")
                    .located(By.cssSelector("input[value='guest']"));

    public static final Target CONTINUE_ACCOUNT =
            Target.the("Continuar cuenta")
                    .located(By.id("button-account"));

    public static final Target FIRST_NAME =
            Target.the("First name field")
                    .located(By.id("input-payment-firstname"));

    public static final Target LAST_NAME =
            Target.the("Last name field")
                    .located(By.id("input-payment-lastname"));

    public static final Target EMAIL =
            Target.the("Email field")
                    .located(By.id("input-payment-email"));

    public static final Target TELEPHONE =
            Target.the("Telephone field")
                    .located(By.id("input-payment-telephone"));

    public static final Target ADDRESS =
            Target.the("Address field")
                    .located(By.id("input-payment-address-1"));

    public static final Target CITY =
            Target.the("City field")
                    .located(By.id("input-payment-city"));

    public static final Target POSTCODE =
            Target.the("Postcode field")
                    .located(By.id("input-payment-postcode"));

    public static final Target COUNTRY =
            Target.the("Country dropdown")
                    .located(By.id("input-payment-country"));

    public static final Target ZONE =
            Target.the("Region dropdown")
                    .located(By.id("input-payment-zone"));

    public static final Target CONTINUE_BILLING =
            Target.the("Continue billing button")
                    .located(By.id("button-guest"));

    public static final Target CONTINUE_DELIVERY =
            Target.the("Continue delivery button")
                    .located(By.id("button-shipping-method"));

    public static final Target TERMS_CHECKBOX =
            Target.the("Terms checkbox")
                    .located(By.name("agree"));

    public static final Target CONTINUE_PAYMENT =
            Target.the("Continue payment button")
                    .located(By.id("button-payment-method"));

    public static final Target CONFIRM_ORDER =
            Target.the("Confirm order button")
                    .located(By.id("button-confirm"));

    public static final Target CONFIRMATION_MESSAGE =
            Target.the("Mensaje confirmación")
                    .located(By.xpath("//h1[contains(text(),'Your order has been placed!')]"));
}