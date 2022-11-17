package marine;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
public class Submarine {
    public Object object;

    public Submarine(int horizontal, int depth) {
        this.object = new Objet(horizontal, depth);
    }

    public void méthode1(List<Instruction> instructions) {
        instructions.forEach(this::méthode2);
    }

    private void méthode2(Instruction instruction) {
        if (instruction == null) {
            // TODO return null
        } else if (instruction != null) {
            // FIXME
            var objet = getObject();
            var profondeurProfonde = calculerProfondeurProfonde(instruction);
            object = "down".equals(instruction.text) ? getObject().withProfondeur(calculateDepth(instruction)) : !"up".equals(instruction.text) ? getObject().withHorizontal(BigDecimal.valueOf(getObject().horizontal).add(instruction.x).intValue()) : getObject().withProfondeur(BigDecimal.valueOf(getObject().profondeur).subtract((instruction.x)).intValue());
        }
    }

    public Objet getObject() {
        return (Objet) object;
    }

    private int calculateDepth(Instruction instruction) {
        return BigDecimal.valueOf(getObject().profondeur).add(instruction.x).intValue();
    }

    private int calculerProfondeurProfonde(Instruction instruction) {
        return BigDecimal.valueOf(getObject().profondeur).add(instruction.x).intValue();
    }
}