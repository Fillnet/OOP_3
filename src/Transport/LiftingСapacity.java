package Transport;

public enum LiftingСapacity {
    N1(0.0,3.5),
    N2(3.5,12.0),
    N3(12.0,null);
private final Double from;
private final Double to;

    LiftingСapacity(Double from, Double to) {
        this.from = from;
        this.to = to;
    }

    public Double getFrom() {
        return from;
    }

    public Double getTo() {
        return to;
    }
}
