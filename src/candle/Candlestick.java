package candle;
import java.util.Calendar;

public final class Candlestick {
	private final double abertura;
	
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;
	
	public Candlestick(double abertura, double fechamento, double minimo,
			double maximo, double volume, Calendar data) {
		if(abertura >= 0)
			this.abertura = abertura;
		else
			throw new IllegalArgumentException("Valor negativo.");
		
		if(fechamento >= 0)
			this.fechamento = fechamento;
		else
			throw new IllegalArgumentException("Valor negativo.");
		
		if(minimo >= 0)
			this.minimo = minimo;
		else
			throw new IllegalArgumentException("Valor negativo.");
		
		if(maximo >= 0)
			this.maximo = maximo;
		else
			throw new IllegalArgumentException("Valor negativo.");		
		
		if(minimo >= 0)
			this.volume = volume;
		else
			throw new IllegalArgumentException("Valor negativo.");
		
		if(data != null)
			this.data = data;
		else 
			throw new IllegalArgumentException("Data nula ou vazia.");
		if (maximo < minimo)
			throw new IllegalArgumentException("Valor maximo menor que o minimo.");
	}

	public double getAbertura() {
		return abertura;
	}

	public double getFechamento() {
		return fechamento;
	}

	public double getMinimo() {
		return minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public double getVolume() {
		return volume;
	}

	public Calendar getData() {
		return data;
	}
}