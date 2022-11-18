package Transport;

public class Mechanic <T extends Transport>{
    private final String name;
    private final String company;

    public boolean diagnostic(T t) {
        return t.diagnostic();
    }

    public void repair(T t) {
        t.repair();
    }
    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }
}
