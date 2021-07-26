package sg.edu.rp.c346.id19048236.myndpsongs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Song> songs;

    public CustomAdapter(Context context, int resource, ArrayList<Song> objects){
        super(context,resource,objects);
        parent_context=context;
        layout_id=resource;
        songs=objects;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewSongTitle);
        TextView tvSingers = rowView.findViewById(R.id.textViewSingers);
        TextView tvYR=rowView.findViewById(R.id.textViewYearR);
        TextView tvStars= rowView.findViewById(R.id.textViewStars);

        Song currentVersion = songs.get(position);

        tvName.setText(currentVersion.getTitle());
        tvSingers.setText(currentVersion.getSingers());
        tvYR.setText(currentVersion.getYearReleased());
        tvStars.setText(currentVersion.getStars());

        return rowView;
    }

}
