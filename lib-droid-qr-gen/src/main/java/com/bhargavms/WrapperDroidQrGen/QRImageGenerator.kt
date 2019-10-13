package com.bhargavms.WrapperDroidQrGen

import android.graphics.Bitmap

import com.mogra.zxing.BarcodeFormat
import com.mogra.zxing.MultiFormatWriter
import com.mogra.zxing.WriterException
import com.mogra.zxing.common.BitMatrix

import android.graphics.Color.BLACK
import android.graphics.Color.WHITE

/**
 * Qr code image generator.
 */
object QRImageGenerator {
    /**
     * Encode the given string to a QR format Bitmap.
     *
     * @param stringToEncode  the string that needs to be encoded into QR format
     * @param preferredWidth  the preferred width in pixels of the Generated Bitmap
     * @param preferredHeight the preferred height in pixels of the Generated Bitmap
     * @return the generated QR formatted Bitmap.
     */
    @JvmStatic
    @Throws(EncodingException::class)
    fun encodeAsBitmap(stringToEncode: String, preferredWidth: Int, preferredHeight: Int): Bitmap {
        try {
            val result = MultiFormatWriter()
                    .encode(stringToEncode, BarcodeFormat.QR_CODE, preferredWidth, preferredHeight, null)
            val width = result.width
            val height = result.height
            val pixels = IntArray(width * height)
            for (y in 0 until height) {
                val offset = y * width
                for (x in 0 until width) {
                    pixels[offset + x] = if (result.get(x, y)) BLACK else WHITE
                }
            }
            val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
            bitmap.setPixels(pixels, 0, width, 0, 0, width, height)
            return bitmap
        } catch (ex: Exception) {
            throw EncodingException()
        }
    }
}
