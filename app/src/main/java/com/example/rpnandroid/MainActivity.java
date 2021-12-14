package com.example.rpnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    public TextView display;
    private final Stack<String> stack = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.calculation_display);

        findViewById(R.id.zero_button).setOnClickListener(view -> {
            if (!display.getText().toString().equals("0") && !display.getText().toString().equals("ERROR")) {
                display.append("0");
            }
        });

        findViewById(R.id.one_button).setOnClickListener(view -> {
            if (display.getText().toString().equals("0")) {
                display.setText("1");
            } else if (!display.getText().toString().equals("ERROR")){
                display.append("1");
            }
        });

        findViewById(R.id.two_button).setOnClickListener(view -> {
            if (display.getText().toString().equals("0")) {
                display.setText("2");
            } else if (!display.getText().toString().equals("ERROR")) {
                display.append("2");
            }
        });

        findViewById(R.id.three_button).setOnClickListener(view -> {
            if (display.getText().toString().equals("0")) {
                display.setText("3");
            } else if (!display.getText().toString().equals("ERROR")) {
                display.append("3");
            }
        });

        findViewById(R.id.four_button).setOnClickListener(view -> {
            if (display.getText().toString().equals("0")) {
                display.setText("4");
            } else if (!display.getText().toString().equals("ERROR")) {
                display.append("4");
            }
        });

        findViewById(R.id.five_button).setOnClickListener(view -> {
            if (display.getText().toString().equals("0")) {
                display.setText("5");
            } else if (!display.getText().toString().equals("ERROR")) {
                display.append("5");
            }
        });

        findViewById(R.id.six_button).setOnClickListener(view -> {
            if (display.getText().toString().equals("0")) {
                display.setText("6");
            } else if (!display.getText().toString().equals("ERROR")) {
                display.append("6");
            }
        });

        findViewById(R.id.seven_button).setOnClickListener(view -> {
            if (display.getText().toString().equals("0")) {
                display.setText("7");
            } else if (!display.getText().toString().equals("ERROR")) {
                display.append("7");
            }
        });

        findViewById(R.id.eight_button).setOnClickListener(view -> {
            if (display.getText().toString().equals("0")) {
                display.setText("8");
            } else if (!display.getText().toString().equals("ERROR")) {
                display.append("8");
            }
        });

        findViewById(R.id.nine_button).setOnClickListener(view -> {
            if (display.getText().toString().equals("0")) {
                display.setText("9");
            } else if (!display.getText().toString().equals("ERROR")) {
                display.append("9");
            }
        });

        findViewById(R.id.clear_button).setOnClickListener(view -> {
            display.setText("");
            while (!stack.isEmpty()) {
                stack.pop();
            }
        });

        findViewById(R.id.decimal_button).setOnClickListener(view -> {
            if (!display.getText().toString().contains(".") && !display.getText().toString().equals("ERROR")) {
                display.append(".");
            }
        });

        findViewById(R.id.enter_button).setOnClickListener(view -> {
            if (!display.getText().toString().equals("") && !display.getText().toString().equals("ERROR")) {
                stack.push(display.getText().toString());
                display.setText("");
            }
        });

        findViewById(R.id.plus_button).setOnClickListener(view -> {
            if (!display.getText().toString().equals("ERROR")) {
                if (!display.getText().toString().equals("")) {
                    stack.push(display.getText().toString());
                }
                if (stack.isEmpty()) {
                    display.setText(R.string.error);
                    return;
                }
                float number = Float.parseFloat(stack.pop());
                if (stack.isEmpty()) {
                    display.setText(R.string.error);
                    return;
                }
                number += Float.parseFloat(stack.pop());
                display.setText(Float.toString(number));
            }

            /*
            if (display.getText().toString().equals("") || display.getText().toString().equals("ERROR")) {
                display.setText(R.string.error);
            } else {
                float number = Float.parseFloat(display.getText().toString());
                if (stack.isEmpty()) {
                    display.setText(R.string.error);
                    return;
                } else {
                    number += Float.parseFloat(stack.pop());
                }
                display.setText(Float.toString(number));
            }
             */
        });

        findViewById(R.id.minus_button).setOnClickListener(view -> {
            if (!display.getText().toString().equals("ERROR")) {
                if (!display.getText().toString().equals("")) {
                    stack.push(display.getText().toString());
                }
                if (stack.isEmpty()) {
                    display.setText(R.string.error);
                    return;
                }
                float number = Float.parseFloat(stack.pop());
                if (stack.isEmpty()) {
                    display.setText(R.string.error);
                    return;
                }
                number = Float.parseFloat(stack.pop()) - number;
                display.setText(Float.toString(number));
            }

            /*
            if (display.getText().toString().equals("") || display.getText().toString().equals("ERROR")) {
                display.setText(R.string.error);
            } else {
                float number = Float.parseFloat(display.getText().toString());
                if (stack.isEmpty()) {
                    display.setText(R.string.error);
                    return;
                } else {
                    number = Float.parseFloat(stack.pop()) - number;
                }
                display.setText(Float.toString(number));
            }
             */
        });

        findViewById(R.id.divide_button).setOnClickListener(view -> {
            if (!display.getText().toString().equals("ERROR")) {
                if (!display.getText().toString().equals("")) {
                    stack.push(display.getText().toString());
                }
                if (stack.isEmpty() || Float.parseFloat(stack.peek()) == 0) {
                    display.setText(R.string.error);
                    return;
                }
                float number = Float.parseFloat(stack.pop());
                if (stack.isEmpty()) {
                    display.setText(R.string.error);
                    return;
                }
                number = Float.parseFloat(stack.pop()) / number;
                display.setText(Float.toString(number));
            }

            /*
            if (display.getText().toString().equals("") || display.getText().toString().equals("ERROR")) {
                display.setText(R.string.error);
            } else {
                float number = Float.parseFloat(display.getText().toString());
                if (stack.isEmpty() || number == 0) {
                    display.setText(R.string.error);
                    return;
                } else {
                    number = Float.parseFloat(stack.pop()) / number;
                }
                display.setText(Float.toString(number));
            }
             */
        });

        findViewById(R.id.multiply_button).setOnClickListener(view -> {
            if (!display.getText().toString().equals("ERROR")) {
                if (!display.getText().toString().equals("")) {
                    stack.push(display.getText().toString());
                }
                if (stack.isEmpty()) {
                    display.setText(R.string.error);
                    return;
                }
                float number = Float.parseFloat(stack.pop());
                if (stack.isEmpty()) {
                    display.setText(R.string.error);
                    return;
                }
                number *= Float.parseFloat(stack.pop());
                display.setText(Float.toString(number));
            }

            /*
            if (display.getText().toString().equals("") || display.getText().toString().equals("ERROR")) {
                display.setText(R.string.error);
            } else {
                float number = Float.parseFloat(display.getText().toString());
                if (stack.isEmpty()) {
                    display.setText(R.string.error);
                    return;
                } else {
                    number *= Float.parseFloat(stack.pop());
                }
                display.setText(Float.toString(number));
            }
             */
        });
    }

}