package Transport;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return name.equals(mechanic.name) && company.equals(mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }
}
