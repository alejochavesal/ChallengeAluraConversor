package clases;

/**
 *
 * @author Johan
 */
public class FahrenheitConversion extends TemperatureConversion{
    
    public FahrenheitConversion() {
        this.setSymbol("°F");
    }

    @Override
    public double degreesCentigradeConversion(double value) {
        return (Math.round( value * 1.8 + 32) * 100.0) / 100.0;
    }

    @Override
    public double conversionToDegreesCentigrade(double value) {
        return (Math.round( (value - 32) / 1.8) * 100.0) / 100.0;
    }
    
}
