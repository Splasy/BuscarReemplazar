package dad.javafx.byr;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazarApp extends Application {
	
	private TextField buscador;
	private TextField reemplazador;
	private Button buscar;
	private Button reemplazar;
	private Button todo;
	private Button cerrar;
	private Button ayuda;
	private RadioButton mayuMin;
	private RadioButton expr;
	private RadioButton haciaAtras;
	private RadioButton resaltarRes;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscador = new TextField();
		reemplazador = new TextField();
		
		buscar = new Button("Buscar");
		buscar.setPrefWidth(100);
		reemplazar = new Button("Reemplazar");
		reemplazar.setPrefWidth(100);
		todo = new Button("Reemplazar todo");
		todo.setPrefWidth(100);
		cerrar = new Button("Cerrar");
		cerrar.setPrefWidth(100);
		ayuda = new Button("Ayuda");
		ayuda.setPrefWidth(100);
		
		mayuMin = new RadioButton("Mayúsculas y minúsculas");
		mayuMin.setPrefWidth(100);
		expr = new RadioButton("Expresión regular");
		expr.setPrefWidth(100);
		haciaAtras = new RadioButton("Buscar hacia atrás");
		haciaAtras.setPrefWidth(100);
		resaltarRes = new RadioButton("Resaltar resultados");
		resaltarRes.setPrefWidth(100);
		
		ToggleGroup check = new ToggleGroup();
		check.getToggles().addAll(mayuMin, expr, haciaAtras, resaltarRes);
		
		HBox primera = new HBox();
		primera.getChildren().addAll(mayuMin, haciaAtras);
		
		HBox segunda = new HBox();
		segunda.getChildren().addAll(expr, resaltarRes);
		
		VBox botonera = new VBox();
		botonera.setSpacing(5);
		botonera.getChildren().addAll(todo, cerrar, ayuda);
		
		GridPane root = new GridPane();
		root.setGridLinesVisible(false);
		root.setVgap(5);
		root.setHgap(5);
		root.setPadding(new Insets(5));
		root.addRow(0, new Label("Buscar:"), new HBox(buscador));
		root.addRow(0, buscar);
		root.addRow(1, new Label("Reemplazar con:"), new HBox(reemplazador));
		root.addRow(1, reemplazar);
		root.addRow(2, new Label(""), primera, botonera);
		root.addRow(3, new Label(""), segunda);
		
		
		
		GridPane.setColumnSpan(buscador, 2);
		GridPane.setHgrow(buscador, Priority.ALWAYS);
		GridPane.setColumnSpan(buscar, 3);
		GridPane.setColumnSpan(reemplazador, 2);
		GridPane.setHgrow(reemplazador, Priority.ALWAYS);
		
		HBox.setHgrow(buscador, Priority.ALWAYS);
		HBox.setHgrow(reemplazador, Priority.ALWAYS);
		
		Scene scene = new Scene(root, 480, 320);
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
