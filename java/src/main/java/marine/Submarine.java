package marine;

import lombok.Getter;

import java.util.List;

@Getter
public class Submarine {
    private Position position;

    public Submarine(int horizontal, int depth) {
        this.position = new Position(horizontal, depth);
    }

    public void move(List<Instruction> instructions) {
        instructions.forEach(this::move);
    }

    private void move(Instruction instruction) {
        if ("down".equals(instruction.getText())) {
            position = position.withProfondeur(calculateDepth(instruction));
        } else if ("up".equals(instruction.getText())) {
            position = position.withProfondeur(position.profondeur - instruction.getX());
        } else {
            position = position.withHorizontal(position.horizontal + instruction.getX());
        }
    }

    private int calculateDepth(Instruction instruction) {
        return position.profondeur + instruction.getX();
    }
}