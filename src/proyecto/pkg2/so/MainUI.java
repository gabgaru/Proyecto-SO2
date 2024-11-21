/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.pkg2.so;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;

public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        super("ToonWars");
        initComponents();
        setLocationRelativeTo(null);



    }

   public void setPhotoStarWars(String resourcePath) {
    try {
        URL resource = getClass().getResource("/StarwarsFotos"+"/"+resourcePath+".jpeg");
        if (resource != null) {
            ImageIcon icon = new ImageIcon(resource);

            // Ajustar tamaño de la imagen
            Image img = icon.getImage();
            Image resizedImg = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(resizedImg);

            // Configurar la imagen en jLabel1
            jLabel1.setIcon(icon);
        } else {
            System.err.println("No se encontró el recurso: " + resourcePath);
        }
    } catch (Exception e) {
        System.err.println("Error cargando la imagen: " + e.getMessage());
    }
}

 public void setPhotoStarTrek(String resourcePath) {
    try {
           URL resource = getClass().getResource("/StarTrekFotos"+"/"+resourcePath+".jpg");
      
        if (resource != null) {
            ImageIcon icon = new ImageIcon(resource);

            // Ajustar tamaño de la imagen
            Image img = icon.getImage();
            Image resizedImg = img.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(resizedImg);

            // Configurar la imagen en jLabel1
            jLabel2.setIcon(icon);
        } else {
            System.err.println("No se encontró el recurso: " + resourcePath);
        }
    } catch (Exception e) {
        System.err.println("Error cargando la imagen: " + e.getMessage());
    }
}


    public void setSecondQueue(int n, ArrayList<Characters> a) {
    StringBuilder concatenatedElements = new StringBuilder();

    for (Characters element : a) {
        concatenatedElements.append(element.getNombre()).append("\n");
    }

    String concatenatedString = concatenatedElements.toString();

    // Seleccionar el TextView basado en studioInt
    switch (n) {
        case 0 -> secondQueueWars.setText(concatenatedString);
        case 1 -> secondQueueTrek.setText(concatenatedString);
        default -> {
            // Opcional: manejar el caso de entrada no válida
            System.out.println("Invalid studioInt");
        }
    }
} 
   
public void setThirdQueue(int n, ArrayList<Characters> a) {
    StringBuilder concatenatedElements = new StringBuilder();

    for (Characters element : a) {
        concatenatedElements.append(element.getNombre()).append("\n");
    }

    String concatenatedString = concatenatedElements.toString();

    // Seleccionar el TextView basado en studioInt
    switch (n) {
        case 0 -> thirdQueueWars.setText(concatenatedString);
        case 1 -> thirdQueueTrek.setText(concatenatedString);
        default -> {
            // Opcional: manejar el caso de entrada no válida
            System.out.println("Invalid studioInt");
        }
    }
} 
   
public void setTopQueue(int n, ArrayList<Characters> a) {
    StringBuilder concatenatedElements = new StringBuilder();

    for (Characters element : a) {
        concatenatedElements.append(element.getNombre()).append("\n");
    }

    String concatenatedString = concatenatedElements.toString();

    // Seleccionar el TextView basado en studioInt
    switch (n) {
        case 0 -> topQueueWars.setText(concatenatedString);
        case 1 -> topQueueTrek.setText(concatenatedString);
        default -> {
            // Opcional: manejar el caso de entrada no válida
            System.out.println("Invalid studioInt");
        }
    }
}
    public void setNanmeStarWars(Characters name) {

        characterIDStarWars.setText("#"+name.getID()+" "+name.getNombre());
        this.chracterHPWars.setText(String.valueOf(name.getHealth()));
        this.chracterSTWars.setText(String.valueOf(name.getStrength()));
        this.chracterAGWars.setText(String.valueOf(name.getAgility()));
        setPhotoStarWars(name.getNombre());
        
    }

    public void setNanmeStarTrek(Characters name) {
        characterIDStarTrek.setText("#"+name.getID()+" "+name.getNombre());
        this.chracterHPTrek.setText(String.valueOf(name.getHealth()));
        this.chracterSTTrek.setText(String.valueOf(name.getStrength()));
        this.chracterAGTrek.setText(String.valueOf(name.getAgility()));
        setPhotoStarTrek(name.getNombre());
    }

    public void changeAIStatus(String status) {
        statusAI.setText(status);
    }

    public void setCartoonWinner() {
        this.cartoonWinner.setText("Winner!");
    }

    public void setNickWinner() {
        this.nickWinner.setText("Winner!");
    }

    public void clearCartoonWinner() {
        this.cartoonWinner.setText("");
    }

    public void clearNickWinner() {
        this.nickWinner.setText("");
    }

    public void changeResult(String result) {
        this.result.setText(result);
    }

    public void setStarWars() {
        int x = Integer.parseInt(winsCounterStarWars.getText());
        x++;
        winsCounterStarWars.setText(String.valueOf(x));
    }

    public void setStarTrek() {
        int x = Integer.parseInt(winsCounterStarTrek.getText());
        x++;
        winsCounterStarTrek.setText(String.valueOf(x));
    }

    //Getters and Setters
    public JSpinner getUISpeedSpinner() {
        return this.speed;
    }

    public void changeRound(int roundInt) {
        this.round.setText(Integer.toString(roundInt));
    }

    public void changeBattleType(String battleType) {
        this.battleType.setText(battleType);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generalPanel = new javax.swing.JPanel();
        cartoonNetworkPanel = new javax.swing.JPanel();
        cartoonNetworkPanel_title = new javax.swing.JLabel();
        networkPanel_title = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        chracterSPTrek = new javax.swing.JLabel();
        chracterAGCartoon_Label = new javax.swing.JLabel();
        characterIDStarTrek = new javax.swing.JLabel();
        characterIDCartoon_Label = new javax.swing.JLabel();
        chracterSPCartoon_Label = new javax.swing.JLabel();
        chracterHPTrek = new javax.swing.JLabel();
        chracterHPCartoon_Label = new javax.swing.JLabel();
        chracterSTTrek = new javax.swing.JLabel();
        chracterSTCartoon_Label = new javax.swing.JLabel();
        chracterAGTrek = new javax.swing.JLabel();
        cartoonWinner = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        secondQueueCartoon_label = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        secondQueueTrek = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        topQueueTrek = new javax.swing.JTextArea();
        topQueueCartoon_label = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        thirdQueueTrek = new javax.swing.JTextArea();
        thirdQueueCartoon_label = new javax.swing.JLabel();
        winsCartoon_label = new javax.swing.JLabel();
        winsCounterStarTrek = new javax.swing.JLabel();
        round = new javax.swing.JLabel();
        battleType = new javax.swing.JLabel();
        speed = new javax.swing.JSpinner();
        speed_Label = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        nickelodeonPanel = new javax.swing.JPanel();
        secondQueueNick_label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        characterIDNick_Label = new javax.swing.JLabel();
        characterIDStarWars = new javax.swing.JLabel();
        chracterHPNick_Label = new javax.swing.JLabel();
        chracterHPWars = new javax.swing.JLabel();
        chracterAGWars = new javax.swing.JLabel();
        chracterAGNick_Label = new javax.swing.JLabel();
        chracterSTWars = new javax.swing.JLabel();
        chracterSTNick_Label = new javax.swing.JLabel();
        chracterSPWars = new javax.swing.JLabel();
        chracterSPNick_Label = new javax.swing.JLabel();
        nickWinner = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nickelodeonPanel_title = new javax.swing.JLabel();
        topQueueNick_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        secondQueueWars = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        topQueueWars = new javax.swing.JTextArea();
        thirdQueueNick_label = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        thirdQueueWars = new javax.swing.JTextArea();
        winsNick_label = new javax.swing.JLabel();
        winsCounterStarWars = new javax.swing.JLabel();
        result_label = new javax.swing.JLabel();
        round_label = new javax.swing.JLabel();
        statusAI = new javax.swing.JLabel();
        AI_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartoonNetworkPanel.setBackground(new java.awt.Color(51, 102, 255));
        cartoonNetworkPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartoonNetworkPanel_title.setBackground(new java.awt.Color(0, 0, 0));
        cartoonNetworkPanel_title.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        cartoonNetworkPanel_title.setForeground(new java.awt.Color(51, 51, 51));
        cartoonNetworkPanel_title.setText("Star");
        cartoonNetworkPanel.add(cartoonNetworkPanel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 90, 60));

        networkPanel_title.setBackground(new java.awt.Color(51, 51, 51));
        networkPanel_title.setForeground(new java.awt.Color(255, 255, 255));
        networkPanel_title.setText("Trek");
        networkPanel_title.setFocusable(false);
        networkPanel_title.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        networkPanel_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkPanel_titleActionPerformed(evt);
            }
        });
        cartoonNetworkPanel.add(networkPanel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 100, 60));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chracterSPTrek.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSPTrek.setForeground(new java.awt.Color(190, 190, 0));
        chracterSPTrek.setText("0");
        jPanel2.add(chracterSPTrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 54, -1));

        chracterAGCartoon_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterAGCartoon_Label.setForeground(new java.awt.Color(255, 153, 0));
        chracterAGCartoon_Label.setText("AG:");
        jPanel2.add(chracterAGCartoon_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 29, -1));

        characterIDStarTrek.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        characterIDStarTrek.setForeground(java.awt.Color.white);
        characterIDStarTrek.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(characterIDStarTrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 143, 20));

        characterIDCartoon_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        characterIDCartoon_Label.setForeground(java.awt.Color.white);
        characterIDCartoon_Label.setText("ID:");
        jPanel2.add(characterIDCartoon_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 41, -1));

        chracterSPCartoon_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSPCartoon_Label.setForeground(new java.awt.Color(190, 190, 0));
        chracterSPCartoon_Label.setText("SPEED:");
        jPanel2.add(chracterSPCartoon_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 340, 50, -1));

        chracterHPTrek.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterHPTrek.setForeground(new java.awt.Color(153, 204, 0));
        chracterHPTrek.setText("0");
        jPanel2.add(chracterHPTrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 54, 20));

        chracterHPCartoon_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterHPCartoon_Label.setForeground(new java.awt.Color(153, 204, 0));
        chracterHPCartoon_Label.setText("HP:");
        jPanel2.add(chracterHPCartoon_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 29, 20));

        chracterSTTrek.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSTTrek.setForeground(new java.awt.Color(255, 51, 51));
        chracterSTTrek.setText("0");
        jPanel2.add(chracterSTTrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 54, 20));

        chracterSTCartoon_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSTCartoon_Label.setForeground(new java.awt.Color(255, 51, 51));
        chracterSTCartoon_Label.setText("ST:");
        jPanel2.add(chracterSTCartoon_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 29, -1));

        chracterAGTrek.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterAGTrek.setForeground(new java.awt.Color(255, 153, 0));
        chracterAGTrek.setText("0");
        jPanel2.add(chracterAGTrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 54, 20));

        cartoonWinner.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        cartoonWinner.setForeground(new java.awt.Color(102, 204, 0));
        jPanel2.add(cartoonWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 100, 30));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 210));

        cartoonNetworkPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 230, 400));

        secondQueueCartoon_label.setBackground(new java.awt.Color(0, 0, 0));
        secondQueueCartoon_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        secondQueueCartoon_label.setForeground(new java.awt.Color(51, 51, 51));
        secondQueueCartoon_label.setText("Segunda prioridad");
        cartoonNetworkPanel.add(secondQueueCartoon_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 150, 30));

        secondQueueTrek.setBackground(new java.awt.Color(255, 255, 255));
        secondQueueTrek.setColumns(20);
        secondQueueTrek.setRows(5);
        secondQueueTrek.setBorder(null);
        jScrollPane6.setViewportView(secondQueueTrek);

        cartoonNetworkPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 260, 50));

        topQueueTrek.setBackground(new java.awt.Color(255, 255, 255));
        topQueueTrek.setColumns(20);
        topQueueTrek.setRows(5);
        topQueueTrek.setBorder(null);
        jScrollPane5.setViewportView(topQueueTrek);

        cartoonNetworkPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 260, 50));

        topQueueCartoon_label.setBackground(new java.awt.Color(0, 0, 0));
        topQueueCartoon_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        topQueueCartoon_label.setForeground(new java.awt.Color(51, 51, 51));
        topQueueCartoon_label.setText("Top Prioridad ");
        cartoonNetworkPanel.add(topQueueCartoon_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 110, 30));

        thirdQueueTrek.setBackground(new java.awt.Color(255, 255, 255));
        thirdQueueTrek.setColumns(20);
        thirdQueueTrek.setRows(5);
        thirdQueueTrek.setBorder(null);
        jScrollPane7.setViewportView(thirdQueueTrek);

        cartoonNetworkPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 260, 50));

        thirdQueueCartoon_label.setBackground(new java.awt.Color(0, 0, 0));
        thirdQueueCartoon_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        thirdQueueCartoon_label.setForeground(new java.awt.Color(51, 51, 51));
        thirdQueueCartoon_label.setText("Terecera Prioridad");
        cartoonNetworkPanel.add(thirdQueueCartoon_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 140, 30));

        winsCartoon_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        winsCartoon_label.setForeground(new java.awt.Color(51, 51, 51));
        winsCartoon_label.setText("Victorias");
        cartoonNetworkPanel.add(winsCartoon_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 120, 30));

        winsCounterStarTrek.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        winsCounterStarTrek.setForeground(new java.awt.Color(51, 51, 51));
        winsCounterStarTrek.setText("0");
        cartoonNetworkPanel.add(winsCounterStarTrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 70, 30));

        round.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        round.setForeground(new java.awt.Color(51, 51, 51));
        round.setText("0");
        cartoonNetworkPanel.add(round, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 30));

        battleType.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        battleType.setForeground(new java.awt.Color(51, 51, 51));
        cartoonNetworkPanel.add(battleType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 30));

        speed.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        speed.setModel(new javax.swing.SpinnerNumberModel(10, 1, 20, 1));
        speed.setToolTipText("");
        speed.setBorder(null);
        speed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        speed.setName(""); // NOI18N
        cartoonNetworkPanel.add(speed, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 90, 30));

        speed_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        speed_Label.setForeground(new java.awt.Color(51, 51, 51));
        speed_Label.setText("Velocidad");
        cartoonNetworkPanel.add(speed_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 130, 30));

        result.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        result.setForeground(new java.awt.Color(51, 51, 51));
        cartoonNetworkPanel.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 30));

        generalPanel.add(cartoonNetworkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 590, 670));

        nickelodeonPanel.setBackground(new java.awt.Color(255, 51, 51));
        nickelodeonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        secondQueueNick_label.setBackground(new java.awt.Color(0, 0, 0));
        secondQueueNick_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        secondQueueNick_label.setForeground(new java.awt.Color(255, 255, 255));
        secondQueueNick_label.setText("Segunda prioridad");
        nickelodeonPanel.add(secondQueueNick_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        characterIDNick_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        characterIDNick_Label.setForeground(new java.awt.Color(255, 153, 0));
        characterIDNick_Label.setText("ID:");
        jPanel1.add(characterIDNick_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 41, -1));

        characterIDStarWars.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        characterIDStarWars.setForeground(new java.awt.Color(255, 153, 0));
        characterIDStarWars.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        jPanel1.add(characterIDStarWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 143, 23));

        chracterHPNick_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterHPNick_Label.setForeground(new java.awt.Color(153, 204, 0));
        chracterHPNick_Label.setText("HP:");
        jPanel1.add(chracterHPNick_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 29, -1));

        chracterHPWars.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterHPWars.setForeground(new java.awt.Color(153, 204, 0));
        chracterHPWars.setText("0");
        jPanel1.add(chracterHPWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 54, 20));

        chracterAGWars.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterAGWars.setForeground(new java.awt.Color(255, 153, 0));
        chracterAGWars.setText("0");
        jPanel1.add(chracterAGWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 54, 20));

        chracterAGNick_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterAGNick_Label.setForeground(new java.awt.Color(255, 153, 0));
        chracterAGNick_Label.setText("AG:");
        jPanel1.add(chracterAGNick_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 29, -1));

        chracterSTWars.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSTWars.setForeground(new java.awt.Color(255, 51, 51));
        chracterSTWars.setText("0");
        jPanel1.add(chracterSTWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 54, -1));

        chracterSTNick_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSTNick_Label.setForeground(new java.awt.Color(255, 51, 51));
        chracterSTNick_Label.setText("ST:");
        jPanel1.add(chracterSTNick_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 29, -1));

        chracterSPWars.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSPWars.setForeground(new java.awt.Color(190, 190, 0));
        chracterSPWars.setText("0");
        jPanel1.add(chracterSPWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 54, -1));

        chracterSPNick_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSPNick_Label.setForeground(new java.awt.Color(190, 190, 0));
        chracterSPNick_Label.setText("SPEED:");
        jPanel1.add(chracterSPNick_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 340, -1, -1));

        nickWinner.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        nickWinner.setForeground(new java.awt.Color(102, 204, 0));
        jPanel1.add(nickWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 210));

        nickelodeonPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 230, 400));

        nickelodeonPanel_title.setBackground(new java.awt.Color(0, 0, 0));
        nickelodeonPanel_title.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        nickelodeonPanel_title.setForeground(new java.awt.Color(255, 255, 255));
        nickelodeonPanel_title.setText("Star Wars");
        nickelodeonPanel.add(nickelodeonPanel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 60));

        topQueueNick_label.setBackground(new java.awt.Color(0, 0, 0));
        topQueueNick_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        topQueueNick_label.setForeground(new java.awt.Color(255, 255, 255));
        topQueueNick_label.setText("Top Prioridad ");
        nickelodeonPanel.add(topQueueNick_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 30));

        secondQueueWars.setBackground(new java.awt.Color(255, 255, 255));
        secondQueueWars.setColumns(20);
        secondQueueWars.setRows(5);
        secondQueueWars.setBorder(null);
        jScrollPane1.setViewportView(secondQueueWars);

        nickelodeonPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 260, 50));

        topQueueWars.setBackground(new java.awt.Color(255, 255, 255));
        topQueueWars.setColumns(20);
        topQueueWars.setRows(5);
        topQueueWars.setBorder(null);
        jScrollPane2.setViewportView(topQueueWars);

        nickelodeonPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, 50));

        thirdQueueNick_label.setBackground(new java.awt.Color(0, 0, 0));
        thirdQueueNick_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        thirdQueueNick_label.setForeground(new java.awt.Color(255, 255, 255));
        thirdQueueNick_label.setText("Terecera Prioridad");
        nickelodeonPanel.add(thirdQueueNick_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 140, 30));

        thirdQueueWars.setBackground(new java.awt.Color(255, 255, 255));
        thirdQueueWars.setColumns(20);
        thirdQueueWars.setRows(5);
        thirdQueueWars.setBorder(null);
        jScrollPane3.setViewportView(thirdQueueWars);

        nickelodeonPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 260, 50));

        winsNick_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        winsNick_label.setForeground(new java.awt.Color(51, 51, 51));
        winsNick_label.setText("Vitorias");
        nickelodeonPanel.add(winsNick_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 110, 30));

        winsCounterStarWars.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        winsCounterStarWars.setForeground(new java.awt.Color(51, 51, 51));
        winsCounterStarWars.setText("0");
        nickelodeonPanel.add(winsCounterStarWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 70, 30));

        result_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        result_label.setForeground(new java.awt.Color(51, 51, 51));
        result_label.setText("Resultado");
        nickelodeonPanel.add(result_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 130, 30));

        round_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        round_label.setForeground(new java.awt.Color(51, 51, 51));
        round_label.setText("Ronda");
        nickelodeonPanel.add(round_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 90, 30));

        statusAI.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        statusAI.setForeground(new java.awt.Color(51, 51, 51));
        statusAI.setText("Espera");
        nickelodeonPanel.add(statusAI, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 190, 30));

        AI_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        AI_label.setForeground(new java.awt.Color(51, 51, 51));
        AI_label.setText("AI:");
        nickelodeonPanel.add(AI_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 40, 30));

        generalPanel.add(nickelodeonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 670));

        getContentPane().add(generalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void networkPanel_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkPanel_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkPanel_titleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AI_label;
    private javax.swing.JLabel battleType;
    private javax.swing.JPanel cartoonNetworkPanel;
    private javax.swing.JLabel cartoonNetworkPanel_title;
    private javax.swing.JLabel cartoonWinner;
    private javax.swing.JLabel characterIDCartoon_Label;
    private javax.swing.JLabel characterIDNick_Label;
    private javax.swing.JLabel characterIDStarTrek;
    private javax.swing.JLabel characterIDStarWars;
    private javax.swing.JLabel chracterAGCartoon_Label;
    private javax.swing.JLabel chracterAGNick_Label;
    private javax.swing.JLabel chracterAGTrek;
    private javax.swing.JLabel chracterAGWars;
    private javax.swing.JLabel chracterHPCartoon_Label;
    private javax.swing.JLabel chracterHPNick_Label;
    private javax.swing.JLabel chracterHPTrek;
    private javax.swing.JLabel chracterHPWars;
    private javax.swing.JLabel chracterSPCartoon_Label;
    private javax.swing.JLabel chracterSPNick_Label;
    private javax.swing.JLabel chracterSPTrek;
    private javax.swing.JLabel chracterSPWars;
    private javax.swing.JLabel chracterSTCartoon_Label;
    private javax.swing.JLabel chracterSTNick_Label;
    private javax.swing.JLabel chracterSTTrek;
    private javax.swing.JLabel chracterSTWars;
    private javax.swing.JPanel generalPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JFormattedTextField networkPanel_title;
    private javax.swing.JLabel nickWinner;
    private javax.swing.JPanel nickelodeonPanel;
    private javax.swing.JLabel nickelodeonPanel_title;
    private javax.swing.JLabel result;
    private javax.swing.JLabel result_label;
    private javax.swing.JLabel round;
    private javax.swing.JLabel round_label;
    private javax.swing.JLabel secondQueueCartoon_label;
    private javax.swing.JLabel secondQueueNick_label;
    private javax.swing.JTextArea secondQueueTrek;
    private javax.swing.JTextArea secondQueueWars;
    private javax.swing.JSpinner speed;
    private javax.swing.JLabel speed_Label;
    private javax.swing.JLabel statusAI;
    private javax.swing.JLabel thirdQueueCartoon_label;
    private javax.swing.JLabel thirdQueueNick_label;
    private javax.swing.JTextArea thirdQueueTrek;
    private javax.swing.JTextArea thirdQueueWars;
    private javax.swing.JLabel topQueueCartoon_label;
    private javax.swing.JLabel topQueueNick_label;
    private javax.swing.JTextArea topQueueTrek;
    private javax.swing.JTextArea topQueueWars;
    private javax.swing.JLabel winsCartoon_label;
    private javax.swing.JLabel winsCounterStarTrek;
    private javax.swing.JLabel winsCounterStarWars;
    private javax.swing.JLabel winsNick_label;
    // End of variables declaration//GEN-END:variables
}
