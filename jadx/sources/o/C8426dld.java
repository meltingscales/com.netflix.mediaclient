package o;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: o.dld  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8426dld {
    public static byte[] d(InputStream inputStream, int i) {
        if (i == -1) {
            i = 8192;
        }
        if (i < 128) {
            throw new IllegalArgumentException("Buffer size should be at least 128");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
