package com.keminggris.allam.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button nol;
    private Button satu;
    private Button dua;
    private Button tiga;
    private Button empat;
    private Button lima;
    private Button enam;
    private Button tujuh;
    private Button delapan;
    private Button sembilan;
    private Button tambah;
    private Button kurang;
    private Button kali;
    private Button bagi;
    private Button hapus;
    private Button samadengan;
    private TextView monitor;
    private TextView hasil;
    private final char PENJUMLAHAN = '+';
    private final char PENGURANGAN = '-';
    private final char PERKALIAN = '*';
    private final char PEMBAGIAN = '/';
    private final char SAMADENGAN = '0';
    private double nilai1 = Double.NaN;
    private double nilai2;
    private char AKSI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText().toString() + "0");
            }
        });

        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText().toString() + "1");
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText().toString() + "2");
            }
        });

        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText().toString() + "3");
            }
        });

        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText().toString() + "4");
            }
        });

        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText().toString() + "5");
            }
        });

        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText().toString() + "6");
            }
        });

        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText().toString() + "7");
            }
        });

        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText().toString() + "8");
            }
        });

        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText().toString() + "9");
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung();
                AKSI = PENJUMLAHAN;
                hasil.setText(String.valueOf(nilai1) + "+");
                monitor.setText(null);
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung();
                AKSI = PENGURANGAN;
                hasil.setText(String.valueOf(nilai1) + "-");
                monitor.setText(null);
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung();
                AKSI = PERKALIAN;
                hasil.setText(String.valueOf(nilai1) + "X");
                monitor.setText(null);
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung();
                AKSI = PEMBAGIAN;
                hasil.setText(String.valueOf(nilai1) + "/");
                monitor.setText(null);
            }
        });

        samadengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung();
                AKSI = SAMADENGAN;
                hasil.setText(hasil.getText().toString() + String.valueOf(nilai2) + "=" +String.valueOf(nilai1));
                monitor.setText(null);
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(monitor.getText().length() > 0) {
                    CharSequence name = monitor.getText().toString();
                    monitor.setText(name.subSequence(0, name.length()-1));
                }
                else{
                    nilai1 = Double.NaN;
                    nilai2 = Double.NaN;
                    monitor.setText(null);
                    hasil.setText(null);
                }

            }
        });

    }

    private void setupUIViews(){
        nol = (Button)findViewById(R.id.bt0);
        satu = (Button)findViewById(R.id.bt1);
        dua = (Button)findViewById(R.id.bt2);
        tiga = (Button)findViewById(R.id.bt3);
        empat = (Button)findViewById(R.id.bt4);
        lima = (Button)findViewById(R.id.bt5);
        enam = (Button)findViewById(R.id.bt6);
        tujuh = (Button)findViewById(R.id.bt7);
        delapan = (Button)findViewById(R.id.bt8);
        sembilan = (Button)findViewById(R.id.bt9);
        tambah = (Button)findViewById(R.id.btTam);
        kurang = (Button)findViewById(R.id.btKur);
        kali = (Button)findViewById(R.id.btKal);
        bagi = (Button)findViewById(R.id.btBag);
        hapus = (Button)findViewById(R.id.btDel);
        samadengan = (Button)findViewById(R.id.btSam);
        monitor = (TextView)findViewById(R.id.tvMonitor);
        hasil = (TextView)findViewById(R.id.tvHasil);

    }

    private void hitung(){
        if(!Double.isNaN(nilai1)){
            nilai2 = Double.parseDouble(monitor.getText().toString());

            switch(AKSI){
                case PENJUMLAHAN:
                    nilai1 = nilai1 + nilai2;
                    break;
                case PENGURANGAN:
                    nilai1 = nilai1 - nilai2;
                    break;
                case PERKALIAN:
                    nilai1 = nilai1 * nilai2;
                    break;
                case PEMBAGIAN:
                    nilai1 = nilai1 / nilai2;
                    break;
                case SAMADENGAN:
                    break;
            }
        }
        else{
            nilai1 = Double.parseDouble(monitor.getText().toString());
        }
    }

}
