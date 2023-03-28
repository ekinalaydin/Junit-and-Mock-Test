import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    @Test
    void totalAmountTest() {
        var payment = new Payment();
        assertEquals(80, payment.TotalAmount(2, 37));
    }

    @Test
    void totalAmountTest2() {
        var payment = new Payment();
        assertEquals(615, payment.TotalAmount(20, 16));
    }

    @Test
    void totalAmountTest3() {
        var payment = new Payment();
        assertEquals(490, payment.TotalAmount(16, 6));
    }

    @Test
    void totalAmountTest4() {
        var payment = new Payment();
        assertEquals(480, payment.TotalAmount(16, 0));
    }
}