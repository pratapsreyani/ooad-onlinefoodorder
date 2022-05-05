package application.example.food_ordering_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class checkout extends AppCompatActivity {
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        done = (Button)findViewById(R.id.DONE);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityopenrating();
            }
        });
    }
    public void  openActivityopenrating()
    {
        Intent intent = new Intent(this,Rating.class);
        startActivity(intent);
    }
}