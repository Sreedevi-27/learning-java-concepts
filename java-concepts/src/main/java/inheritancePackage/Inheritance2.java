package inheritancePackage;

public class Inheritance2 {
    public static void main(String[] args) {
        House house = new House(150000, 2);
        System.out.println(house.squareFeet);
        System.out.println("-------------------------------------");

        House house1 = new House(house);
        System.out.println(house1.cost);
        System.out.println(house1.squareFeet);

        System.out.println("-------------------------------------");
        TwoBHK twoBHK = new TwoBHK();
        ThreeBHK threeBHK = new ThreeBHK();

        System.out.println("-------------------------------------");
        twoBHK.numberOfBedRooms();

        System.out.println("-------------------------------------");
        TwoBHK twoBHK1 = new TwoBHK(twoBHK);
        System.out.println(twoBHK1.cost);
    }
}

class House{
    int cost;
    int squareFeet;
    int common = 5;

    House(){
        this.cost = 100000;
        this.squareFeet = 1;
        System.out.println("House - inside Default constructor");
    }

    House(int cost, int squareFeet){
        this.cost = cost;
        this.squareFeet = squareFeet;
        System.out.println("House - inside overloaded constructor");
    }

    House(House house){   // copy constructor
        this.cost = house.cost;
       // this.squareFeet = house.squareFeet;
    }

    public void numberOfBedRooms(){
        System.out.println("One room");
    }
}

class TwoBHK extends House{
    int common = 10;
    TwoBHK(){
        // when child class Default constructor is called, by default parent class Default will be called
        this.cost = 500000;
        this.squareFeet = 5;
        System.out.println("TwoBHK - inside Default constructor");
    }

    TwoBHK(TwoBHK twoBHK){
        super(twoBHK);    // same as     House house = new TwoBHK();
        this.cost = twoBHK.cost;
    }

    public void numberOfBedRooms(){
        System.out.println("Two room");
        System.out.println(this.common);
        System.out.println(super.common);
    }
}

class ThreeBHK extends House{
    ThreeBHK(){
        super(20000, 1);
        this.cost = 1000000;
        this.squareFeet = 10;
        System.out.println("ThreeBHK - inside Default constructor");
    }

    public void numberOfBedRooms(){
        System.out.println("Three room");
    }
}