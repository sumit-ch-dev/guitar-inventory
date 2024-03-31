public class GuitarSpec {
    private String model;
    private Builder builder;
    private Wood backWood, topWood;
    private Type type;

    public GuitarSpec(String model, Builder builder, Wood backWood, Wood topWood, Type type) {
        this.model = model;
        this.builder = builder;
        this.backWood = backWood;
        this.topWood = topWood;
        this.type = type;
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "model='" + model + '\'' +
                ", builder=" + builder +
                ", backWood=" + backWood +
                ", topWood=" + topWood +
                ", type=" + type +
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
}
