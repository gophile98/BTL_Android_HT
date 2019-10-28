package com.example.myapptruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapptruyen.adapter.ChapTruyenAdapter;
import com.example.myapptruyen.app.ChapTruyen;
import com.example.myapptruyen.app.TruyenTranh;

import java.util.ArrayList;

public class ChapActivity extends AppCompatActivity {
    TextView txvTenTruyens;
    ImageView imgAnhTruyens;
    TruyenTranh truyenTranh;
    ListView lvDanhSachChap;
    ArrayList<ChapTruyen> arrChap;
    ChapTruyenAdapter chapTruyenAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap);
        init();
        anhxa();
        setUp();
        setClick();
        
    }

    private void setClick() {
        lvDanhSachChap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(ChapActivity.this, DocTruyenActivity.class));


            }
        });
    }

    private void setUp() {
        txvTenTruyens.setText(truyenTranh.getTenTruyen());
        Glide.with(this).load(truyenTranh.getLinkAnh()).into(imgAnhTruyens);

        lvDanhSachChap.setAdapter(chapTruyenAdapter);
    }

    private void anhxa() {
        imgAnhTruyens = findViewById(R.id.imgAnhTruyens);
        txvTenTruyens = findViewById(R.id.txvTenTruyens);
        lvDanhSachChap = findViewById(R.id.lvDanhSachChap);
    }

    private void init(){
        Bundle b = getIntent().getBundleExtra("data");
        truyenTranh =(TruyenTranh) b.getSerializable("truyen");


        //tao du lieu ao
        arrChap = new ArrayList<>();
        for (int i=1; i<2;i++){
            arrChap.add(new ChapTruyen("Chap "+i, "28-10-2019"));
        }
        chapTruyenAdapter = new ChapTruyenAdapter(this, 0, arrChap);

    }
}
