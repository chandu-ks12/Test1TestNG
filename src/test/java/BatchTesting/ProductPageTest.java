package BatchTesting;

import org.testng.annotations.Test;

public class ProductPageTest {

	
	@Test
	public void AddProductToWishList() {
		
		System.out.println("AddedProductToWishList");	
	}
	@Test
	public void AddProductToCart() {
		
		System.out.println("AddedProductTocart");	
	}
	@Test
	public void SelectQuantity() {
		
		System.out.println("Quantity Selected");	
	}

}
