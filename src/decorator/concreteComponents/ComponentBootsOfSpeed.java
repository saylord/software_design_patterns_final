package decorator.concreteComponents;

import decorator.components.IComponentBootsOfSpeed;

public class ComponentBootsOfSpeed implements IComponentBootsOfSpeed {

    @Override
    public int cost() {
        return 500;
    }

    @Override
    public String getNotification() {
        return "Boots of Speed";
    }

}
