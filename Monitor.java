public class Monitor {
    private final double diagonal;
    private final TypeMonitor type;
    private final double weight;

    public Monitor(double diagonal, TypeMonitor type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public Monitor setDiagonal(double diagonal) {
        return new Monitor(diagonal,type,weight);
    }

    public TypeMonitor getType() {
        return type;
    }

    public Monitor setType(TypeMonitor type) {
        return new Monitor(diagonal,type,weight);
    }

    public double getWeight() {
        return weight;
    }

    public Monitor setWeight(double weight) {
        return new Monitor(diagonal,type,weight);
    }
}
