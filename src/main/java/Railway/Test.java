package Railway;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mysql.cj.xdevapi.JsonArray;

public class Test 
{
	public static void main(String args[]) throws Exception
	{
		
		JSONObject closingPrice1 = new JSONObject();
		closingPrice1.put("date", "1Aug");
		closingPrice1.put("price", "10");
		
		JSONObject closingPrice2 = new JSONObject();
		closingPrice2.put("date", "2Aug");
		closingPrice2.put("price", "20");
		
		JSONArray closingPriceArray = new JSONArray();
		closingPriceArray.put(closingPrice1);
		closingPriceArray.put(closingPrice2);
		
		JSONObject stock1 = new JSONObject();
		stock1.put("name", "Stk1");
		stock1.put("closing_prices", closingPriceArray);
		
		JSONObject closingPrice1Stk2 = new JSONObject();
		closingPrice1Stk2.put("date", "1Aug");
		closingPrice1Stk2.put("price", "10");
		
		JSONObject closingPrice2Stk2 = new JSONObject();
		closingPrice2Stk2.put("date", "2Aug");
		closingPrice2Stk2.put("price", "20");
		
		JSONArray closingPriceStk2Array = new JSONArray();
		closingPriceStk2Array.put(closingPrice1Stk2);
		closingPriceStk2Array.put(closingPrice2Stk2);
		
		JSONObject stock2 = new JSONObject();
		stock2.put("name", "Stk2");
		stock2.put("closing_prices", closingPriceStk2Array);
		
		JSONArray stocksArray = new JSONArray();
		stocksArray.put(stock1);
		stocksArray.put(stock2);
		
		JSONObject priceDetails = new JSONObject();
		priceDetails.put("stocks", stocksArray);
		
		System.out.println(priceDetails.toString());
		
	}
}
