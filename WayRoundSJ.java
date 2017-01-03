package anna.banana.wayroundsj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class WayRoundSJ extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_way_round_sj);
        Button b1 = (Button) findViewById(R.id.fD);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFoodDrinks(v);
            }
        });
        Button b2 = (Button) findViewById(R.id.fD);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFunFunk(v);
            }
        });
        Button b3 = (Button) findViewById(R.id.fD);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocalSites(v);
            }
        });
    }
    public void openFoodDrinks(View view) {
        Intent i = new Intent(this, FoodDrinks.class);
        startActivity(i);
    }
    public void openFunFunk(View view) {
        Intent i = new Intent(this, FunFunk.class);
        startActivity(i);
    }
    public void openLocalSites(View view) {
        Intent i = new Intent(this, LocalSites.class);
        startActivity(i);
    }
}
