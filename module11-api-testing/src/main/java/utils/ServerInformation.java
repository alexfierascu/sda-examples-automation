package utils;

public enum ServerInformation {
    Server("Cowboy"), Connection("keep-alive"),
    ContentType("application/json;charset=UTF-8"), TransferEncoding("chunked"),
    Via("1.1 vegur");
    private final String value;

    ServerInformation(String value) {
        this.value = value;
    }
}
