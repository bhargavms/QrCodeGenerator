package com.bhargavms.qrcodegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bhargavms.lib_droid_wrapper.QRImageGenerator;
import com.google.zxing.WriterException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String qrString = "blah";
        ImageView imgShowQr = (ImageView) findViewById(R.id.img_show_qr);
        try {
            QRImageGenerator imageGenerator = new QRImageGenerator();
            imgShowQr.setImageBitmap(imageGenerator.encodeAsBitmap(qrString, 400, 400));
        } catch (WriterException e) {
            e.printStackTrace();
        }
    }
}
