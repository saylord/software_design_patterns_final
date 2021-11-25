package facade;

import facade.interfaces.IItem;

public class UpgradedItem implements IItem {

    public String purchaseItem;

    @Override
    public void purchaseItem(String items) {
        purchaseItem = items + " have purchased.";
    }

    @Override
    public String deliverItem() {
        return purchaseItem;
    }
}
