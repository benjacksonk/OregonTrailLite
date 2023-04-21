package org.yup.oregontrail;

public class OregonTrailApp {

    public static void main(String[] args) {

        Traveler dwene = new Traveler("Dwene", 100, 100);

        System.out.println("before hunting food: " + dwene.getFood());
        System.out.println(dwene.hunt());
        System.out.println("after hunting food: " + dwene.getFood());
        System.out.println(dwene.hunt());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println("food: " + dwene.getFood());

        Traveler eric = new Traveler("Eric", 75, 127);

        Wagon dwagon = new Wagon(5);

        //print the count of passengers in the passenger list of wagon
        System.out.println("number of people on the wagon: " + dwagon.getPassengers().size());

        //attempt to have a passenger join the wagon if there is room
        System.out.println(dwagon.join(dwene));

        //print the count of passengers in the passenger list of wagon
        System.out.println("number of people on the wagon: " + dwagon.getPassengers().size());

        //attempt to have a passenger join the wagon if there is room
        System.out.println(dwagon.join(eric));

        System.out.println(dwagon.getTotalFood());

    }

}
