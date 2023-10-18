import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class jeonggyun {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a id");
		String brigth = JOptionPane.showInputDialog("Enter a brigth level");
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" mood Lamp");
		moodLamp.setBright(Double.parseDouble(brigth));
		moodLamp.on();

	}

}
