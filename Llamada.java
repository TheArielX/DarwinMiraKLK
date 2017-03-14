package central;

public abstract class Llamada 
{	
	String numOrigen;
	String numDestino;
	double Duracion;
	
	public Llamada (String param1, String param2, double param3)
	{
		numOrigen = param1;
		numDestino = param2;
		Duracion = param3;
	}

	public String getNumOrigen() 
	{
		return numOrigen;
	}

	public String getNumDestino() 
	{
		return numDestino;
	}

	public double getDuracion() 
	{
		return Duracion;
	}
	
	public abstract double calcularPrecio();
	
}
