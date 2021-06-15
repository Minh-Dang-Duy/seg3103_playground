package tic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TicTest {
	Tic obj = new Tic();
	@Test
	void test_emptyBoard() {
		//that empty board (l=1,w=1)
		/* 
		 _ _ _
		 _ _ _
		 _ _ _
		 */
		String[][] re = {{"_"}};
		assertTrue(Arrays.deepEquals(re, obj.emptyboard(1,1)));
	}
	
	@Test
	public void test_expert_board() {
		String[][] re = {{"_","_","_"},{"_","_","_"}};
		assertTrue(Arrays.deepEquals(re, obj.emptyboard(2,3)));
	}
	
	@Test
	public void test_board_po(){
		/*
		 * X X X
		 * _ O _
		 * O _ O
		 * 
		 * player 1 -x -true
		 * player2 -o - false
		 */
		assertEquals("X",obj.boardP(true,0,1));
		assertEquals("O",obj.boardP(false,2,0));
		assertEquals("X",obj.boardP(true,0,0));
		assertEquals("O",obj.boardP(false,1,1));
		assertEquals("X",obj.boardP(true,0,2));
		assertEquals("O",obj.boardP(false,2,2));
		assertEquals("N",obj.boardP(true,2,2));
		
		
	}
	
	@Test
	public void test_winner(){
		assertEquals(false,obj.win());
	}
	
	@Test
	public void test_to_string(){
		String[][] re = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
		assertTrue(Arrays.deepEquals(re, obj.to_String(3,3)));
	}
	
	
	
	
	

}
