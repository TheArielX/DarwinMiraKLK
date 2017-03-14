package central;
import java.io.FileWriter;

public class TareaCentral
{	
	public static void main(String[] args)
	{
		Centralita Central = new Centralita();
		LlamadaProvincial llamada1 = new LlamadaProvincial("809220111", "8096202020", 3.50, 1);
		LlamadaProvincial llamada2 = new LlamadaProvincial("809220111", "8095086060", 7.20, 2);
		LlamadaProvincial llamada3 = new LlamadaProvincial("809220111", "8095350111", 20.50, 1);
		LlamadaLocal llamada4 = new LlamadaLocal("8095334444", "8097202020", 30.30);
		Central.registrarLlamada(llamada1);
		Central.registrarLlamada(llamada2);
		Central.registrarLlamada(llamada3);
		Central.registrarLlamada(llamada4);
		System.out.println("Tiburcio Telecom Inc.\nBe free and unstoppable\n\nFactura del mes de Febrero del 2017");
		System.out.println("\nInformacion de la llamada 1");
		System.out.println("Numero de Origen: "+llamada1.getNumOrigen());
		System.out.println("Numero de Destino: "+llamada1.getNumDestino());
		System.out.println("Duracion de la llamada: "+llamada1.getDuracion()+" minutos");
		System.out.println("Precio de la llamada: "+llamada1.calcularPrecio()+" dólares estadounidenses");
		
		System.out.println("\nInformacion de la llamada 2");
		System.out.println("Numero de Origen: "+llamada2.getNumOrigen());
		System.out.println("Numero de Destino: "+llamada2.getNumDestino());
		System.out.println("Duracion de la llamada: "+llamada2.getDuracion()+" minutos");
		System.out.println("Precio de la llamada: "+llamada2.calcularPrecio()+" dólares estadounidenses");
		
		System.out.println("\nInformacion de la llamada 3");
		System.out.println("Numero de Origen: "+llamada3.getNumOrigen());
		System.out.println("Numero de Destino: "+llamada3.getNumDestino());
		System.out.println("Duracion de la llamada: "+llamada3.getDuracion()+" minutos");
		System.out.println("Precio de la llamada: "+llamada3.calcularPrecio()+" dólares estadounidenses");
		
		System.out.println("\nInformacion de la llamada 4");
		System.out.println("Numero de Origen: "+llamada4.getNumOrigen());
		System.out.println("Numero de Destino: "+llamada4.getNumDestino());
		System.out.println("Duracion de la llamada: "+llamada4.getDuracion()+" minutos");
		System.out.println("Precio de la llamada: "+llamada4.calcularPrecio()+" dólares estadounidenses");
		
		System.out.println("\nCantidad total llamadas "+Central.getTotalLlamadas());
		System.out.println("Precio total de todas las llamadas: "+Central.getTotalFacturado()+" dólares estadounidenses");
		
		final String COMMA_DELIMITER = ";";
		final String NEW_LINE_SEPARATOR = "\n";
		FileWriter archivo = null;
        
		try
        {
            archivo = new FileWriter("C:\\Users\\ariel\\Desktop\\Universidad\\ISC\\P1\\Central Telefonica\\FacturaFebrero2017.csv");
            
            archivo.append("Numero de Origen");
            archivo.append(COMMA_DELIMITER);
            archivo.append("Numero de Destino");
            archivo.append(COMMA_DELIMITER);
            archivo.append("Duracion de la llamada (En minutos)");
            archivo.append(COMMA_DELIMITER);
            archivo.append("Precio de la llamada (En dólares estadounidenses)");
            archivo.append(NEW_LINE_SEPARATOR);
            
            archivo.append(String.valueOf(llamada1.getNumOrigen()));
            archivo.append(COMMA_DELIMITER);
            archivo.append(String.valueOf(llamada1.getNumDestino()));
            archivo.append(COMMA_DELIMITER);
            archivo.append(String.valueOf(llamada1.getDuracion()));
            archivo.append(COMMA_DELIMITER);
            archivo.append(String.valueOf(llamada1.calcularPrecio()));
            archivo.append(NEW_LINE_SEPARATOR);
            
            archivo.append(String.valueOf(llamada2.getNumOrigen()));
            archivo.append(COMMA_DELIMITER);
            archivo.append(String.valueOf(llamada2.getNumDestino()));
            archivo.append(COMMA_DELIMITER);
            archivo.append(String.valueOf(llamada2.getDuracion()));
            archivo.append(COMMA_DELIMITER);
            archivo.append(String.valueOf(llamada2.calcularPrecio()));
            archivo.append(NEW_LINE_SEPARATOR);
            
            archivo.append(String.valueOf(llamada3.getNumOrigen()));
            archivo.append(COMMA_DELIMITER);
            archivo.append(String.valueOf(llamada3.getNumDestino()));
            archivo.append(COMMA_DELIMITER);
            archivo.append(String.valueOf(llamada3.getDuracion()));
            archivo.append(COMMA_DELIMITER);
            archivo.append(String.valueOf(llamada3.calcularPrecio()));
            archivo.append(NEW_LINE_SEPARATOR);
            
            archivo.append(String.valueOf(llamada4.getNumOrigen()));
            archivo.append(COMMA_DELIMITER);
            archivo.append(String.valueOf(llamada4.getNumDestino()));
            archivo.append(COMMA_DELIMITER);
            archivo.append(String.valueOf(llamada4.getDuracion()));
            archivo.append(COMMA_DELIMITER);
            archivo.append(String.valueOf(llamada4.calcularPrecio()));
            archivo.append(NEW_LINE_SEPARATOR);

        } 
		
		catch (Exception e) 
		{
            e.printStackTrace();
        } 
		
		finally 
		{
           try 
           {
           if (null != archivo)
              archivo.close();
           } 
           catch (Exception e2) 
           {
              e2.printStackTrace();
           }
        }
    }
        
}
