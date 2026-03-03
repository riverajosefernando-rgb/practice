package com.opencart.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target FIRST_PRODUCT =
            Target.the("Primer producto")
                    .located(By.xpath("(//button[contains(@onclick,'cart.add')])[1]"));

    public static final Target SECOND_PRODUCT =
            Target.the("Segundo producto")
                    .located(By.xpath("(//button[contains(@onclick,'cart.add')])[2]"));

    public static final Target CART_BUTTON =
            Target.the("Botón carrito")
                    .located(By.id("cart"));

    public static final Target PRODUCT_BY_POSITION =
            Target.the("Producto en posición {0}")
                    .locatedBy("(//button[contains(@onclick,'cart.add')])[{0}]");

    public static final Target PRODUCT_BY_NAME =
            Target.the("Producto con nombre {0}")
                    .locatedBy("//h4/a[text()='{0}']/../../..//button[contains(@onclick,'cart.add')]");


    public static final Target CHECKOUT_BUTTON =
            Target.the("Checkout button")
                    .located(By.linkText("Checkout"));

    public static final Target GUEST_CHECKOUT =
            Target.the("Guest checkout option")
                    .located(By.cssSelector("input[value='guest']"));

    public static final Target CONTINUE_ACCOUNT =
            Target.the("Continue account button")
                    .located(By.id("button-account"));

    public static final Target CONFIRMATION_MESSAGE =
            Target.the("Order confirmation message")
                    .located(By.xpath("//h1[contains(text(),'Your order has been placed!')]"));

}