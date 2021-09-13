package one.digitalinovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinovation.personapi.entity.Phone;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotNull
    @Size(min = 2, max = 100)
    private String fisrtName;

    @NotNull
    @Size(min = 2, max = 100)
    private String lastName;

    @NotNull
    @CPF
    private String cpf;

    private LocalDate birthDate;

    @Valid
    @NotNull
    private List<Phone> phones;
}
