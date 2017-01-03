package anna.banana.wayroundsj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static anna.banana.wayroundsj.R.layout.listviewitem;

/**
 * Created by Anna on 1/2/17.
 */

public class ItemAdapter extends ArrayAdapter<NewItem> {
    private ArrayList<NewItem> obj;

        public ItemAdapter(Context context, ArrayList<NewItem> obj, int imageResource) {
            super(context, 0, obj);
            this.obj = obj;

        }

    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(
                    listviewitem, parent, false);
        }
        NewItem currentItem = obj.get(position);

        if (currentItem !=null) {
            TextView name = (TextView) v.findViewById(R.id.name);
            name.setText(currentItem.getNameDescription());

            TextView desc = (TextView) v.findViewById(R.id.desc);
            desc.setText(currentItem.getDescription());

            ImageView image = (ImageView) v.findViewById(R.id.image);
            image.setId(currentItem.getImageResource());

            if (name != null) {
                name.setText(currentItem.getNameDescription());

            }
            if (desc != null) {
                name.setText(currentItem.getDescription());

            }
            if (image != null) {
                name.setId(currentItem.getImageResource());

            }
        }

        return v;
    }
}