

public class Robottester {

	
		public static Object my_first_robot;

		public static void main (String[] args) throws Exception {
			
			Robot my_first_robot = new Robot(0, 1, "South", 3);
			
			System.out.println("Current facing: " + my_first_robot.facing + " Current X-position: " + my_first_robot.xpos + " Current Y-position: " + my_first_robot.ypos);
			my_first_robot.goLeft();
			my_first_robot.goForward();
			my_first_robot.goBackward();
			my_first_robot.goLeft();
			my_first_robot.goForward();
			
			System.out.println("");
			
			System.out.println("These commands are now stored, awaiting to bed executed: " + my_first_robot.comandList);
			System.out.println("");
			
			my_first_robot.execute();
			
			System.out.println("Current facing: " + my_first_robot.facing + " Current X-position: " + my_first_robot.xpos + " Current Y-position: " + my_first_robot.ypos);
			
			
		}

	}

