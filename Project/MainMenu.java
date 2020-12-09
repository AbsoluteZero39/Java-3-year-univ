package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.company.Enums.roomType;

/**
 * Клас управління головним меню
 */
public class MainMenu extends Helpers{
    private Scanner in = new Scanner(System.in);
    private HotelManager hotelManager = new HotelManager();
    private static final String DATE_FORMAT = "dd.MM.yyyy";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
    /**
     * Запускає вибір ролі
     * @throws Exception
     */
    public void Start() throws Exception {
        chooseRole();
    }

    /**
     * Дозволяє користувачу обрати роль - адмін або клієнт
     * @throws Exception
     */
    private void chooseRole() throws Exception {
        print("----------------------------------");
        print("        | Оберіть роль |          ");
        print("----------------------------------");
        print("Клієнт - 1 | Адмін - 2 | Вихід - 3");
        print("----------------------------------");
        do{
            try{
                int role = 0;
                print("Оберіть дію");
                role = in.nextInt();
                if(role == 1) clientActions();
                else if(role == 2) adminActions();
                else if (role == 3) System.exit(0);
            }catch(InputMismatchException ex){
                print("Виберіть правильну операцію");
                in.nextLine();
            }
        }while(true);
    }

    /**
     * Опрацьовує операції адміна
     * @throws Exception
     */
    private void adminActions() throws Exception {
        print("--------------------------------------------------------------------------------------------------------------");
        print("|                                        | Виберіть операцію |                                               |");
        print("|------------------------------------------------------------------------------------------------------------|");
        print("|Додати кімнату - 1 | Видалити кімнату - 2 | Змінити кімнату - 3 | Показати всі кімнати - 4 |Обрати роль - 5 |");
        print("--------------------------------------------------------------------------------------------------------------");
        do{
            try{
                int action = in.nextInt();
                switch (action){
                    case 1:
                        hotelManager.addRoom(getHotelRoom());
                        adminActions();
                        break;
                    case 2:
                        hotelManager.removeRoom(getInteger());
                        adminActions();
                        break;
                    case 3:
                        hotelManager.changeRoom(getHotelRoom());
                        adminActions();
                        break;
                    case 4:
                        hotelManager.showAllRooms();
                        adminActions();
                        break;
                    case 5:
                        chooseRole();
                        break;
                    default:
                        throw new InputMismatchException();
                }
                return;
            }catch(InputMismatchException ex){
                print("Виберіть правильну операцію");
                in.nextLine();
            }
        }while(true);
    }

    /**
     * опрацьовує операції клієнта
     * @throws Exception
     */
    private void clientActions() throws Exception {
        print("-------------------------------------------------------------------");
        print("                          | Виберіть операцію |                    ");
        print("-------------------------------------------------------------------");
        print("Замовити кімнату - 1 | Переглянути всі кімнати- 2 | Обрати роль - 3");
        print("-------------------------------------------------------------------");

        do{
            try{
                int action = in.nextInt();
                switch (action){
                    case 1:
                        bookRoom();
                        clientActions();
                        break;
                    case 2:
                        hotelManager.showAllRooms();
                        clientActions();
                        break;
                    case 3:
                        chooseRole();
                        break;
                    default:
                        throw new InputMismatchException();
                }
            }catch(InputMismatchException ex){
                print("Виберіть правильну операцію");
                in.nextLine();
            }
        }while(true);
    }

    /**
     * Зчитує користувацький ввід і повертає дату
     * @return
     */
    private String getDateInput() {
        do{

            try {
                String line = in.nextLine();
                if(line.length()>0){
                    return LocalDate.parse(line, formatter).format(formatter);
                }
            } catch (Exception e) {
                print("Введіть дату у форматі dd.MM.yyyy");
            }
        }while(true);

    }

    /**
     * зчитує користувацький ввід і бронює номер
     */
    private void bookRoom(){
        do{
            try {
                print("Введать номер кімнати");
                int num = in.nextInt();
                print("Введіть дату початку броні у форматі dd.MM.yyyy");
                String strStartDate = getDateInput();
                print("Введіть дату кінця броні у форматі dd.MM.yyyy");
                String strSndDate = getDateInput().toString();
                LocalDate startDate = LocalDate.parse(strStartDate,formatter);
                LocalDate endDate = LocalDate.parse(strSndDate,formatter);
                if(endDate.isAfter(startDate)){
                    hotelManager.bookRoom(num,strStartDate,strSndDate);
                    return;
                }else{
                    print("Дата початку має бути перед датою кінця");
                    return;
                }
            }catch(InputMismatchException ex){
                print("Введіть коректні дані");
                in.nextLine();
            }
        }while(true);
    }

    /**
     * Зчитує користувацький ввід і повертає ціле число
     * @return
     */
    public int getInteger(){
        do{
            try{
                print("Введіть номер");
                int number = in.nextInt();
                return number;
            }catch(InputMismatchException ex) {
                print("Введіть ціле число");
                in.nextLine();
            }
        }while (true);
    }

    /**
     * зчитує користувацький ввід і повертає об'єкт класу HotelRoom
     * @return
     * @throws Exception
     */
    private HotelRoom getHotelRoom() throws Exception {
        do{
            try {
                print("Введіть номер номеру");
                int number = in.nextInt();
                print("Введіть ціну за ніч");
                double price  = in.nextDouble();
                print("Виберіть тип номеру: 1 - стандарт, 2 - пентхауз");
                int type = in.nextInt();
                roomType RoomType = roomType.standart;
                if(type == 1) RoomType = roomType.standart;
                else if(type == 2) RoomType = roomType.penthhouse;
                return  new HotelRoom(number,price,RoomType);
            }catch(InputMismatchException ex){
                print("Введіть коректні дані");
                in.nextLine();
            }
        }while (true);

    }
}
