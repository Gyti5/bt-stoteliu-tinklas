package code;

import java.util.Arrays;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class stotelesMarsrutai {
	
	private String stotelesPavadinimas;
	private HardCodedDb stoteles = new HardCodedDb();
	
	public stotelesMarsrutai(String pav) {
		this.stotelesPavadinimas = pav;
		marsrutuPaieska(stotelesPavadinimas);
	}
	
	public void marsrutuPaieska(String stotelesPavadinimas) {
		for (Station a : stoteles.getStoteles()) {
			if (stotelesPavadinimas == a.getName()) {
				System.out.println( "Stotel�s: '" + stotelesPavadinimas + "' koordinat�s: " + a.getLongtitute() + " " + a.getLatitude() );
				System.out.println( "Stotel�s: '" + stotelesPavadinimas + "' mar�rutai: " + Arrays.toString(a.getRoutes()) );
			}
		}
	}
}
