package euler54;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A049778
 */
public class PokerHand implements Comparable {

    private String[] cards;
    
    public PokerHand(String[] h) {
        this.cards = h;

    }

    @Override
    public int compareTo(Object p) {
        PokerHand o = (PokerHand) p;
        int r = 0;
        if (this.toNum() == o.toNum())
            return r;
        else if(this.toNum()>o.toNum())
              r = this.toNum() - o.toNum();
        else
              r=o.toNum() - this.toNum();

        return r;
    }
    
    private int toNum(){
        int rank = 0;
        
        
        
        return rank;
    }
    
    
    
    
    
    
}
