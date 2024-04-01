public class GuitarSpec {
    private final String model;
    private final Builder builder;
    private final Wood backWood;
    private final Wood topWood;
    private final Type type;

    private final int numStrings;

    public GuitarSpec(String model, Builder builder, Wood backWood, Wood topWood, Type type, int numStrings) {
        this.model = model;
        this.builder = builder;
        this.backWood = backWood;
        this.topWood = topWood;
        this.type = type;
        this.numStrings = numStrings;
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "model='" + model + '\'' +
                ", builder=" + builder +
                ", backWood=" + backWood +
                ", topWood=" + topWood +
                ", type=" + type +
                ", strings" + numStrings +
                '}';
    }

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public Type getType() {
        return type;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public boolean matches(GuitarSpec otherSpecs) {
        if(builder != otherSpecs.getBuilder()) return false;

        if((model != null) && (!model.isEmpty()) && (!model.equals(otherSpecs.model))) return false;

        if(type != otherSpecs.type) return false;

        if(numStrings != otherSpecs.numStrings) return false;

        if(backWood != otherSpecs.backWood) return false;

        if(topWood != otherSpecs.topWood) return false;

        return true;
    }
}
