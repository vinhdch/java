/*
 * Author : AdNovum Informatik AG
 */

package Learning_java;

import java.util.ArrayList;
import java.util.List;

import Learning_java.Entity.Product;

public class RunDemo {

	public static void main(String[] args) {
		ReadAPI readAPI = new ReadAPI();
		String body = readAPI.getListProduct();

		//List<Long> items = readAPI.getListItem(body, "$.data[*].sku");
		//List<Product> products = new ArrayList<>();
		//for (int i =0; i< items.size(); i++) {
		//	// refer: https://jsonpath.com/
		//	Product product = new Product();
		//	product.setId(readAPI.getNumberValue(body, "$.data["+i+"].id"));
		//	product.setName(readAPI.getStringValue(body,"$.data["+i+"].name"));
		//	product.setSku(readAPI.getStringValue(body,"$.data["+i+"].sku"));
		//	product.setPrice(readAPI.getNumberValue(body, "$.data["+i+"].price"));
		//	product.setQty((int) readAPI.getNumberValue(body, "$.data["+i+"].stock.item.qty"));
		//	products.add(product);
		//}

		List<Product> products = readAPI.buildListProduct(body);
	}

}
