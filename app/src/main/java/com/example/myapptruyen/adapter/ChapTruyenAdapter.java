package com.example.myapptruyen.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapptruyen.R;
import com.example.myapptruyen.app.ChapTruyen;

import java.util.ArrayList;
import java.util.List;

public class ChapTruyenAdapter extends ArrayAdapter<ChapTruyen> {
    private Context ct;
    private ArrayList<ChapTruyen> arr;
    public ChapTruyenAdapter(@NonNull Context context, int resource, @NonNull List<ChapTruyen> objects) {
        super(context, resource, objects);
        this.ct=context;
        this.arr = new ArrayList<>(objects);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_chap_truyen, null);


        }
        if (arr.size()>0){
            TextView txvTenChaps;
            TextView txvNgayUpdata;

            txvTenChaps = convertView.findViewById(R.id.txvTenChaps);
            txvNgayUpdata = convertView.findViewById(R.id.txvNgayUpdata);

            ChapTruyen chapTruyen = arr.get(position);
            txvTenChaps.setText(chapTruyen.getTenChap());
            txvNgayUpdata.setText(chapTruyen.getNgayDang());
        }
        return convertView;
    }
}
