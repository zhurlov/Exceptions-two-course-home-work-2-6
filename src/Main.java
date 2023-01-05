public class Main {
    public static void main(String[] args) {


        Car car = new Car("Geely", 2021, "China");
        System.out.println(car);

        Car car1 = new Car(2021);
        System.out.println(car1);
        car1.refill();


//        Transport transport = new Transport("Tugella", "gray green",  240);
//       System.out.println(transport);

        Train martin = new Train(3500, 1.50, "Белорусский вокзал", "станция Минск", 11);
        System.out.println(martin);
        //JOptionPane.showConfirmDialog(null,  martin );

        Train leningrad = new Train(car1.getBrand(), car1.getYearOfIssue(), car1.getCountryOfOrigin(), 1700, 0.35, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(leningrad.toString("D-125"));
        leningrad.setTripPrice(-1);
        System.out.println();
        leningrad.refill();


        Bus audi = new Bus("A6", "green", 320);
        System.out.println(audi);
        Bus bmw = new Bus("M5", "blue", 360);
        System.out.println(bmw);
        Bus mercedes = new Bus("E320", "white", 280);
        System.out.println(mercedes);
        audi.refill();

    }

}
