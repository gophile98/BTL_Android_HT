package com.example.myapptruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DocTruyenActivity extends AppCompatActivity {
    ImageView imgAnh;
    ArrayList<String> arrUrlAnh;
    int soTrang, soTrangDangDoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_truyen);

        init();
        anhXa();
        setUp();
        setClick();
    }

    private void setClick() {
    }

    private void setUp() {
        docTheoTrang(0);
    }

    private void anhXa() {
        imgAnh = findViewById(R.id.imgAnh);
    }

    private void init() {
        arrUrlAnh = new ArrayList<>();
        arrUrlAnh.add("https://lh3.googleusercontent.com/-PIgDFdQ5vc4/We6-jKoKzRI/AAAAAAABeLI/CJatlZbfUFIKBOdpHbgWpJIQ_dc9u3IpgCLcBGAs/s0/hhnndnxdh-a3manga-1+%281%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-fLJNzhCijQY/We6-k0GGOVI/AAAAAAABeL0/inc0cjkt5o4AvujJwoOu--NBrgvCkyoqQCLcBGAs/s0/hhnndnxdh-a3manga-1+%282%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-laf2ysxW8hM/We6-l3IiyKI/AAAAAAABeMU/z5OlvstnyIwnG_dhnCLnDAm_ft_sF1wugCLcBGAs/s0/hhnndnxdh-a3manga-1+%283%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-XGjS8lmWmio/We6-mLZMERI/AAAAAAABeMY/y4Yo9R5SUHQp0bQMQgXyzD8hQ9sVQEIVwCLcBGAs/s0/hhnndnxdh-a3manga-1+%284%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-yoiIapr2KRE/We6-mVlKIUI/AAAAAAABeMc/_c-Epkjw9LUcdwKd2ex9Ot1J4hx6i7kXACLcBGAs/s0/hhnndnxdh-a3manga-1+%285%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-h_HIZoPjlnM/We6-mf_r2sI/AAAAAAABeMg/L75xkUIHQ5cxeJeHq8TlKJRUJhgkGEajACLcBGAs/s0/hhnndnxdh-a3manga-1+%286%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-ArXBUHDfEM4/We6-mmHT2zI/AAAAAAABeMo/NE_3YqXvlrY8Fjbae0q381sstxKh4axKwCLcBGAs/s0/hhnndnxdh-a3manga-1+%287%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-JfqAUVb5FIE/We6-mnGiKaI/AAAAAAABeMk/2oNFoo8bVcAvyItOEE-f38-jkun43BpbgCLcBGAs/s0/hhnndnxdh-a3manga-1+%288%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-Ae9nIOXU5z4/We6-mwhR2JI/AAAAAAABeMs/8jok-0bPdCM0E9eL1Wddu8aNIajUHvYlwCLcBGAs/s0/hhnndnxdh-a3manga-1+%289%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-Ae9nIOXU5z4/We6-mwhR2JI/AAAAAAABeMs/8jok-0bPdCM0E9eL1Wddu8aNIajUHvYlwCLcBGAs/s0/hhnndnxdh-a3manga-1+%289%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-Nyw8l-QvWK4/We6-kNk22DI/AAAAAAABeLo/9ke63ZY19lAZdYGDWw6WNHY5DfGrs0GwACLcBGAs/s0/hhnndnxdh-a3manga-1+%2817%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-2jA0_HTZBys/We6-kgtKmrI/AAAAAAABeLs/WcHarUZAerwy6PeBCgSASqh724sDQ8FyACLcBGAs/s0/hhnndnxdh-a3manga-1+%2818%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-2jA0_HTZBys/We6-kgtKmrI/AAAAAAABeLs/WcHarUZAerwy6PeBCgSASqh724sDQ8FyACLcBGAs/s0/hhnndnxdh-a3manga-1+%2818%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-KmIsa1R-bsw/We6-kqpcwcI/AAAAAAABeLw/NlhCha7U3uEf8iYGJM0y6olfOmetWpuyACLcBGAs/s0/hhnndnxdh-a3manga-1+%2819%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-9t7jtyRIDGA/We6-k-BQfPI/AAAAAAABeL4/Jl78f-fsk6wC9CmtSPFpAU3GLaoknsUmACLcBGAs/s0/hhnndnxdh-a3manga-1+%2820%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-eo7SVdbY7P8/We6-lLM1utI/AAAAAAABeL8/Ptac3Me0YQQvwOmeVplxdsCHsnVnHkQrgCLcBGAs/s0/hhnndnxdh-a3manga-1+%2821%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-9Fg1oIgLeBc/We6-laoF6cI/AAAAAAABeMA/gRDRxNMONzoFAm6ojJZEC3tfQgdRqxbvACLcBGAs/s0/hhnndnxdh-a3manga-1+%2822%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-4bu_5JiY4H4/We6-lc_KIHI/AAAAAAABeME/_F0_7lOFDngQEYmoa9Rt2eJZbvAa5ulMACLcBGAs/s0/hhnndnxdh-a3manga-1+%2823%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-SEBI3EMp5yU/We6-lfslvdI/AAAAAAABeMI/5CTk6N19_jkCGXD0pM0h83NUkc_toUpiQCLcBGAs/s0/hhnndnxdh-a3manga-1+%2824%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-B8Imou-iG0k/We6-l2w9mxI/AAAAAAABeMM/odjJ-YUiDmcPATnJeLBp3c8v0uOF4fdQwCLcBGAs/s0/hhnndnxdh-a3manga-1+%2825%29.jpg");
        arrUrlAnh.add("https://lh3.googleusercontent.com/-B8Imou-iG0k/We6-l2w9mxI/AAAAAAABeMM/odjJ-YUiDmcPATnJeLBp3c8v0uOF4fdQwCLcBGAs/s0/hhnndnxdh-a3manga-1+%2825%29.jpg");
//        arrUrlAnh.add("");
//        arrUrlAnh.add("");
        ///
        soTrangDangDoc = 1;
        soTrang = arrUrlAnh.size();


    }
    private void docTheoTrang(int i){
        soTrangDangDoc = soTrangDangDoc + i;
        if(soTrangDangDoc == 0){
            soTrangDangDoc =1;
        }
        if (soTrangDangDoc > soTrang){
            soTrangDangDoc = soTrang;
        }
        Glide.with(this).load(arrUrlAnh.get(soTrangDangDoc - 1)).into(imgAnh);

    }

    public void right(View view) {
        docTheoTrang(1);
    }

    public void left(View view) {
        docTheoTrang(-1);
    }
}
