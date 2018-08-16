package com.samarpitha.shara.kannadalanguage;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class KannadaAdapter extends ArrayAdapter<Kannada> {
    public KannadaAdapter(@NonNull Context context, @NonNull List<Kannada> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }
        Kannada currentmusic = getItem(position);
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_id);
        iconView.setImageResource(currentmusic.getImageid());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.Kannada_name);
        numberTextView.setText(currentmusic.getKannadaWords());
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.English_name);
        nameTextView.setText(currentmusic.getEnglishWords());
        return listItemView;
    }
}
