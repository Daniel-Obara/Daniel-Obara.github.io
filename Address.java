
public class Address {

   private String streetAddress;

   private String city;

   private String country;

   private int postalCode;

   private AddressType type;

   public Address(String streetAddress, String city, String country, int postalCode, AddressType type) {

       this.streetAddress = streetAddress;

       this.city = city;

       this.country = country;

       this.postalCode = postalCode;

       this.type = type;

   }


   public String getStreetAddress() {

       return streetAddress;

   }

   

   public void setStreetAddress(String streetAddress) {

       this.streetAddress = streetAddress;

   }

 

   public String getCity() {

       return city;

   }

  
   public void setCity(String city) {

       this.city = city;

   }

   

   public String getCountry() {

       return country;

   }



   public void setCountry(String country) {

       this.country = country;

   }



   public int getPostalCode() {

       return postalCode;

   }

   public void setPostalCode(int postalCode) {

       this.postalCode = postalCode;

   }


   public AddressType getType() {

       return type;

   }


   public void setType(AddressType type) {

       this.type = type;

   }

   @Override

   public String toString() {

       return streetAddress + ", " + city + ", " + country + ", " + postalCode + ", Address type: " + type.toString();

   }

}