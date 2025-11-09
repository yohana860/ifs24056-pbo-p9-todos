package org.delcom.todos.controllers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HomeControllerTest {

    @Test
    void testHelloMethod() {
        HomeController controller = new HomeController();
        String result = controller.hello();
        assertEquals("Hay, selamat datang di Spring Boot!", result);
    }
}
