package com.bhargavms.lib_droid_wrapper;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.WHITE;

/**
 * Qr code image generator.
 */
public class QRImageGenerator {
    /**
     * Encode the given string to a QR format Bitmap.
     *
     * @param stringToEncode  the string that needs to be encoded into QR format
     * @param preferredWidth  the preferred width in pixels of the Generated Bitmap
     * @param preferredHeight the preferred height in pixels of the Generated Bitmap
     * @return the generated QR formatted Bitmap.
     */
    public Bitmap encodeAsBitmap(String stringToEncode, int preferredWidth, int preferredHeight) throws WriterException {
        BitMatrix result;
        result = new MultiFormatWriter()
                .encode(stringToEncode, BarcodeFormat.QR_CODE, preferredWidth, preferredHeight, null);
        int width = result.getWidth();
        int height = result.getHeight();
        int[] pixels = new int[width * height];
        for (int y = 0; y < height; y++) {
            int offset = y * width;
            for (int x = 0; x < width; x++) {
                pixels[offset + x] = result.get(x, y) ? BLACK : WHITE;
            }
        }
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmap.setPixels(pixels, 0, width, 0, 0, width, height);
        return bitmap;
    }
}
