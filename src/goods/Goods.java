package goods;

public class Goods {

	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public Goods() {
	};

	public Goods(String name, int price, int countStock, int countSold) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("상품이름: ");
		builder.append(name);
		builder.append("\n상품가격: ");
		builder.append(price);
		builder.append("\n재고수량: ");
		builder.append(countStock);
		builder.append("\n팔린수량: ");
		builder.append(countSold);
		return builder.toString();
	}

}
