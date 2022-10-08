public class Winchester {
    private final TypeWinchester type;
    private final double volume;
    private final double weight;

    public Winchester(TypeWinchester type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public TypeWinchester getType() {
        return type;
    }

    public Winchester setType(TypeWinchester type) {
        return new Winchester(type,volume,weight);
    }

    public double getVolume() {
        return volume;
    }

    public Winchester setVolume(double volume) {
        return new Winchester(type,volume,weight);
    }

    public double getWeight() {
        return weight;
    }

    public Winchester setWeight(double weight) {
        return new Winchester(type,volume,weight);
    }
}
