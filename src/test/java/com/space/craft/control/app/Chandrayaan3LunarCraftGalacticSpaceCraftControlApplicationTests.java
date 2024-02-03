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
	public void case1() {
		char[] commands = { 'f', 'r', 'u', 'b', 'l' };
		FinalResponse response = control.processCommands(commands);
		assertEquals('N', response.getDirection());
	}
	@Test
	public void case2() {
		GalacticSpaceCraftControl control = new GalacticSpaceCraftControl();
		char[] commands = { 'f', 'r', 'u', 'b', 'l' };
		FinalResponse response = control.processCommands(commands);
		assertEquals("(0,1,-1)", response.getPosition());
	}

	@Test
	public void case3() {
		GalacticSpaceCraftControl control = new GalacticSpaceCraftControl();
		char[] commands = {'f'};
		FinalResponse response = control.processCommands(commands);
		assertEquals('N', response.getDirection());
		assertEquals("(0,1,0)", response.getPosition());
	}
	@Test
	public void case4() {
		GalacticSpaceCraftControl control = new GalacticSpaceCraftControl();
		char[] commands = {'f', 'r'};
		FinalResponse response = control.processCommands(commands);
		assertEquals('E', response.getDirection());
		assertEquals("(0,1,0)", response.getPosition());
	}
	@Test
	public void case5() {
		GalacticSpaceCraftControl control = new GalacticSpaceCraftControl();
		char[] commands = {'f', 'r','u'};
		FinalResponse response = control.processCommands(commands);
		assertEquals('U', response.getDirection());
		assertEquals("(0,1,0)", response.getPosition());
	}
	
	@Test
	public void case6() {
		GalacticSpaceCraftControl control = new GalacticSpaceCraftControl();
		char[] commands = {'f', 'r','u','b'};
		FinalResponse response = control.processCommands(commands);
		assertEquals('U', response.getDirection());
		assertEquals("(0,1,-1)", response.getPosition());
	}
	@Test
	public void case7() {
		GalacticSpaceCraftControl control = new GalacticSpaceCraftControl();
		char[] commands = {'f', 'r','u','b','r'};
		FinalResponse response = control.processCommands(commands);
		assertEquals('N', response.getDirection());
		assertEquals("(0,1,-1)", response.getPosition());
	}
	@Test
	public void case8() {
		GalacticSpaceCraftControl control = new GalacticSpaceCraftControl();
		char[] commands = {'r'};
		FinalResponse response = control.processCommands(commands);
		assertEquals('E', response.getDirection());
		assertEquals("(0,0,0)", response.getPosition());
	}
	@Test
	public void case9() {
		GalacticSpaceCraftControl control = new GalacticSpaceCraftControl();
		char[] commands = {'b'};
		FinalResponse response = control.processCommands(commands);
		assertEquals('N', response.getDirection());
		assertEquals("(0,-1,0)", response.getPosition());
	}
	@Test
	public void case10() {
		GalacticSpaceCraftControl control = new GalacticSpaceCraftControl();
		char[] commands = {'l'};
		FinalResponse response = control.processCommands(commands);
		assertEquals('W', response.getDirection());
		assertEquals("(0,0,0)", response.getPosition());
	}
}
