package com.opencart.questions;

import com.opencart.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

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