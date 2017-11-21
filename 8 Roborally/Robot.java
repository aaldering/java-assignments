

import java.util.*;

class Robot {
	
	int xpos = 0;
	int ypos = 0;
	String facing = "North";
	int speed = 1;
	ArrayList<String> comandList = new ArrayList<String>();

	public Robot(int i, int j, String string) {
		xpos = i;
		ypos = j;
		facing = string;
		
	}
	
	public Robot(int i, int j, String string, int k) {
		xpos = i;
		ypos = j;
		facing = string;
		speed = k;
	}
	
	
	public String turnleft() {
		switch (facing) {
		case "East": facing = "North";
		break;
		case "North": facing = "West";
		break;
		case "West": facing = "South";
		break;
		case "South": facing = "East";
		break;
		}
		System.out.println("Turning left");
		return facing;
		
	}
	
	public void turnright() {
		switch (facing) {
		case "West": facing = "North";
		break;
		case "North": facing = "East";
		break;
		case "East": facing = "South";
		break;
		case "South": facing = "West";
		break;
		}
		System.out.println("Turning right");
		
	}
	
	public void forward() {
		if (speed == 1) {
			switch (facing) {
			case "North": ypos = ypos + 1;
			break;
			case "South": ypos = ypos - 1;
			break;
			case "East": xpos= xpos + 1;
			break;
			case "West": xpos = xpos - 1;
			break;
			}
		}
		if (speed == 2) {
			switch (facing) {
			case "North": ypos = ypos + 2;
			break;
			case "South": ypos = ypos - 2;
			break;
			case "East": xpos= xpos + 2;
			break;
			case "West": xpos = xpos - 2;
			break;
			}
		}
		if (speed == 3) {
			switch (facing) {
			case "North": ypos = ypos + 3;
			break;
			case "South": ypos = ypos - 3;
			break;
			case "East": xpos= xpos + 3;
			break;
			case "West": xpos = xpos - 3;
			break;
			}
		}
		System.out.println("Moving forward with speed " + speed);
	}
	
	public void backward() {
		switch (facing) {
		case "North": ypos = ypos - 1;
		break;
		case "South": ypos = ypos + 1;
		break;
		case "East": xpos= xpos - 1;
		break;
		case "West": xpos = xpos + 1;
		break;
		}	
		System.out.println("Moving backward");
	}
	
	
	
	public void goLeft() {
		
		comandList.add("turnleft();");
	}
	
	public void goRight() {
		
		comandList.add("turnright();");
	}

	public void goForward() {
		
		comandList.add("forward();");
	}

	public void goBackward() {
		
		comandList.add("backward();");
	}
	
	public void execute() {
		
		int i = 0;
		while(i<comandList.size()) {
			switch (comandList.get(i)) {
			case "turnleft();": turnleft();
			break;
			case "turnright();": turnright();
			break;
			case "forward();": forward();
			break;
			case "backward();": backward();
			break;
			}
			i++;
		}
	}
}
	
