public enum Wood {

    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA, OVANGKOL, ROSEWOOD, EBONY;

    public String toString() {
        return switch (this) {
            case ALDER -> "alder";
            case CEDAR -> "cedar";
            case MAPLE -> "maple";
            case SITKA -> "stika";
            case COCOBOLO -> "cocobolo";
            case MAHOGANY -> "mahagony";
            case ADIRONDACK -> "adirondack";
            case INDIAN_ROSEWOOD -> "indian rosewood";
            case BRAZILIAN_ROSEWOOD -> "brazillian rosewood";
            case OVANGKOL -> "ovangkol";
            case EBONY -> "ebony";
            default -> "";
        };
    }

}
