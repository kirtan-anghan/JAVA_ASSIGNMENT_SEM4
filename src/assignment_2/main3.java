package assignment_2;

//•	The Airplane class has three subclasses named B747, B757, and B767. Each plane type can transport different no. of passengers.
// Each airplane object has a unique serial no. Write an application that declares this class hierarchy.
// Instantiate several types of airplanes and display them. Override the toString() method of object to return a string with the type,
// serial no. and capacity.
interface Airplane {
    public int getCapacity();
}
class B747 implements Airplane {
    private int capacity;
    private int serialNo;

    public B747(int capacity, int serialNo) {
        this.capacity = capacity;
        this.serialNo = serialNo;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "B747{" +
                "capacity=" + capacity +
                ", serialNo=" + serialNo +
                '}';
    }
}

class B757 implements Airplane {
    private int capacity;
    private int serialNo;

    public B757(int capacity, int serialNo) {
        this.capacity = capacity;
        this.serialNo = serialNo;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "B757{" +
                "capacity=" + capacity +
                ", serialNo=" + serialNo +
                '}';
    }
}

class B767 implements Airplane {
    private int capacity;
    private int serialNo;

    public B767(int capacity, int serialNo) {
        this.capacity = capacity;
        this.serialNo = serialNo;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "B767 has " + "capacity=" + capacity + ", serialNo=" + serialNo ;
    }
}

class AirplaneFactory {
    public static Airplane getAirplane(String type, int capacity, int serialNo) {
        if (type.equals("B747")) {
            return new B747(capacity, serialNo);
        } else if (type.equals("B757")) {
            return new B757(capacity, serialNo);
        } else if (type.equals("B767")) {
            return new B767(capacity, serialNo);
        } else {
            return null;
        }
    }
}


public class main3 {
    public static void main(String[] args) {

        Airplane airplane1 = AirplaneFactory.getAirplane("B747", 100, 1);
        Airplane airplane2 = AirplaneFactory.getAirplane("B757", 200, 2);

        System.out.println(airplane1);
        System.out.println(airplane2);

    }
}
