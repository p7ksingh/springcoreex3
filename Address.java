package springcoreex3;

public class Address {
    private String dno;
    private String city;
    private String state;

    public Address(){
        System.out.println("Address :: constructor");
    }
    public String getDno() {
        return dno;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public void setdno(String dno) {
        this.dno = dno;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }

    
}