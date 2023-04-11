//program to demonstrate the encapsulation
package encapsulation;

public class HDFCBank {

	//private data members
	private Long cardNo;
	private String cardType;
	private int cvvNo;
	private int pinNo;
	
	//getters and setters
	public Long getCardNo() {
		return cardNo;
	}
	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	//toString method
	@Override
	public String toString() {
		return "HDFCBank [cardNo=" + cardNo + ", cardType=" + cardType + ", cvvNo=" + cvvNo + ", pinNo=" + pinNo + "]";
	}
	
	
	
	
	
	
	
	
}
