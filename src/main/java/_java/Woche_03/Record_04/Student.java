package _java.Woche_03.Record_04;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.With;

@Getter
@Setter
@With
@Builder
public class Student {
    private int age;
    private String name;
    private int classroom;
}
