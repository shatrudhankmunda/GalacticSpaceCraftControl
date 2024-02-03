package com.space.craft.control.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.space.craft.control.app.service.FinalResponse;
import com.space.craft.control.app.service.GalacticSpaceCraftControl;

@SpringBootApplication
public class Chandrayaan3LunarCraftGalacticSpaceCraftControlApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Chandrayaan3LunarCraftGalacticSpaceCraftControlApplication.class, args);
		GalacticSpaceCraftControl spacecraft = new GalacticSpaceCraftControl();
		char[] commands = { 'f', 'r', 'u', 'b', 'l' };
		FinalResponse processCommands = spacecraft.processCommands(commands);
		char dir = processCommands.getDirection();
		System.out.println(dir);
		String cord = processCommands.getPosition();
		System.out.println(cord);
	}

}
