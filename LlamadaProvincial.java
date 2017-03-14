package central;

public class LlamadaProvincial extends Llamada
{	
	double Precio1 = 0.20;
	double Precio2 = 0.25;
	double Precio3 = 0.30;
	int Franja;
	double Monto;
	
	public LlamadaProvincial(String param1, String param2, double param3, int param4) 
	{
		super(param1, param2, param3);
		Franja = param4;
	}

	public double calcularPrecio() 
	{
		if(Franja == 1)
		{
			Monto = (Duracion * Precio1);
		}
		else if(Franja == 2)
		{
			Monto = (Duracion * Precio2);
		}
		else if(Franja == 3)
		{
			Monto = (Duracion * Precio3);
		}
		return Monto;
	}
	
	public String toString() 
	{
		return "Llamada [Numero de Origen=" + numOrigen+ ", Numero de Destino=" + numDestino + ", Duracion=" + Duracion + ", Precio="+ Monto+"]";	
	}

}
