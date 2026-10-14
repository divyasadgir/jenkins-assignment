
package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGreeting() {
        assertEquals(
            "Hello from Jenkins CI/CD Pipeline!",
            App.getGreeting()
        );
    }
}
