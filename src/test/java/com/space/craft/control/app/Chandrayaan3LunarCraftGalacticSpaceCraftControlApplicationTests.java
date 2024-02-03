package com.space.craft.control.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.space.craft.control.app.service.FinalResponse;
import com.space.craft.control.app.service.GalacticSpaceCraftControl;

@SpringBootTest
class Chandrayaan3LunarCraftGalacticSpaceCraftControlApplicationTests {

	@Autowired
	private GalacticSpaceCraftControl control;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void test() {
		char[] commands = { 'f', 'r', 'u', 'b', 'l' };
		FinalResponse response = control.processCommands(commands);
		assertEquals('N', response.getDirection());
	}

}
