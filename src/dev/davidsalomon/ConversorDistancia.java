package dev.davidsalomon;

public class ConversorDistancia {
    double distancia, conversion;

    public void ConversorTemperatura(double distancia) {
        this.distancia = distancia;
        this.conversion = 0;
    }

    public double fromKm(TipoDistancia d) {
        switch (d) {
            case KM:
                this.conversion = distancia;
                break;
            case MILE:
                this.conversion = distancia * 0.621371;
                break;
            default:
                throw new IllegalArgumentException("Tipo de distancia no válida");
        }
        return conversion;
    }

    public double fromMile(TipoDistancia d) {
        switch (d) {
            case KM:
                this.conversion = distancia * 1.60934;
                break;
            case MILE:
                this.conversion = distancia;
                break;
            default:
                throw new IllegalArgumentException("Tipo de distancia no válida");
        }
        return conversion;
    }


    public enum TipoDistancia {
        KM, MILE
    }
}
