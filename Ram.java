public class Ram {
    private final TypeRam type;
    private final double volume;
    private final double weight;

    public Ram(TypeRam type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public TypeRam getType() {
        return type;
    }

    public Ram setType(TypeRam type) {
        return new Ram(type,volume,weight);
    }

    public double getVolume() {
        return volume;
    }

    public Ram setVolume(double volume) {
        return new Ram(type,volume,weight);
    }

    public double getWeight() {
        return weight;
    }

    public Ram setWeight(double weight) {
        return new Ram(type,volume,weight);
    }
}