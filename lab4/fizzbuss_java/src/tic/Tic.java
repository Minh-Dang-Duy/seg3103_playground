package tic;

public class Tic {
	static String [][] game_map= Tic.default_board();
	public static String[][] emptyboard(int l,int w)
	{
		String[][] dboard= new String[l][w];
		for (int i=0;i<l;i++) {
			for(int j=0;j<w;j++) {
				dboard[i][j]="_";
			}
		}
		return dboard;
	}
	
	private static String[][] default_board() {
		// TODO Auto-generated method stub
		String[][] board= new String[3][3];
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j]="_";
			}
		}
		return board;
	}

	public static String boardP(boolean player, int x, int y) {
		String play =" ";
		if(player) {
			play="X";
		}else {
				play="O";
			}
		if(Tic.game_map[x][y]=="_") {
			Tic.game_map[x][y]=play;
		}
		else {return "N";}
		return Tic.game_map[x][y];
	}
	
	public static boolean win() {
		if(Tic.game_map[0][0]=="X"&&Tic.game_map[1][0]=="X"&&Tic.game_map[2][0]=="X") {
			return true;
		}else if(Tic.game_map[0][0]=="X"&&Tic.game_map[1][1]=="X"&&Tic.game_map[2][2]=="X") {
			return true;
		}else if(Tic.game_map[0][0]=="X"&&Tic.game_map[0][1]=="X"&&Tic.game_map[0][2]=="X") {
			return true;
		}else if(Tic.game_map[1][0]=="X"&&Tic.game_map[1][1]=="X"&&Tic.game_map[1][2]=="X") {
			return true;
		}else if(Tic.game_map[2][0]=="X"&&Tic.game_map[2][1]=="X"&&Tic.game_map[2][2]=="X") {
			return true;
		}else {return false;}
	}
	
	public static String to_String(int l,int w) {
		String [][] board = Tic.default_board();
		return board[l][w];
	}
}
