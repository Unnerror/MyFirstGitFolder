import javax.swing.*;

public class Angle_to_radians {

	public static void main(String[] args) {


		String angle = JOptionPane.showInputDialog(null, "Please, input the angle of a triangle in degrees", "Input Dialog", JOptionPane.QUESTION_MESSAGE);
		
		double radians = Math.toRadians(Integer.parseInt (angle));
		
		System.out.println(radians);
		
	
	}
}