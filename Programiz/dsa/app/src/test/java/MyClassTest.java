/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author tomas
 */
public class MyClassTest {

    @Test
    public void testMyClass() {
        MyClass test = new MyClass();
        assertEquals(50, test.multiply(10, 5));
    }

}
