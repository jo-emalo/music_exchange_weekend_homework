import Accessories.Accessories;
import Instruments.Instrument;
import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stockList;

    public Shop() {
        stockList = new ArrayList<>();
    }

    public int getIstockCount() {
        return this.stockList.size();
    }

    public void addToIstock(ISell stock) {
        this.stockList.add(stock);
    }

    public void removeStockFromIstock(Accessories accessories) {
        this.stockList.remove(0);
    }
}
