/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
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
//　５．ブラックジャックの準備は整いました。ゲームが成り立つよう、２つのクラスを利用してコーディングしてみてください。abstract 

    abstract public class human {
    abstract public Integer open();
    abstract public boolean chackSum();
    abstract public void setcard( ArrayList<Integer>bj);
    ArrayList<String>myCard= new ArrayList<>();
   }  
