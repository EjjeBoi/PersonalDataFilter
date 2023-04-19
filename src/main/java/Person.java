import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private int id;
    private String name;
    private int waterCount;
    private int gasCount1;
    private int gasCount2;
    private int electroCount1;
    private int electroCount2;
}
