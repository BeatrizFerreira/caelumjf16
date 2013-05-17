package test_candle;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import candle.Candlestick;

public class CandlestickTest {

	@Test (expected=IllegalArgumentException.class )
	public void testPrecoMaximoNaoPodeSerMenorQueMinimo() {
		new Candlestick(10, 20, 20, 10, 10000, Calendar.getInstance());
	}
	
	@Test (expected=IllegalArgumentException.class )
	public void testdataNula() {
		new Candlestick(10, 20, 10, 10, 10000, null);
	}

}
