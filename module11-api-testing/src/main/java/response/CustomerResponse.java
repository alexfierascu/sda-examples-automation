package response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Customer;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomerResponse extends Customer {
    @JsonProperty("customerUrl")
    private String customerUrl;
}
