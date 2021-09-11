package sample;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.NodeOrientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    GridPane cuadro;
    private Integer Nfilas; //(Horizontal)
    private Integer Ncolumnas; //(vertical)
    private Button [][] arrayPlantilla;
    private String NumeroBase;
    private Integer NBTransf, Magnitud;
    private Label nodo, nodo2;
    private TextField RecibidorDatos, RecibidorMagnitud;
    private BorderPane root;
    private Button Next;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vBox = new VBox();
        nodo = new Label(" Ingresa el Numero Base:  ");
        RecibidorDatos = new TextField();
        nodo2 = new Label(" Magnitud del cuadro:  ");
        RecibidorMagnitud = new TextField();
        Next = new Button("SIGUIENTE");
        vBox.getChildren().addAll(nodo, nodo2, RecibidorDatos, RecibidorMagnitud, Next);
        root = new BorderPane();
        root.setTop(vBox);
        Scene scene = new Scene(root, 400, 100);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
        Next.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent){
                NumeroBase = RecibidorDatos.getText();
                Magnitud = Integer.parseInt(RecibidorMagnitud.getText());
                arrayPlantilla = new Button[Magnitud][Magnitud];//NXN
                if(Magnitud == 3){
                cuadro = new GridPane();

                //Método 0 PARA 3X3
                cuadro.add(new Button(NumeroBase), 1, 0); //                               C      R
                NBTransf = Integer.parseInt(NumeroBase); //convertimos el numero base (texto) a entero
                System.out.println("" + NBTransf); //27
                NBTransf++; /*sumamos 1 al numero base para que en la sig.vuelta ya sea el numero que sigue y asi
                              hasta terminar el ciclo...*/
                System.out.println("" + NBTransf); //28
                // se requiere una forma de parseo de NBtrnsg a string para despues solo igualar 2 strings
                NumeroBase = NBTransf.toString(); //convertimos el número base aumentado de int a string (este es la forma)
                System.out.println(NumeroBase); //27

                cuadro.add(new Button(NumeroBase), 2, 2);
                NBTransf = Integer.parseInt(NumeroBase);
                NBTransf++;
                NumeroBase = NBTransf.toString();

                cuadro.add(new Button(NumeroBase), 0, 1);
                NBTransf = Integer.parseInt(NumeroBase);
                NBTransf++;
                NumeroBase = NBTransf.toString();

                cuadro.add(new Button(NumeroBase), 0, 2);
                NBTransf = Integer.parseInt(NumeroBase);
                NBTransf++;
                NumeroBase = NBTransf.toString();

                cuadro.add(new Button(NumeroBase), 1, 1);
                NBTransf = Integer.parseInt(NumeroBase);
                NBTransf++;
                NumeroBase = NBTransf.toString();

                cuadro.add(new Button(NumeroBase), 2, 0);
                NBTransf = Integer.parseInt(NumeroBase);
                NBTransf++;
                NumeroBase = NBTransf.toString();

                cuadro.add(new Button(NumeroBase), 2, 1);
                NBTransf = Integer.parseInt(NumeroBase);
                NBTransf++;
                NumeroBase = NBTransf.toString();

                cuadro.add(new Button(NumeroBase), 0, 0);
                NBTransf = Integer.parseInt(NumeroBase);
                NBTransf++;
                NumeroBase = NBTransf.toString();

                cuadro.add(new Button(NumeroBase), 1, 2);
                NumeroBase = NBTransf.toString();}

                if(Magnitud == 5){
                    cuadro = new GridPane();

                    //Método 0 PARA 5X5
                    cuadro.add(new Button(NumeroBase), 2, 0); //                               C      R
                    NBTransf = Integer.parseInt(NumeroBase); //convertimos el numero base (texto) a entero
                    System.out.println("" + NBTransf); //27
                    NBTransf++; /*sumamos 1 al numero base para que en la sig.vuelta ya sea el numero que sigue y asi
                              hasta terminar el ciclo...*/
                    System.out.println("" + NBTransf); //28
                    // se requiere una forma de parseo de NBtrnsg a string para despues solo igualar 2 strings
                    NumeroBase = NBTransf.toString(); //convertimos el número base aumentado de int a string (este es la forma)
                    System.out.println(NumeroBase); //27

                    cuadro.add(new Button(NumeroBase), 3, 4);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 4, 3);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 0, 2);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 1, 1);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 1, 2);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 2, 1);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 3, 0);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 4, 4);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 0, 3);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 0, 4);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 1, 3);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 2, 2);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 3, 1);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 4, 0);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 4, 1);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 0, 0);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 1, 4);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 2, 3);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 3, 2);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 3, 3);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 4, 2);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 0, 1);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 1, 0);
                    NBTransf = Integer.parseInt(NumeroBase);
                    NBTransf++;
                    NumeroBase = NBTransf.toString();

                    cuadro.add(new Button(NumeroBase), 2, 4);
                    NumeroBase = NBTransf.toString();
                }

                //if(Magnitud != 3 || Magnitud != 5){
                 //   System.exit(0);
                //}

                Scene scene2 = new Scene(cuadro);
                primaryStage.setScene(scene2);
                primaryStage.setMaximized(true);
                primaryStage.setTitle("CUADRO MAGICO");
                primaryStage.show();
                //System.exit(0);
            }
            });
            }
    private String toString(Integer NBTransf) {
        return NumeroBase;
    }

    public static void main(String[] args) {
        launch(args);
    }}
