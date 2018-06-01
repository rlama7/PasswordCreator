/**
 * PassWordPane   --A program to demonstrate use of a TextField and a GridPane.
 * @author          Ratna Lama / Luliia Oblasova
 * @version         1.0
 * @since           09/25/2017
 */

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import java.util.Random;

public class PassWordPane extends GridPane{
    private Label result;
    private TextField name;
    private TextField sixDigitDate;

    /**
    * Instantiates four labels: header, nameLabel, datelabel, result.
    * Instantiates two textFields: name and sixDigitDate.
    * Includes method refrences ('handlers') that respond
    * when a user types into the TextFields and presses <enter>.
    * Sets up a GUI containing a labeled text field for generating
    * password.
    * The password is displayed by the 4th Label and uses this algorithm:
	* I     first 2 letters of name
	* II    plus a period
	* III   plus a 1-2 digit positive random number
	* IV    plus last 4 digits of date
    */
    public PassWordPane(){
        Font font = new Font(18);

        // Creates header label: "Lama's Password Creator"
        Label header = new Label("Lama's Password Creator");
        header.setFont(font);
        GridPane.setHalignment(header, HPos.LEFT);

        // Creates Label: "Your Name:"
        Label nameLabel = new Label("Your Name:");
        nameLabel.setFont(font);
        GridPane.setHalignment(nameLabel, HPos.RIGHT);

        // Creates Label: "6-digit Date"
        Label dateLabel = new Label("6-digit Date:");
        dateLabel.setFont(font);
        GridPane.setHalignment(dateLabel, HPos.RIGHT);

        // Creates label: result
        result = new Label("Enter Info then press Enter:");
        result.setFont(font);
        GridPane.setHalignment(result, HPos.CENTER);

        // Sets TextField: name
        name = new TextField();
        name.setFont(font);
        name.setPrefColumnCount(5);
        name.setAlignment(Pos.CENTER);
        name.setOnAction(this::processReturn);

        // Sets TextField: sixDigitDate
        sixDigitDate = new TextField();
        sixDigitDate.setFont(font);
        sixDigitDate.setPrefColumnCount(5);
        sixDigitDate.setAlignment(Pos.CENTER);
        sixDigitDate.setOnAction(this::processReturn);

        // Sets up alignment for various labels
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: yellow");

        // Displays output
        add(header, 0, 0); 			// displays header field
        add(nameLabel, 0, 1);		// displays nameLabel: "Your Name:"
        add(name, 1, 1);			// displays textField for nameLabel
        add(dateLabel, 0, 2);		// displays dateLabel: "6-digit Date:"
        add(sixDigitDate, 1, 2); 	// displays textField for dateLabel
        add(result, 0, 3);			// displays newly generated password

    }	// end constructor PassWordPane

    /**
    * Computes and displays the converted temperature when the user
    * presses the return key while in the text field.
    */
    public void processReturn(ActionEvent event){

        String nameStr = name.getText(); 						// Gets name String
        nameStr = nameStr.substring(0,2); 						// Extracts first two substring from String
        String fourStr = sixDigitDate.getText(); 				// Gets sixDigitDate in String format
        fourStr = fourStr.substring(2, 6); 						// Extracts last four digits in Strings
        int randomNum = 1 + (int) (Math .random() * 99); 		// Generates a random number between 1 to 100
        String password = nameStr + "." + randomNum + fourStr;	// Generates password
        result.setText(password);

    }	// end method processReturn

} // class PassWordPane (BluePrint)
