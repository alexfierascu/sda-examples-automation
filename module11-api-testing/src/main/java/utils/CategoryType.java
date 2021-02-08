package utils;

public enum CategoryType {
    FRUITS("Fruits"), DRIED("Dried"),
    FRESH("Fresh"), EXOTIC("Exotic"),
    NUTS("Nuts");
    private final String value;

    CategoryType(String value) {
        this.value = value;
    }
}