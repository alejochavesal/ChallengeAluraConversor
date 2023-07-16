package clases;

public class EuroConversion extends CurrencyConversion{
    
    public EuroConversion() {
        this.setUnitValue(4618.67);
        this.setName("euros");
        this.setSymbol('€');
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
