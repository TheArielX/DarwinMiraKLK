package central;

public class LlamadaLocal extends Llamada
{	
	double Precio = 0.15;
	double Monto = 0;

	public LlamadaLocal(String param1, String param2, double param3) 
	{
		super(param1, param2, param3);
		
	}
	
	public double calcularPrecio() 
	{
		Monto = (Duracion * Precio);
		return Monto;
	}
	
	public String toString() 
	{
		return "Llamada [Numero de Origen=" + numOrigen+ ", Numero de Destino=" + numDestino + ", Duracion=" + Duracion + ", Precio="+ Monto+"]";	
	}
}
