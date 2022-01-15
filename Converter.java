package Currency_Converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Converter extends JFrame{
    private JPanel controlPanel;
    private JPanel panel = new JPanel();
    private JLabel title;
    private JTextField priceInput;
    private JTextField priceOutput;
    private JComboBox<String> typeList1;
    private JComboBox<String> typeList2;
    private String currencyType1;
    private String currencyType2;
    Double price1;
    Double price2;
    ButtonListener back = new ButtonListener();
    MenuListener ear = new MenuListener();
    String[] type = {"United States Dollar", "Canadian Dollar", "Japanese Yen", "Pound Sterling", "Austrailian Dollar", "Euro"};
    public Converter(){
        super();
        prepareGUI();
    }
    public void prepareGUI(){
        setTitle("ePortfolio");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout());

        /**
         * Custom font
         */
        Font titleFont = new Font(Font.SERIF, Font.BOLD, 16);
        title = new JLabel("<html>Welcome to currency converter!<br><br>Choose a command from the Commands menu to convert between currencies, or quit the program.<html>", JLabel.LEFT);
        title.setFont(titleFont);

        /**
         * Menu that holds all commands
         */
        JMenu commands = new JMenu("Commands");

        /**
         * "Buy" menu option
         */
        JMenuItem convert = new JMenuItem("Convert between currencies");
        convert.addActionListener(ear);
        commands.add(convert);

        /**
         * MenuBar that holds the "commands" menu
         */
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(commands);
        controlPanel.add(menuBar);

        setJMenuBar(menuBar);
        add(title);
    }
    private class MenuListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String action = e.getActionCommand();
            Font headerFont = new Font(Font.SERIF, Font.BOLD, 16);
            switch(action){
                case "Convert between currencies":
                    panel.setVisible(false);
                    controlPanel.remove(panel);

                    title.setText("");
                    panel = new JPanel();
                    panel.setLayout(null);
                    panel.setBackground(Color.lightGray);

                    /**
                     * Header for the "buy" panel
                     */
                    JLabel header = new JLabel("Currency Converter");
                    header.setBounds(10, 20, 200, 25);
                    header.setFont(headerFont);
                    panel.add(header);

                    typeList1 = new JComboBox<>(type);
                    typeList1.addActionListener(back);
                    typeList1.setBounds(100, 230, 150, 25);
                    panel.add(typeList1);

                    typeList2 = new JComboBox<>(type);
                    typeList2.addActionListener(back);
                    typeList2.setBounds(300, 230, 150, 25);
                    panel.add(typeList2);

                    //text fields
                    priceInput = new JTextField(20);
                    priceInput.setBounds(100, 200, 150, 25);
                    priceInput.setText("1");
                    panel.add(priceInput);

                    priceOutput = new JTextField(20);
                    priceOutput.setBounds(300, 200, 150, 25);
                    priceOutput.setEditable(false);
                    panel.add(priceOutput);

                    if(typeList1.getItemAt(0).equals(type[0])){
                        typeList2.setSelectedIndex(1);
                    }
                    currencyType1 = (String)typeList1.getSelectedItem();
                    currencyType2 = (String)typeList2.getSelectedItem();

                    price1 = Double.parseDouble(priceInput.getText());

                    if(currencyType1.equals("United States Dollar")){
                        price2 = price1 * 0.80;
                    }
                    priceOutput.setText(String.valueOf(price2));

                    System.out.println(currencyType1 + " " + currencyType2);

                    controlPanel.add(panel);
                    add(controlPanel);
                    break;
            }
        }
    }
    private class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            
        }
        
    }
    public static void main(String[] args){
        Converter converter = new Converter();
        converter.setVisible(true);
    }
}
