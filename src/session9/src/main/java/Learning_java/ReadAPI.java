/*
 * Author : AdNovum Informatik AG
 */

package Learning_java;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import Learning_java.Entity.Product;
import com.jayway.jsonpath.JsonPath;
import io.restassured.response.Response;

public class ReadAPI {

	public String getListProduct() {

		String path = "https://tiki.vn/api/v2/products?category=28856";
		Response data = getAPI(path);
		if (data.getStatusCode() == 200) {
			// lay body
			return data.asString();
		}
		return null;
	}

	public Response getAPI(String domain) {

		 return given().when().contentType("application/json").get(domain);
	}

	public long getNumberValue(String data, String key) {

		return Long.valueOf(String.valueOf(JsonPath.parse(data).read(key)));
	}

	public String getStringValue(String data, String key) {
		return JsonPath.parse(data).read(key).toString();
	}

	public List<Long> getListItem(String data, String key) {
		return JsonPath.parse(data).read(key);
	}

	public List<Product> buildListProduct(String body) {
		List<Long> items = getListItem(body, "$.data[*].sku");
		List<Product> products = new ArrayList<>();
		for (int i =0; i< items.size(); i++) {
			// refer: https://jsonpath.com/
			Product product = new Product();
			product.setId(getNumberValue(body, "$.data["+i+"].id"));
			product.setName(getStringValue(body,"$.data["+i+"].name"));
			product.setSku(getStringValue(body,"$.data["+i+"].sku"));
			product.setPrice(getNumberValue(body, "$.data["+i+"].price"));
			product.setQty((int) getNumberValue(body, "$.data["+i+"].stock_item.qty"));
			products.add(product);
		}
		return products;
	}

}
