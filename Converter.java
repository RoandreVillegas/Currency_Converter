package Currency_Converter;

import javax.swing.*;
import javax.swing.event.*;
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
    Double quantity;
    ButtonListener back = new ButtonListener();
    MenuListener ear = new MenuListener();
    String[] type = {"Afghan Afghani", "Albanian Lek", "Algerian Dinar", "Angolan Kwanza", "Argentine Peso", "Armenian Dram",
                     "Aruban Florin",  "Australian Dollar", "Azerbaijani Manat", "Bahamas Dollar", "Bahrain Dinar", "Bangladesh Taka",
                     "Barbados Dollar", "Belarus Ruble", "Belize Dollar", "Bermuda Dollar", "Bhutan Ngultrum", "Bolivia Boliviano",
                     "Bosnia-Herzegovina Convertible Mark", "Botswana Pula", "Brazil Real", "Brunei Dollar", "Bulgaria Lev", 
                     "Burundi Franc", "Cambodia Riel", "Canadian Dollar", "Cape Verde Escudo", "Cayman Islands Dollar", "Chile Peso",
                     "China Yuan Renminbi", "Colombia Peso", "Comorian Franc", "Congolese Franc", "Costa Rica Colon", "Cuban Peso",
                     "Czech Republic Koruna", "Denmark Krone", "Djibouti Franc", "Dominican Republic Peso", "East Caribbean Dollar",
                     "Egypt Pound", "El Salvador Colon", "Eritrea Nakfa", "Ethiopia Birr", "Euro", "Fijian Dollar", "Gambia Dalasi",
                     "Gambia Dalasi", "Georgia Lari", "Ghana Cedi", "Gibraltar Pound", "Guatemala Quetzal", "Guernsey Pound",
                     "Guinea Franc", "Guyana Dollar", "Haiti Gourde", "Honduras Lempira", "Hong Kong Dollar", "Japan Yen", "Jersey Pound",
                     "Jordan Dinar", "Kazakhstan Tenge", "Kenya Shilling", "Korea (North) Won", "Korea (South) Won", "Kuwait Dinar",
                     "Kyrgyzstan Som", "Laos Kip", "Lebanon Pound", "Lesotho Loti", "Liberia Dollar", "Libya Dinar", "Macau Pataca",
                     "Macedonia Denar", "Madagascar Ariary", "Malawi Kwacha", "Malaysia Ringgit", "Maldives Rufiyaa", "Mauritania Ouguiya",
                     "Mauritius Rupee", "Mexico Peso", "Moldova Leu", "Mongolia Tughrik", "Mozambique Metical", "Myanmar Kyat", "Namibia Dollar",
                     "Nepal Rupee", "Netherlands Antilles Guilder", "New Zealand Dollar", "Nicaragua Cordoba", "Nigeria Naira", "Norway Krone",
                     "Oman Rial", "Pakistan Rupee", "Panama Balboa", "Pupua New Guinea Kina", "Paraguay Guarani", "Peru Sol", "Philippines Peso", 
                     "Poland Zloty", "Qatar Riyal", "Romania Leu", "Russia Ruble", "Rwanda Franc", "Saint Helena Pound", "Samoa Tala",
                     "Saudi Riyal", "Seborga Luigino", "Serbia Dinar", "Seychelles Rupee", "Sierra Leone Leone", "Singapore Dollar",
                     "Solomon Islands Dollar", "Somalia Shilling", "South Africa Rand", "Sri Lanka Rupee", "Sudan Pound", "Suriname Dollar",
                     "Swaziland Lilangeni", "Sweden Krona", "Switzerland Franc", "Syria Pound", "Taiwan New Dollar", "Tajikistan Somoni",
                     "Tanzania Shilling", "Thailand Baht" ,"Tonga Pa'anga", "Trinidad and Tobago Dollar", "Tunisia Dinar", "Turkey Lira",
                     "Turkmenistan Manat", "Tuvalu Dollar", "Uganda Shilling", "Ukraine Hryvnia", "United Arab Emirates Dirham", "United Kingdom Pound",
                     "United States Dollar", "Uruguay Peso", "Uzbekistan Som", "Vanuatu Vatu", "Venezuela Bolivar", "Viet Nam Dong", "Yemen Rial",
                     "Zambia Kwacha", "Zimbabwe Dollar"};
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
                    priceOutput.setText(String.valueOf(price2));

                    priceInput.getDocument().addDocumentListener(new DocumentListener() {
                        public void changedUpdate(DocumentEvent e) {
                            update(e);
                        }
                        public void removeUpdate(DocumentEvent e) {
                            update(e);
                        }
                        public void insertUpdate(DocumentEvent e) {
                            update(e);
                        }
                        public void update(DocumentEvent e){
                            price1 = Double.parseDouble(priceInput.getText());
                            price2 = price1 * 0.80;
                            priceOutput.setText(String.valueOf(price2));
                        }
                    });

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
