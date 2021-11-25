package decorator.concreteDecorators.bootsOfTravel;

import decorator.baseDecorators.AddDecoratorBootsOfSpeed;
import decorator.components.IComponentBootsOfSpeed;

public class DecoratorRecipeBootsOfTravel extends AddDecoratorBootsOfSpeed {
    public DecoratorRecipeBootsOfTravel(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        super(iComponentBootsOfSpeed);
    }

    private int costRecipeBootsOfTravel() {
        return 2000;
    }

    @Override
    public int cost(){
        return super.cost() + costRecipeBootsOfTravel();
    }

}
