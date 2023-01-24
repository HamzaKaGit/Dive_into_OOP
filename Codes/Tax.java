

class Tax {
	int qty = 0;
	String prodName = null;
	float price = 0.0f;
	boolean imported = false;
	boolean exempted = false;
	float tax = 0.0f;

	void calculateSalesTax() {
		float totalTax = 0.0f;
		if (imported)
			totalTax = 0.05f;
		if (!exempted)
			totalTax = .1f;
		if ((imported) && (!exempted))
			totalTax = .15f;
		tax = totalTax * price;
	}

	public String toString() {
		float p = price + tax;
		return qty + " " + prodName + " at " + p;
	}
}

