/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler54;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author A049778
 */
public class Euler54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<String> fileList = loadFile();
        String[][] hands = null;
        
        if (fileList != null) {
            for (String i : fileList) {
                hands = splitLine(i);
                //System.out.print(Arrays.toString(hands[0])+" || ");
                //System.out.println(Arrays.toString(hands[1]));
                hands[0] = sortHand(hands[0]);
                hands[1] = sortHand(hands[1]);
                //System.out.println("########################################################");
                //System.out.print(Arrays.toString(hands[0])+" || ");
                //System.out.println(Arrays.toString(hands[1]));
                System.out.println(compareHands(hands));
            }
            
        }

    }
    public static String compareHands(String[][] h){
        String winner = null;
        
        
        
        
        
       return winner; 
    }

    public static ArrayList<String> loadFile() {
        ArrayList<String> list = new ArrayList<String>();
        Scanner input = null;
        try {
            input = new Scanner(new File("data/test.dat"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (input.hasNext()) {
            list.add(input.nextLine());
        }
        return list;

    }

    public static String[][] splitLine (String line){
        String[] hands = line.split(" ");
        String[] hand1 = {hands[0],hands[1],hands[2],hands[3],hands[4]};
        String[] hand2 = {hands[5],hands[6],hands[7],hands[8],hands[9]};
        return new String[][] {hand1,hand2};
    }
    
    public static String[] sortHand(String[] h) {
        for(int i=0;i<h.length;i++){
            h[i]= h[i].charAt(1)+""+h[i].charAt(0);
        }
       Arrays.sort(h);
        for(int i=0;i<h.length;i++){
            h[i]= h[i].charAt(1)+""+h[i].charAt(0);
        }
        return h; 
    }

}
