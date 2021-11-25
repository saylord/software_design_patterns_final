package decorator.concreteDecorators.arcaneBoots;

import decorator.baseDecorators.AddDecoratorBootsOfSpeed;
import decorator.components.IComponentBootsOfSpeed;

public class DecoratorEnergyBooster extends AddDecoratorBootsOfSpeed {
    public DecoratorEnergyBooster(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costEnergyBooster() {
        return 800;
    }

    @Override
    public int cost(){
        return super.cost() + costEnergyBooster();
    }
}
