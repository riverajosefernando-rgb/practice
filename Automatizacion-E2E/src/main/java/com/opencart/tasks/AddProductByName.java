package com.opencart.tasks;

import com.opencart.models.Product;
import com.opencart.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddProductByName implements Task {

    private final Product product;

    public AddProductByName(Product product) {
        this.product = product;
    }

    public static AddProductByName called(Product product) {
        return Tasks.instrumented(AddProductByName.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(HomePage.PRODUCT_BY_NAME.of(product.getName()))
        );
    }
}