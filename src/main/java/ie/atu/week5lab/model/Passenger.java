package ie.atu.week5lab.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//THIS WAS ADDED SO I CAN COMMIT FOR WK6
public class Passenger {
    @NotBlank @Size(max = 40)
    private String passengerId;

    @NotBlank @Size(max = 60)
    private String name;

    @NotBlank (message = "email is required")
    @Email(message = "email must be a valid address")
    private String email;
}
