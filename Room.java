public class Room { //Begin

    private static int roomID = 100;
    public int theID;
    private String bedType;
    private int guestCount;
    private boolean ensuite;
    private int price;
    private boolean vacant;

    //Constructor
    public Room()
    {
        setID(roomID);
        roomID++;
    
    }

    //Constructor Overload
    public Room(String type, int count, int price, boolean vacancy, boolean bathroom)
    {
        setID(roomID);
        roomID++;

        bedType = type;
        guestCount = count;
        this.price = price;
        vacant = vacancy;
        ensuite = bathroom;
    }

    //Setter methods
    public void setID(int theID)
    {
        this.theID = theID;
    }

    public void setBedType(String type)
    {
        bedType = type;
    }

    public void setGuestCount(int count)
    {

        guestCount = count;
    }

    public void setPrice(int amount)
    {
        price = amount;
    }

    public void setVacancy(boolean vacancy)
    {
        vacant = vacancy;
    }

    public void setEnsuite(boolean bathroom)
    {
        ensuite = bathroom;
    }

    //Getter methods
    public String getBedType()
    {
        return bedType;
    }

    public int getGuests()
    {
        return guestCount;
    }

    public int getRoomID()
    {
        return roomID;
    }

    public boolean isVacant()
    {
        return vacant;
    }

    public boolean isBathroom()
    {
        return ensuite;
    }
    public int getPrice()
    {
        return price;
    }


    @Override
    public String toString()
    {
        return "Room Number : " + roomID 
        + "\n Bed Type : " + bedType
        + "\n Guests : " + guestCount;
    }
}//End
