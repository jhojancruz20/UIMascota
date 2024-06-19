import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnMostar;

    @FXML
    private Button btnSalir;

    @FXML
    private TextField lblEdad;

    @FXML
    private TextField lblEspecie;

    @FXML
    private TextField lblNombre;

    @FXML
    private TextField lblRaza;

    @FXML
    private TextArea txfResultados;
    
    Mascota ob1 = new Mascota();

    @FXML
    void inAgregarEdad(ActionEvent event) {

    }

    @FXML
    void inAgregarEspecie(ActionEvent event) {

    }

    @FXML
    void inAgregarMascotas(ActionEvent event) {

    }

    @FXML
    void inAgregarNombre(ActionEvent event) {

    }

    @FXML
    void inAgregarRaza(ActionEvent event) {

    }

    @FXML
    void inMostrarMascotas(ActionEvent event) {

    }

    @FXML
    void inSalirFormulario(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnAgregar != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'RegistroMascotas.fxml'.";
        assert btnMostar != null : "fx:id=\"btnMostar\" was not injected: check your FXML file 'RegistroMascotas.fxml'.";
        assert btnSalir != null : "fx:id=\"btnSalir\" was not injected: check your FXML file 'RegistroMascotas.fxml'.";
        assert lblEdad != null : "fx:id=\"lblEdad\" was not injected: check your FXML file 'RegistroMascotas.fxml'.";
        assert lblEspecie != null : "fx:id=\"lblEspecie\" was not injected: check your FXML file 'RegistroMascotas.fxml'.";
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'RegistroMascotas.fxml'.";
        assert lblRaza != null : "fx:id=\"lblRaza\" was not injected: check your FXML file 'RegistroMascotas.fxml'.";
        assert txfResultados != null : "fx:id=\"txfResultados\" was not injected: check your FXML file 'RegistroMascotas.fxml'.";

    }

}
