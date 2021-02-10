package response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Vendor;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class VendorResponse extends Vendor {
    @JsonProperty("vendorUrl")
    private String vendorUrl;

}
