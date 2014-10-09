package com.zubiri.constructor;

public class Circulo{
	
private double area;
private double circunferencia;
private double radio;

public Circulo (double valorRadio)
{
this.radio = valorRadio;
}

public void  setRadio (double Radio)
{
this.radio = Radio;
}

public double Area ()
{
area = 3.1416 * radio * radio; 
return area;
} 

public double Circunferencia ()
{
circunferencia = 2 * 3.1416 * radio;
return circunferencia;
}

public double getArea()
{
return area;
}

public double getCircunferencia()
{
return circunferencia;
	}

}
