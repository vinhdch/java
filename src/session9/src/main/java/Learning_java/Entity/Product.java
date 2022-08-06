/*
 * Author : AdNovum Informatik AG
 */

package Learning_java.Entity;

public class Product {

	private long id;
	private String sku;
	private String name;
	private long price;
	private int qty;

	public void setId(long id) {
		this.id = id;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
}
