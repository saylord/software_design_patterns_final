package decorator.concreteDecorators.powerTreads;

import decorator.baseDecorators.AddDecoratorBootsOfSpeed;
import decorator.components.IComponentBootsOfSpeed;

public class DecoratorGlovesOfHaste extends AddDecoratorBootsOfSpeed {

    public DecoratorGlovesOfHaste(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costGlovesOfHaste() {
        return 450;
    }

    @Override
    public int cost(){
        return super.cost() + costGlovesOfHaste();
    }

}
