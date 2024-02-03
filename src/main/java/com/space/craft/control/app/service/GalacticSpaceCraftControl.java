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

}
