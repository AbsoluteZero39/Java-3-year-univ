package com.company;
import com.company.Enums.roomType;
/**
 * Клас описує готельний номер
 */

public class HotelRoom {
    private double mPrice;
    private roomType mType;
    private String mReserveStart;
    private String mReserveEnd;
    private int mRoomNumber;

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double mPrice) throws Exception {
        if (mPrice >= 0 ) {
            this.mPrice = mPrice;
        } else {
           throw new Exception("Price cant be less than 0");
        }

    }

    public roomType getType() {
        return mType;
    }

    public void setType(roomType mType) {
        this.mType = mType;
    }

    public String getReserveStart() {
        return mReserveStart;
    }

    public void setReserveStart(String reserveStart) {
        this.mReserveStart = reserveStart;
    }

    public String getReserveEnd() {
        return mReserveEnd;
    }

    public void setReserveEnd(String reserveEnd) {
        this.mReserveEnd = reserveEnd;
    }

    public int getmRoomNumber() {
        return mRoomNumber;
    }

    public void setmRoomNumber(int mRoomNumber) {
        this.mRoomNumber = mRoomNumber;
    }

    public HotelRoom(int roomNumber, double price, roomType type) throws Exception {
       this.setmRoomNumber(roomNumber);
       this.setPrice(price);
       this.setType(type);
    }
}
