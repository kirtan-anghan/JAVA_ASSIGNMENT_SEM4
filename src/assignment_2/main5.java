package assignment_2;
//•	Write an application that illustrates how a method can invoke a super class method. Class I2 is extended by J2.
// Class J2 is extended by K2. Each of these class defines a getDescription() method that returns a string.
// That String includes a description of the class plus descriptions of each super class.
// Instantiate each object of these classes and invoke the getDescription () method.

class K2 {
    public String getDescription() {
        return "K2";
    }
}

class J2 extends K2 {
    @Override
    public String getDescription() {
        return "J2 is extended by " + super.getDescription() + "";
    }
}

class I2 extends J2{
    @Override
    public String getDescription(){
        return "I2 is extended by " + super.getDescription() + "";
    }
}
public class main5 {
    public static void main(String[] args) {
        K2 ass5 = new I2();
        System.out.println(ass5.getDescription());
    }
}
