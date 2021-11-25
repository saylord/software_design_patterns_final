package decorator.concreteDecorators.powerTreads;

import decorator.baseDecorators.AddDecoratorBootsOfSpeed;
import decorator.components.IComponentBootsOfSpeed;

public class DecoratorBeltOfStrength extends AddDecoratorBootsOfSpeed {
    public DecoratorBeltOfStrength(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costBeltOfStrength() {
        return 450;
    }

    @Override
    public int cost(){
        return super.cost() + costBeltOfStrength();
    }
}
