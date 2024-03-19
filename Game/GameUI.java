package InterfacesDemo.Game;
import java.util.ArrayList;
import java.util.Scanner;

public class GameUI {
    public static void main(String[] args){
        IsSavable k1 = new King("Henry the King", 2,"one at a time in any direction", "black");
        IsSavable q1 = new Queen("Elizabeth the Queen", 6, "any direction as far", "white");
        saveObject(k1);
        saveObject(q1);
    }

    public void increaseDecrease(IsSavable king, IsSavable queen){

    }

    public static void saveObject(IsSavable iso){
        for(int i = 0; i > iso.write().size() + 1; i++){
            System.out.println(iso.write().get(i));
        }
    }

    public void increasePoint(IsSavable iso){

    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Choose 1 to enter a string or 0 to quit");
        int choice = scanner.nextInt();
        int index = 0;
        while(choice != 0) {
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    /**
     * loading method is going to call readValues()
     * then, call read(List<String> listOfSavedValues);
     * @param isobj
     */

    public static void loading (IsSavable isobj){
        ArrayList<String> chris = readValues();
        isobj.read(chris);
    }

    public void winLoseOrTie(King k, Queen q){
        if (k.getPoints() > q.getPoints()){
            System.out.println("King wins!");
        }else if(q.getPoints() > k.getPoints()){
            System.out.println("Queen wins!");
        }else{
            System.out.println("It's a tie.");
        }
    }
}
