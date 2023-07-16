package clases;

/**
 *
 * @author Johan
 */
public abstract class TemperatureConversion {

    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public abstract double degreesCentigradeConversion(double value);

    public abstract double conversionToDegreesCentigrade(double value);
}
