import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScanTicketTest {
    @Test
    void cheaknumberTest1() {
        var scanTicket = new ScanTicket();
        assertEquals(1, scanTicket.cheaknumber("ekin", "ekin"));

    }

    @Test
    void cheaknumberTest2() {
        var scanTicket = new ScanTicket();
        assertEquals(0, scanTicket.cheaknumber("ekin", "melih"));
    }

    @Test
    void cheaknumberTest3() {
        var scanTicket = new ScanTicket();
        assertEquals(0, scanTicket.cheaknumber("aaa", "bbb"));
    }

}