package application.example.food_ordering_app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.w3c.dom.Text;
import java.util.List;
public class cart extends AppCompatActivity {
    Button cart_action,checkout;
    TextView e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Globals globals = Globals.getInstance();
        List<String> cart_list = globals.getMyVar();
        cart_action = (Button)findViewById(R.id.cart);
        e1 = (TextView) findViewById(R.id.get_items);
        checkout = (Button)findViewById(R.id.checkout);
        cart_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cart_string = "";
                if(cart_list.size() == 0)
                {
                    e1.setText("no item selected");
                }
                else {
                    for (String items : cart_list) {
                        cart_string = cart_string + items + "\n";
                    }
                    int final_cost = globals.getCost();
                    e1.setText(cart_string + "\n" + "FINAL COST" + "\n" + final_cost);
                }
            }
        });
        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitycheckout();
            }
        });
    }
    public void  openActivitycheckout()
    {
        Intent intent = new Intent(this,checkout.class);
        startActivity(intent);
    }
}