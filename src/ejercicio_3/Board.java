package ejercicio_3;

import java.util.*;

public class Board {

	private String[][] table = new String[3][3];
	private Player player1 = new Player(Piece.O);
	private Player player2 = new Player(Piece.X);
	private Player machine1 = new Player(Piece.O);
	private Player machine2 = new Player(Piece.X);
	
	/**
	 * Constructor del tablero, lo inicializa a " " para poder mostrarlo bien definido
	 */
	public Board() {

		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++)
				
				table[i][j] = " ";
		}
	}

	public String[][] getBoard() {
		return this.table;
	}

	public void setBoard(String[][] board) {
		this.table = board;
	}

	/**
	 * Menú del juego
	 * @return devuelve el número para seleccionar opción
	 */
	public int menu() {
		
		Scanner s = new Scanner(System.in);
		
		int menu;
		
		System.out.println("Seleccione opción:");
		System.out.println("1- Jugador vs Jugador");
		System.out.println("2- Jugador vs Máquina");
		System.out.println("3-Máquina vs Máquina");
		
		menu = s.nextInt();
		
		while(menu<1||menu>3) {
			System.out.println("Seleccione un número de los mostrados:");
			menu();
		}
		return menu;
	}
	/**
	 * 
	 * @param player El turno de los jugadores, pasa por parámetros un Player
	 */
	public void turn(Player player) {
		
		Scanner s = new Scanner(System.in);
		
		int row;
		
		int col;
		
		System.out.println("Turno del jugador " + player.getPiece());
		
		System.out.println("Introduzca la fila: ");
		
		row = s.nextInt()-1;
		
		
		while(row > 3 ||row < 0) {
			s.nextLine();
			System.out.println("Introduzca un número del 1 al 3");
			
			row = s.nextInt()-1;
		}
		s.nextLine();
		
		System.out.println("Introduzca la columna:");
		
		col = s.nextInt()-1;

		
		while(col > 3 ||col < 0) {
			s.nextLine();
			System.out.println("Introduzca un número del 1 al 3");
			
			col = s.nextInt()-1;
		}
		
		s.nextLine();

		mark(player, player.getPiece(), row, col);

	}
	
	/**
	 * Es la forma de añadir la ficha en el tablero
	 * @param player
	 * @param p es la String de la marca de la ficha
	 * @param row la fila del tablero
	 * @param col la columna del tablero
	 */
	public void mark(Player player, String p, int row, int col) {
		
		if (this.table[row][col] == "X" || this.table[row][col] == "O") {
			
			System.out.println("No se puede seleccionar esa posisición porque ya está marcada");
			
			turn(player);
		
		} else
			
			table[row][col] = p;

		System.out.println(this);
	}

	/**
	 * El turno de la máquina
	 * @param machine un Player de nombre machine para diferenciar
	 */
	public void machineTurn(Player machine) {
		
		Random r = new Random();
		System.out.println("Turno de la máquina "+machine.getPiece());
		machineMark(machine,machine.getPiece(),r.nextInt(3),r.nextInt(3));
		
		
	}
	
	/**
	 * Forma de marcar ficha con la máquina
	 * @param machine
	 * @param p es la String de la ficha
	 * @param row
	 * @param col
	 */
	public void machineMark(Player machine,String p,int row, int col) {
		
		if (this.table[row][col] == "X" || this.table[row][col] == "O") {
			
			machineTurn(machine);
		
		} else
			
			table[row][col] = p;

		System.out.println(this);
	}
	
	/**
	 * Inicia el juego con dos Player personas
	 */
	public void game() {
		
		System.out.println(this);
		
		while (true) {
				
			turn(player1);
			
			if(win()) {
				break;
			}
			
			if(isThisGameFinished()) {
				break;
			}
			
			turn(player2);
			
			if(win()) {
				break;
			}
			
			if(isThisGameFinished()) {
				break;
			}
			
		}
	}
	
	/**
	 * 
	 * Inicia el juego con un jugador y una máquina
	 */
	public void gameWithMachine() {
		
		System.out.println(this);
		
		while (true) {
			
			
			turn(player1);
			
			if(win()) {
				break;
			}
			
			if(isThisGameFinished()) {
				break;
			}
			
			machineTurn(machine2);
			
			if(win()) {
				break;
			}
			
			if(isThisGameFinished()) {
				break;
			}
			
		}
		
	}
	/**
	 * Inicia el juego de dos máquinas
	 */
	public void gameOnlyMachines() {
		
		System.out.println(this);
		
		while (true) {
			
			
			machineTurn(machine2);
			
			if(win()) {
				break;
			}
			
			if(isThisGameFinished()) {
				break;
			}
			
			machineTurn(machine1);
			
			if(win()) {
				break;
			}
			
			if(isThisGameFinished()) {
				break;
			}
			
		}
		
	}
	
	/**
	 * 
	 * @return true si se ha cumplido cualquier condición de victoria, false si no es así
 	 */
	public boolean win() {
		
		if (table[0][0].equals("O") && table[0][1].equals("O") && table[0][2].equals("O") || table[1][0].equals("O") && table[1][1].equals("O") && table[1][2].equals("O") ||
			table[2][0].equals("O") && table[2][1].equals("O") && table[2][2].equals("O") || table[0][0].equals("O") && table[1][1].equals("O") && table[2][2].equals("O") ||
			table[0][2].equals("O") && table[1][1].equals("O") && table[2][0].equals("O") || table[0][0].equals("O") && table[1][0].equals("O") && table[2][0].equals("O") ||
			table[0][1].equals("O") && table[1][1].equals("O") && table[2][1].equals("O") || table[0][2].equals("O") && table[1][2].equals("O") && table[2][2].equals("O")) {
			
			System.out.println("Ha ganado el jugador de la ficha O, ¡enhorabuena!");
			
			return true;
			
		}
		
		if (table[0][0].equals("X") && table[0][1].equals("X") && table[0][2].equals("X") || table[1][0].equals("X") && table[1][1].equals("X") && table[1][2].equals("X") ||
			table[2][0].equals("X") && table[2][1].equals("X") && table[2][2].equals("X") || table[0][0].equals("X") && table[1][1].equals("X") && table[2][2].equals("X") ||
			table[0][2].equals("X") && table[1][1].equals("X") && table[2][0].equals("X") || table[0][0].equals("X") && table[1][0].equals("X") && table[2][0].equals("X") ||
			table[0][1].equals("X") && table[1][1].equals("X") && table[2][1].equals("X") || table[0][2].equals("X") && table[1][2].equals("X") && table[2][2].equals("X")) {
			
			System.out.println("Ha ganado el jugador de la ficha X, ¡enhorabuena!");
			
			return true;
			
		}
		
		return false;
		
	}
	
	/**
	 * 
	 * @return true si el juego acaba en empate cuando no se puedan añadir más marcas
	 */
	public boolean isThisGameFinished() {

		int count = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (table[i][j].equals("X") || table[i][j].equals("O")) {

					count++;
		
				}
			}
		}

		if (count == 9) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {

		return "________________________" + "\n" +" | " + table[0][0] + " | " + table[0][1] + " | " + table[0][2] + " | " + "\n" + "_______________" + "\n" + " | " + table[1][0] + " | " + table[1][1] + " | " + table[1][2] + " | " + "\n" + "_______________" + "\n" + " | " + table[2][0] + " | " + table[2][1] + " | " + table[2][2] + " | "+"\n________________________";
	}
}
