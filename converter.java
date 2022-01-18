package Currency_Converter;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class converter extends JFrame{
    private JPanel controlPanel;
    private JPanel panel = new JPanel();
    private JLabel title;
    private JTextField priceInput;
    private JTextField priceOutput;
    private JComboBox<String> typeList1;
    private JComboBox<String> typeList2;
    private String currencyType1;
    private String currencyType2;
    HashMap<String, Double> Brazil = new HashMap<>();
    HashMap<String, Double> Brunei = new HashMap<>();
    HashMap<String, Double> Bulgaria = new HashMap<>(); 
    HashMap<String, Double> Burundi = new HashMap<>();
    HashMap<String, Double> Cambodia = new HashMap<>();
    HashMap<String, Double> Canadian = new HashMap<>();
    HashMap<String, Double> Cape_Verde = new HashMap<>();
    HashMap<String, Double> Cayman_Islands = new HashMap<>();
    HashMap<String, Double> Chile = new HashMap<>();
    HashMap<String, Double> China = new HashMap<>();
    HashMap<String, Double> Colombia  = new HashMap<>();
    HashMap<String, Double> Comorian = new HashMap<>();
    HashMap<String, Double> Congolese = new HashMap<>();
    HashMap<String, Double> Costa_Rica = new HashMap<>();
    HashMap<String, Double> Cuba = new HashMap<>();
    HashMap<String, Double> Czech = new HashMap<>();
    HashMap<String, Double> Denmark = new HashMap<>();
    HashMap<String, Double> Djibouti = new HashMap<>();
    HashMap<String, Double> Dominican = new HashMap<>();
    HashMap<String, Double> East_Caribbean= new HashMap<>();
    HashMap<String, Double> Egypt = new HashMap<>();
    HashMap<String, Double> El_Salvador = new HashMap<>();
    HashMap<String, Double> Eritrea = new HashMap<>();
    HashMap<String, Double> Ethiopia = new HashMap<>();
    HashMap<String, Double> Euro = new HashMap<>();
    HashMap<String, Double> Fiji = new HashMap<>();
    HashMap<String, Double> Gambia = new HashMap<>();
    HashMap<String, Double> Georgia  = new HashMap<>();
    HashMap<String, Double> Ghana = new HashMap<>();
    HashMap<String, Double> Gibraltar  = new HashMap<>();
    HashMap<String, Double> Guatemala = new HashMap<>();
    HashMap<String, Double> Guernsey = new HashMap<>();
    HashMap<String, Double> Guinea = new HashMap<>();
    HashMap<String, Double> Guyana = new HashMap<>();
    HashMap<String, Double> Haiti = new HashMap<>();
    HashMap<String, Double> Honduras = new HashMap<>();
    HashMap<String, Double> Hong_Kong = new HashMap<>();
    HashMap<String, Double> Japan = new HashMap<>();
    HashMap<String, Double> Jersey = new HashMap<>();
    HashMap<String, Double> Jordan = new HashMap<>();
    HashMap<String, Double> Kazakhstan  = new HashMap<>();
    HashMap<String, Double> Kenya = new HashMap<>();
    HashMap<String, Double> Korea_North = new HashMap<>();
    HashMap<String, Double> Korea_South = new HashMap<>();
    HashMap<String, Double> Kuwait = new HashMap<>();
    HashMap<String, Double> Kyrgyzstan = new HashMap<>();
    HashMap<String, Double> Laos = new HashMap<>();
    HashMap<String, Double> Lebanon = new HashMap<>();
    HashMap<String, Double> Lesotho = new HashMap<>();
    HashMap<String, Double> Liberia = new HashMap<>();
    HashMap<String, Double> Libya  = new HashMap<>();
    HashMap<String, Double> Macau = new HashMap<>();
    HashMap<String, Double> Macedonia = new HashMap<>();
    HashMap<String, Double> Madagascar = new HashMap<>();
    HashMap<String, Double> Malawi = new HashMap<>();
    HashMap<String, Double> Malaysia = new HashMap<>();
    HashMap<String, Double> Maldives = new HashMap<>();
    HashMap<String, Double> Mauritania = new HashMap<>();
    HashMap<String, Double> Mauritius = new HashMap<>();
    HashMap<String, Double> Mexico = new HashMap<>();
    HashMap<String, Double> Moldova = new HashMap<>();
    HashMap<String, Double> Mongolia = new HashMap<>();
    HashMap<String, Double> Mozambique = new HashMap<>();
    HashMap<String, Double> Myanmar = new HashMap<>();
    HashMap<String, Double> Namibia = new HashMap<>();
    HashMap<String, Double> Nepal = new HashMap<>();
    HashMap<String, Double> Netherlands = new HashMap<>();
    HashMap<String, Double> New_Zealand = new HashMap<>();
    HashMap<String, Double> Nicaragua = new HashMap<>();
    HashMap<String, Double> Nigeria  = new HashMap<>();
    HashMap<String, Double> Norway = new HashMap<>();
    HashMap<String, Double> Omanl = new HashMap<>();
    HashMap<String, Double> Pakistan  = new HashMap<>();
    HashMap<String, Double> Panama = new HashMap<>();
    HashMap<String, Double> Pupua_New_Guinea = new HashMap<>();
    HashMap<String, Double> Paraguay = new HashMap<>();
    HashMap<String, Double> Peru = new HashMap<>();
    HashMap<String, Double> Philippines = new HashMap<>();
    HashMap<String, Double> Poland = new HashMap<>();
    HashMap<String, Double> Qatar = new HashMap<>();
    HashMap<String, Double> Romania = new HashMap<>();
    HashMap<String, Double> Russia = new HashMap<>();
    HashMap<String, Double> Rwanda = new HashMap<>();
    HashMap<String, Double> Saint_Helena  = new HashMap<>();
    HashMap<String, Double> Samoa = new HashMap<>();
    HashMap<String, Double> Saudi = new HashMap<>();
    HashMap<String, Double> Seborga = new HashMap<>();
    HashMap<String, Double> Serbia = new HashMap<>();
    HashMap<String, Double> Seychelles = new HashMap<>();
    HashMap<String, Double> Sierra_Leone = new HashMap<>();
    HashMap<String, Double> Singapore = new HashMap<>();
    HashMap<String, Double> Solomon_Islands = new HashMap<>();
    HashMap<String, Double> Somalia = new HashMap<>();
    HashMap<String, Double> South_Africa = new HashMap<>();
    HashMap<String, Double> Sri_Lanka  = new HashMap<>();
    HashMap<String, Double> Sudan = new HashMap<>();
    HashMap<String, Double> Suriname = new HashMap<>();
    HashMap<String, Double> Swaziland = new HashMap<>();
    HashMap<String, Double> Sweden = new HashMap<>();
    HashMap<String, Double> Switzerland = new HashMap<>();
    HashMap<String, Double> Syria = new HashMap<>();
    HashMap<String, Double> Taiwan = new HashMap<>();
    HashMap<String, Double> Tajikistan = new HashMap<>();
    HashMap<String, Double> Tanzania = new HashMap<>();
    HashMap<String, Double> Thailand = new HashMap<>();
    HashMap<String, Double> Tonga = new HashMap<>();
    HashMap<String, Double> Trinidad = new HashMap<>();
    HashMap<String, Double> Tunisia = new HashMap<>();
    HashMap<String, Double> Turkey = new HashMap<>();
    HashMap<String, Double> Turkmenistan = new HashMap<>();
    HashMap<String, Double> Tuvalu = new HashMap<>();
    HashMap<String, Double> Uganda = new HashMap<>();
    HashMap<String, Double> Ukraine = new HashMap<>();
    HashMap<String, Double> United_Arab_Emirates = new HashMap<>();
    HashMap<String, Double> United_Kingdom = new HashMap<>();
    HashMap<String, Double> United_States = new HashMap<>();
    HashMap<String, Double> Uruguay = new HashMap<>();
    HashMap<String, Double> Uzbekistan = new HashMap<>();
    HashMap<String, Double> Vanuatu  = new HashMap<>();
    HashMap<String, Double> Venezuela = new HashMap<>();
    HashMap<String, Double> Vietnam = new HashMap<>();
    HashMap<String, Double> Yemen = new HashMap<>();
    HashMap<String, Double> Zambia = new HashMap<>();
    HashMap<String, Double> Zimbabwe = new HashMap<>();
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
                     "Georgia Lari", "Ghana Cedi", "Gibraltar Pound", "Guatemala Quetzal", "Guernsey Pound",
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
                     "United States Dollar", "Uruguay Peso", "Uzbekistan Som", "Vanuatu Vatu", "Venezuela Bolivar", "Vietnam Dong", "Yemen Rial",
                     "Zambia Kwacha", "Zimbabwe Dollar"};
    public converter(){
        super();
        prepareGUI();
    }
    public static void populate_afghan (){
    
    }
    public static void populate_albanian (){
        
    }
    public static void populate_algerian (){
        
    }
    public static void populate_angolan (){
        
    }
    public static void populate_argentine (){
        
    }
    public static void populate_armenian (){
        
    }
    public static void populate_aruban (){
        
    }
    public static void populate_australian (){
        
    }
    public static void populate_azerbaijani (){
        
    }
    public static void populate_bahamas(){
        
    }
    public static void populate_bahrain (){
        
    }
    public static void populate_bangladesh (){
        
    }
    public static void populate_barbados(){
        
    }
    public static void populate_belarus (){
        
    }
    public static void populate_belize(){
        
    }
    public static void populate_bermuda (){
        
    }
    public static void populate_bhutan(){
        
    }
    public static void populate_bolivia(){
        
    }
    public static void populate_bosnia (){
        
    }
    public static void populate_botswana(){
        
    }
    public static void populate_brazil(){
        
    }
    public static void populate_brunei (){
        
    }
    public static void populate_bulgaria(){
        
    }
    public static void populate_burundi(){
        
    }
    public static void populate_cambodia(){
        
    }
    public static void populate_canadian(){
        
    }
    public static void populate_cape_verde (){
        
    }
    public static void populate_cayman_islands(){
        
    }
    public static void populate_chile(){
        
    }
    public static void populate_china (){
        
    }
    public static void populate_colombia (){
        
    }
    public static void populate_comorian(){
        
    }
    public static void populate_congolese(){
        
    }
    public static void populate_costa_rica(){
        
    }
    public static void populate_cuban (){
        
    }
    public static void populate_czech_republic(){
        
    }
    public static void populate_denmark(){
        
    }
    public static void populate_djibouti (){
        
    }
    public static void populate_dominican_republic (){
        
    }
    public static void populate_east_caribbean(){
        
    }
    public static void populate_egypt (){
        
    }
    public static void populate_el_salvador (){
        
    }
    public static void populate_eritrea(){
        
    }
    public static void populate_ethiopia(){
        
    }
    public static void populate_euro (){
        
    }
    public static void populate_fijian (){
        
    }
    public static void populate_gambia (){
        
    }
    public static void populate_georgia (){
        
    }
    public static void populate_ghana (){
        
    }
    public static void populate_gibraltar (){
        
    }
    public static void populate_guatemala(){
        
    }
    public static void populate_guernsey (){
        
    }
    public static void populate_guinea(){
        
    }
    public static void populate_guyana (){
        
    }
    public static void populate_haiti (){
        
    }
    public static void populate_honduras (){
        
    }
    public static void populate_hong_kong(){
        
    }
    public static void populate_japan(){
        
    }
    public static void populate_jersey(){
        
    }
    public static void populate_jordan (){
        
    }
    public static void populate_kazakhstan(){
        
    }
    public static void populate_kenya (){
        
    }
    public static void populate_north_korea(){
        
    }
    public static void populate_south_korea(){
        
    }
    public static void populate_kuwait (){
        
    }
    public static void populate_kyrgyzstan (){
        
    }
    public static void populate_laos(){
        
    }
    public static void populate_lebanon (){
        
    }
    public static void populate_lesotho(){
        
    }
    public static void populate_liberia (){
        
    }
    public static void populate_libya (){
        
    }
    public static void populate_macau(){
        
    }
    public static void populate_macedonia(){
        
    }
    public static void populate_madagascar (){
        
    }
    public static void populate_malawi (){
        
    }
    public static void populate_malaysia (){
        
    }
    public static void populate_maldives (){
        
    }
    public static void populate_mauritania(){
        
    }
    public static void populate_mauritius (){
        
    }
    public static void populate_mexico (){
        
    }
    public static void populate_moldova (){
        
    }
    public static void populate_mongolia (){
        
    }
    public static void populate_mozambique(){
        
    } 
    public static void populate_myanmar(){
        
    }
    public static void populate_namibia(){
        
    }
    public static void populate_nepal (){
        
    }
    public static void populate_netherlands (){
        
    }
    public static void populate_new_zealand (){
        
    }
    public static void populate_nicaragua (){
        
    }
    public static void populate_nigeria(){
        
    }
    public static void populate_norway(){
        
    }
    public static void populate_oman(){
        
    }
    public static void populate_pakistan (){
        
    }
    public static void populate_panama (){
        
    }
    public static void populate_pupua_new_guinea (){
        
    }
    public static void populate_paraguay (){
        
    }
    public static void populate_peru(){
        
    }
    public static void populate_philippines(){
        
    }
    public static void populate_poland (){
        
    }
    public static void populate_Qatar (){
        
    }
    public static void populate_romania (){
        
    }
    public static void populate_russia (){
        
    }
    public static void populate_rwanda(){
        
    }
    public static void populate_saint_helena(){
        
    }
    public static void populate_samoa (){
        
    }
    public static void populate_saudi (){
        
    }
    public static void populate_seborga (){
        
    }
    public static void populate_serbia(){
        
    }
    public static void populate_seychelles (){
        
    }
    public static void populate_sierra_leone (){
        
    }
    public static void populate_singapore (){
        
    }
    public static void populate_solomon_islands(){
        
    }
    public static void populate_somalia (){
        
    }
    public static void populate_south_africa(){
        
    }
    public static void populate_sri_lanka(){
        
    }
    public static void populate_sudan(){
        
    }
    public static void populate_suriname(){
        
    }
    public static void populate_swaziland(){
        
    }
    public static void populate_sweden(){
        
    }
    public static void populate_switzerland (){
        
    }
    public static void populate_syria(){
        
    }
    public static void populate_taiwan (){
        
    }
    public static void populate_tajikistan (){
        
    }
    public static void populate_tanzania (){
        
    }
    public static void populate_thailand (){
        
    }
    public static void populate_tonga (){
        
    }
    public static void populate_trinidad (){
        
    }
    public static void populate_tunisia (){
        
    }
    public static void populate_turkey (){
        
    }
    public static void populate_turkmenistan (){
        
    }
    public static void populate_tuvalu (){
        
    }
    public static void populate_uganda (){
        
    }
    public static void populate_ukraine (){
        
    }
    public static void populate_united_arab_emirates (){
        
    }
    public static void populate_united_kingdom (){
        
    }
    public static void populate_united_states (){
        
    }
    public static void populate_uruguay(){
        
    }
    public static void populate_uzbekistan (){
        
    }
    public static void populate_vanuatu (){
        
    }
    public static void populate_venezuela (){
        
    }
    public static void populate_vietnam(){
        
    }
    public static void populate_yemen (){
        
    }
    public static void populate_zambia(){
        
    }
    public static void populate_zimbabwe(){
        
    }
    
    public void prepareGUI(){
        setTitle("ePortfolio");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout());

        Font titleFont = new Font(Font.SERIF, Font.BOLD, 16);
        title = new JLabel("<html>Welcome to currency converter!<br><br>Choose a command from the Commands menu to convert between currencies, or quit the program.<html>", JLabel.LEFT);
        title.setFont(titleFont);

        JMenu commands = new JMenu("Commands");

        JMenuItem convert = new JMenuItem("Convert between currencies");
        convert.addActionListener(ear);
        commands.add(convert);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(commands);
        controlPanel.add(menuBar);

        setJMenuBar(menuBar);
        add(title);
    }
    private class MenuListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            for(int i = 0; i < type.length; i++){
                if(type[i].equals("Afghan Afghani")){
                    populate_afghan();
                }else if(type[i].equals("Albanian Lek")){
                    populate_albanian();
                }else if(type[i].equals("Algerian Dinar")){
                    populate_algerian();
                }else if(type[i].equals("Argentine Peso")){
                    populate_argentine();
                }else if(type[i].equals("Armenian Dram")){
                    populate_armenian();
                }else if(type[i].equals("Aruban Florin")){
                    populate_aruban();
                }else if(type[i].equals("Australian Dollar")){
                    populate_australian();
                }else if(type[i].equals("Azerbaijani Manat")){
                    populate_azerbaijani();
                }else if(type[i].equals("Bahamas Dollar")){
                    populate_bahamas();
                }else if(type[i].equals("Bahrain Dinar")){
                    populate_bahrain();
                }else if(type[i].equals("Bangladesh Taka")){
                    populate_bangladesh();
                }else if(type[i].equals("Barbados Dollar")){
                    populate_barbados();
                }else if(type[i].equals("Belarus Ruble")){
                    populate_belarus();
                }else if(type[i].equals("Belize Dollar")){
                    populate_belize();
                }else if(type[i].equals("Bermuda Dollar")){
                    populate_bermuda();
                }else if(type[i].equals("Bhutan Ngultrum")){
                    populate_bhutan();
                }else if(type[i].equals("Bolivia Boliviano")){
                    populate_bolivia();
                }else if(type[i].equals("Bosnia-Herzegovina Convertible Mark")){
                    populate_bosnia();
                }else if(type[i].equals("Botswana Pula")){
                    populate_botswana();
                }else if(type[i].equals("Brazil Real")){
                    populate_brazil();
                }else if(type[i].equals("Brunei Dollar")){
                    populate_brunei();
                }else if(type[i].equals("Bulgaria Lev")){
                    populate_bulgaria();
                }else if(type[i].equals("Burundi Franc")){
                    populate_burundi();
                }else if(type[i].equals("Cambodia Riel")){
                    populate_cambodia();
                }else if(type[i].equals("Canadian Dollar")){
                    populate_canadian();
                }else if(type[i].equals("Cape Verde Escudo")){
                    populate_cape_verde();
                }else if(type[i].equals("Cayman Island Dollar")){
                    populate_cayman_islands();
                }else if(type[i].equals("Chile Peso")){
                    populate_chile();
                }else if(type[i].equals("Comorian Franc")){
                    populate_comorian();
                }else if(type[i].equals("Congolese Franc")){
                    populate_congolese();
                }else if(type[i].equals("Costa Rica Colon")){
                    populate_costa_rica();
                }else if(type[i].equals("Cuban Peso")){
                    populate_cuban();
                }else if(type[i].equals("Czech Republic Koruna")){
                    populate_czech_republic();
                }else if(type[i].equals("Denmark Krone")){
                    populate_denmark();
                }else if(type[i].equals("Djibouti Franc")){
                    populate_djibouti();
                }else if(type[i].equals("Dominican Republic Peso")){
                    populate_dominican_republic();
                }else if(type[i].equals("East Caribbean Dollar")){
                    populate_east_caribbean();
                }else if(type[i].equals("Egypt Pound")){
                    populate_egypt();
                }else if(type[i].equals("El Salvador Colon")){
                    populate_el_salvador();
                }else if(type[i].equals("Eritrea Nakfa")){
                    populate_eritrea();
                }else if(type[i].equals("Ethiopia Birr")){
                    populate_ethiopia();
                }else if(type[i].equals("Euro")){
                    populate_euro();
                }else if(type[i].equals("Fijian Dollar")){
                    populate_fijian();
                }else if(type[i].equals("Gambia Dalasi")){
                    populate_gambia();
                }else if(type[i].equals("Georgia Lari")){
                    populate_georgia();
                }else if(type[i].equals("Ghana Cedi")){
                    populate_ghana();
                }else if(type[i].equals("Gibraltar Pound")){
                    populate_gibraltar();
                }else if(type[i].equals("Guatemala Quetzal")){
                    populate_guatemala();
                }else if(type[i].equals("Guernsey Pound")){
                    populate_guernsey();
                }else if(type[i].equals("Guinea Franc")){
                    populate_guinea();
                }else if(type[i].equals("Haiti Gourde")){
                    populate_haiti();
                }else if(type[i].equals("Honduras Lempira")){
                    populate_honduras();
                }else if(type[i].equals("Hong Kong Dollar")){
                    populate_hong_kong();
                }else if(type[i].equals("Japan Yen")){
                    populate_japan();
                }else if(type[i].equals("Jersey Pound")){
                    populate_jersey();
                }else if(type[i].equals("Jordan Dinar")){
                    populate_jordan();
                }else if(type[i].equals("Kazakhstan Tenge")){
                    populate_kazakhstan();
                }else if(type[i].equals("Kenya Shilling")){
                    populate_kenya();
                }else if(type[i].equals("Korea (North) Won")){
                    populate_north_korea();
                }else if(type[i].equals("Korea (South) Won")){
                    populate_south_korea();
                }else if(type[i].equals("Kuwait Dinar")){
                    populate_kuwait();
                }else if(type[i].equals("Kyrgyzstan Som")){
                    populate_kyrgyzstan();
                }else if(type[i].equals("Laos Kip")){
                    populate_laos();
                }else if(type[i].equals("Lebanon Pound")){
                    populate_lebanon();
                }else if(type[i].equals("Lesotho Loti")){
                    populate_lesotho();
                }else if(type[i].equals("Liberia Dollar")){
                    populate_liberia();
                }else if(type[i].equals("Libya Dinar")){
                    populate_libya();
                }else if(type[i].equals("Macau Pataca")){
                    populate_macau();
                }else if(type[i].equals("Macedonia Denar")){
                    populate_macedonia();
                }else if(type[i].equals("Madagascar Ariary")){
                    populate_madagascar();
                }else if(type[i].equals("Malawi Kwacha")){
                    populate_malawi();
                }else if(type[i].equals("Malaysia Ringgit")){
                    populate_malaysia();
                }else if(type[i].equals("Maldives Rufiyaa")){
                    populate_maldives();
                }else if(type[i].equals("Mauritania Ouguiya")){
                    populate_mauritania();
                }else if(type[i].equals("Mauritius Rupee")){
                    populate_mauritius();
                }else if(type[i].equals("Mexico Peso")){
                    populate_mexico();
                }else if(type[i].equals("Moldova Leu")){
                    populate_moldova();
                }else if(type[i].equals("Mongolia Tughrik")){
                    populate_mongolia();
                }else if(type[i].equals("Mozambique Metical")){
                    populate_mozambique();
                }else if(type[i].equals("Myanmar Kyat")){
                    populate_myanmar();
                }else if(type[i].equals("Namibia Dollar")){
                    populate_namibia();
                }else if(type[i].equals("Nepal Rupee")){
                    populate_nepal();
                }else if(type[i].equals("Netherlands Antilles Guilder")){
                    populate_netherlands();
                }else if(type[i].equals("New Zealand Dollar")){
                    populate_new_zealand();
                }else if(type[i].equals("Nicaragua Cordoba")){
                    populate_nicaragua();
                }else if(type[i].equals("Nigeria Naira")){
                    populate_nigeria();
                }else if(type[i].equals("Norway Krone")){
                    populate_norway();
                }else if(type[i].equals("Oman Rial")){
                    populate_oman();
                }else if(type[i].equals("Pakistan Rupee")){
                    populate_pakistan();
                }else if(type[i].equals("Panama Balboa")){
                    populate_panama();
                }else if(type[i].equals("Pupua New Guinea Kina")){
                    populate_pupua_new_guinea();
                }else if(type[i].equals("Paraguay Guarani")){
                    populate_paraguay();
                }else if(type[i].equals("Peru Sol")){
                    populate_peru();
                }else if(type[i].equals("Philippines Peso")){
                    populate_philippines();
                }else if(type[i].equals("Poland Zloty")){
                    populate_poland();
                }else if(type[i].equals("Qatar Riyal")){
                    populate_Qatar();
                }else if(type[i].equals("Romania Leu")){
                    populate_romania();
                }else if(type[i].equals("Russia Ruble")){
                    populate_russia();
                }else if(type[i].equals("Rwanda Franc")){
                    populate_rwanda();
                }else if(type[i].equals("Saint Helena Pound")){
                    populate_saint_helena();
                }else if(type[i].equals("Samoa Tala")){
                    populate_samoa();
                }else if(type[i].equals("Saudi Riyal")){
                    populate_saudi();
                }else if(type[i].equals("Seborga Luigino")){
                    populate_seborga();
                }else if(type[i].equals("Serbia Dinar")){
                    populate_serbia();
                }else if(type[i].equals("Seychelles Rupee")){
                    populate_seychelles();
                }else if(type[i].equals("Sierra Leone Leone")){
                    populate_sierra_leone();
                }else if(type[i].equals("Singapore Dollar")){
                    populate_singapore();
                }else if(type[i].equals("Solomon Islands Dollar")){
                    populate_solomon_islands();
                }else if(type[i].equals("Somalia Shilling")){
                    populate_somalia();
                }else if(type[i].equals("South Africa Rand")){
                    populate_south_africa();
                }else if(type[i].equals("Sri Lanka Rupee")){
                    populate_sri_lanka();
                }else if(type[i].equals("Sudan Pound")){
                    populate_sudan();
                }else if(type[i].equals("Suriname Dollar")){
                    populate_suriname();
                }else if(type[i].equals("Swaziland Lilangeni")){
                    populate_swaziland();
                }else if(type[i].equals("Sweden Krona")){
                    populate_sweden();
                }else if(type[i].equals("Switzerland Franc")){
                    populate_switzerland();
                }else if(type[i].equals("Syria Pound")){
                    populate_syria();
                }else if(type[i].equals("Taiwan New Dollar")){
                    populate_taiwan();
                }else if(type[i].equals("Tajikistan Somoni")){
                    populate_tajikistan();
                }else if(type[i].equals("Tanzania Shilling")){
                    populate_tanzania();
                }else if(type[i].equals("Thailand Baht")){
                    populate_thailand();
                }else if(type[i].equals("Tonga Pa'anga")){
                    populate_tonga();
                }else if(type[i].equals("Trinidad and Tobago Dollar")){
                    populate_trinidad();
                }else if(type[i].equals("Tunisia Dinar")){
                    populate_tunisia();
                }else if(type[i].equals("Turkey Lira")){
                    populate_turkey();
                }else if(type[i].equals("Turkmenistan Manat")){
                    populate_turkmenistan();
                }else if(type[i].equals("Tuvalu Dollar")){
                    populate_tuvalu();
                }else if(type[i].equals("Uganda Shilling")){
                    populate_uganda();
                }else if(type[i].equals("Ukraine Hryvnia")){
                    populate_ukraine();
                }else if(type[i].equals("United Arab Emirates Dirham")){
                    populate_united_arab_emirates();
                }else if(type[i].equals("United Kingdom Pound")){
                    populate_united_kingdom();
                }else if(type[i].equals("United States Dollar")){
                    populate_united_states();
                }else if(type[i].equals("Uruguay Peso")){
                    populate_uruguay();
                }else if(type[i].equals("Uzbekistan Som")){
                    populate_uzbekistan();
                }else if(type[i].equals("Vanuatu Vatu")){
                    populate_vanuatu();
                }else if(type[i].equals("Venezuela Bolivar")){
                    populate_venezuela();
                }else if(type[i].equals("Vietnam Dong")){
                    populate_vietnam();
                }else if(type[i].equals("Yemen Rial")){
                    populate_yemen();
                }else if(type[i].equals("Zambia Kwacha")){
                    populate_zambia();
                }else if(type[i].equals("Zimbabwe Dollar")){
                    populate_zimbabwe();
                }
            }
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
                    price2 = price1 * 0.80;
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
                    typeList1.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            String temp = (String)typeList1.getSelectedItem();
                            System.out.println(temp);
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
        converter converter = new converter();
        converter.setVisible(true);
    }
}
