package uap.models;

import java.text.NumberFormat;
import java.util.Locale;

import uap.bases.Shape;
import uap.interfaces.MassCalcuable;
import uap.interfaces.MassConverter;
import uap.interfaces.PiRequired;
import uap.interfaces.ShippingCostCalculator;
import uap.interfaces.ThreeDimensional;

public class Sphere extends Shape
implements MassCalcuable, MassConverter, PiRequired, ShippingCostCalculator, ThreeDimensional {
    private double radius;

    public Sphere(){

    }

    public Sphere (double radius){
        this.radius = radius;
    }

    @Override
    public double getVolume(){
        return 4/3.0 * PI * Math.pow(radius, 3) ;

    }

    @Override
    public double getSurfaceArea(){
        return 4 * PI * Math.pow(radius, 3);
    }

    @Override
    public double getMass(){
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public double gramToKilogram(){
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost(){
        return gramToKilogram() * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.println("Volume\t\t: " + getVolume());
        System.out.println("Luas Permukaan\t: " + getSurfaceArea());
        System.out.println("Massa\t\t: " + getMass());
        System.out.println("Massa dalam kg\t: " + gramToKilogram());

        System.out.println("Biaya kirim\t: " + calculateCost());
    }

}
