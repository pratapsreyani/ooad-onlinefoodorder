package application.example.food_ordering_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class type_of_food extends AppCompatActivity {
    Button indian, italian, thai, chinese, mexican,see_your_cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_food);

        indian = (Button)findViewById(R.id.indian);
        italian = (Button)findViewById(R.id.italian);
        thai = (Button)findViewById(R.id.thai);
        chinese = (Button)findViewById(R.id.chinese);
        mexican = (Button)findViewById(R.id.mexican);

        indian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityIndian();
            }
        });
        see_your_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitycart();
            }
        });
    }

    public void  openActivityIndian()
    {
        Intent intent = new Intent(this,Indian.class);
        startActivity(intent);
    }

    public void  openActivitycart()
    {
        Intent intent = new Intent(this,cart.class);
        startActivity(intent);
    }

}