public class Main {
	
	
	public static void main(String[] args) {
		
		/* Κλήση της μεθόδου sub με τις επιθυμητές τιμές για τις μεταβλητές a, b 
		 * Η κλήση γίνεται σε ένα String res το οποίο νστη συνέχεια θα τυπώσουμε */
		String res=sub(5,4);
		System.out.println(res);
		
	}
		
	
	/* Μέθοδος για σύγκριση ακεραίων 
	 * η μέθοδος έχει return type String για να τυπωθεί το κατάλληλο μήνυμα 
	 * και παίρνει ορίσματα τους 2 ακεραίους a, b  */
	public static String sub(int a, int b) {
				
		int result;
	
		/* Υπολογισμός αφαίρεσης */
		result= a-b; 

		/* Έλεγχος αποτελέσματος >0, <0 ή =0  και επιστροφή αντίστοιχου μηνύματος */
		if(result>0) {
			return "POSITIVE" ;
		}
		else if(result<0){
			return "NEGATIVE" ;
		}
		return "ZERO";
		
	}
	
}
