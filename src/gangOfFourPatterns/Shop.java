package gangOfFourPatterns;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	   private List<Drink> drinks = new ArrayList<Drink>();	

	   public void addItem(Drink drink){
	      drinks.add(drink);
	   }

	   public float getCost(){
	      float cost = 0.0f;
	      
	      for (Drink drink : drinks) {
	         cost += drink.price();
	      }		
	      return cost;
	   }

	   public void showItems(){
	   
	      for (Drink drink : drinks) {
	         System.out.print("Drink name is" + drink.name()+"Packed in:"+drink.wrapper().wrap()+"and price is"+drink.price());
	         
	      }		
	   }
}

