package com.example.gis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    TextView dtnama, dtalamat, dtdeskripsi;
    Button btngo, btnback;
    ImageView dtgambar;
    public static String id, nama, alamat, deskripsi, gambar;
    public static Double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        dtnama = findViewById(R.id.txt_nama);
        dtalamat = findViewById(R.id.txt_alamat);
        dtdeskripsi = findViewById(R.id.txt_deskripsi);
        btngo = findViewById(R.id.btn_go);
        btnback = findViewById(R.id.btn_back);
        dtgambar = findViewById(R.id.img_data);

        dtnama.setText(nama);
        dtalamat.setText(alamat);
        dtdeskripsi.setText(deskripsi);
        Picasso.get().load(gambar).into(dtgambar);

    }
}
