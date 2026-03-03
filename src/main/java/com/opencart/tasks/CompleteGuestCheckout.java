package com.opencart.tasks;

import com.opencart.constants.CustomerData;
import com.opencart.models.Customer;
import com.opencart.ui.HomePage;
import com.opencart.ui.CheckoutPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompleteGuestCheckout implements Task {

    private final Customer customer;

    public CompleteGuestCheckout(Customer customer) {
        this.customer = customer;
    }

    public static CompleteGuestCheckout with(Customer customer) {
        return Tasks.instrumented(CompleteGuestCheckout.class, customer);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                // Abrir carrito y checkout
                Click.on(HomePage.CART_BUTTON),
                Click.on(CheckoutPage.CHECKOUT_BUTTON),

                // Seleccionar guest
                Click.on(CheckoutPage.GUEST_CHECKOUT),
                Click.on(CheckoutPage.CONTINUE_ACCOUNT),

                WaitUntil.the(CheckoutPage.FIRST_NAME, isVisible()),

                // Llenar formulario
                Enter.theValue(customer.getFirstName()).into(CheckoutPage.FIRST_NAME),
                Enter.theValue(customer.getLastName()).into(CheckoutPage.LAST_NAME),
                Enter.theValue(customer.getEmail()).into(CheckoutPage.EMAIL),
                Enter.theValue(customer.getTelephone()).into(CheckoutPage.TELEPHONE),
                Enter.theValue(customer.getAddress()).into(CheckoutPage.ADDRESS),
                Enter.theValue(customer.getCity()).into(CheckoutPage.CITY),
                Enter.theValue(customer.getPostCode()).into(CheckoutPage.POSTCODE),

                SelectFromOptions.byVisibleText(CustomerData.COUNTRY)
                        .from(CheckoutPage.COUNTRY),

                SelectFromOptions.byIndex(1)
                        .from(CheckoutPage.ZONE),

                Click.on(CheckoutPage.CONTINUE_BILLING),
                Click.on(CheckoutPage.CONTINUE_DELIVERY),
                Click.on(CheckoutPage.TERMS_CHECKBOX),
                Click.on(CheckoutPage.CONTINUE_PAYMENT),
                Click.on(CheckoutPage.CONFIRM_ORDER)
        );
    }
}