package central;

public class Centralita 
{	
	int Cont;
	double acum;
	
	public void registrarLlamada(Llamada llamada)
	{
		Cont += 1;
		acum += llamada.calcularPrecio();
	}
	
	public int getTotalLlamadas()
	{
		return Cont;
	}
	public double getTotalFacturado() 
	{
		return Math.floor(acum);
	}
}