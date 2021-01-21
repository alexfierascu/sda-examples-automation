package response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AllVendorResponse {
    @JsonProperty("vendors")
    private List<VendorResponse> vendors;
}
