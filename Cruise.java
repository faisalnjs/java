public class Cruise {
    private int price;
    private int people;

    public Cruise(int num, int thePrice) { // originally did not include constructor
        price = thePrice;
        people = num;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public void checkResponse(String response) {
        if (response.contains("cruise")) people++;
    }

    public int calculateRevenue() {
        int revenue = 0;
        if (people > 300 && price > 500) {
            revenue = people * (price - 500);
        } else if (200 <= people && people < 300 && price > 350) {
            revenue = people * (price - 350);
        } else {
            revenue = people * price;
        }
        return revenue;
    }

    public static void main(String[] args) {
        Cruise cr = new Cruise();
        cr.people = 78;
        cr.setPrice(4000);
        cr.setPrice(5000);
        cr.checkResponse("world cruise");
        cr.checkResponse("ship trip");
        System.out.println(cr.calculateRevenue());
        Cruise cr1 = new Cruise();
        cr1.people = 200;
        cr1.setPrice(2000);
        System.out.println(cr1.calculateRevenue());
        Cruise cr2 = new Cruise();
        cr2.people = 397;
        cr2.setPrice(6000);
        System.out.println(cr2.calculateRevenue());
    }
}
