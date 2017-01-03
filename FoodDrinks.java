package anna.banana.wayroundsj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodDrinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewitem);

        //create new array list to hold food and drink items
        ArrayList<NewItem> obj = new ArrayList<>();

        //add new items to array
        obj.add(new NewItem("Name", "Description", R.mipmap.ic_launcher));
        obj.add(new NewItem("Name", "Description", R.mipmap.ic_launcher));
        obj.add(new NewItem("Name", "Description", R.mipmap.ic_launcher));
        obj.add(new NewItem("Name", "Description", R.mipmap.ic_launcher));
        obj.add(new NewItem("Name", "Description", R.mipmap.ic_launcher));
        ItemAdapter adapter = new ItemAdapter(this, obj, R.mipmap.ic_launcher);
        ListView listview = (ListView) findViewById(R.id.l1);
        listview.setAdapter(adapter);
    }
}




