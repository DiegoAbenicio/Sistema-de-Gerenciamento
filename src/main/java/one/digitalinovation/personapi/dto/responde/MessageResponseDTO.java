package one.digitalinovation.personapi.dto.responde;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {
    private String message;
}
