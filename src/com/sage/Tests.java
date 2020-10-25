package com.sage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class Tests {
	PuzzleSolver solver = new PuzzleSolver();

	// Valid Test Case
	@Test
	void validtest() {
		Robot robot = solver.intializeRobot("1 2 N");
		assertEquals(solver.processMovement(robot, "LMLMLMLMM"), "1 3 N");
	}

	// InValid Test Case
	@Test
	void invalidtest() {
		Robot robot = solver.intializeRobot("3 3 E");
		assertEquals(solver.processMovement(robot, "MMRMMRMRRM"), "5 1 W");
	}

}
