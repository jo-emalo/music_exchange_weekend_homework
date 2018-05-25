import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Accessories accessories;

    @Before
    public void before(){
        shop = new Shop();
    }

    @Test
    public void canGetShopInventoryCount() {
        assertEquals(0, shop.getShopInventoryCount());
    }

    @Test
    public void canAddStockToShopInventory() {
        shop.addStockToShopInventoryCount(accessories);
        assertEquals(1, shop.getShopInventoryCount());
    }

    @Test
    public void canRemoveStockFromShopInventory() {
        shop.addStockToShopInventoryCount(accessories);
        shop.removeStockFromShopInventory(accessories);
        assertEquals(0, shop.getShopInventoryCount());
    }

}
