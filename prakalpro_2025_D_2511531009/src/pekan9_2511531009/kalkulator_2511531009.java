package pekan9_2511531009;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class kalkulator_2511531009 {

    private JFrame frame;
    private JTextField textField;

    double first;
    double second;
    double result;
    String operation;
    String answer;
    boolean isResultDisplayed = false; // for chaining/calculation control

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    kalkulator_2511531009 window = new kalkulator_2511531009();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public kalkulator_2511531009() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 254, 302);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField.setBounds(10, 11, 218, 43);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
                isResultDisplayed = false;
            }
        });
        clear.setBounds(8, 62, 49, 36);
        frame.getContentPane().add(clear);

        JButton delete = new JButton("←");
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String backSpace = null;
                if (textField.getText().length() > 0) {
                    StringBuilder str = new StringBuilder(textField.getText());
                    str.deleteCharAt(textField.getText().length() - 1);
                    backSpace = str.toString();
                    textField.setText(backSpace);
                }
            }
        });
        delete.setBounds(65, 62, 49, 36);
        frame.getContentPane().add(delete);

        JButton num00 = new JButton("00");
        num00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isResultDisplayed) { 
                    textField.setText(""); 
                    isResultDisplayed = false; 
                }
                String number = textField.getText() + num00.getText();
                textField.setText(number);
            }
        });
        num00.setBounds(122, 62, 49, 36);
        frame.getContentPane().add(num00);

        JButton div = new JButton("/");
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText().replace(",", ".")); // PATCH
                textField.setText("");
                operation = "/";
                isResultDisplayed = false;
            }
        });
        div.setBounds(179, 62, 49, 36);
        frame.getContentPane().add(div);

        JButton num1 = new JButton("1");
        num1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isResultDisplayed) {
                    textField.setText("");
                    isResultDisplayed = false;
                }
                String number = textField.getText()+num1.getText();
                textField.setText(number);
            }
        });
        num1.setBounds(8, 104, 49, 36);
        frame.getContentPane().add(num1);

        JButton num2 = new JButton("2");
        num2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isResultDisplayed) {
                    textField.setText("");
                    isResultDisplayed = false;
                }
                String number = textField.getText()+num2.getText();
                textField.setText(number);
            }
        });
        num2.setBounds(65, 104, 49, 36);
        frame.getContentPane().add(num2);

        JButton num3 = new JButton("3");
        num3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isResultDisplayed) {
                    textField.setText("");
                    isResultDisplayed = false;
                }
                String number = textField.getText()+num3.getText();
                textField.setText(number);
            }
        });
        num3.setBounds(122, 104, 49, 36);
        frame.getContentPane().add(num3);

        JButton mul = new JButton("*");
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText().replace(",", ".")); // PATCH
                textField.setText("");
                operation = "*";
                isResultDisplayed = false;
            }
        });
        mul.setBounds(179, 104, 49, 36);
        frame.getContentPane().add(mul);

        JButton num4 = new JButton("4");
        num4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isResultDisplayed) {
                    textField.setText("");
                    isResultDisplayed = false;
                }
                String number = textField.getText()+num4.getText();
                textField.setText(number);
            }
        });
        num4.setBounds(8, 144, 49, 36);
        frame.getContentPane().add(num4);

        JButton num5 = new JButton("5");
        num5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isResultDisplayed) {
                    textField.setText("");
                    isResultDisplayed = false;
                }
                String number = textField.getText()+num5.getText();
                textField.setText(number);
            }
        });
        num5.setBounds(65, 144, 49, 36);
        frame.getContentPane().add(num5);

        JButton num6 = new JButton("6");
        num6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isResultDisplayed) {
                    textField.setText("");
                    isResultDisplayed = false;
                }
                String number = textField.getText()+num6.getText();
                textField.setText(number);
            }
        });
        num6.setBounds(122, 144, 49, 36);
        frame.getContentPane().add(num6);

        JButton sub = new JButton("-");
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText().replace(",", ".")); // PATCH
                textField.setText("");
                operation = "-";
                isResultDisplayed = false;
            }
        });
        sub.setBounds(179, 144, 49, 36);
        frame.getContentPane().add(sub);

        JButton num7 = new JButton("7");
        num7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isResultDisplayed) {
                    textField.setText("");
                    isResultDisplayed = false;
                }
                String number = textField.getText()+num7.getText();
                textField.setText(number);
            }
        });
        num7.setBounds(8, 186, 49, 36);
        frame.getContentPane().add(num7);

        JButton num8 = new JButton("8");
        num8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isResultDisplayed) {
                    textField.setText("");
                    isResultDisplayed = false;
                }
                String number = textField.getText()+num8.getText();
                textField.setText(number);
            }
        });
        num8.setBounds(65, 186, 49, 36);
        frame.getContentPane().add(num8);

        JButton num9 = new JButton("9");
        num9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isResultDisplayed) {
                    textField.setText("");
                    isResultDisplayed = false;
                }
                String number = textField.getText()+num9.getText();
                textField.setText(number);
            }
        });
        num9.setBounds(122, 186, 49, 36);
        frame.getContentPane().add(num9);

        JButton add = new JButton("+");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText().replace(",", ".")); // PATCH
                textField.setText("");
                operation = "+";
                isResultDisplayed = false;
            }
        });
        add.setBounds(179, 186, 49, 36);
        frame.getContentPane().add(add);

        JButton dot = new JButton(".");
        dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isResultDisplayed) {
                    textField.setText("");
                    isResultDisplayed = false;
                }
                String number = textField.getText()+dot.getText();
                textField.setText(number);
            }
        });
        dot.setBounds(8, 225, 49, 36);
        frame.getContentPane().add(dot);

        JButton num0 = new JButton("0");
        num0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isResultDisplayed) {
                    textField.setText("");
                    isResultDisplayed = false;
                }
                String number = textField.getText()+num0.getText();
                textField.setText(number);
            }
        });
        num0.setBounds(65, 225, 49, 36);
        frame.getContentPane().add(num0);

        JButton percent = new JButton("%");
        percent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText().replace(",", ".")); // PATCH
                textField.setText("");
                operation = "%";
                isResultDisplayed = false;
            }
        });
        percent.setBounds(122, 225, 49, 36);
        frame.getContentPane().add(percent);

        JButton equals = new JButton("=");
        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String answer;
                second = Double.parseDouble(textField.getText().replace(",", ".")); // PATCH
                if (operation.equals("+")) {
                    result = first + second;
                } else if (operation.equals("-")) {
                    result = first - second;
                } else if (operation.equals("*")) {
                    result = first * second;
                } else if (operation.equals("/")) {
                    result = first / second;
                } else if (operation.equals("%")) {
                    result = first % second;
                } else {
                    result = second;
                }
                answer = String.format("%.2f", result);
                textField.setText(answer);
                isResultDisplayed = true;
            }
        });
        equals.setBackground(SystemColor.activeCaption);
        equals.setBounds(179, 225, 49, 36);
        frame.getContentPane().add(equals);
    }
}