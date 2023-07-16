package clases;

public class DolarConversion extends CurrencyConversion{
    
    public DolarConversion() {
        this.setUnitValue(4129.27);
        this.setName("dolares");
        this.setSymbol('$');
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
