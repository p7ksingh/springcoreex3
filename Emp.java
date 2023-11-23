package springcoreex3;

public class Emp {
    private int eid;
    private String ename;
    private double esal;
    private Address address;

    public Emp() {
        System.out.println("Emp :: constructor");
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public double getEsal() {
        return esal;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

}
