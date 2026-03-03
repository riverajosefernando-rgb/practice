package com.opencart.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import com.opencart.ui.HomePage;
import com.opencart.ui.CheckoutPage;

public class GoToCheckout implements Task {

    public static GoToCheckout process() {
        return Tasks.instrumented(GoToCheckout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.CART_BUTTON),
                Click.on(CheckoutPage.CHECKOUT_BUTTON)
        );
    }
}