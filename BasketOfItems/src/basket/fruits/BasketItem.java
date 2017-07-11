package basket.fruits;

import java.util.List;

public class BasketItem {

	public double getTotalCost(List<String> itemList) throws Exception {
		double totalCost = 0;
		for (String item : itemList) {
			BasketItemEnum itemEnum = BasketItemEnum.getItemEnum(item);
			switch (itemEnum) {
			case APPLE:
				totalCost = totalCost + BasketItemEnum.getCost(itemEnum);
				break;
			case ORANGE:
				totalCost = totalCost + BasketItemEnum.getCost(itemEnum);
				break;
			case PEACHES:
				totalCost = totalCost + BasketItemEnum.getCost(itemEnum);
				break;
			case BANANA:
				totalCost = totalCost + BasketItemEnum.getCost(itemEnum);
				break;
			case LEMON:
				totalCost = totalCost + BasketItemEnum.getCost(itemEnum);
				break;
			}
		}
		return totalCost;
	}
}
