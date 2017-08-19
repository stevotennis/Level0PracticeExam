import javax.swing.JOptionPane;
public class CodingExercise3 {
	public static void main(String[] args){
		String ageStr = JOptionPane.showInputDialog("How old are you?");
		int ageNum = Integer.parseInt(ageStr);
		if(ageNum >= 18){
			System.out.println("You can watch all the movies!");
		}
		else if((ageNum >= 0) && (ageNum <= 17)){
			System.out.println("Please bring your parents to watch the movies!");
		}
		else if (ageNum < 0){
			System.out.println("Please put in a valid number!");
		}
	}
}
