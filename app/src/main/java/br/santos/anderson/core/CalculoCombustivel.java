package br.santos.anderson.core;

public class CalculoCombustivel {
    private double alcool, gasolina;

    public double getAlcool() {
        return alcool;
    }

    public void setAlcool(double alcool) {
        this.alcool = alcool>0?alcool:0;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina>0?gasolina:0;
    }

    public CalculoCombustivel(double alcool, double gasolina) {
        this.alcool = alcool>0?alcool:0;
        this.gasolina = gasolina>0?gasolina:0;
    }

    public boolean selectFuel(){
        if(this.alcool<=0.7*this.gasolina)
            return true;
        return false;
    }
}
