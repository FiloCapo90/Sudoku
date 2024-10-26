/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class SudokuBtn extends JButton {
    
    private int num;
    private String iconPath;
    private int rowId;
    private int colId;
    private boolean isEnabled;
    
    public SudokuBtn(int value, int i, int j){
        setText("");
        setPreferredSize(new Dimension(56, 56));
        setSize(new Dimension(56, 56));
        this.isEnabled = true;
        this.num = value;
        this.rowId = i;
        this.colId = j;
        this.iconPath = "";
        setIcon(null);
    }
    
    public int getValue(){
        return num;
    }
    
    public int getRowId(){
       return rowId; 
    }

    public int getColId(){
       return colId; 
    }
    
    public boolean getIsEnabled(){
        return isEnabled;
    }
    
    public void setValue(int value){
        this.num = value;
        updateIcon(value);
    }
    
    public void setIsEnabled(boolean bool){
        this.isEnabled = bool;
    }
    
    public void updateValue(){
        num ++;
        if (num > 9) {
            num = 0;
        }
        updateIcon(num);  
    }
    
    private void updateIcon(int num){
        Image image;
        Image newImage;
        switch (num) {
            case 0:
                this.iconPath = "";
                this.setIcon(null);
                break;
            case 1:
                this.iconPath = "sudoku/one.png";
                image = (new ImageIcon(getClass().getResource(this.iconPath))).getImage();
                newImage = image.getScaledInstance(this.getWidth()-((int)(this.getWidth()*0.2)), this.getHeight()-((int)(this.getHeight()*0.2)), java.awt.Image.SCALE_SMOOTH);
                //System.out.println(this.getWidth()+" "+this.getHeight());
                this.setIcon(new ImageIcon(newImage));
                break;
            case 2:
                this.iconPath = "sudoku/two.png";
                image = (new ImageIcon(getClass().getResource(this.iconPath))).getImage();
                newImage = image.getScaledInstance(this.getWidth()-((int)(this.getWidth()*0.2)), this.getHeight()-((int)(this.getHeight()*0.2)), java.awt.Image.SCALE_SMOOTH);
                this.setIcon(new ImageIcon(newImage));
                break;
            case 3:
                this.iconPath = "sudoku/three.png";
                image = (new ImageIcon(getClass().getResource("sudoku/three.png"))).getImage();
                newImage = image.getScaledInstance(this.getWidth()-((int)(this.getWidth()*0.2)), this.getHeight()-((int)(this.getHeight()*0.2)), java.awt.Image.SCALE_SMOOTH);
                this.setIcon(new ImageIcon(newImage));
                break;                
            case 4:
                this.iconPath = "sudoku/four.png";
                image = (new ImageIcon(getClass().getResource("sudoku/four.png"))).getImage();
                newImage = image.getScaledInstance(this.getWidth()-((int)(this.getWidth()*0.2)), this.getHeight()-((int)(this.getHeight()*0.2)), java.awt.Image.SCALE_SMOOTH);
                this.setIcon(new ImageIcon(newImage));
                break;             
            case 5:
                this.iconPath = "sudoku/five.png";
                image = (new ImageIcon(getClass().getResource("sudoku/five.png"))).getImage();
                newImage = image.getScaledInstance(this.getWidth()-((int)(this.getWidth()*0.2)), this.getHeight()-((int)(this.getHeight()*0.2)), java.awt.Image.SCALE_SMOOTH);
                this.setIcon(new ImageIcon(newImage));
                break;
            case 6:
                this.iconPath = "sudoku/six.png";
                image = (new ImageIcon(getClass().getResource("sudoku/six.png"))).getImage();
                newImage = image.getScaledInstance(this.getWidth()-((int)(this.getWidth()*0.2)), this.getHeight()-((int)(this.getHeight()*0.2)), java.awt.Image.SCALE_SMOOTH);
                this.setIcon(new ImageIcon(newImage));
                break;              
            case 7:
                this.iconPath = "sudoku/seven.png";
                image = (new ImageIcon(getClass().getResource("sudoku/seven.png"))).getImage();
                newImage = image.getScaledInstance(this.getWidth()-((int)(this.getWidth()*0.2)), this.getHeight()-((int)(this.getHeight()*0.2)), java.awt.Image.SCALE_SMOOTH);
                this.setIcon(new ImageIcon(newImage));
                break;
            case 8:
                this.iconPath = "sudoku/eight.png";
                image = (new ImageIcon(getClass().getResource("sudoku/eight.png"))).getImage();
                newImage = image.getScaledInstance(this.getWidth()-((int)(this.getWidth()*0.2)), this.getHeight()-((int)(this.getHeight()*0.2)), java.awt.Image.SCALE_SMOOTH);
                this.setIcon(new ImageIcon(newImage));
                break;             
            case 9:
                this.iconPath = "sudoku/nine.png";
                image = (new ImageIcon(getClass().getResource("sudoku/nine.png"))).getImage();
                newImage = image.getScaledInstance(this.getWidth()-((int)(this.getWidth()*0.2)), this.getHeight()-((int)(this.getHeight()*0.2)), java.awt.Image.SCALE_SMOOTH);
                this.setIcon(new ImageIcon(newImage));
                break;                
            default:
                throw new AssertionError();
        }        
    }
    
}
