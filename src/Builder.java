public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINS, TAYLOR, OLSON, RYAN, PRS, ANY;

    public String toString() {
        return switch (this) {
            case FENDER ->  "fender";
            case GIBSON -> "gibson";
            case PRS -> "prs";
            case MARTIN -> "martin";
            case RYAN -> "ryan";
            case OLSON -> "olson";
            case COLLINS -> "collins";
            case TAYLOR -> "taylor";
            case ANY -> "any";
            default -> "";
        };
    }
}
