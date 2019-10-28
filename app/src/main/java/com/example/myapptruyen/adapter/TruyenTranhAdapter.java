package com.example.myapptruyen.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.myapptruyen.R;
import com.example.myapptruyen.app.TruyenTranh;

import java.util.ArrayList;
import java.util.List;

public class TruyenTranhAdapter  extends ArrayAdapter<TruyenTranh> {
    private Context ct;
    private ArrayList<TruyenTranh>arrayList;

    public TruyenTranhAdapter(@NonNull Context context, int resource, @NonNull List<TruyenTranh> objects) {
        super(context, resource, objects);
        this.ct = context;
        this.arrayList = new ArrayList<>(objects);
    }

    public void searchTruyen(String s){
        s =s.toUpperCase();
        int k= 0;
        for (int i=0;i<arrayList.size();i++){
            TruyenTranh t = arrayList.get(i);
            String ten= t.getTenTruyen().toUpperCase();
            if (ten.indexOf(s)>=0){
                arrayList.set(i,arrayList.get(k));
                arrayList.set(k,t);
                k++;
            }
        }
        notifyDataSetChanged();

    }


    @NonNull

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_truyen,null);


        }
        if (arrayList.size()>0){
            TruyenTranh truyenTranh = this.arrayList.get(position);
            TextView tenTruyen = convertView.findViewById(R.id.txvTenTruyen);
            TextView tenChap = convertView.findViewById(R.id.txvTenChap);
            ImageView imgAnhTruyen = convertView.findViewById(R.id.imgAnhTruyen);

            tenTruyen.setText(truyenTranh.getTenTruyen());
            tenChap.setText(truyenTranh.getTenChap());
            Glide.with(this.ct).load(truyenTranh.getLinkAnh()).into(imgAnhTruyen);

        }
        return convertView;
    }
}
