package com.zubiri.constructor;
public class Rectangulo{

private double vbase;
private double valtura;
private double vperimetro;
private double vsuperficie;


public Rectangulo (double valoralto ,double valorlargo)
{
	this.vbase = valorlargo;
	this.valtura = valoralto;
}
public void setBase (double base)
{
	this.vbase = base;
}
public void setAltura (double altura)
{
	this.valtura = altura;
}


public double getBase()
{
	return vbase;
}

public double getAltura()
{
	return valtura;
}

public double Superficie ()
{
	vsuperficie = vbase * valtura;
	return vsuperficie;
}

public double Perimetro ()
{
	vperimetro = (2*vbase) + (2*valtura);
	return vperimetro; 
	}
}



