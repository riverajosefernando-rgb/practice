package com.opencart.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import com.opencart.ui.CheckoutPage;

public class CompleteCheckoutAsGuest implements Task {

    public static CompleteCheckoutAsGuest perform() {
        return Tasks.instrumented(CompleteCheckoutAsGuest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.GUEST_CHECKOUT),
                Click.on(CheckoutPage.CONTINUE_ACCOUNT)
        );
    }
}