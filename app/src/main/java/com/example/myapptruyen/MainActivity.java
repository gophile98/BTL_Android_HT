package com.example.myapptruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import com.example.myapptruyen.adapter.TruyenTranhAdapter;
import com.example.myapptruyen.adapter.api.ApiLayTruyen;
import com.example.myapptruyen.adapter.interfaces.LayTruyenVe;
import com.example.myapptruyen.app.TruyenTranh;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements LayTruyenVe {
    EditText edtTimKiem;

    GridView gdvDSTruyen;
    TruyenTranhAdapter adapter;
    ArrayList<TruyenTranh> truyenTranhArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        anhXa();
        setUp();
        setClick();

        new ApiLayTruyen(this).execute();
    }
    private void setUp() {

        gdvDSTruyen.setAdapter(adapter);
    }

    private void anhXa() {
        gdvDSTruyen = findViewById(R.id.gdvDSTruyen);
        edtTimKiem = findViewById(R.id.edtTimKiem);
    }

    private void setClick() {
        edtTimKiem.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String a = edtTimKiem.getText().toString();
                adapter.searchTruyen(a);


            }
        });

        gdvDSTruyen.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TruyenTranh truyenTranh = truyenTranhArrayList.get(position);
                Bundle b = new Bundle();
                b.putSerializable("truyen", truyenTranh);
                Intent i = new Intent(MainActivity.this, ChapActivity.class);
                i.putExtra("data", b);
                startActivity(i);


            }
        });

    }


    private void init() {
        truyenTranhArrayList = new ArrayList<>();
//        truyenTranhArrayList.add(new TruyenTranh("Kiếm Nghịch Thương Khung","Chapter 159","http://st.nettruyen.com/data/comics/185/kiem-nghich-thuong-khung.jpg"));
//        truyenTranhArrayList.add(new TruyenTranh("Hoàng Hậu Nương Nương Đích Năm Xu Đặc Hiệu","Chapter 187","http://st.nettruyen.com/data/comics/221/hoang-hau-nuong-nuong-dich-nam-xu-dac-hi-5131.jpg"));
//        truyenTranhArrayList.add(new TruyenTranh("Hành trình hậu tận thế","Chapter 91","http://st.nettruyen.com/data/comics/131/hanh-trinh-hau-tan-the.jpg"));
//        truyenTranhArrayList.add(new TruyenTranh("Hiệp Khách Hành bất thông","Chapter 15","http://st.nettruyen.com/data/comics/253/hiep-khach-hanh-bat-thong.jpg"));
//        truyenTranhArrayList.add(new TruyenTranh("Bạn Trai Hắc Đạo Của Tôi","Chapter 242","http://st.nettruyen.com/data/comics/37/ban-trai-hac-dao-cua-toi.jpg"));
//        truyenTranhArrayList.add(new TruyenTranh("Võ Đạo Độc Tôn","Chapter 77","http://st.nettruyen.com/data/comics/228/vo-dao-doc-ton.jpg"));


        adapter = new TruyenTranhAdapter(this, 0, truyenTranhArrayList );


    }

    @Override
    public void batDau() {
        Toast.makeText(this, "Đang lấy về", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void ketThuc(String data) {
        try {
            truyenTranhArrayList.clear();
            JSONArray array =new JSONArray(data);
            for (int i =0; i<array.length();i++){
                JSONObject o = array.getJSONObject(i);
                truyenTranhArrayList.add(new TruyenTranh(o));
            }
            adapter = new TruyenTranhAdapter(this, 0, truyenTranhArrayList );
            gdvDSTruyen.setAdapter(adapter);

        }catch (JSONException e){

        }

    }

    @Override
    public void biLoi() {
        Toast.makeText(this, "Lỗi kết nối", Toast.LENGTH_SHORT).show();

    }
}
