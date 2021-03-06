package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  TextView input, signBox;
  String sign, value1, value2;
  Double num1, num2, result;
  boolean hasDot;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
//    Toolbar toolbar = findViewById(R.id.toolbar);
//    TextView calcTitle = toolbar.findViewById(R.id.toolbar_title);
    input = (TextView) findViewById(R.id.input);
    signBox = (TextView) findViewById(R.id.sign);

    hasDot = false;
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu, menu);

    return super.onCreateOptionsMenu(menu);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item){
    switch(item.getItemId()){
      case R.id.menuAbout :
        Intent aboutIntent = new Intent(this, About.class );
        startActivity(aboutIntent);
        return true;

      case R.id.menuCalc :
        Intent calcIntent = new Intent(this, MainActivity.class );
        startActivity(calcIntent);
        return true;

      case R.id.menuConversions :
        Intent conversionsIntent = new Intent(this, conversion.class );
        startActivity(conversionsIntent);
        return true;

      case R.id.menuHistory :
        Intent historyIntent = new Intent(this, history.class );
        startActivity(historyIntent);
        return true;


      default: return super.onOptionsItemSelected(item);
    }

  }

  @SuppressLint("SetTextI18n")
  public void btnClick_0(View view) {
    input.setText(input.getText() + "0");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_1(View view) {
    input.setText(input.getText() + "1");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_2(View view) {
    input.setText(input.getText() + "2");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_3(View view) {
    input.setText(input.getText() + "3");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_4(View view) {
    input.setText(input.getText() + "4");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_5(View view) {
    input.setText(input.getText() + "5");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_6(View view) {
    input.setText(input.getText() + "6");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_7(View view) {
    input.setText(input.getText() + "7");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_8(View view) {
    input.setText(input.getText() + "8");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_9(View view) {
    input.setText(input.getText() + "9");
  }

  @SuppressLint("SetTextI18n")
  public void btnRandom(View view) {
    Random rand = new Random();
    double d = rand.nextInt(999999);
    String s = Double.toString(d);
    input.setText(input.getText() + s);
  }

  @SuppressLint("SetTextI18n")
  public void btnPi(View view) {
    double d = Math.PI;
    String s = Double.toString(d);
    input.setText(input.getText() + s);
  }

  @SuppressLint("SetTextI18n")
  public void btnNegative(View view) {
    double i = Double.parseDouble(String.valueOf(input.getText()));
    i = i * (-1);
    input.setText(String.valueOf(i));
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_dot(View view) {
    if (!hasDot) {
      if (input.getText().equals("")) {

        input.setText("0.");
      } else {
        input.setText(input.getText() + ".");
      }

      hasDot = true;
    }

  }

  public void btnClick_add(View view) {
    sign = "+";
    value1 = input.getText().toString();
    input.setText(null);
    signBox.setText("+");
    hasDot = false;
  }

  public void btnClick_subtract(View view) {
    sign = "-";
    value1 = input.getText().toString();
    input.setText(null);
    signBox.setText("-");
    hasDot = false;
  }

  public void btnClick_multiply(View view) {
    sign = "*";
    value1 = input.getText().toString();
    input.setText(null);
    signBox.setText("??");
    hasDot = false;
  }

  public void btnClick_percent(View view) {
    sign = "%";
    value1 = input.getText().toString();
    input.setText(null);
    signBox.setText("%");
    hasDot = false;

  }

  public void btnClick_divide(View view) {
    sign = "/";
    value1 = input.getText().toString();
    input.setText(null);
    signBox.setText("??");
    hasDot = false;
  }

  public void btnClick_power(View view) {
    sign = "power";
    value1 = input.getText().toString();
    input.setText(null);
    hasDot = false;
    signBox.setText("x???");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_sin(View view) {
    sign = "sin";
    input.setText(null);
    hasDot = false;
    signBox.setText("sin");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_cos(View view) {
    sign = "cos";
    input.setText(null);
    hasDot = false;
    signBox.setText("cos");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_tan(View view) {
    sign = "tan";
    input.setText(null);
    hasDot = false;
    signBox.setText("tan");
  }

  public void btnClick_root(View view) {
    sign = "root";
    input.setText(null);
    hasDot = false;
    signBox.setText("???");
  }

  @SuppressLint("SetTextI18n")
  public void btnClick_equal(View view) {
    if (sign == null) {
      signBox.setText("Error!");
    } else if (input.getText().equals("")) {
      signBox.setText("Error!");
    } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")) {
      signBox.setText("Error!");
    } else {
      switch (sign) {
        default:
          break;
        case "log":
          value1 = input.getText().toString();
          num1 = Double.parseDouble(value1);
          input.setText(Math.log10(num1) + "");
          sign = null;
          signBox.setText(null);
          break;
        case "power":
          num1 = Double.parseDouble((value1));
          value2 = input.getText().toString();
          num2 = Double.parseDouble(value2);
          input.setText(Math.pow(num1, num2) + "");
          sign = null;
          signBox.setText(null);
          break;
        case "root":
          value1 = input.getText().toString();
          num1 = Double.parseDouble((value1));
          input.setText(Math.sqrt(num1) + "");
          sign = null;
          signBox.setText(null);
          break;
        case "%":
          value1 = input.getText().toString();
          num1 = Double.parseDouble(value1);
          input.setText((num1 / 100 * 10) + "");
          sign = null;
          signBox.setText(null);
          break;
        case "sin":
          value1 = input.getText().toString();
          num1 = Double.parseDouble((value1));
          input.setText(Math.sin(num1) + "");
          sign = null;
          signBox.setText(null);
          break;
        case "cos":
          value1 = input.getText().toString();
          num1 = Double.parseDouble((value1));
          input.setText(Math.cos(num1) + "");
          sign = null;
          signBox.setText(null);
          break;
        case "tan":
          value1 = input.getText().toString();
          num1 = Double.parseDouble((value1));
          input.setText(Math.tan(num1) + "");
          sign = null;
          signBox.setText(null);
          break;
        case "+":
          value2 = input.getText().toString();
          num1 = Double.parseDouble(value1);
          num2 = Double.parseDouble(value2);
          result = num1 + num2;
          input.setText(result + "");
          sign = null;
          signBox.setText(null);
          break;
        case "-":
          value2 = input.getText().toString();
          num1 = Double.parseDouble(value1);
          num2 = Double.parseDouble(value2);
          result = num1 - num2;
          input.setText(result + "");
          sign = null;
          signBox.setText(null);
          break;
        case "*":
          value2 = input.getText().toString();
          num1 = Double.parseDouble(value1);
          num2 = Double.parseDouble(value2);
          result = num1 * num2;
          input.setText(result + "");
          sign = null;
          signBox.setText(null);
          break;
        case "/":
          value2 = input.getText().toString();
          num1 = Double.parseDouble(value1);
          num2 = Double.parseDouble(value2);
          result = num1 / num2;
          input.setText(result + "");
          sign = null;
          signBox.setText(null);
          break;
      }

    }
  }


  public void btnClick_delete(View view) {
    if (input.getText().equals("")) {
      input.setText(null);
    } else {
      int len = input.getText().length();
      String s = input.getText().toString();
      if (s.charAt(len - 1) == '.') {
        hasDot = false;
        input.setText(input.getText().subSequence(0, input.getText().length() - 1));

      } else {
        input.setText(input.getText().subSequence(0, input.getText().length() - 1));
      }
    }
  }

  public void btnClick_clear(View view) {

    input.setText(null);
    signBox.setText(null);
    value1 = null;
    value2 = null;
    sign = null;
    hasDot = false;
  }


}
