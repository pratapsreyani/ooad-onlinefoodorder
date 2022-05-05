package application.example.food_ordering_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;


public class Indian extends AppCompatActivity {

    ImageButton dal_rice,biryani,pnb;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);


        dal_rice = (ImageButton)findViewById(R.id.dal_rice);
        biryani = (ImageButton)findViewById(R.id.biryani);
        pnb = (ImageButton)findViewById(R.id.pnb);

        dal_rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitydal_rice();
            }
        });

        biryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitybiryani();
            }
        });
        pnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitypnb();
            }
        });

    }

    public void  openActivitydal_rice()
    {
        Intent intent = new Intent(this,dal_rce.class);
        startActivity(intent);
    }
    public void  openActivitybiryani()
    {
        Intent intent = new Intent(this,biryani.class);
        startActivity(intent);
    }

    public void  openActivitypnb()
    {
        Intent intent = new Intent(this,pnb.class);
        startActivity(intent);
    }
}