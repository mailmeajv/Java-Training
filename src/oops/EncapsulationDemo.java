package oops;

public class EncapsulationDemo {
    /*Why Encapsulation?1.Better control of class attributes and methods2.Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    3.Flexible: the programmer can change one part of the code without affecting other parts4.Increased security of data*/
    private String name;
    // Getter
    public String getName() {
        return name;
    }
    // Setter
    public void setName(String newName) {
        this.name = newName;

    }
    public static void main(String[] args) {
        EncapsulationDemo myObj = new EncapsulationDemo();
        myObj.setName("John");
        System.out.println(myObj.getName());
    }
}
