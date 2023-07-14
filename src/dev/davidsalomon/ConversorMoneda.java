package dev.davidsalomon;

public class ConversorMoneda {
    double cantidad, conversion;

    public void ConversorMoneda(double cantidad) {
        this.cantidad = cantidad;
        this.conversion = 0;
    }

    public double fromDollar(TipoCambio tipoCambio) {
        switch (tipoCambio) {
            case DOLAR:
                this.conversion = cantidad;
                break;
            case EURO:
                this.conversion = cantidad * 0.89;
                break;
            case LIBRA:
                this.conversion = cantidad * 0.76;
                break;
            case YEN:
                this.conversion = cantidad * 137.63;
                break;
            case WON:
                this.conversion = cantidad * 1262.95;
                break;
            default:
                throw new IllegalArgumentException("Tipo de cambio no válido");
        }
        return conversion;
    }

    public double fromEuro(TipoCambio tipoCambio) {
        switch (tipoCambio) {
            case DOLAR:
                this.conversion = cantidad * 1.12;
                break;
            case EURO:
                this.conversion = cantidad;
                break;
            case LIBRA:
                this.conversion = cantidad * 0.86;
                break;
            case YEN:
                this.conversion = cantidad * 154.62;
                break;
            case WON:
                this.conversion = cantidad * 1419.19;
                break;
            default:
                throw new IllegalArgumentException("Tipo de cambio no válido");
        }
        return conversion;
    }

    public double fromPound(TipoCambio tipoCambio) {
        switch (tipoCambio) {
            case DOLAR:
                this.conversion = cantidad * 1.31;
                break;
            case EURO:
                this.conversion = cantidad * 1.17;
                break;
            case LIBRA:
                this.conversion = cantidad;
                break;
            case YEN:
                this.conversion = cantidad * 180.68;
                break;
            case WON:
                this.conversion = cantidad * 1658.46;
                break;
            default:
                throw new IllegalArgumentException("Tipo de cambio no válido");
        }
        return conversion;
    }

    public double fromYen(TipoCambio tipoCambio) {
        switch (tipoCambio) {
            case DOLAR:
                this.conversion = cantidad * 0.0073;
                break;
            case EURO:
                this.conversion = cantidad * 0.0065;
                break;
            case LIBRA:
                this.conversion = cantidad * 0.0055;
                break;
            case YEN:
                this.conversion = cantidad;
                break;
            case WON:
                this.conversion = cantidad * 9.18;
                break;
            default:
                throw new IllegalArgumentException("Tipo de cambio no válido");
        }
        return conversion;
    }

    public double fromWon(TipoCambio tipoCambio) {
        switch (tipoCambio) {
            case DOLAR:
                this.conversion = cantidad * 0.00079;
                break;
            case EURO:
                this.conversion = cantidad * 0.00070;
                break;
            case LIBRA:
                this.conversion = cantidad * 0.00060;
                break;
            case YEN:
                this.conversion = cantidad * 0.11;
                break;
            case WON:
                this.conversion = cantidad;
                break;
            default:
                throw new IllegalArgumentException("Tipo de cambio no válido");
        }
        return conversion;
    }

    public enum TipoCambio {
        DOLAR, EURO, LIBRA, YEN, WON
    }


}
