package decorator.concreteDecorators.tranquilBoots;

import decorator.baseDecorators.AddDecoratorBootsOfSpeed;
import decorator.components.IComponentBootsOfSpeed;

public class DecoratorWindLace extends AddDecoratorBootsOfSpeed {
    public DecoratorWindLace(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costWindLace() {
        return 250;
    }

    @Override
    public int cost(){
        return super.cost() + costWindLace();
    }

}
