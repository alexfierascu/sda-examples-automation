package depurtat.utils;

public enum CategoryId {
    GHETE("273479"), GHETE_CU_SIRET("330059"),
    GHETE_FARA_SIRET("330060"), GHETE_DE_IARNA("330057"),
    GHETE_PRIMAVAVARA_TOAMNA("330056"),SPORT("330030");
    private final String value;

    CategoryId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
