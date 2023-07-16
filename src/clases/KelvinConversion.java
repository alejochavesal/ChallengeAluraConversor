package clases;

/**
 *
 * @author Johan
 */
public class KelvinConversion extends TemperatureConversion {

    public KelvinConversion() {
        this.setSymbol("K");
    }

    @Override
    public double degreesCentigradeConversion(double value) {
        return (Math.round(value + 273.15) * 100.0) / 100.0;
    }

    @Override
    public double conversionToDegreesCentigrade(double value) {
        return (Math.round(value - 273.15) * 100.0) / 100.0;
    }

}
