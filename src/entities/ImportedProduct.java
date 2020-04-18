package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFree() {
		return customsFee;
	}

	public void setCustomsFree(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return customsFee + getPrice();
	}

	@Override
	public String priceTag() {
		return super.priceTag()
			+ " (Custom fee: $ "
			+ String.format("%.2f", customsFee)
			+ ")";
	}
}
