package decorator.concreteDecorators.tranquilBoots;

import decorator.baseDecorators.AddDecoratorBootsOfSpeed;
import decorator.components.IComponentBootsOfSpeed;

public class DecoratorRingOfRegen extends AddDecoratorBootsOfSpeed {
    public DecoratorRingOfRegen(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costRingOfRegen() {
        return 175;
    }

    @Override
    public int cost(){
        return super.cost() + costRingOfRegen();
    }

}
