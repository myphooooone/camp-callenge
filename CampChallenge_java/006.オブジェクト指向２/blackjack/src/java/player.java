
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wappen
 */
//１．Humanという抽象クラスを作成し、以下を実装してください。
//　　・openというabstractな公開メソッドを用意してください。
//　　・setCardというArrayListを引数とした、abstractな公開メソッドを用意してください。
//　　・checkSumというabstractな公開メソッドを用意してください。
//　　・myCardsというArrayListの変数を用意してください。
//　２．１で作成した抽象クラスを継承して、以下のクラスを作成してください。
//　　・Dealerクラス
//　　・Userクラス
//　３．まずはDealerクラスを完成させます。
//　　・cardsというArrayListの変数を用意し、初期処理でこのcardsに全てのトランプを持たせてください。
//　　・dealという公開メソッドを用意し、cardsからランダムで2枚のカードをArrayListにして返却してください。
//　　・hitという公開メソッドを用意し、cardsからランダムで1枚のカードをArrayListにして返却してください。
//　４．DealerとUser両方に必要な処理を実装し、完成させます。
//　　・setCardは、ArrayListで受けたカード情報をmyCardsに追加するように実装してください。
//　　・checkSumは、myCardsを確認し、まだカードが必要ならtrue、必要無ければfalseを返却するように実装してください。
//　　・openは、myCardsのカードの合計値を返却するように実装してください。
//
//　５．ブラックジャックの準備は整いました。ゲームが成り立つよう、２つのクラスを利用してコーディングしてみてください。 
public class player extends human{
//setCardは、ArrayListで受けたカード情報をmyCardsに追加するように実装してください。
     ArrayList<Integer>cards = new ArrayList<Integer>();
     ArrayList<Integer>myCard= new ArrayList<>();
     
     
     
       public ArrayList<Integer> deal(){
    //2枚のカード持たせる箱
    ArrayList<Integer>deck= new ArrayList(); 
     //乱数    
      Random rand= new Random();
         for(int i=0; i>2; i++){
             deck.add(cards.get(rand.nextInt(cards.size())));
       }
         return deck;
      }
//hitという公開メソッドを作成
    public ArrayList<Integer> hit(){
    //1枚のカード持たせる箱
    ArrayList<Integer>hit= new ArrayList(); 
     //乱数    
      Random rand= new Random();
             hit.add(cards.get(rand.nextInt(cards.size())));
       
         return hit;
    }
//hitという公開メソッドを作成
   //・setCardは、ArrayListで受けたカード情報をmyCardsに追加するように実装してください。
    public void setcard( ArrayList<Integer>bj){
    for(int b=0;  b<bj.size(); b++){
     this.myCard.add(bj.get(b));
 }
 } 
 //・openは、myCardsのカードの合計値を返却するように実装してください。
     public Integer open(){
     int b=0;
     for (int h=0; h<this.myCard.size(); h++){
     b += this.myCard.get(h); 
     }
     return b;
     }
//・checkSumは、myCardsを確認し、まだカードが必要ならtrue、必要無ければfalseを返却するように実装してください。
     public boolean chackSum(){
         if(open()<16){      
            return true;
         }
         else{
            return false;
         }
     }
 }