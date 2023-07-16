package clases;

public class YenConversion extends CurrencyConversion{
    
    public YenConversion() {
        this.setUnitValue(29.75);
        this.setName("yenes");
        this.setSymbol('¥');
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








































