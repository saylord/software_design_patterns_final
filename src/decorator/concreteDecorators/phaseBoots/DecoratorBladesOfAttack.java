package decorator.concreteDecorators.phaseBoots;

import decorator.baseDecorators.AddDecoratorBootsOfSpeed;
import decorator.components.IComponentBootsOfSpeed;

public class DecoratorBladesOfAttack extends AddDecoratorBootsOfSpeed {
    public DecoratorBladesOfAttack(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costBladesOfAttack() {
        return 450;
    }

    @Override
    public int cost(){
        return super.cost() + costBladesOfAttack();
    }

}
