package uap.models;

import java.text.NumberFormat;
import java.util.Locale;

import uap.bases.Shape;
import uap.interfaces.MassCalcuable;
import uap.interfaces.MassConverter;
import uap.interfaces.PiRequired;
import uap.interfaces.ShippingCostCalculator;
import uap.interfaces.ThreeDimensional;

public class Torus extends Shape
implements MassCalcuable, MassConverter, PiRequired, ShippingCostCalculator, ThreeDimensional {
    private double majorRadius;
    private double minorRadius;

    public Torus(){
        
    }

    public Torus(double majorRadius, double minorRadius){
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume(){
        return 2 * Math.pow(PI, 2)* majorRadius * Math.pow(minorRadius, 2) ;
    }
    
    @Override
    public double getSurfaceArea(){
        return 4 * Math.pow(PI, 2)* majorRadius * minorRadius;
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
