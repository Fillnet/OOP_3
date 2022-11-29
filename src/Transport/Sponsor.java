package Transport;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
