package terragon;


public class CipherCreation {
	private int shift ;
	public CipherCreation(int shift) {
		super();
		this.shift = shift;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}
//a final variable declaring the English Alphabets
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
/*method for the encryption: it replace each character by the next "shift" character 
shift is the number entered by the user */
	public String encrypt(String plainText, int shift) {
		plainText = plainText.toLowerCase();
		String cipherText = "";
		//loops through the entered plain text 
		for (int i = 0; i < plainText.length(); i++) {
			//gets the position of each character in the plainText in the English Alphabet 
			int charPosition = ALPHABET.indexOf(plainText.charAt(i));
			// ensures the index of the replacing character is not exceeding length of English Alphabet"26"
			int keyValue = (shift + charPosition)%26;
			// gets the replacing character 
			char replaceVal = ALPHABET.charAt(keyValue);
			// appends the replaceVal to the String cipher Text
			cipherText += replaceVal;
		}
		// returns the ciphered text 
		return cipherText;
	}
	public static void main(String[] args) {
		CipherCreation cipherCreation = new CipherCreation(5);
		System.out.println(cipherCreation.encrypt("Sanfoundry hdsinfbbefbhebhb  hbfyrfr", cipherCreation.shift));
	}

}
