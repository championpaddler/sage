package com.sage;
import	java.util.*;

public class PuzzleSolver {
	
 public static int getInt(String s) {
     return Integer.parseInt(s.trim());
 }
 
 public		Robot intializeRobot(String	in) {
	 String	input[]	=	in.split(" ");
	 return	new Robot(getInt(input[0]), getInt(input[1]), input[2].charAt(0));
 }
 	
 public  String processMovement(Robot robot, String movement) {
	 for (int i = 0; i < movement.length(); i++) {
         switch (movement.charAt(i)) {
             case 'L':
                 robot.turnLeft();
                 break;
             case 'R':
                 robot.turnRight();
                 break;
             case 'M':
                 robot.move();
                 break;
         }
     }
    return	robot.x+" "+robot.y+" "+robot.pointer;
 }

 public static void main(String[] args) throws Exception {
	 PuzzleSolver	solver	=	new	PuzzleSolver();
	 Scanner scanner = new Scanner(System.in);
     String input[] = scanner.nextLine().split(" ");
     Plateau plateau = new Plateau(getInt(input[0]), getInt(input[1]));
     String robotData = scanner.nextLine();
     while (robotData != null) {
    	 Robot	robot=	solver.intializeRobot(robotData);
         String movement =	scanner.nextLine().trim();
    	System.out.println( solver.processMovement(robot,movement));
         robotData = scanner.nextLine();
     }
     scanner.close();
 }


}