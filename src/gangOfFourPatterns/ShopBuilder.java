package gangOfFourPatterns;

public class ShopBuilder {
	public Shop buildShop (){
	      Shop shop = new Shop();
	      shop.addItem(new Corona());
	      shop.addItem(new Sprite());
	      return shop;
	   }   
}
