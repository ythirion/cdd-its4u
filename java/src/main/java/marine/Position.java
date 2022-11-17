package marine;

import lombok.AllArgsConstructor;
import lombok.With;

@AllArgsConstructor
@With
public class Position {
    public final int horizontal;
    public final int depth;
}