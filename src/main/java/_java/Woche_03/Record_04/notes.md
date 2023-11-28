# Record

##  

###  

```
//code notes go here:
public record Name(
        String name,
        int prive,
        double country
) {
}

//BigDecimal
new BigDecimal("");

//Lombok
@Getter
@Setter
@With
@Required Args Constructor
@Builder

//Lombok @Builder and @With
Student student01 = Student.builder()
                .age(24)
                .name("Jesse")
                .classroom(01)
                .build();
        Student student02 = student01.withClassroom(02);

        Teacher teacher01 = new Teacher("Walter", 52, "Meth");
        Teacher teacher02 = teacher01.withSubject("Chemistry");
```

- Sammlung Konstanten in einer Klasse
- BigDecimal String | Methoden zum rechnen
- Lombok : um keine setter und getter Methoden schreiben zu müssen
- `Required Args Constructor` generiert den Constructor automatisch
- `Builder` übersichtlicheres erstellen von Objekten
- `With` erstellt eine copy eines Objektes mit einem veränderten Wert
- `Setter / Getter` erstellt automatisch getter und setter methode

- [x]
- [ ]

### Bilder

Ein Bild aus dem Internet:
![Bildadresse kopieren und einfügen.](https://pbs.twimg.com/media/FMtAtFDXoAEVfUd.jpg "Bild aus dem Internet")