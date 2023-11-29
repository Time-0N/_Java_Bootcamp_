package _java.Woche_03.Exceptions_08;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record Student(
        String id,
        String name,
        String subject
) {
}

