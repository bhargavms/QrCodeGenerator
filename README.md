# QrCodeGenerator
QR code encoding stolen from ZXING, encode strings into QR code bitmaps!
## Module `lib-droid-qr-gen`:

### Adding to your project:

Put the below line in the application module's build.gradle file's dependencies block

```groovy
compile 'com.bhargavms:lib-droid-qr-gen:2.0'
```
And you're set!

### Generating a Bitmap from a QRCode String:

```java
QRImageGenerator imageGenerator = new QRImageGenerator();
try {
    Bitmap bm = imageGenerator.encodeAsBitmap(qrString, 400, 400);
} catch (WriterException e) {
    // TODO: Handle the error.
}
```
Thats it for now, if you want more features, welll....! request for it by opening an issue right here on the [ISSUES SECTION][1]

## Module `lib-zxing-qr-gen`:

> This is the set of classes taken directly from `ZXING`, only the part that encodes to QR format.

### Adding to your project:

```groovy
compile 'com.bhargavms:lib-zxing-qr-gen:2.0'
```

  [1]: https://github.com/bhargavms/QrCodeGenerator/issues
