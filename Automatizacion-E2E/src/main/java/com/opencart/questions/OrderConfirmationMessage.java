package com.opencart.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import com.opencart.ui.CheckoutPage;

public class OrderConfirmationMessage implements Question<String> {

    public static OrderConfirmationMessage text() {
        return new OrderConfirmationMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CheckoutPage.CONFIRMATION_MESSAGE)
                .answeredBy(actor);
    }
}