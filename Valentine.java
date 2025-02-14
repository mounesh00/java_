import java.util.Scanner;

public class Valentine{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       // String name;
       // String favPlace;
        String message;
       System.out.println("Enter your Name: ");
       String name=sc.nextLine();
       System.out.println("Enter your Favourite Place: ");
       String favPlace=sc.nextLine();
        int times=0;
        System.out.println("Welcome to Valentine Day Dear. I am here to vanish your loneliness. Enter zero to stop me.");

        while(true){
            System.out.println("Enter a message: ");
            message=sc.nextLine();

            if(message.equals("0")){
                System.out.println("Bye dear. Take care of yourself.\nSee you soon. Love you "+name+".");
                break;
            }
            times++;

            switch(message){
                case "hi":
                    System.out.println("Hello baby! I was just waiting for your message.");
                    break;
                case "How are you?":
                    System.out.println("I am fine Shona. What about you?");
                    break;
                case "I am missing you a lot baby.":
                    System.out.println("I am also missing you ");
                    break;
                case "I just want to meet you.":
                    System.out.println("Yes baby. We will meet and spend some time together.");
                    break;
                case "Where can we meet baby?":
                    System.out.println("Baby we will meet near View Ponit and you should pick up from my home.");
                    break;
                case "Yeah baby,I will be there in 5 minutes.":
                    System.out.println("Come safely my love. I am eagar to meet you on this auspicious day.");
                    break;
                case "What do you like to have baby?":
                    System.out.println("Like some chocolate pastry.");
                    break;
                case "Yeah I will bring that with a surprise!":
                    System.out.println("Surprise???");
                    break;
                case "Yes baby. I have a surprise for you.":
                    System.out.println("What is that baby? I want to hear it.");
                    break;
                case "No baby. If I reveal it then my surprise fades away.":
                    System.out.println("Ohhh! Fine babu. I like Surprises<3<3<3");
                    break;
                case "Yeah baby.":
                    System.out.println("How are you coming?");
                    break;
                case "Like my friend gonna drop me by his car.":
                    System.out.println("Then let him drive the car and we will be connected online Sonu. Because I don't to leave you for a second. You're so precious for me, my love<3<3");
                    break;
                case "Oh! so nice of you.":
                    System.out.println("Yes bangara.");
                    break;
                case "Baby I was thinking of us going to Goa for this Valentine.":
                    System.out.println("Yes baby. I am also a lot excited but don't know whether my parents will allow or not bangara.");
                    break;
                case "Ha baby. Try to convince them.":
                    System.out.println("Yes "+name);
                    break;
                case "Baby,you're just beautiful like a Taj Mahal.":
                    System.out.println("Thank you baby. I am not beautiful as you think. I think you need a pair of spects(LOL)");
                    break;
                case "No baby. You won't notice your beauty. I just love you.":
                    System.out.println("Love you to the square of infinity Bangara<3<3");
                    break;
                case "Baby I came to your place.":
                    System.out.println("Ohhh! Wait I am coming to the balcony.");
                    break;
                case "Baby,how am I looking?":
                    System.out.println("You're just looking like a K-Drama actor. You're my hero baby.");
                    break;
                case "Thank you. I love you.":
                    System.out.println("Love you too "+name);
                    break;
                default:
                    System.out.println("Okay baby take care. Love You "+name+".Will catch you later.");
            }
        }sc.close();
    }
}