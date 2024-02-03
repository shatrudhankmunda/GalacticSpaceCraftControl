package com.space.craft.control.app.service;

public class GalacticSpaceCraftControl {
	 private int x, y, z; // Galactic coordinates (x, y, z)
	    private char direction; // Current direction (N, S, E, W, U, D)

	    public GalacticSpaceCraftControl() {
	        this.x = 0;
	        this.y = 0;
	        this.z = 0;
	        this.direction = 'N'; // Initial direction is North
	    }
}
