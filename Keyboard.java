public class Keyboard {
    private final TypeKeyboard type;
    private final boolean illumination;
    private final double weight;

    public Keyboard(TypeKeyboard type, boolean illumination, double weight) {
        this.type = type;
        this.illumination = illumination;
        this.weight = weight;
    }

    public TypeKeyboard getType() {
        return type;
    }

    public Keyboard setType(TypeKeyboard type) {
        return new Keyboard(type,illumination,weight);
    }

    public boolean isIllumination() {
        return illumination;
    }

    public Keyboard setIllumination(boolean illumination) {
        return new Keyboard(type,illumination,weight);
    }

    public double getWeight() {
        return weight;
    }

    public Keyboard setWeight(double weight) {
        return new Keyboard(type,illumination,weight);
    }
}
