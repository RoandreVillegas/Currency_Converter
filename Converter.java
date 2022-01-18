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
    HashMap<String, Double> afghan = new HashMap<>();
    HashMap<String, Double> albania = new HashMap<>();
    HashMap<String, Double> algeria = new HashMap<>();
    HashMap<String, Double> argentina = new HashMap<>();
    HashMap<String, Double> armenia = new HashMap<>();
    HashMap<String, Double> aruba = new HashMap<>();
    HashMap<String, Double> australia = new HashMap<>();
    HashMap<String, Double> azerbaijan = new HashMap<>();
    HashMap<String, Double> bahamas = new HashMap<>();
    HashMap<String, Double> bahrain = new HashMap<>();
    HashMap<String, Double> bangladesh = new HashMap<>();
    HashMap<String, Double> barbados = new HashMap<>();
    HashMap<String, Double> belarus = new HashMap<>();
    HashMap<String, Double> belize = new HashMap<>();
    HashMap<String, Double> bermuda = new HashMap<>();
    HashMap<String, Double> bhutan = new HashMap<>();
    HashMap<String, Double> bolivia = new HashMap<>();
    HashMap<String, Double> bosnia = new HashMap<>();
    HashMap<String, Double> botswana = new HashMap<>();
    HashMap<String, Double> brazil = new HashMap<>();
    HashMap<String, Double> brunei = new HashMap<>();
    HashMap<String, Double> bulgaria = new HashMap<>(); 
    HashMap<String, Double> burundi = new HashMap<>();
    HashMap<String, Double> cambodia = new HashMap<>();
    HashMap<String, Double> canadian = new HashMap<>();
    HashMap<String, Double> cape_verde = new HashMap<>();
    HashMap<String, Double> cayman_islands = new HashMap<>();
    HashMap<String, Double> chile = new HashMap<>();
    HashMap<String, Double> china = new HashMap<>();
    HashMap<String, Double> colombia  = new HashMap<>();
    HashMap<String, Double> comorian = new HashMap<>();
    HashMap<String, Double> congolese = new HashMap<>();
    HashMap<String, Double> costa_rica = new HashMap<>();
    HashMap<String, Double> cuba = new HashMap<>();
    HashMap<String, Double> czech = new HashMap<>();
    HashMap<String, Double> denmark = new HashMap<>();
    HashMap<String, Double> djibouti = new HashMap<>();
    HashMap<String, Double> dominican = new HashMap<>();
    HashMap<String, Double> east_caribbean= new HashMap<>();
    HashMap<String, Double> egypt = new HashMap<>();
    HashMap<String, Double> el_salvador = new HashMap<>();
    HashMap<String, Double> eritrea = new HashMap<>();
    HashMap<String, Double> ethiopia = new HashMap<>();
    HashMap<String, Double> euro = new HashMap<>();
    HashMap<String, Double> fiji = new HashMap<>();
    HashMap<String, Double> gambia = new HashMap<>();
    HashMap<String, Double> georgia  = new HashMap<>();
    HashMap<String, Double> ghana = new HashMap<>();
    HashMap<String, Double> guatemala = new HashMap<>();
    HashMap<String, Double> guernsey = new HashMap<>();
    HashMap<String, Double> guinea = new HashMap<>();
    HashMap<String, Double> guyana = new HashMap<>();
    HashMap<String, Double> haiti = new HashMap<>();
    HashMap<String, Double> honduras = new HashMap<>();
    HashMap<String, Double> hong_kong = new HashMap<>();
    HashMap<String, Double> japan = new HashMap<>();
    HashMap<String, Double> jersey = new HashMap<>();
    HashMap<String, Double> jordan = new HashMap<>();
    HashMap<String, Double> kazakhstan  = new HashMap<>();
    HashMap<String, Double> kenya = new HashMap<>();
    HashMap<String, Double> korea_north = new HashMap<>();
    HashMap<String, Double> korea_south = new HashMap<>();
    HashMap<String, Double> kuwait = new HashMap<>();
    HashMap<String, Double> kyrgyzstan = new HashMap<>();
    HashMap<String, Double> laos = new HashMap<>();
    HashMap<String, Double> lebanon = new HashMap<>();
    HashMap<String, Double> lesotho = new HashMap<>();
    HashMap<String, Double> liberia = new HashMap<>();
    HashMap<String, Double> libya  = new HashMap<>();
    HashMap<String, Double> macau = new HashMap<>();
    HashMap<String, Double> macedonia = new HashMap<>();
    HashMap<String, Double> madagascar = new HashMap<>();
    HashMap<String, Double> malawi = new HashMap<>();
    HashMap<String, Double> malaysia = new HashMap<>();
    HashMap<String, Double> maldives = new HashMap<>();
    HashMap<String, Double> mauritania = new HashMap<>();
    HashMap<String, Double> mauritius = new HashMap<>();
    HashMap<String, Double> mexico = new HashMap<>();
    HashMap<String, Double> moldova = new HashMap<>();
    HashMap<String, Double> mongolia = new HashMap<>();
    HashMap<String, Double> mozambique = new HashMap<>();
    HashMap<String, Double> myanmar = new HashMap<>();
    HashMap<String, Double> namibia = new HashMap<>();
    HashMap<String, Double> nepal = new HashMap<>();
    HashMap<String, Double> netherlands = new HashMap<>();
    HashMap<String, Double> new_zealand = new HashMap<>();
    HashMap<String, Double> nicaragua = new HashMap<>();
    HashMap<String, Double> nigeria  = new HashMap<>();
    HashMap<String, Double> norway = new HashMap<>();
    HashMap<String, Double> oman = new HashMap<>();
    HashMap<String, Double> pakistan  = new HashMap<>();
    HashMap<String, Double> panama = new HashMap<>();
    HashMap<String, Double> pupua_new_guinea = new HashMap<>();
    HashMap<String, Double> paraguay = new HashMap<>();
    HashMap<String, Double> peru = new HashMap<>();
    HashMap<String, Double> philippines = new HashMap<>();
    HashMap<String, Double> poland = new HashMap<>();
    HashMap<String, Double> qatar = new HashMap<>();
    HashMap<String, Double> romania = new HashMap<>();
    HashMap<String, Double> russia = new HashMap<>();
    HashMap<String, Double> rwanda = new HashMap<>();
    HashMap<String, Double> saint_helena  = new HashMap<>();
    HashMap<String, Double> samoa = new HashMap<>();
    HashMap<String, Double> saudi = new HashMap<>();
    HashMap<String, Double> seborga = new HashMap<>();
    HashMap<String, Double> serbia = new HashMap<>();
    HashMap<String, Double> seychelles = new HashMap<>();
    HashMap<String, Double> sierra_leone = new HashMap<>();
    HashMap<String, Double> singapore = new HashMap<>();
    HashMap<String, Double> solomon_islands = new HashMap<>();
    HashMap<String, Double> somalia = new HashMap<>();
    HashMap<String, Double> south_africa = new HashMap<>();
    HashMap<String, Double> sri_lanka  = new HashMap<>();
    HashMap<String, Double> sudan = new HashMap<>();
    HashMap<String, Double> suriname = new HashMap<>();
    HashMap<String, Double> swaziland = new HashMap<>();
    HashMap<String, Double> sweden = new HashMap<>();
    HashMap<String, Double> switzerland = new HashMap<>();
    HashMap<String, Double> syria = new HashMap<>();
    HashMap<String, Double> taiwan = new HashMap<>();
    HashMap<String, Double> tajikistan = new HashMap<>();
    HashMap<String, Double> tanzania = new HashMap<>();
    HashMap<String, Double> thailand = new HashMap<>();
    HashMap<String, Double> tonga = new HashMap<>();
    HashMap<String, Double> trinidad = new HashMap<>();
    HashMap<String, Double> tunisia = new HashMap<>();
    HashMap<String, Double> turkey = new HashMap<>();
    HashMap<String, Double> turkmenistan = new HashMap<>();
    HashMap<String, Double> tuvalu = new HashMap<>();
    HashMap<String, Double> uganda = new HashMap<>();
    HashMap<String, Double> ukraine = new HashMap<>();
    HashMap<String, Double> united_arab_emirates = new HashMap<>();
    HashMap<String, Double> united_kingdom = new HashMap<>();
    HashMap<String, Double> united_states = new HashMap<>();
    HashMap<String, Double> uruguay = new HashMap<>();
    HashMap<String, Double> uzbekistan = new HashMap<>();
    HashMap<String, Double> vanuatu  = new HashMap<>();
    HashMap<String, Double> venezuela = new HashMap<>();
    HashMap<String, Double> vietnam = new HashMap<>();
    HashMap<String, Double> yemen = new HashMap<>();
    HashMap<String, Double> zambia = new HashMap<>();
    HashMap<String, Double> zimbabwe = new HashMap<>();
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
                     "Georgia Lari", "Ghana Cedi", "Guatemala Quetzal", "Guernsey Pound","Guinea Franc", "Guyana Dollar", "Haiti Gourde", 
                     "Honduras Lempira", "Hong Kong Dollar", "Indian Rupee", "Japan Yen", "Jersey Pound",
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
    public void populate_afghan (){ //popukate afghan hashmap
        for(int i = 0; i < type.length; i++){
            if(type[i].equals("Afghan Afghani")){
                afghan.put(type[i], 1.0);
            }else if(type[i].equals("Albanian Lek")){
                afghan.put(type[i], 1.01);
            }else if(type[i].equals("Algerian Dinar")){
                afghan.put(type[i], 1.33);
            }else if(type[i].equals("Angolan Kwanza")){
                afghan.put(type[i], 5.08);
            }else if(type[i].equals("Argentine Peso")){
                afghan.put(type[i], 0.99);
            }else if(type[i].equals("Armenian Dram")){
                afghan.put(type[i], 4.56);
            }else if(type[i].equals("Aruban Florin")){
                afghan.put(type[i], 0.017);
            }else if(type[i].equals("Australian Dollar")){
                afghan.put(type[i], 0.013);
            }else if(type[i].equals("Azerbaijani Manat")){
                afghan.put(type[i], 0.016);
            }else if(type[i].equals("Bahamas Dollar")){
                afghan.put(type[i], 0.0095);
            }else if(type[i].equals("Bahrain Dinar")){
                afghan.put(type[i], 0.0036);
            }else if(type[i].equals("Bangladesh Taka")){
                afghan.put(type[i], 0.82);
            }else if(type[i].equals("Barbados Dollar")){
                afghan.put(type[i], 0.019);
            }else if(type[i].equals("Belarus Ruble")){
                afghan.put(type[i], 0.025);
            }else if(type[i].equals("Belize Dollar")){
                afghan.put(type[i], 0.019);
            }else if(type[i].equals("Bermuda Dollar")){
                afghan.put(type[i], 0.0095);
            }else if(type[i].equals("Bhutan Ngultrum")){
                afghan.put(type[i], 0.71);
            }else if(type[i].equals("Bolivia Boliviano")){
                afghan.put(type[i], 0.065);
            }else if(type[i].equals("Bosnia-Herzegovina Convertible Mark")){
                afghan.put(type[i], 0.016);
            }else if(type[i].equals("Botswana Pula")){
                afghan.put(type[i], 0.11);
            }else if(type[i].equals("Brazil Real")){
                afghan.put(type[i], 0.053);
            }else if(type[i].equals("Brunei Dollar")){
                afghan.put(type[i], 0.013);
            }else if(type[i].equals("Bulgaria Lev")){
                afghan.put(type[i], 0.016);
            }else if(type[i].equals("Burundi Franc")){
                afghan.put(type[i], 19.03);
            }else if(type[i].equals("Cambodia Riel")){
                afghan.put(type[i], 38.64);
            }else if(type[i].equals("Canadian Dollar")){
                afghan.put(type[i], 0.012);
            }else if(type[i].equals("Cape Verde Escudo")){
                afghan.put(type[i], 0.92);
            }else if(type[i].equals("Cayman Island Dollar")){
                afghan.put(type[i], 0.0079);
            }else if(type[i].equals("Chile Peso")){
                afghan.put(type[i], 7.76);
            }else if(type[i].equals("China Yuan Renminbi")){
                afghan.put(type[i], 0.060);
            }else if(type[i].equals("Colombia Peso")){
                afghan.put(type[i], 38.25);
            }else if(type[i].equals("Comorian Franc")){
                afghan.put(type[i], 4.11);
            }else if(type[i].equals("Congolese Franc")){
                afghan.put(type[i], 19.01);
            }else if(type[i].equals("Costa Rica Colon")){
                afghan.put(type[i], 6.02);
            }else if(type[i].equals("Cuban Peso")){
                afghan.put(type[i], 0.23);
            }else if(type[i].equals("Czech Republic Koruna")){
                afghan.put(type[i], 0.20);
            }else if(type[i].equals("Denmark Krone")){
                afghan.put(type[i], 0.062);
            }else if(type[i].equals("Djibouti Franc")){
                afghan.put(type[i], 1.68);
            }else if(type[i].equals("Dominican Republic Peso")){
                afghan.put(type[i], 0.55);
            }else if(type[i].equals("East Caribbean Dollar")){
                afghan.put(type[i], 0.026);
            }else if(type[i].equals("Egypt Pound")){
                afghan.put(type[i], 0.15);
            }else if(type[i].equals("El Salvador Colon")){
                afghan.put(type[i], 0.083);
            }else if(type[i].equals("Eritrea Nakfa")){
                afghan.put(type[i], 0.14);
            }else if(type[i].equals("Ethiopia Birr")){
                afghan.put(type[i], 0.47);
            }else if(type[i].equals("Euro")){
                afghan.put(type[i], 0.0084);
            }else if(type[i].equals("Fijian Dollar")){
                afghan.put(type[i], 0.02);
            }else if(type[i].equals("Gambia Dalasi")){
                afghan.put(type[i], 0.5);
            }else if(type[i].equals("Georgia Lari")){
                afghan.put(type[i], 0.029);
            }else if(type[i].equals("Ghana Cedi")){
                afghan.put(type[i], 0.059);
            }else if(type[i].equals("Guatemala Quetzal")){
                afghan.put(type[i], 0.073);
            }else if(type[i].equals("Guernsey Pound")){
                afghan.put(type[i], 0.01);
            }else if(type[i].equals("Guinea Franc")){
                afghan.put(type[i], 85.97);
            }else if(type[i].equals("Guyana Dollar")){
                afghan.put(type[i], 1.98);
            }else if(type[i].equals("Haiti Gourde")){
                afghan.put(type[i], 0.96);
            }else if(type[i].equals("Honduras Lempira")){
                afghan.put(type[i], 0.23);
            }else if(type[i].equals("Hong Kong Dollar")){
                afghan.put(type[i], 0.074);
            }else if (type[i].equals("Indian Rupee")){
                afghan.put(type[i], 0.71);
            }else if(type[i].equals("Japan Yen")){
                afghan.put(type[i], 0.96);
            }else if(type[i].equals("Jersey Pound")){
            }else if(type[i].equals("Jordan Dinar")){
            }else if(type[i].equals("Kazakhstan Tenge")){
            }else if(type[i].equals("Kenya Shilling")){
            }else if(type[i].equals("Korea (North) Won")){
            }else if(type[i].equals("Korea (South) Won")){
            }else if(type[i].equals("Kuwait Dinar")){
            }else if(type[i].equals("Kyrgyzstan Som")){
            }else if(type[i].equals("Laos Kip")){
            }else if(type[i].equals("Lebanon Pound")){
            }else if(type[i].equals("Lesotho Loti")){
            }else if(type[i].equals("Liberia Dollar")){
            }else if(type[i].equals("Libya Dinar")){
            }else if(type[i].equals("Macau Pataca")){
            }else if(type[i].equals("Macedonia Denar")){
            }else if(type[i].equals("Madagascar Ariary")){
            }else if(type[i].equals("Malawi Kwacha")){
            }else if(type[i].equals("Malaysia Ringgit")){
            }else if(type[i].equals("Maldives Rufiyaa")){
            }else if(type[i].equals("Mauritania Ouguiya")){
            }else if(type[i].equals("Mauritius Rupee")){
            }else if(type[i].equals("Mexico Peso")){
            }else if(type[i].equals("Moldova Leu")){
            }else if(type[i].equals("Mongolia Tughrik")){
            }else if(type[i].equals("Mozambique Metical")){
            }else if(type[i].equals("Myanmar Kyat")){
            }else if(type[i].equals("Namibia Dollar")){
            }else if(type[i].equals("Nepal Rupee")){
            }else if(type[i].equals("Netherlands Antilles Guilder")){
            }else if(type[i].equals("New Zealand Dollar")){
            }else if(type[i].equals("Nicaragua Cordoba")){
            }else if(type[i].equals("Nigeria Naira")){
            }else if(type[i].equals("Norway Krone")){
            }else if(type[i].equals("Oman Rial")){
            }else if(type[i].equals("Pakistan Rupee")){
            }else if(type[i].equals("Panama Balboa")){
            }else if(type[i].equals("Pupua New Guinea Kina")){
            }else if(type[i].equals("Paraguay Guarani")){
            }else if(type[i].equals("Peru Sol")){
            }else if(type[i].equals("Philippines Peso")){
            }else if(type[i].equals("Poland Zloty")){
            }else if(type[i].equals("Qatar Riyal")){
            }else if(type[i].equals("Romania Leu")){
            }else if(type[i].equals("Russia Ruble")){
            }else if(type[i].equals("Rwanda Franc")){
            }else if(type[i].equals("Saint Helena Pound")){
            }else if(type[i].equals("Samoa Tala")){
            }else if(type[i].equals("Saudi Riyal")){
            }else if(type[i].equals("Seborga Luigino")){
            }else if(type[i].equals("Serbia Dinar")){
            }else if(type[i].equals("Seychelles Rupee")){
            }else if(type[i].equals("Sierra Leone Leone")){
            }else if(type[i].equals("Singapore Dollar")){
            }else if(type[i].equals("Solomon Islands Dollar")){
            }else if(type[i].equals("Somalia Shilling")){
            }else if(type[i].equals("South Africa Rand")){
            }else if(type[i].equals("Sri Lanka Rupee")){
            }else if(type[i].equals("Sudan Pound")){
            }else if(type[i].equals("Suriname Dollar")){
            }else if(type[i].equals("Swaziland Lilangeni")){
            }else if(type[i].equals("Sweden Krona")){
            }else if(type[i].equals("Switzerland Franc")){
            }else if(type[i].equals("Syria Pound")){
            }else if(type[i].equals("Taiwan New Dollar")){
            }else if(type[i].equals("Tajikistan Somoni")){
            }else if(type[i].equals("Tanzania Shilling")){
            }else if(type[i].equals("Thailand Baht")){
            }else if(type[i].equals("Tonga Pa'anga")){
            }else if(type[i].equals("Trinidad and Tobago Dollar")){
            }else if(type[i].equals("Tunisia Dinar")){
            }else if(type[i].equals("Turkey Lira")){
            }else if(type[i].equals("Turkmenistan Manat")){
            }else if(type[i].equals("Tuvalu Dollar")){
            }else if(type[i].equals("Uganda Shilling")){
            }else if(type[i].equals("Ukraine Hryvnia")){
            }else if(type[i].equals("United Arab Emirates Dirham")){
            }else if(type[i].equals("United Kingdom Pound")){
            }else if(type[i].equals("United States Dollar")){
            }else if(type[i].equals("Uruguay Peso")){
            }else if(type[i].equals("Uzbekistan Som")){
            }else if(type[i].equals("Vanuatu Vatu")){
            }else if(type[i].equals("Venezuela Bolivar")){
            }else if(type[i].equals("Vietnam Dong")){
            }else if(type[i].equals("Yemen Rial")){
            }else if(type[i].equals("Zambia Kwacha")){
            }else if(type[i].equals("Zimbabwe Dollar")){
            }
        }
    }
    public void populate_albanian (){
        
    }
    public void populate_algerian (){
        
    }
    public void populate_angolan (){
        
    }
    public void populate_argentine (){
        
    }
    public void populate_armenian (){
        
    }
    public void populate_aruban (){
        
    }
    public void populate_australian (){
        
    }
    public void populate_azerbaijani (){
        
    }
    public void populate_bahamas(){
        
    }
    public void populate_bahrain (){
        
    }
    public void populate_bangladesh (){
        
    }
    public void populate_barbados(){
        
    }
    public void populate_belarus (){
        
    }
    public void populate_belize(){
        
    }
    public void populate_bermuda (){
        
    }
    public void populate_bhutan(){
        
    }
    public void populate_bolivia(){
        
    }
    public void populate_bosnia (){
        
    }
    public void populate_botswana(){
        
    }
    public void populate_brazil(){
        
    }
    public void populate_brunei (){
        
    }
    public void populate_bulgaria(){
        
    }
    public void populate_burundi(){
        
    }
    public void populate_cambodia(){
        
    }
    public void populate_canadian(){
        
    }
    public void populate_cape_verde (){
        
    }
    public void populate_cayman_islands(){
        
    }
    public void populate_chile(){
        
    }
    public void populate_china (){
        
    }
    public void populate_colombia (){
        
    }
    public void populate_comorian(){
        
    }
    public void populate_congolese(){
        
    }
    public void populate_costa_rica(){
        
    }
    public void populate_cuban (){
        
    }
    public void populate_czech_republic(){
        
    }
    public void populate_denmark(){
        
    }
    public void populate_djibouti (){
        
    }
    public void populate_dominican_republic (){
        
    }
    public void populate_east_caribbean(){
        
    }
    public void populate_egypt (){
        
    }
    public void populate_el_salvador (){
        
    }
    public void populate_eritrea(){
        
    }
    public void populate_ethiopia(){
        
    }
    public void populate_euro (){
        
    }
    public void populate_fijian (){
        
    }
    public void populate_gambia (){
        
    }
    public void populate_georgia (){
        
    }
    public void populate_ghana (){
        
    }
    public void populate_guatemala(){
        
    }
    public void populate_guernsey (){
        
    }
    public void populate_guinea(){
        
    }
    public void populate_guyana (){
        
    }
    public void populate_haiti (){
        
    }
    public void populate_honduras (){
        
    }
    public void populate_hong_kong(){
        
    }
    public void populate_india(){

    }
    public void populate_japan(){
        
    }
    public void populate_jersey(){
        
    }
    public void populate_jordan (){
        
    }
    public void populate_kazakhstan(){
        
    }
    public void populate_kenya (){
        
    }
    public void populate_north_korea(){
        
    }
    public void populate_south_korea(){
        
    }
    public void populate_kuwait (){
        
    }
    public void populate_kyrgyzstan (){
        
    }
    public void populate_laos(){
        
    }
    public void populate_lebanon (){
        
    }
    public void populate_lesotho(){
        
    }
    public void populate_liberia (){
        
    }
    public void populate_libya (){
        
    }
    public void populate_macau(){
        
    }
    public void populate_macedonia(){
        
    }
    public void populate_madagascar (){
        
    }
    public void populate_malawi (){
        
    }
    public void populate_malaysia (){
        
    }
    public void populate_maldives (){
        
    }
    public void populate_mauritania(){
        
    }
    public void populate_mauritius (){
        
    }
    public void populate_mexico (){
        
    }
    public void populate_moldova (){
        
    }
    public void populate_mongolia (){
        
    }
    public void populate_mozambique(){
        
    } 
    public void populate_myanmar(){
        
    }
    public void populate_namibia(){
        
    }
    public void populate_nepal (){
        
    }
    public void populate_netherlands (){
        
    }
    public void populate_new_zealand (){
        
    }
    public void populate_nicaragua (){
        
    }
    public void populate_nigeria(){
        
    }
    public void populate_norway(){
        
    }
    public void populate_oman(){
        
    }
    public void populate_pakistan (){
        
    }
    public void populate_panama (){
        
    }
    public void populate_pupua_new_guinea (){
        
    }
    public void populate_paraguay (){
        
    }
    public void populate_peru(){
        
    }
    public void populate_philippines(){
        
    }
    public void populate_poland (){
        
    }
    public void populate_Qatar (){
        
    }
    public void populate_romania (){
        
    }
    public void populate_russia (){
        
    }
    public void populate_rwanda(){
        
    }
    public void populate_saint_helena(){
        
    }
    public void populate_samoa (){
        
    }
    public void populate_saudi (){
        
    }
    public void populate_seborga (){
        
    }
    public void populate_serbia(){
        
    }
    public void populate_seychelles (){
        
    }
    public void populate_sierra_leone (){
        
    }
    public void populate_singapore (){
        
    }
    public void populate_solomon_islands(){
        
    }
    public void populate_somalia (){
        
    }
    public void populate_south_africa(){
        
    }
    public void populate_sri_lanka(){
        
    }
    public void populate_sudan(){
        
    }
    public void populate_suriname(){
        
    }
    public void populate_swaziland(){
        
    }
    public void populate_sweden(){
        
    }
    public void populate_switzerland (){
        
    }
    public void populate_syria(){
        
    }
    public void populate_taiwan (){
        
    }
    public void populate_tajikistan (){
        
    }
    public void populate_tanzania (){
        
    }
    public void populate_thailand (){
        
    }
    public void populate_tonga (){
        
    }
    public void populate_trinidad (){
        
    }
    public void populate_tunisia (){
        
    }
    public void populate_turkey (){
        
    }
    public void populate_turkmenistan (){
        
    }
    public void populate_tuvalu (){
        
    }
    public void populate_uganda (){
        
    }
    public void populate_ukraine (){
        
    }
    public void populate_united_arab_emirates (){
        
    }
    public void populate_united_kingdom (){
        
    }
    public void populate_united_states (){
        
    }
    public void populate_uruguay(){
        
    }
    public void populate_uzbekistan (){
        
    }
    public void populate_vanuatu (){
        
    }
    public void populate_venezuela (){
        
    }
    public void populate_vietnam(){
        
    }
    public void populate_yemen (){
        
    }
    public void populate_zambia(){
        
    }
    public void populate_zimbabwe(){
        
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
                }else if(type[i].equals("Angolan Kwanza")){
                    populate_angolan();
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
                }else if(type[i].equals("China Yuan Renminbi")){
                    populate_china();
                }else if(type[i].equals("Colombia Peso")){
                    populate_colombia();
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
                }else if(type[i].equals("Guatemala Quetzal")){
                    populate_guatemala();
                }else if(type[i].equals("Guernsey Pound")){
                    populate_guernsey();
                }else if(type[i].equals("Guinea Franc")){
                    populate_guinea();
                }else if(type[i].equals("Guyana Dollar")){
                    populate_guyana();
                }else if(type[i].equals("Haiti Gourde")){
                    populate_haiti();
                }else if(type[i].equals("Honduras Lempira")){
                    populate_honduras();
                }else if(type[i].equals("Hong Kong Dollar")){
                    populate_hong_kong();
                }else if(type[i].equals("Indian Rupee")){
                    populate_india();
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
                System.out.println(afghan);
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
