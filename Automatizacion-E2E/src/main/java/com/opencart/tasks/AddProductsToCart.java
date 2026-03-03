package com.opencart.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import com.opencart.ui.HomePage;

public class AddProductsToCart implements Task {

    public static AddProductsToCart twoProducts() {
        return Tasks.instrumented(AddProductsToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.FIRST_PRODUCT),
                Click.on(HomePage.SECOND_PRODUCT)
        );
    }
}