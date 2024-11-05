public class Address 
{ //Begin
    private String streetName;
    private String cityName;
    private String countyName;


    //Constructor
    public Address()
    {

    }

    //Constructor overload
    public Address(String street, String city, String county)
    {
        streetName = street;
        cityName = city;
        countyName = county;
    }

    //Setter methods
    public void setStreet(String street)
    {
        streetName = street;
    }

    public void setCity(String city)
    {
        cityName = city;
    }

    public void setCounty(String county)
    {
        countyName = county;
    }

    //Getter methods
    public String getStreet()
    {
        return streetName;
    }

    public String getCity()
    {
        return cityName;
    }

    public String getCounty()
    {
        return countyName;
    }

    @Override
    public String toString()
    {
        return "Street : " + streetName 
        + "\n City : " + cityName
        + "\n County : " + countyName;
    }
} //End
