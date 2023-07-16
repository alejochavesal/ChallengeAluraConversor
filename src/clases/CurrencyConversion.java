package clases;

public abstract class CurrencyConversion {

    private double unitValue;
    private String name;
    private char symbol;

    public double getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(double unitValue) {
        this.unitValue = unitValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public abstract double colombianCurrencyConversion(double value);

    public abstract double conversionToColombianCurrency(double value);
}
