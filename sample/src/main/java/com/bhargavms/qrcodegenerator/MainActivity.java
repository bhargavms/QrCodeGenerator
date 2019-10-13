package com.bhargavms.qrcodegenerator;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bhargavms.WrapperDroidQrGen.EncodingException;
import com.bhargavms.WrapperDroidQrGen.QRImageGenerator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String qrString = "blah";
        ImageView imgShowQr = findViewById(R.id.img_show_qr);
        try {
            imgShowQr.setImageBitmap(QRImageGenerator.encodeAsBitmap(qrString, 400, 400));
        } catch (EncodingException e) {
            e.printStackTrace();
        }
    }
}
