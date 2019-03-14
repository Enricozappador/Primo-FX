package it.polito.tdp.primofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField casellatesto;

    @FXML
    private Button invio;

    @FXML
    private TextArea stampa;

    @FXML
    void handleinvio(ActionEvent event) {
    	
    	String parolaScritta = casellatesto.getText();
    	
    	parolaScritta =parolaScritta.trim();
    	
    	if (parolaScritta.length()==0)
    	{
    		stampa.appendText("Non Puoi non inserire nulla! \n");
    	}
    	else {
    	
    	
    	stampa.setText("Hai digitato la parola : "+parolaScritta+".\n");
    	
    	casellatesto.clear();
    	 }}
    
 


    @FXML
    void initialize() {
        assert casellatesto != null : "fx:id=\"casellatesto\" was not injected: check your FXML file 'Primo_FX .fxml'.";
        assert invio != null : "fx:id=\"invio\" was not injected: check your FXML file 'Primo_FX .fxml'.";
        assert stampa != null : "fx:id=\"stampa\" was not injected: check your FXML file 'Primo_FX .fxml'.";

    }
}
