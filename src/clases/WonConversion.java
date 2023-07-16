package clases;

public class WonConversion extends CurrencyConversion{
    
    public WonConversion() {
        this.setUnitValue(3.25);
        this.setName("wones");
        this.setSymbol('₩');
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
