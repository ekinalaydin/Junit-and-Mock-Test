import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentMutationTest {
    @Test
    void totalAmountTest() {
        var payment = new Payment();
        assertNotEquals(80, payment.TotalAmount(2, 35));
    }
    @Test
    void totalAmountTest2() {
        var payment = new Payment();
        assertNotEquals(45, payment.TotalAmount(1, 20));
    }

    @Test
    void totalAmountTest3() {
        var payment = new Payment();
        assertNotEquals(540, payment.TotalAmount(18, 0));
    }

}