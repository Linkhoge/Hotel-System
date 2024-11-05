public class Booking 
{ //Begin
    
    public static int bookingNum = 1000;
    public int theID;
    public String guestName;
    public int telephoneNum;
    public int bookedDays;
    public Address theAddress;

    //Constructor
    public Booking()
    {
        setID(bookingNum);
        bookingNum++;
    }

    //Constructor Overload
    public Booking(String name, int number, int days, Address address)
    {
        setID(bookingNum);
        bookingNum++;
        
        guestName = name;
        telephoneNum = number;
        bookedDays = days;
        theAddress = address;
    }

    //Setter methods

    public void setID(int theID)
    {
        this.theID = theID;
    }

    public void setGuestName(String name)
    {
        guestName = name;
    }

    public void setTelephone(int number)
    {
        telephoneNum = number;
    }

    public void setBookingDays(int days)
    {
        bookedDays = days;
    }
    public void setAddress(Address address)
    {
        theAddress = address;
    }

    //Getter methods
    public String getGuestsName()
    {
        return guestName;
    }

    public int getBookedDays() 
    {
        return bookedDays;
    }

    public int getTelephoneNum()
    {
        return telephoneNum;
    }

    public Address getTheAddress() 
    {
        return theAddress;
    }

} //End
