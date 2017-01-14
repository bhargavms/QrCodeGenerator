# QrCodeGenerator
QR code encoding stolen from ZXING, encode strings into QR code bitmaps!

## Module QRImageGenerator:

### Adding to your project:

Put the below line in the application module's build.gradle file's dependencies block

```groovy
compile 'com.bhargavms:lib-droid-qr-gen:1.0.1'
```
And you're set!

### Generating a Bitmap from a QRCode String:

```java
try {
    QRImageGenerator imageGenerator = new QRImageGenerator();
    Bitmap bm = imageGenerator.encodeAsBitmap(qrString, 400, 400);
} catch (WriterException e) {
    e.printStackTrace();
}
```
Thats it for now, if you want more features, welll....! request for it by opening an issue right here on the [ISSUES SECTION][1]


  [1]: https://github.com/bhargavms/QrCodeGenerator/issues