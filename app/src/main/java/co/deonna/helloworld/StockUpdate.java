package co.deonna.helloworld;

import org.parceler.Parcel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by deonna on 6/8/17.
 */

@Parcel
public class StockUpdate {

    private String stockSymbol;
    private BigDecimal price;
    private Date date;

    public StockUpdate() {}

    public StockUpdate(String stockSymbol, double price, Date date) {

        this.stockSymbol = stockSymbol;
        this.price = new BigDecimal(price);
        this.date = date;
    }

    public String getStockSymbol() {

        return stockSymbol;
    }

    public BigDecimal getPrice() {

        return price;
    }

    public Date getDate() {

        return date;
    }
}
