package response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class VendorResponse {
    @JsonProperty("vendorName")
    private String vendorName;
    @JsonProperty("vendorUrl")
    private String vendorUrl;

}
