package candle;
import java.util.Calendar;
import java.util.List;

public class CandlestickFactory {
 
	public Candlestick constroiCandleParaData(Calendar data, List<Negocio> negocios) {
		double maximo = 0.0;
		double minimo = 0.0;
		double volume = 0.0;
		double abertura = 0.0;
		double fechamento = 0.0;
		
		if(negocios.size() != 0){
			maximo = negocios.get(0).getPreco();
			minimo = negocios.get(0).getPreco();
			// digite foreach<control_espaco> para ajudar aqui!
			for (Negocio negocio : negocios) {
				volume += negocio.getVolume();
				if (negocio.getPreco() > maximo) {
					maximo = negocio.getPreco();
				} else if (negocio.getPreco() < minimo) {
					minimo = negocio.getPreco();
				}
			}
			abertura = negocios.get(0).getPreco();
			fechamento = negocios.get(negocios.size() - 1).getPreco();
			
		}

		return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
	}
}
