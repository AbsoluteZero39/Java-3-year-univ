package com.company;
import com.company.Enums.roomType;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MyTests {
    @Test
    public void testIfRoomAvailable() throws Exception {
        //Test of the method that checks room availability
        HotelManager manager = new HotelManager();
        HotelRoom room  = new HotelRoom(12,234.4, roomType.standart);
        room.setReserveStart("10.12.2000");
        room.setReserveEnd("15.12.2000");
        manager.addRoom(room);
        //assert statements
        /**
         * Якщо дата бронювання номеру раніша за дату звільнення номеру, метод поверає false
         */
        assertEquals(true,manager.isRoomAvailable(room,"16.12.2000","15.12.2000"));
        assertEquals(false,manager.isRoomAvailable(room,"14.12.2000","15.12.2000"));
        assertEquals(false,manager.isRoomAvailable(room,"15.12.2000","15.12.2000"));
    }
}
