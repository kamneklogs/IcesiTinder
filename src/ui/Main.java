package ui;

import java.util.List;

import data_structures.WeightedGraph.FloydWarshall;
import data_structures.WeightedGraph.Graph;
import data_structures.WeightedGraph.Kruskal;
import data_structures.WeightedGraph.Node;
import data_structures.WeightedGraph.Prim;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.User;

public class Main extends Application {

	public static void main(String[] args) {
/* 
		Graph<User> miGrafo = new Graph<User>();

		User a = new User("andrea", "sabsajhds");
		User b = new User("danna", "asdas");
		User c = new User("escobar", "122s");
		User d = new User("cordoba", "c3s");
		User e = new User("reyes", "12ss");

		miGrafo.addNode(a);
		miGrafo.addNode(b);
		miGrafo.addNode(c);
		miGrafo.addNode(d);
		miGrafo.addNode(e);

		miGrafo.addConnection(a.hashCode(), d.hashCode(), 3);

		miGrafo.addConnection(a.hashCode(), c.hashCode(), 20);

		miGrafo.addConnection(d.hashCode(), c.hashCode(), 2);

		miGrafo.addConnection(c.hashCode(), e.hashCode(), 3);

		miGrafo.addConnection(a.hashCode(), b.hashCode(), 3);

		int[][] matriz = miGrafo.adjMatrix;

		for (int x = 0; x < matriz.length; x++) {
			System.out.print("|");
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print(matriz[x][y]);
				if (y != matriz[x].length - 1)
					System.out.print("\t");
			}
			System.out.println("|");
		}

		FloydWarshall flow = new FloydWarshall();
		Kruskal myKruskal = new Kruskal(); */

		// System.out.println(myKruskal.kruskalMST(miGrafo.adjMatrix));
		// System.out.println();
	/* 	List<Integer> list = flow.floydWarshall(matriz);

		System.out.println(list.toString());
 */
		// Prim p = new Prim();
		// p.primMST(miGrafo.adjMatrix);
		// System.out.println(p.mincost);
		// for (Node<User> nodo: miGrafo.dijkstraForAdjaMatrix(a.hashCode(),
		// e.hashCode())
		// ) {
		// System.out.println(nodo.getValue().userName);
		// }

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/MainView.fxml"));

		fxmlLoader.setController(new MainController());
		Parent root = fxmlLoader.load();

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("IcesiTinder V0.1");
		primaryStage.show();
	}

}