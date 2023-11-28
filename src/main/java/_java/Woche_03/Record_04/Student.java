package _java.Woche_03.Record_04;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Builder
@With
public class Student {
    private int age;
    private String name;
    private int classroom;
}
