import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe2 extends Application {
	private ImageView X, O;
	private GridPane gp = new GridPane();
	private ImageView[][] cells = new ImageView[3][3];
	private char[][] XO = new char[3][3];
	private int count = 0;
	private Scene scene;
	private Stage primaryStage;
	private Button button1;

	public static void main(String args[]) throws Exception {
		launch(args);

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void start(Stage primaryStage) throws Exception {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				XO[i][j] = ' ';
			}
		}
		this.primaryStage = primaryStage;
		// TODO Auto-generated method stub
		int count = 0;
		button1 = new Button("Button 1");
		Button button2 = new Button("Button 2");
		Button button3 = new Button("Button 3");
		Button button4 = new Button("Button 4");
		Button button5 = new Button("Button 5");
		Button button6 = new Button("Button 6");
		Button button7 = new Button("Button 7");
		Button button8 = new Button("Button 8");
		Button button9 = new Button("Button 9");

		button1.setOnAction(value -> {
			if (turn()) {
				try {
					tryX(0, 0);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					tryO(0, 0);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		button2.setOnAction(value -> {
			if (turn()) {
				try {
					tryX(1, 0);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					tryO(1, 0);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		button3.setOnAction(value -> {
			if (turn()) {
				try {
					tryX(2, 0);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					tryO(2, 0);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		button4.setOnAction(value -> {
			if (turn()) {
				try {
					tryX(0, 1);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					tryO(0, 1);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		button5.setOnAction(value -> {
			if (turn()) {
				try {
					tryX(1, 1);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					tryO(1, 1);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		button6.setOnAction(value -> {
			if (turn()) {
				try {
					tryX(2, 1);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					tryO(2, 1);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		button7.setOnAction(value -> {
			if (turn()) {
				try {
					tryX(0, 2);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					tryO(0, 2);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		button8.setOnAction(value -> {
			if (turn()) {
				try {
					tryX(1, 2);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					tryO(1, 2);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		button9.setOnAction(value -> {
			if (turn()) {
				try {
					tryX(2, 2);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					tryO(2, 2);
					printMap();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		X = new ImageView(new Image(new FileInputStream("C:/Users/Kyle/eclipse-workspace/TicTacToe/src/x.jpg")));
		O = new ImageView(new Image(new FileInputStream("C:/Users/Kyle/eclipse-workspace/TicTacToe/src/o.jpg")));

		X.setFitHeight(200);
		X.setFitWidth(200);

		O.setFitHeight(200);
		O.setFitWidth(200);
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				X = new ImageView(
						new Image(new FileInputStream("C:/Users/Kyle/eclipse-workspace/TicTacToe/src/x.jpg")));
				O = new ImageView(
						new Image(new FileInputStream("C:/Users/Kyle/eclipse-workspace/TicTacToe/src/o.jpg")));

				X.setFitHeight(200);
				X.setFitWidth(200);

				O.setFitHeight(200);
				O.setFitWidth(200);
				cells[x][y] = X;
				// gp.add(X, x, y);

			}
		}

		gp.add(button1, 0, 0);
		gp.add(button2, 0, 1);
		gp.add(button3, 0, 2);
		gp.add(button4, 1, 0);
		gp.add(button5, 1, 1);
		gp.add(button6, 1, 2);
		gp.add(button7, 2, 0);
		gp.add(button8, 2, 1);
		gp.add(button9, 2, 2);

		scene = new Scene(gp, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private boolean turn() {
		count++;
		if (count % 2 == 1) {
			return true;
		}
		return false;
	}

	private void tryX(int x, int y) throws FileNotFoundException {
		if (!checkWin()) {
			if (XO[x][y] == ' ') {

				XO[x][y] = 'X';
				// checkWin();
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {

						System.out.print(XO[i][j]);
					}
					System.out.println();
				}
				if (!checkWin()) {
					System.out.println("O's turn");
				}
			} else {
				System.out.println("CHEATING!!! YOUR TURN IS FORFEIT!");
				System.out.println("O's turn");
			}
		}
	}

	private void tryO(int x, int y) throws FileNotFoundException {
		if (!checkWin()) {
			if (XO[x][y] == ' ') {
				XO[x][y] = 'O';
				// checkWin();
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {

						System.out.print(XO[i][j]);
					}
					System.out.println();

				}
				if (!checkWin()) {
					System.out.println("X's turn");
				}
			} else {
				System.out.println("CHEATING!!! YOUR TURN IS FORFEIT!");
				System.out.println("X's turn");
			}
		}
	}

	private boolean checkWin() throws FileNotFoundException {

		if (XO[0][0] == XO[1][1] && XO[1][1] == XO[2][2] && XO[2][2] != ' ') {
			win(XO[0][0]);
			return true;
		}
		if (XO[2][0] == XO[1][1] && XO[1][1] == XO[0][2] && XO[2][0] != ' ') {
			win(XO[1][1]);
			return true;
		}
		if (XO[2][0] == XO[1][0] && XO[1][0] == XO[0][0] && XO[2][0] != ' ') {
			win(XO[0][0]);
			return true;
		}
		if (XO[2][1] == XO[1][1] && XO[1][1] == XO[0][1] && XO[2][1] != ' ') {
			win(XO[1][1]);
			return true;
		}
		if (XO[2][2] == XO[1][2] && XO[1][2] == XO[0][2] && XO[2][2] != ' ') {
			win(XO[2][2]);
			return true;
		}
		if (XO[0][2] == XO[0][1] && XO[0][1] == XO[0][0] && XO[0][1] != ' ') {
			win(XO[0][0]);
			return true;
		}
		if (XO[1][2] == XO[1][1] && XO[1][1] == XO[1][0] && XO[1][1] != ' ') {
			win(XO[1][1]);
			return true;
		}
		if (XO[2][1] == XO[2][2] && XO[2][2] == XO[2][0] && XO[2][1] != ' ') {
			win(XO[2][2]);
			return true;
		}
		boolean full = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (XO[i][j] == ' ') {
					full = false;
				}
			}
		}
		if (full) {
			System.out.println("DRAW!");
			return true;
		}
		return false;
	}

	private void win(char w) throws FileNotFoundException {
		System.out.println("WINNER " + w);
		printMap();

	}

	private void printMap() throws FileNotFoundException {
		GridPane gridPane = new GridPane();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				Image image = new Image(new FileInputStream("C:/Users/Kyle/eclipse-workspace/TicTacToe/src/o.jpg"));
				// Image X = new Image(new
				// FileInputStream("C:/Users/Kyle/eclipse-workspace/TicTacToe/src/x.jpg"));

				ImageView imageView = new ImageView(
						new Image(new FileInputStream("C:/Users/Kyle/eclipse-workspace/TicTacToe/src/x.jpg")));
				ImageView imageViewO = new ImageView(image);

				ImageView blank = new ImageView(new Image(new FileInputStream("C:/Users/Kyle/eclipse-workspace/TicTacToe/src/blank.JPG")));
				
				
				imageView.setFitHeight(200);
				imageView.setFitWidth(200);

				blank.setFitHeight(200);
				blank.setFitWidth(200);
				
				imageViewO.setFitHeight(200);
				imageViewO.setFitWidth(200);

				imageView.setPreserveRatio(true);
				imageViewO.setPreserveRatio(true);

				if (XO[i][j] == 'X') {

					gridPane.add(imageView, j, i);
				}
				if (XO[i][j] == 'O') {
					gridPane.add(imageViewO, j, i);
				}
				if(XO[i][j]==' ') {
					gridPane.add(blank, j, i);

				}
			}
		}
		Group[][] root = new Group[3][3];
		// root[0][0]= new Group(imageView);
		// root[0][1]= new Group(imageViewO);

		Scene scene = new Scene(gridPane, 600, 600);

		Stage stage = new Stage();
		// stage.setTitle("Loading an image");

		stage.setScene(scene);
		stage.show();
	}

}