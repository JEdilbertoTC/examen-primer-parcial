package uaslp.enginering.exam.model;

public class Guest {
    private String name;
    private String address;
    private String country;
    private String phone;

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setPhoneNumber(String phone){
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
}
