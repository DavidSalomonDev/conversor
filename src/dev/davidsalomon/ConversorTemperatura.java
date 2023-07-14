package dev.davidsalomon;

public class ConversorTemperatura {
    double temperatura, conversion;

    public void ConversorTemperatura(double temperatura) {
        this.temperatura = temperatura;
        this.conversion = 0;
    }

    public double fromCelsius(Medicion medicion) {
        switch (medicion) {
            case CELSIUS:
                this.conversion = temperatura;
                break;
            case FAHRENHEIT:
                this.conversion = temperatura * 1.8 + 32;
                break;
            case KELVIN:
                this.conversion = temperatura + 273.15;
            default:
                throw new IllegalArgumentException("Tipo de temperatura no válida");
        }
        return conversion;
    }

    public double fromFahrenheit(Medicion medicion) {
        switch (medicion) {
            case CELSIUS:
                this.conversion = (temperatura - 32) / 1.8;
                break;
            case FAHRENHEIT:
                this.conversion = temperatura;
                break;
            case KELVIN:
                this.conversion = (temperatura + 459.67) / 1.8;
            default:
                throw new IllegalArgumentException("Tipo de temperatura no válida");
        }
        return conversion;
    }

    public double fromKelvin(Medicion medicion) {
        switch (medicion) {
            case CELSIUS:
                this.conversion = temperatura - 273.15;
                break;
            case FAHRENHEIT:
                this.conversion = (temperatura * 9) - 459.67;
                break;
            case KELVIN:
                this.conversion = temperatura;
            default:
                throw new IllegalArgumentException("Tipo de temperatura no válida");
        }
        return conversion;
    }

    public enum Medicion {
        CELSIUS, FAHRENHEIT, KELVIN;
    }


}
