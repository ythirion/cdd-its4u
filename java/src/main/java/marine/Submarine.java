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
            position = position.withDepth(calculateDepth(instruction));
        } else if ("up".equals(instruction.getText())) {
            position = position.withDepth(position.getDepth() - instruction.getX());
        } else {
            position = position.withHorizontal(position.getHorizontal() + instruction.getX());
        }
    }
    
    private int calculateDepth(Instruction instruction) {
        return position.getDepth() + instruction.getX();
    }
}