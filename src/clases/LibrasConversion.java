package clases;

public class LibrasConversion extends CurrencyConversion{
    
    public LibrasConversion() {
        this.setUnitValue(5411.95);
        this.setName("libras");
        this.setSymbol('£');
    }

    @Override
    public double colombianCurrencyConversion(double value) {
        double conversion = value / this.getUnitValue();
        return Math.round(conversion * 100.0) / 100.0;
    }

    @Override
    public double conversionToColombianCurrency(double value) {
        double conversion = value * this.getUnitValue();
        return Math.round(conversion * 100.0) / 100.0;
    }
}
