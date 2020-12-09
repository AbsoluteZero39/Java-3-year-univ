package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Клас описує менеджер готелю (додавання, видалення, зміна, показ)
 */
public class HotelManager extends Helpers{
    private ArrayList<HotelRoom> mRooms = new ArrayList<HotelRoom>();

    private static final String DATE_FORMAT = "dd.MM.yyyy";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);

    /**
     * Додає ноиер до бази готелю
     * @param room
     */
    public void addRoom(HotelRoom room){
        HotelRoom roomToChange =
                mRooms.stream()
                        .filter(item -> item.getmRoomNumber() == room.getmRoomNumber())
                        .findFirst()
                        .orElse(null);
        if(!mRooms.contains((roomToChange))){
            mRooms.add(room);
            print("Номер №" + room.getmRoomNumber() + " був доданий");
        }
        else{
           print("Такий номер вже існує");
        }
    }

    /**
     * Видаляє номер з бази готелю
     * @param number
     */
    public void removeRoom(int number){
        HotelRoom roomToChange =  mRooms
                .stream()
                .filter(item -> item.getmRoomNumber() == number)
                .findFirst()
                .orElse(null);
        int index = mRooms.indexOf(roomToChange);
        if(index != -1){
            mRooms.remove(index);
           print("Номер №" + number + " успішно видалений");
        }
        else{
            print("Такого номеру не існує");
            return;
        }
    }

    /**
     * вносить зміни до бази готелю
     * @param room
     */
    public void changeRoom(HotelRoom room){
        HotelRoom roomToChange =  mRooms.stream()
                .filter(item -> item.getmRoomNumber() == room.getmRoomNumber())
                .findFirst()
                .orElse(null);
        int index = mRooms.indexOf(roomToChange);
        if(index != -1){
            mRooms.set(index,room);
            print("Номер №"+room.getmRoomNumber() + " успішно змінений");
        }
        else{
            print("Такого номеру немає в наявності");
        }
    }

    /**
     * виводить список всіх номерів
     */
    public void showAllRooms(){
        if(mRooms.size()>0){
            for (HotelRoom room:mRooms) {
                String str = "Номер: "
                        +room.getmRoomNumber() + "; Ціна: "
                        +room.getPrice()+"; Зарезервована до: "
                        +room.getReserveEnd()+ "; Тип: "
                        +room.getType();
                print(str);
            }
        }
        else{
            print("Немає вільних номерів");
        }
    }

    /**
     * перевіряє чи доступний номер на вказану дату
     * @param room
     * @param orderStartDate
     * @param existEndDate
     * @return
     */
    public boolean isRoomAvailable(HotelRoom room, String orderStartDate, String existEndDate){
        try{
            if(existEndDate == null){
                return true;
            }
            LocalDate startDate = LocalDate.parse(orderStartDate,formatter);
            LocalDate endDate = LocalDate.parse(existEndDate,formatter);
            boolean isAfter = startDate.isAfter(endDate);
            if(isAfter == true){
                return true;
            }
            return false;
        }catch(Exception err){
            print(""+err);
            return false;
        }

    }

    /**
     * Робить бронювання номеру
     * @param number
     * @param startDate
     * @param endDate
     */
    public void bookRoom(int number, String startDate, String endDate){
        HotelRoom roomToChange =  mRooms.stream().filter(item -> item.getmRoomNumber() == number).findFirst().orElse(null);
        int index = mRooms.indexOf(roomToChange);
        if(index != -1){
            if(isRoomAvailable(roomToChange,startDate,roomToChange.getReserveEnd())){
                roomToChange.setReserveStart(startDate);
                roomToChange.setReserveEnd(endDate);
                mRooms.set(index,roomToChange);
                print("Номер №"+ roomToChange.getmRoomNumber() + " успішно заброньовано");
            }else{
                print("Номер недоступний на вказану дату");
            }
        }else{
            print("Такого номеру не існує");
        }

    }
}
