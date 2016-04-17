package goit.gojava2.javacore.project14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Window extends JFrame {
    private ButtonGroup group = new ButtonGroup();
    private JRadioButton fibSeqButton;
    private JRadioButton factorialButton;
    private JTextField inputNumberTextField;
    private JPanel dialogJPanel;

    public Window() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setTitle("Фибоначчи и факториал");
        setResizable(false);

        JLabel descriptionField = new JLabel("<html>Программа создана для вычисления факториала," +
                "<br>в ряде Фибоначии, которое не больше введеного значения." +
                "<br>Введите число для расчета:</html>");


        fibSeqButton = new JRadioButton("Fibonacci Sequence", false);
        factorialButton = new JRadioButton("Factorial", false);
        group.add(fibSeqButton);
        group.add(factorialButton);
        inputNumberTextField = new JTextField();
        JButton findButton = new JButton("Рассчитать!");
        dialogJPanel = new JPanel();
        JPanel descriptionPanel = new JPanel();

        add(descriptionPanel);
        add(descriptionField,
                new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(10, 5, 5, 3), 0, 0));
        descriptionPanel.add(descriptionField);
        add(inputNumberTextField,
                new GridBagConstraints(0, 1, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(7, 5, 5, 3), 0, 0));
        add(fibSeqButton,
                new GridBagConstraints(0, 2, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 3), 0, 0));
        add(factorialButton,
                new GridBagConstraints(0, 4, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(2, 5, 5, 3), 0, 0));
        add(findButton,
                new GridBagConstraints(0, 5, 1, 1, 0.0, 0.9, GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL, new Insets(12, 5, 5, 3), 0, 0));

        findButton.addActionListener(new findButtonActionListener());

        setVisible(true);
        pack();
    }

    public class findButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String inputString = inputNumberTextField.getText();
            Validation validation = new Validation();
            if ((!fibSeqButton.isSelected()) &&
                    (!factorialButton.isSelected())) {
                JOptionPane.showMessageDialog(dialogJPanel, "<html>Вы ничего не ввели!" +
                        "<br>Для рассчета необходимо ввести " +
                        "<br>положительное целое число.<html>", "Ошибка", JOptionPane.DEFAULT_OPTION);
            } else if (validation.isValid(inputString) == 1) {
                int number = Integer.parseInt(inputString);
                outputResult(number);
            } else if (validation.isValid(inputString) == -1){
                JOptionPane.showMessageDialog(dialogJPanel, "<html>Невозможно произвести расчет " +
                        "для отрицательного числа!" +
                        "<br>Для рассчета необходимо ввести " +
                        "положительное целое число.<html>", "Ошибка", JOptionPane.DEFAULT_OPTION);
            } else if(validation.isValid(inputString) == -2){
                JOptionPane.showMessageDialog(dialogJPanel, "<html>Некорректный ввод!" +
                        "<br>Для рассчета необходимо ввести " +
                        "положительное целое число.<html>", "Ошибка", JOptionPane.DEFAULT_OPTION);
            } else if (validation.isValid(inputString) == 0){
                if (factorialButton.isSelected()){
                    Factorial2 factorial = new Factorial2();
                    JOptionPane.showMessageDialog(dialogJPanel, "Факториал: " +
                                    String.valueOf(factorial.getFactorial(Integer.parseInt
                                            (inputString))),
                            "Результат", JOptionPane.DEFAULT_OPTION);
                } else {
                    JOptionPane.showMessageDialog(dialogJPanel, "<html>Нуль!" +
                            "<br>Для значения '0' можно посчитать" +
                            "<br>только факториал.<html>", "Ошибка", JOptionPane.DEFAULT_OPTION);
                }
            }
        }

        private void outputResult(int number) {
            Fibonacci fibonacci = new Fibonacci();
            Factorial2 factorial = new Factorial2();

            if (fibSeqButton.isSelected()){
                ArrayList<Integer> fibonacciSequence = fibonacci.getFibSeq(number);

                JOptionPane.showMessageDialog(dialogJPanel, "<html>Ряд Фибоначчи: "
                        + fibonacciSequence  + "</html>", "Результат", JOptionPane.DEFAULT_OPTION);
            }

         if (factorialButton.isSelected()){
                JOptionPane.showMessageDialog(dialogJPanel, "<html>Факториал: " + String.valueOf(factorial
                        .getFactorial(number)) +
                        "</html>", "Результат", JOptionPane.DEFAULT_OPTION);
            }
            }
        }
    }

