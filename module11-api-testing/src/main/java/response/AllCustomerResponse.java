package response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AllCustomerResponse {
    @JsonProperty("customers")
    private List<CustomerResponse> customers;
}
