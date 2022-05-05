package application.example.food_ordering_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button registration;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registration = (Button)findViewById(R.id.btn_register);
        login = (Button)findViewById(R.id.btn_login);

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRegistration();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLogin();
            }
        });
    }


    public void  openActivityRegistration()
    {
        Intent intent = new Intent(this,registration.class);
        startActivity(intent);
    }


    public void openActivityLogin() {
        Intent intent = new Intent(this,login.class);
        startActivity(intent);


    }



}