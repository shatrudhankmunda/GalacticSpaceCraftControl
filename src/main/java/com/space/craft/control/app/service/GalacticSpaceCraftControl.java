package com.space.craft.control.app.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class GalacticSpaceCraftControl {
	private int x, y, z; // Galactic coordinates (x, y, z)
	private char direction; // Current direction (N, S, E, W, U, D)

	public GalacticSpaceCraftControl() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.direction = 'N'; // Initial direction is North
	}

	public Map<String, String> processCommands(char[] commands) {
		for (char command : commands) {
			move(command);
		}
		return finalPositionAndDirection();
	}

	private void move(char command) {
		switch (command) {
		case 'f':
			moveForward();
			break;
		case 'b':
			moveBackward();
			break;
		case 'l':
			turnLeft();
			break;
		case 'r':
			turnRight();
			break;
		case 'u':
			turnUp();
			break;
		case 'd':
			turnDown();
			break;
		default:
			System.out.println("Invalid command: " + command);
		}
	}

	private void moveBackward() {
		switch (direction) {
		case 'N':
			y--;
			break;
		case 'S':
			y++;
			break;
		case 'E':
			x--;
			break;
		case 'W':
			x++;
			break;
		case 'U':
			z--;
			break;
		case 'D':
			z++;
			break;
		}
	}

	private void turnLeft() {
		switch (direction) {
		case 'N':
			direction = 'W';
			break;
		case 'S':
			direction = 'E';
			break;
		case 'E':
			direction = 'N';
			break;
		case 'W':
			direction = 'S';
			break;
		// No change for 'U' and 'D' when turning left or right
		}
	}

	private void turnRight() {
		switch (direction) {
		case 'N':
			direction = 'E';
			break;
		case 'S':
			direction = 'W';
			break;
		case 'E':
			direction = 'S';
			break;
		case 'W':
			direction = 'N';
			break;
		// No change for 'U' and 'D' when turning left or right
		}
	}

	private void turnUp() {
		if (direction == 'N' || direction == 'S' || direction == 'E' || direction == 'W') {
			direction = 'U';
		}
	}

	private void turnDown() {
		if (direction == 'N' || direction == 'S' || direction == 'E' || direction == 'W') {
			direction = 'D';
		}
	}

	private void moveForward() {
		switch (direction) {
		case 'N':
			y++;
			break;
		case 'S':
			y--;
			break;
		case 'E':
			x++;
			break;
		case 'W':
			x--;
			break;
		case 'U':
			z++;
			break;
		case 'D':
			z--;
			break;
		}
	}
}
