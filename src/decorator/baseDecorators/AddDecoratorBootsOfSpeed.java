package decorator.baseDecorators;

import decorator.components.IComponentBootsOfSpeed;

public class AddDecoratorBootsOfSpeed implements IComponentBootsOfSpeed {
    private IComponentBootsOfSpeed iComponentBootsOfSpeed;

    public AddDecoratorBootsOfSpeed(IComponentBootsOfSpeed iComponentBootsOfSpeed) {
        this.iComponentBootsOfSpeed = iComponentBootsOfSpeed;
    }

    @Override
    public int cost() {
        return iComponentBootsOfSpeed.cost();
    }

    @Override
    public String getNotification() {
        return iComponentBootsOfSpeed.getNotification();
    }

}
