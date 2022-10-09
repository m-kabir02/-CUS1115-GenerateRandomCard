import java.util.*;
public class RandomCardGenerate
{
    public static void main (String[] args)
    {
        //you can randomly generate a card using case and switch.
// the first will randomly choose a faceValue for a card 1 through 13 where 11 is Jack 12 is Queen and 13 is King. 1 is Ace
//the second case and switch is the suitValue for a card 1 is HEARTS, 
//2 is SPADES 3 is DIAMONDS 4 is CLUBS

        int faceValue=(int)(13*Math.random())+1;
//chooses random value between 1 and 13
                int suitValue=(int)(4*Math.random())+1;
//chooses random value between 1 and 4

                switch(faceValue)
                {
                case 1:
                {
                System.out.print("Ace of ");
                break;
                }
                case 2:
                {
                System.out.print("Two of ");
                break;
                }
                case 3:
                {
                System.out.print("Three of ");
                break;
                }
                case 4:
                {
                System.out.print("Four of ");
                break;
                }
                case 5:
                {
                System.out.print("Five of ");
                break;
                }
                case 6:
                {
                System.out.print("Six of ");
                break;
                }
                case 7:
                {
                System.out.print("Seven of ");
                break;
                }
                case 8:
                {
                System.out.print("Eight of ");
                break;
                }
                case 9:
                {
                System.out.print("Nine of ");
                break;
                }
                case 10:
                {
                System.out.print("Ten of ");
                break;
                }
                case 11:
                {
                System.out.print("Jack of ");
                break;
                }
                case 12:
                {
                System.out.print("Queen of ");
                break;
                }
                case 13:
                {
                System.out.print("King of ");
                break;
                }
default:
        System.out.print("INVALID FaceValue for the card ");
        }
        switch(suitValue)
        {
        case 1:
        {
        System.out.println("HEARTS");
        break;
        }
        case 2:
        {
        System.out.println("SPADES");
        break;
        }
        case 3:
        {
        System.out.println("DIAMONDS");
        break;
        }
        case 4:
        {
        System.out.println("CLUBS");
        break;
        }
default:
        System.out.println("INVALID suitValue for the card");
        }}}
         /*
                 * Three of SPADES*
                 */