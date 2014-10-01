package fi.oulu.tol.sqat;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.easymock.EasyMock;
public class PortfolioTest {
	Portfolio sqatPortfolio;
	StockMarket nasdaq;
	
	@Before
	public void setup(){
		sqatPortfolio = new Portfolio();
		sqatPortfolio.setName("SQaTLab Portfolio");
		
		//Mock create
		nasdaq = EasyMock.createMock(StockMarket.class);
		sqatPortfolio.setMarket(nasdaq);
	}
	@Test
	public void theTotalValueOfTheStocksAreReturnedAccordingToTheStockmarketPrice() {
		//Mock set expectations
		EasyMock.expect(nasdaq.getPrice("MS")).andReturn(25.50);
		EasyMock.expect(nasdaq.getPrice("N0")).andReturn(5.50);
		//Mock ready
		EasyMock.replay(nasdaq);
		Stock microsoft = new Stock("MS", 4);
		Stock nokia = new Stock("N0", 100);
		sqatPortfolio.addStock(microsoft);
		sqatPortfolio.addStock(nokia);
		sqatPortfolio.setMarket(nasdaq);
		assertEquals(25.50*4+5.50*100, sqatPortfolio.getTotalValue(),0.0);
	}

}
