public enum Type {
    ACOUSTIC, ELECTRIC, ACOUSTIC_ELECTRIC, BASS, SEMI_HOLLOW;

    public String toString() {
        return switch (this) {
            case ACOUSTIC -> "acoustic";
            case ELECTRIC -> "electric";
            case ACOUSTIC_ELECTRIC -> "acoustic electric";
            case BASS -> "bass";
            case SEMI_HOLLOW -> "semi hollow";
            default -> ""; // or any other appropriate default value
        };
    }
}
