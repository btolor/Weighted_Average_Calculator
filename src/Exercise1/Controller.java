package Exercise1;
//Imports...
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.animation.*;
import javafx.util.Duration;

public class Controller {
    //Weighted Calculator gui controls...
    //Gui Buttons.
    public Button btn_calculate;
    public Button btn_clear;
    //Test Score gui text-fields..
    public TextField testScoreOne;
    public TextField testScoreTwo;
    public TextField testScoreThree;
    public TextField testScoreFour;
    //Weight percentage gui text-fields...
    public TextField weightOne;
    public TextField weightTwo;
    public TextField weightThree;
    public TextField weightFour;
    //Weighted Average gui label....
    public Label weightedAverageLabel;
    public Label validationError;
    //Weighted Average....
    public Label weightedAverage;









    //Weighted Average Calculator GUI methods...
    //This is a validation method to ensure a number is entered into the test-score text-field...
    public boolean tsValidation(TextField test, String score ){
        //The try catch method checks to see if the test score can be parsed into an int and if so it returns true...
        try {
            int valid = Integer.parseInt(test.getText());
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    //This is a validation method to ensure a double/float is entered into the test-score text-field...
    public boolean twValidation(TextField test, String weight ){
        //The try catch method checks to see if the weight can be parsed into a double and if so it returns true...
        try {
            double valid = Double.parseDouble(weight);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }


    //The button methods...
    /*This method calculates the weighted average of the test scores and their weight percentages
     when the calculate button is clicked. If all of the test score and weight validations
     are true the test scores are converted to integers and the weights are converted to doubles,
     else a validation error is displayed. After everything is converted to its required data type
     the weighted average is calculated in a double type variable and then converted to a string to
     be displayed in a label on the gui...*/
    public void btn_calculateClicked(){
        if(tsValidation(testScoreOne, testScoreOne.getText()) == true
                && tsValidation(testScoreTwo, testScoreTwo.getText()) == true
                && tsValidation(testScoreThree, testScoreThree.getText()) == true
                && tsValidation(testScoreFour, testScoreFour.getText()) == true
                && twValidation(weightOne, weightOne.getText()) == true
                && twValidation(weightTwo, weightTwo.getText()) == true
                && twValidation(weightThree, weightThree.getText()) == true
                && twValidation(weightFour, weightFour.getText()) == true){
            int tOne = Integer.parseInt(testScoreOne.getText());
            int tTwo = Integer.parseInt(testScoreTwo.getText());
            int tThree = Integer.parseInt(testScoreThree.getText());
            int tFour = Integer.parseInt(testScoreFour.getText());
            double wOne = Double.parseDouble(weightOne.getText());
            double wTwo = Double.parseDouble(weightTwo.getText());
            double wThree = Double.parseDouble(weightThree.getText());
            double wFour = Double.parseDouble(weightFour.getText());
            /*The weighted average calculation adds each weight times its test score
            together then it divides that total by the sum of all the weights...*/
            String calculatedWAverage = Double.toString((wOne * tOne) + (wTwo * tTwo) + (wThree * tThree) +
                    (wFour * tFour) / (wOne + wTwo + wThree + wFour));
            weightedAverageLabel.setText("Weighted Average: ");
            weightedAverage.setText(calculatedWAverage + "%");
            validationError.setText("");
        }else{
            validationError.setText("* Invalid Entries...");
        }
    }

    /*This is the method to clear all the text-fields and certain labels text
    when the clear button is clicked...*/
    public void btn_clearClicked(){
        testScoreOne.clear();
        testScoreTwo.clear();
        testScoreThree.clear();
        testScoreFour.clear();
        weightOne.clear();
        weightTwo.clear();
        weightThree.clear();
        weightFour.clear();
        weightedAverage.setText("");
        weightedAverageLabel.setText("");
        validationError.setText("");
    }

    //CSS work-around methods for hovering over buttons...
    //This method is a CSS work-around to add background color to the calculate button when the mouse hovers over it.
     //#6600ff
    public void btn_CalculateHover(){
        btn_calculate.setStyle("-fx-background-color: #66ffcc; -fx-border-style: solid; -fx-border-color: #66ffcc; -fx-text-fill: #6600ff; -fx-border-radius: 5");
    }
    //This method is a CSS work-around to remove the background color on the calculate button when the mouse is not hovering over it..
    public void btn_CalculateUnHover(){
        btn_calculate.setStyle("-fx-background-color: transparent; -fx-border-style: solid; -fx-border-color: #66ffcc; -fx-border-radius: 5");
    }
    //This method is a CSS work-around to add background color to the clear button when the mouse hovers over it...
    public void btn_ClearHover(){
        btn_clear.setStyle("-fx-background-color: #ff3385; -fx-border-color: #ff3385; -fx-border-radius: 5; -fx-text-fill: #6600ff; -fx-border-style: solid");
    }
    //This method is a CSS work-around to remove the background color on the clear button when the mouse is not hovering over it....
    public void btn_ClearUnHover(){
        btn_clear.setStyle("-fx-background-color: transparent; -fx-border-color: #ff3385; -fx-border-radius: 5; -fx-border-style: solid");
    }





}
