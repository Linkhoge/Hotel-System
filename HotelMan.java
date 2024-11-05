import java.util.Scanner; 

//Scanner readMe = new Scanner(System.in);

public class HotelMan {
    public static void main(String[] args) {
        int userLimit = 5;
        int bookingsMade = 0;
        Room[] rooms = new Room[15];

        //Messy code!!!
        rooms[1] = new Room("Twin", 2, 1200, true, false);
        rooms[2] = new Room("Double", 2, 1200, false, false);
        rooms[3] = new Room("Single", 1, 1200, true, false);
        rooms[4] = new Room("Twin", 2, 1200, false, false);
        rooms[5] = new Room("Single", 2, 1200, true, false);
        rooms[6] = new Room("Single", 1, 1500, false, true);
        rooms[7] = new Room("Double", 1, 200, true, false);
        rooms[8] = new Room("Single", 1, 1200, true, false);
        rooms[9] = new Room("Double", 2, 6200, false, true);
        rooms[10] = new Room("Single", 1, 700, false, false);

        // for (int i = 0; i < 10; i++)
        // {
        //     Room room = new Room();
        //     rooms[i] = room;
        //     System.out.println("Room ID: " + room.getRoomID());
        // }
        System.out.println("Hello! I am the Automated Hotel Man.");
        System.out.println("-----------------------------------");
        System.out.println("1. List All Rooms");
        System.out.println("2. List all booked Rooms");
        System.out.println("3. List all available rooms.");
        System.out.println("4. Create a new room booking");
        System.out.println("5. List all room bookings.");

        Scanner optionChecker = new Scanner(System.in);
        Scanner forBooking = new Scanner(System.in);

        String guestName;
        int telephoneNum;
        int bookedDays;
        String streetName;
        String cityName;
        String countyName;
        Address theAddress;

        int option = 0;
        option = optionChecker.nextInt();
        
        switch (option) {
            case 1:
            for (int i = 0; i < rooms.length; i++)
                {
                    System.out.println(rooms[i]);
                }
            case 2:
            for (int i = 0; i < rooms.length; i++)
            {
                if (!rooms[i].isVacant())
                {
                System.out.println(rooms[i]);
                }
            }
            case 3:
            for (int i = 0; i < rooms.length; i++)
            {
                if (rooms[i].isVacant())
                {
                System.out.println(rooms[i]);
                }
            }
            case 4:
            if (bookingsMade >= userLimit)
            {
                System.out.println("User Booking limit Exceeded.");

            }
            else
            {
                System.out.println("Guest name: ");
                guestName = forBooking.nextLine();
                System.out.println("Phone number: ");
                telephoneNum = forBooking.nextInt();
                System.out.println("How many days: ");
                bookedDays = forBooking.nextInt();
                // Booking userBooking = new Booking(guestName, telephoneNum, bookedDays, )
                System.out.println("Street Name: ");
                streetName = forBooking.next();
                System.out.println("City Name: ");
                cityName = forBooking.next();
                System.out.println("County Name: ");
                countyName = forBooking.next();
                theAddress = new Address(streetName, cityName, countyName);
                Booking userBooking = new Booking(guestName, telephoneNum, bookedDays, theAddress);
            }

                break;

            case 5:
                
            default:
                break;
        }
    }
}
