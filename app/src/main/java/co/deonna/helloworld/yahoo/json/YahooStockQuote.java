package co.deonna.helloworld.yahoo.json;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * Created by dhodges on 7/21/17.
 */

public class YahooStockQuote {

    private String symbol;

    @SerializedName("Name")
    private String name;

    @SerializedName("LastTradePriceOnly")
    private BigDecimal lastTradePriceOnly;

    @SerializedName("DaysLow")
    private BigDecimal daysLow;

    @SerializedName("DaysHigh")
    private BigDecimal daysHigh;

    @SerializedName("Volume")
    private String volume;
}
