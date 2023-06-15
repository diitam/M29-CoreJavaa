//driver class
package GoShoppingApp.client;

import GoShoppingApp.application.GSNormalAcc;
import GoShoppingApp.application.GSPrimeAcc;
import GoShoppingApp.application.GSShopFactory;
import GoShoppingApp.framework.NormalAcc;
import GoShoppingApp.framework.PrimeAcc;
import GoShoppingApp.framework.ShopFactory;

public class GoShoppingApplicationClient {

	public static void main(String[] args) {

		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(5670,"Disha Tamore",500,true);
		NormalAcc n=new GSNormalAcc(5675,"Karsha",500,60);
		System.out.println("PrimeAccount");
		p.bookProduct(p.getCharges());
		System.out.println("NormalAccount");
		n.bookProduct(n.getCharges());
		System.out.println(p);
		System.out.println(n);

	}

}
