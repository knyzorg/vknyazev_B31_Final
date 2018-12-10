package application;

import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MorseController {
	@FXML
    private Button encodeBtn;
	@FXML
    private Button decodeBtn;
	@FXML
    private Button clearBtn;

	@FXML
	private TextArea outputFld;
	@FXML
	private TextArea inputFld;
	
    public void initialize() {
    	// init
    }
    
    public void encode() {
    	outputFld.setText("Encoded output here");
    }
    
    public void decode() {
    	outputFld.setText("Decoded output here");
    }
    
    public void clear() {
    	inputFld.setText("");
    	outputFld.setText("");
    }
}
