package sudoku;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    private ArrayList<ArrayList<SudokuBtn>> buttons = new ArrayList<ArrayList<SudokuBtn>>(); 
    private Sudoku sudoku;
    private int lastSelRow;
    private int lastSelCol;
    
    public NewJFrame() {
        initComponents();
        setBackground(new Color(0,0,0));
        //setIconImage(new ImageIcon("/testjbutton/image/frameIcon.png").getImage());
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/sudoku/image/frameIcon.png")));
        congratJPanel1.setVisible(false);
        comboBoxSel1.addItem(new ComboBoxItem("Easy","/sudoku/image/easy.png"));
        comboBoxSel1.addItem(new ComboBoxItem("Medium","/sudoku/image/medium.png"));
        comboBoxSel1.addItem(new ComboBoxItem("Hard","/sudoku/image/hard.png"));
        comboBoxSel1.addItem(new ComboBoxItem("Very Hard","/sudoku/image/very hard.png"));        
        lastSelRow = 0;
        lastSelCol = 0;
        sudoku = new Sudoku();
        for(int i=0;i<9;i++){
            buttons.add(new ArrayList<SudokuBtn>());
            for (int j = 0; j < 9; j++) {
                (buttons.get(i)).add(new SudokuBtn(0,i,j));
                SudokuBtn app = (buttons.get(i)).get(j);
                this.jPanel2.add(app);
                
                
                app.addActionListener(new java.awt.event.ActionListener() {
                                        
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        sudokuActionPerformed(evt);
                    }
                });
            }
        }
        //jPanel2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titleJPanel1 = new sudoku.TitleJPanel();
        newGameBtn = new javax.swing.JButton();
        checkCellSolBtn = new javax.swing.JButton();
        congratJPanel1 = new sudoku.CongratJPanel();
        comboBoxSel1 = new sudoku.ComboBoxSel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(9, 9));

        newGameBtn.setBackground(new java.awt.Color(245, 245, 245));
        newGameBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        newGameBtn.setForeground(new java.awt.Color(33, 44, 116));
        newGameBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku/image/newGame.png"))); // NOI18N
        newGameBtn.setText("New Game");
        newGameBtn.setMargin(new java.awt.Insets(3, 4, 3, 4));
        newGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameBtnActionPerformed(evt);
            }
        });

        checkCellSolBtn.setBackground(new java.awt.Color(245, 245, 245));
        checkCellSolBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        checkCellSolBtn.setForeground(new java.awt.Color(33, 44, 116));
        checkCellSolBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku/image/checkCell.png"))); // NOI18N
        checkCellSolBtn.setText("<html>Check Cell<br>Solution</html>");
        checkCellSolBtn.setIconTextGap(10);
        checkCellSolBtn.setMargin(new java.awt.Insets(3, 4, 3, 4));
        checkCellSolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCellSolBtnActionPerformed(evt);
            }
        });

        comboBoxSel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(congratJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(checkCellSolBtn)
                        .addComponent(newGameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxSel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(132, 132, 132)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(newGameBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxSel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkCellSolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(congratJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkCellSolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCellSolBtnActionPerformed
        //sudoku.printSudokuToSolve();
        //sudoku.printSudoku();
        //System.out.println(congratJPanel1.isVisible());
        //System.out.println(sudoku.checkExist());
        SudokuBtn app = (buttons.get(lastSelRow)).get(lastSelCol);
        if(!congratJPanel1.isVisible() && sudoku.checkExist() && app.getIsEnabled()){

            int[][] sol = sudoku.getSolution();
            if (sol[lastSelRow][lastSelCol] == app.getValue()) {
                app.setBackground(new Color(0,102,0));
            }else{
                app.setBackground(Color.RED);
            }
        }
    }//GEN-LAST:event_checkCellSolBtnActionPerformed

    private void newGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameBtnActionPerformed
        if (congratJPanel1.isVisible() || !sudoku.checkExist()) {
            newGame();
        } else {
            int decision = JOptionPane.showConfirmDialog(jPanel1, "Quit this game and create another one?","New Game",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if (decision == 0) {
               newGame(); 
            }
        }
        

    }//GEN-LAST:event_newGameBtnActionPerformed

    private void newGame(){
        congratJPanel1.setVisible(false);
        int num = comboBoxSel1.getSelectedIndex();
        int k;
        switch (num) {
            case 0:
                k = 41;
                break;
            case 1:
                k = 51;
                break;
            case 2:
                k = 61;
                break;
            case 3:
                k = 71;
                break;        
            default:
                throw new AssertionError();
        }
 
        sudoku.createSudoku(k);
        int[][] tabToSolve = sudoku.getTabToSolve();
        for (int i = 0; i < 9; i++) {
            ArrayList<SudokuBtn> currRow = buttons.get(i);
            for (int j = 0; j < 9; j++) {
                SudokuBtn currBtn = currRow.get(j);
                if(tabToSolve[i][j] == 0){
                    currBtn.setIsEnabled(true);
                    //currBtn.setBackground(new Color(255,255,255));
                    currBtn.setBackground(new JButton().getBackground());
                }else{
                    currBtn.setIsEnabled(false);
                    currBtn.setBackground(new Color(0,0,0));
                }
                currBtn.setValue(tabToSolve[i][j]);
            }
        }        
    }
    
    private void comboBoxSel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSel1ActionPerformed

    
    private void sudokuActionPerformed(java.awt.event.ActionEvent evt){
        SudokuBtn app = (SudokuBtn)evt.getSource();
        if(app.getIsEnabled()){
            if(!(app.getBackground().equals(new JButton().getBackground()))){
                app.setBackground(new JButton().getBackground());
            }
            app.updateValue();
            sudoku.updateTabToSolve(app.getValue(), app.getRowId(), app.getColId());
            if(sudoku.checkSolution() && sudoku.checkExist()){
                for (int i = 0; i < 9; i++) {
                ArrayList<SudokuBtn> currRow = buttons.get(i);
                    for (int j = 0; j < 9; j++) {
                        SudokuBtn currBtn = currRow.get(j);
                        currBtn.setIsEnabled(false);
                        currBtn.setBackground(new Color(0,102,0));

                    }   
                }
                congratJPanel1.setVisible(true);
            }
            //System.out.println("clik "+app.getValue()+" "+evt.getSource());
            lastSelRow = app.getRowId();
            lastSelCol = app.getColId();
        }

    }
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkCellSolBtn;
    private sudoku.ComboBoxSel comboBoxSel1;
    private sudoku.CongratJPanel congratJPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton newGameBtn;
    private sudoku.TitleJPanel titleJPanel1;
    // End of variables declaration//GEN-END:variables
}
