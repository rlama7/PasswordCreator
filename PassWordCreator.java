/**
 * PassWordCreator.java  --A Driver program to generate a password.
 * @author                 Ratna Lama / Luliia Oblasova
 * @version                1.0
 * @since                  09/25/2017
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
* The password is displayed by the 4th Label and uses this algorithm:
* I     first 2 letters of name
* II    plus a period
* III   plus a 1-2 digit positive random number
* IV    plus last 4 digits of date
*/
public class PassWordCreator extends Application{
    /**
    * Launches the password generator application.
    */
    public void start(Stage primaryStage){
        Scene scene = new Scene(new PassWordPane(), 450, 450);

        primaryStage.setTitle("Password Creator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }   // end method start

    /**
   * Prints out newly generated password
   * and the command line arguments.
   * @param arg A string array containing
   * the command line arguments.
   * @exception Any exception
   * @return No return value.
   */
    public static void main(String[] args)
    {
        launch(args);
    }   // end method main

}   //end class PassWordCreator
