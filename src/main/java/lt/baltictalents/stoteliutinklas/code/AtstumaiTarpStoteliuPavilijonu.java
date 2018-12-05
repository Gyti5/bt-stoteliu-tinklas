package lt.baltictalents.stoteliutinklas.code;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class AtstumaiTarpStoteliuPavilijonu {
	
	private double atstumasMetrais;
	private HardCodedDb stoteles = new HardCodedDb();
	
	public AtstumaiTarpStoteliuPavilijonu(double distance) {
		this.atstumasMetrais = distance;
		tinkamosStoteles(atstumasMetrais);
	}
	
	public String tinkamosStoteles(double atstumasMetrais) {
		
		List<Station> stoteliuSarasas = stoteles.getStoteles();
		
		
		Map<String, Long> counting = stoteliuSarasas.stream().collect(
                Collectors.groupingBy(Station::getName, Collectors.counting()));
		
		System.out.println(counting);
		
		
		return null;
	}
	
	public double atstumasTarpPavilijonu( double x1,  double y1,  double x2,  double y2 ) {
		double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return distance;
	}
}
