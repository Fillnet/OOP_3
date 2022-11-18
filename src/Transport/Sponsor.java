package Transport;

public class Sponsor {
    private final String name;
    private final int amount;

    public void toSponsorRace() {
        System.out.printf("Sponsor \"%s\" is sponsor race to %d%n",name,amount);
    }
    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
