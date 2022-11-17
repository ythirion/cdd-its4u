package marine;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import lombok.Getter;
import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;
import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;
import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;
import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.With;
import java.util.List;
import lombok.Getter;
import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.With;
import java.util.List;
import lombok.Getter;
import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.With;

@AllArgsConstructor
public class Instruction {
    public String text;
    public BigDecimal x;

    public static Instruction fromText(String text) {
        var split = text.split(" ");
        return new Instruction(split[0], BigDecimal.valueOf(Integer.parseInt(split[1])));
    }
}