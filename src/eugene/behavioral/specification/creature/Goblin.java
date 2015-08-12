package eugene.behavioral.specification.creature;

import eugene.behavioral.specification.property.Color;
import eugene.behavioral.specification.property.Movement;
import eugene.behavioral.specification.property.Size;

/**
 * Created by Jian on 2015/8/12.
 */
public class Goblin extends AbstractCreature {
    public Goblin() {
        super("Goblin", Size.SMALL, Movement.WALKING, Color.GREEN);
    }
}
