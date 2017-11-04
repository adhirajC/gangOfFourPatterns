package gangOfFourPatterns;

import java.util.Hashtable;

public class MoneyCache {
private static Hashtable<String, Money> moneyMap  = new Hashtable<String, Money>();
public static Money getMoney(String moneyId) {
    Money cachedMoney = moneyMap.get(moneyId);
    return (Money) cachedMoney.clone();
 }
public static void getCache(){
	Paper paper=new Paper();
	paper.setId("100");
	moneyMap.put(paper.getId(),paper);
	Coin coin=new Coin();
	coin.setId("200");
	moneyMap.put(coin.getId(),coin);
}
}
