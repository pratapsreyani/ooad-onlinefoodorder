package application.example.food_ordering_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class biryani extends AppCompatActivity {

    Button add_to_cart,syc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biryani);

        add_to_cart = (Button)findViewById(R.id.add_to_cart_b);
        syc = (Button)findViewById(R.id.check_cart_b);

        add_to_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                func();
            }
        });

        syc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                func1();
            }
        });


    }

    public void func()
    {
        Globals globals = Globals.getInstance();
        globals.setMyVar("BIRYANI");
        globals.setCost(125);

        Toast.makeText(getApplicationContext(),
                "ADDED TO THE CART!!",
                Toast.LENGTH_LONG)
                .show();
    }


    public void func1()
    {
        Intent intent = new Intent(this,cart.class);
        startActivity(intent);
    }
}