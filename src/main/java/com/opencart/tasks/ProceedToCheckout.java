package com.opencart.tasks;

import com.opencart.ui.HomePage;
import com.opencart.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ProceedToCheckout implements Task {

    public static ProceedToCheckout asGuest() {
        return Tasks.instrumented(ProceedToCheckout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(HomePage.CART_BUTTON),
                Click.on(CheckoutPage.CHECKOUT_BUTTON),
                Click.on(CheckoutPage.GUEST_CHECKOUT),
                Click.on(CheckoutPage.CONTINUE_ACCOUNT)
        );
    }
}