package com.opencart.tasks;

import com.opencart.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddProductByPosition implements Task {

    private final int position;

    public AddProductByPosition(int position) {
        this.position = position;
    }

    public static AddProductByPosition number(int position) {
        return Tasks.instrumented(AddProductByPosition.class, position);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.PRODUCT_BY_POSITION.of(String.valueOf(position)))
        );
    }
}