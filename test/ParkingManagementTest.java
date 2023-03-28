import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class ParkingManagementTest {

    @Test
    void cheaknumberTest2() {
        var scanTicket = new ScanTicket();
        assertEquals(1, scanTicket.cheaknumber("ekin", "ekin"));

    }

    @Test
    void cheaknumberTest3() {
        var scanTicket = new ScanTicket();
        assertEquals(0, scanTicket.cheaknumber("ekin", "melih"));
    }

    @Test
    void parkingSpotTest() {
        var parkingSpot = new ParkingSpot();
        assertEquals(1, parkingSpot.SpotNum());
    }

    @Test
    void parkingSpotTest2() {
        var parkingSpot = new ParkingSpot();
        assertEquals(10, parkingSpot.si());
    }


    @Test
    void parkingSpotTest3() {
        var parkingSpot = new ParkingSpot();
        parkingSpot.sipe();
    }


    @Test
    void parkingSpotTest4() {
        var parkingSpot = new ParkingSpot();
        parkingSpot.FreeSpot(3);


    }

    @Test
    void RandomInfoTest1() {
        var randomInfo = new RandomInfo();
        assertNotEquals("Black", randomInfo.CarColor());
    }

    @Test
    void RandomInfoTest2() {
        var randomInfo = new RandomInfo();
        assertEquals("van", randomInfo.CarType());
    }

    @Test
    void RandomInfoTest3() {
        var randomInfo = new RandomInfo();
        assertEquals("2022-11-07", randomInfo.Date());
    }

    @Test
    void RandomInfoTest4() {
        var randomInfo = new RandomInfo();
        assertEquals("Debit", randomInfo.CardType());
    }
    @Test
    void PaymentTest(){
        var payment = new Payment();
        assertEquals(50, payment.TotalAmount(1,45));
    }
    @Test
    void PaymentTest2(){
        var payment = new Payment();
        assertEquals(105, payment.TotalAmount(3,22));
    }
    @Test
    void PaymentTest3(){
        var payment = new Payment();
        assertEquals(70, payment.TotalAmount(2,8));
    }
    @Test
    void CarTest(){
        var car = new Car();
      car.setNumberPlate("06");
    }
    @Test
    void CarTest2(){
        var car = new Car();
        car.setCarColor("pink");
    }
}