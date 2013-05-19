package candle;
import java.util.Calendar;


public final class Negocio {
	private final double preco;
	private final int quantidade;
	private final Calendar data;
	
	public Negocio(double preco, int quantidade, Calendar data) {
		this.preco = preco;
		this.quantidade = quantidade;
		if (data != null){
			this.data = data;
		} else
			throw new IllegalArgumentException("Data nula ou vazia.");
	}
	
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public Calendar getData() {
		return (Calendar) data.clone();
	}
	public double getVolume() {
		return preco * quantidade;
	}

}
