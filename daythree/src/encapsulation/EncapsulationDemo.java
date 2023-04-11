package encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		//object creation
		HDFCBank h=new HDFCBank();
		//setters are used to set a value
		h.setCardNo(2515151l);
		h.setCardType("Debit-Card");
		h.setCvvNo(444);
		h.setPinNo(2323);
		//getters are used to return value
		System.out.println(h.getCardNo());
		System.out.println(h.getCardType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());

		
	}

}
