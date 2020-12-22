package model;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.Stack;


public class functionsC {

    public Stack<String> num = new Stack<String>();
    public StringBuilder numbers = new StringBuilder();
    public StringBuilder pushed_numbers = new StringBuilder();

    @FXML public TextArea txt;
    @FXML public TextArea txt1;

    //button for numbers
    @FXML public Button btn0;
    @FXML public Button btn1;
    @FXML public Button btn2;
    @FXML public Button btn3;
    @FXML public Button btn4;
    @FXML public Button btn5;
    @FXML public Button btn6;
    @FXML public Button btn7;
    @FXML public Button btn8;
    @FXML public Button btn9;
    @FXML public Button btn_comma;
    @FXML public Button btn_divide;

    public void setNumbers() {
        if (btn0.isArmed()) {
            numbers.append(0);
            txt.setText(numbers.toString());
        }
        else if (btn1.isArmed()) {
            numbers.append(1);
            txt.setText(numbers.toString());
        }
        else if (btn2.isArmed()) {
            numbers.append(2);
            txt.setText(numbers.toString());
        }
        else if (btn3.isArmed()) {
            numbers.append(3);
            txt.setText(numbers.toString());
        }
        else if (btn4.isArmed()) {
            numbers.append(4);
            txt.setText(numbers.toString());
        }
        else if (btn5.isArmed()) {
            numbers.append(5);
            txt.setText(numbers.toString());
        }
        else if (btn6.isArmed()) {
            numbers.append(6);
            txt.setText(numbers.toString());
        }
        else if (btn7.isArmed()) {
            numbers.append(7);
            txt.setText(numbers.toString());
        }
        else if (btn8.isArmed()) {
            numbers.append(8);
            txt.setText(numbers.toString());
        }
        else if (btn9.isArmed()) {
            numbers.append(9);
            txt.setText(numbers.toString());
        }
        else if (btn_comma.isArmed()) {
            numbers.append(".");
            txt.setText(numbers.toString());
        }
        else if (btn_divide.isArmed()){
            numbers.append("/");
            txt.setText(numbers.toString());
        }
    }

    public void function_Enter() {
            num.push(String.valueOf(numbers));
            pushed_numbers.append(String.format("%s %n", numbers));
            txt1.setText(String.valueOf(pushed_numbers));
            txt.setText(null);
            numbers.delete(0, numbers.length());
    }

    public void function_C(){
        num.clear();
        numbers.delete(0,numbers.length());
        pushed_numbers.delete(0,pushed_numbers.length());
        txt.setText(null);
        txt1.setText(null);
    }

    public void function_CE(){
        txt.setText(null);
        numbers.delete(0,numbers.length());
    }

    public void function_plus(){
        try {
            double firstNum = Double.parseDouble(num.pop());
            double secondNum = Double.parseDouble(num.pop());

            double result = firstNum + secondNum;
            txt.setText(String.valueOf(result));
        }
        catch (Exception ex){
            txt.setText("input error");
        }
    }

    public void function_minus(){
        try {
            double firstNum = Double.parseDouble(num.pop());
            double secondNum = Double.parseDouble(num.pop());

            double result = secondNum - firstNum;
            txt.setText(String.valueOf(result));
        }
        catch (Exception ex){
            txt.setText("input error");
        }
    }

    public void function_multiply(){
        try {
            double firstNum = Double.parseDouble(num.pop());
            double secondNum = Double.parseDouble(num.pop());

            double result = firstNum * secondNum;
            txt.setText(String.valueOf(result));
        }
        catch (Exception ex){
            txt.setText("input error");
        }
    }

    public void function_divide(){
        try {
            double firstNum = Double.parseDouble(num.pop());
            double secondNum = Double.parseDouble(num.pop());

            double result = secondNum / firstNum;
            txt.setText(String.valueOf(result));
        }
        catch (Exception ex){
            txt.setText("input error");
        }
    }

    public void function_switch(){
        try {
            double firstNum = Double.parseDouble(num.pop());

            double result = 1 / firstNum;

            txt.setText(String.valueOf(result));
        }
        catch (Exception ex){
            txt.setText("input error");
        }
    }

    public void function_switch1(){
        try {
            double firstNum = Double.parseDouble(num.pop());
            double secondNum = Double.parseDouble(num.pop());

            num.push(String.valueOf(secondNum));
            num.push(String.valueOf(firstNum));

            txt.setText(String.valueOf(num));
        }
        catch (Exception ex){
            txt.setText("input error");
        }
    }
}


