package basket.fruits;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BasketItemTest {
	
	private BasketItem item;

	@Before
	public void setUp() {
		item = new BasketItem();
	}

	@Test
	public void testGetTotalCost() throws Exception {
		double totalCost = item.getTotalCost(getItemList());
		assertEquals(79, totalCost, 80);
	}
	
	@Test
	public void testGetTotalCost_empty() throws Exception {
		double totalCost = item.getTotalCost(new ArrayList<String>());
		assertEquals(0, totalCost, 0);
	}

	@Test(expected = Exception.class)
	public void testGetTotalCost_error() throws Exception {
		List<String> itemList = new ArrayList<String>();
		itemList.add("ORANGE"); 
		itemList.add("PEACHES");
		itemList.add("PEACHES");
		itemList.add("BANANA");
		itemList.add("APPLE");
		itemList.add("LEMON123");
		item.getTotalCost(itemList);
	}

	private List<String> getItemList() {
		List<String> itemList = new ArrayList<String>();
		itemList.add("LEMON");
		itemList.add("LEMON");
		itemList.add("ORANGE");
		itemList.add("PEACHES");
		itemList.add("PEACHES");
		itemList.add("BANANA");
		itemList.add("BANANA");
		itemList.add("BANANA");
		itemList.add("APPLE");

		return itemList;
	}

}
