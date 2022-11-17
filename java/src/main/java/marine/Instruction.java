package marine;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Instruction {
    public String text;
    public int x;

    public static Instruction fromText(String text) {
        var split = text.split(" ");
        return new Instruction(split[0], Integer.parseInt(split[1]));
    }
}