package application.example.food_ordering_app;
import java.util.ArrayList;
import java.util.List;
public class Globals {
    private static Globals globalsInstance = new Globals();
    public static Globals getInstance() {
        return globalsInstance;
    }
   public static List<String> cart_items = new ArrayList<String>();
    public static int cost = 0;
    private Globals() {}
    public List<String> getMyVar() {
        return cart_items;
    }
    public void setMyVar(String myVar) {
        cart_items.add(myVar);
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int v) {
        cost = cost + v;
    }
}
