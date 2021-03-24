public class Deck {
    public static void main(String[] args) {
        String [] CardValue ={
            "2","3","4","5","6","7","8","9","10","Jack","Queen","King", "Ace"
        };
        String[] Suits = {
            "Hearts", "Diamonds", "Spades", "Clubs"
        };
        
        // initialize deck
        int totalCards = Suits.length * CardValue.length;
        String[] deck = new String[totalCards];
        for (int i = 0; i < CardValue.length; i++) {
            for (int j = 0; j < Suits.length; j++) {
                deck[Suits.length*i + j] = CardValue[i] + " of " + Suits[j];
            }
        }

        // shuffle
        for (int i = 0; i < totalCards; i++) {
            int r = i + (int) (Math.random() * (totalCards-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // print shuffled deck
        System.out.println("The five cards drawn are:");
        
        for (int i = 0; i < 5 ; i++) {
            System.out.println(deck[i]);
        }

        

        String card1 = deck[0];
        char c1V = card1.charAt(0);
        String[] c1 = card1.split(" ");
        String c1S = c1[2];
        String card2 = deck[1];
        char c2V = card2.charAt(0);
        String[] c2 = card2.split(" ");
        String c2S = c2[2];
        String card3 = deck[2];
        char c3V = card3.charAt(0);
        String[] c3 = card3.split(" ");
        String c3S = c3[2];
        String card4 = deck[3];
        char c4V = card4.charAt(0);
        String[] c4 = card4.split(" ");
        String c4S = c4[2];
        String card5 = deck[4];
        char c5V = card5.charAt(0);
        String[] c5 = card5.split(" ");
        String c5S = c5[2];
         
        String highestHand;

        if((c1S.equals(c2S)&&c1S.equals(c3S)&&c1S.equals(c4S)&&c1S.equals(c5S))&&(c1V=='A'||c2V=='A'||c3V=='A'||c4V=='A'||c5V=='A')&&(c1V=='K'||c2V=='K'||c3V=='K'||c4V=='K'||c5V=='K')&&(c1V=='Q'||c2V=='Q'||c3V=='Q'||c4V=='Q'||c5V=='Q')&&(c1V=='J'||c2V=='J'||c3V=='J'||c4V=='J'||c5V=='J')&&(c1V=='1'||c2V=='1'||c3V=='1'||c4V=='1'||c5V=='1')){
            highestHand = "royal flush";
        // }else if((c1S.equals(c2S)&&c1S.equals(c3S)&&c1S.equals(c4S)&&c1S.equals(c5S))&&){
        //     highestHand = "straight flush";
        }else if((c1V == c2V && c1V == c3V && c1V == c4V)||(c1V == c2V && c1V == c3V && c1V == c5V)||(c1V == c2V && c1V == c5V && c1V == c4V)||(c1V == c5V && c1V == c3V && c1V == c4V)||(c5V == c2V && c5V == c3V && c5V == c4V)){
            highestHand = "four of a kind";
        }else if(((c1V == c2V && c3V == c1V)&&(c4V==c5V))||((c1V == c2V && c4V ==c1V)&&(c3V==c5V))|| ((c1V == c2V && c5V == c1V)&&(c3V==c4V))|| ((c2V == c3V && c4V == c2V)&&(c1V==c5V))|| ((c2V == c3V && c5V ==c2V)&&(c1V==c4V)) || ((c3V == c4V && c5V ==c3V)&&(c1V==c2V))||((c2V == c4V && c5V ==c2V)&&(c1V==c3V))||((c3V == c4V && c1V ==c3V)&&(c2V==c5V))||((c3V == c5V && c1V ==c3V)&&(c2V==c4V))||((c4V == c5V && c1V ==c4V)&&(c2V==c3V))||((c3V == c5V && c2V ==c3V)&&(c1V==c4V))){
            highestHand = "full house";
        }else if(c1S.equals(c2S)&&c1S.equals(c3S)&&c1S.equals(c4S)&&c1S.equals(c5S)){
            highestHand = "flush";
        // }else if(){
        //     highestHand = "straight";
        }else if((c1V == c2V && c3V == c1V)||(c1V == c2V && c4V ==c1V) || (c1V == c2V && c5V == c1V) || (c2V == c3V && c4V == c2V)|| (c2V == c3V && c5V ==c2V) || (c3V == c4V && c5V ==c3V)||(c2V == c4V && c5V ==c2V)||(c3V == c4V && c1V ==c3V)||(c3V == c5V && c1V ==c3V)||(c4V == c5V && c1V ==c4V)||(c3V == c5V && c2V ==c3V)){
            highestHand = "three of a kind";
        }else if(((c1V==c2V)&&(c3V==c4V||c3V==c5V||c4V==c5V))||((c1V==c3V)&&(c2V==c4V||c2V==c5V||c4V==c5V))||((c1V==c4V)&&(c3V==c2V||c3V==c5V||c2V==c5V))||((c2V==c5V)&&(c3V==c1V||c3V==c4V||c4V==c1V))||((c4V==c2V)&&(c3V==c1V||c3V==c5V||c1V==c5V))||((c3V==c2V)&&(c1V==c4V||c1V==c5V||c4V==c5V))||((c3V==c4V)&&(c1V==c2V||c1V==c5V||c2V==c5V))||((c3V==c5V)&&(c1V==c2V||c1V==c4V||c4V==c2V))||((c4V==c5V)&&(c3V==c1V||c3V==c2V||c1V==c2V))){
            highestHand = "two pair";
        }else if((c1V == c2V)||(c1V == c3V) || (c1V == c4V) || (c1V == c5V)|| (c2V == c3V) || (c2V == c4V) || (c2V == c5V) || (c3V == c4V) || (c3V == c5V) ||(c4V == c5V)){
            highestHand = "one pair";
        }else{
            highestHand = "high card";
        }

        System.out.println("The highest hand is " + highestHand);
    }

}
