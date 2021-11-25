package decorator.concreteDecorators.phaseBoots;

import decorator.baseDecorators.AddDecoratorBootsOfSpeed;
import decorator.components.IComponentBootsOfSpeed;

public class DecoratorChainmail extends AddDecoratorBootsOfSpeed {

    public DecoratorChainmail(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costChainmail() {
        return 550;
    }

    @Override
    public int cost(){
        return super.cost() + costChainmail();
    }

}
