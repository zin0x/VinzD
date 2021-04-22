package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class Controller {
    public Label labelName;
    public TextField calculatorOutput;
    public ArrayList<String> numbers = new ArrayList<>();
    public ArrayList<String> operators = new ArrayList<>();
    boolean lastButtonEquals = false;

    //method for adding numbers into calculator
    public void number(int value){
        if (lastButtonEquals){
            numbers.clear();
            operators.clear();
            calculatorOutput.setText("");
        }
        int x = value;
        String y = Integer.toString(x);
        int number = Integer.parseInt(calculatorOutput.getText() + y);
        String num = Integer.toString(number);
        calculatorOutput.setText(num);
        numbers.add(num);
    }

    //clears calculator input/output text field
    public void clear(ActionEvent actionEvent) {
        numbers.clear();
        operators.clear();
        calculatorOutput.setText("");
    }

    public void equalTo(ActionEvent actionEvent) {
        int x = Integer.parseInt(numbers.get(0));
        int y = Integer.parseInt(numbers.get(numbers.size()-1));
        int z = Integer.parseInt(operators.get(0));
        int answer;
        if(z==0){
            answer = x+y;
        }else if(z==1){
            answer = x-y;
        }else{
            answer = x*y;
        }
        numbers.add(0, Integer.toString(answer));
        calculatorOutput.setText(numbers.get(0));
        lastButtonEquals = true;
    }

    //addition
    public void addX(ActionEvent actionEvent) {
        operators.add(0,Integer.toString(0));
        calculatorOutput.setText("");
    }

    //subtraction
    public void subtractX(ActionEvent actionEvent) {
        calculatorOutput.setText("");
        operators.add(0, Integer.toString(1));
    }

    //multiplication
    public void multiplyX(ActionEvent actionEvent) {
        calculatorOutput.setText("");
        operators.add(0, Integer.toString(2));
    }




    //ActionEvent for buttons 0-9
    public void one(ActionEvent actionEvent) {
        number(1);
    }
    public void two(ActionEvent actionEvent) {
        number(2);
    }
    public void three(ActionEvent actionEvent) {
        number(3);
    }
    public void four(ActionEvent actionEvent) {
        number(4);
    }
    public void five(ActionEvent actionEvent) {
        number(5);
    }
    public void six(ActionEvent actionEvent) {
        number(6);
    }
    public void seven(ActionEvent actionEvent) {
        number(7);
    }
    public void eight(ActionEvent actionEvent) {
        number(8);
    }
    public void nine(ActionEvent actionEvent) {
        number(9);
    }
    public void zero(ActionEvent actionEvent) {
        number(0);
    }
}
