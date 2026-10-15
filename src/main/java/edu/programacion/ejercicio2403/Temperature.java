package edu.programacion.ejercicio2403;

public class Temperature {
    private Double celsius;

    public Temperature() {
        celsius = 0.0;
    }

    public Double getCelsius() {
        return celsius;
    }

    public void setCelsius(Double value) {
        this.celsius = value;
    }

    public Double getFahrenheit() {
        return celsius * 1.8 + 32;
    }

    public void setFahrenheit(Double value) {
        this.celsius = (value - 32) / 1.8;
    }

    public Double getKelvin() {
        return celsius + 273.15;
    }

    public void setKelvin(Double value) {
        this.celsius = value - 273.15;
    }

    public Double convertTemperature(Double value, String scale, String targetScale) {
        Double enCelsius = 0.0;

        switch (scale) {
            case "Celsius": enCelsius = value; break;
            case "Fahrenheit": enCelsius = (value - 32) / 1.8; break;
            case "Kelvin": enCelsius = value - 273.15; break;
            case "Rankine": enCelsius = (value - 491.67) * 5/9; break;
            case "Reaumur": enCelsius = value * 1.25; break;
        }

        switch (targetScale) {
            case "Celsius": return enCelsius;
            case "Fahrenheit": return enCelsius * 1.8 + 32;
            case "Kelvin": return enCelsius + 273.15;
            case "Rankine": return enCelsius * 9/5 + 491.67;
            case "Reaumur": return enCelsius * 0.8;
            default: return enCelsius;
        }
    }
}