package o;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: o.drw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8607drw {
    public static /* synthetic */ long a(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return e(inputStream, outputStream, i);
    }

    public static final long e(InputStream inputStream, OutputStream outputStream, int i) {
        C8632dsu.c((Object) inputStream, "");
        C8632dsu.c((Object) outputStream, "");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static final byte[] b(InputStream inputStream) {
        C8632dsu.c((Object) inputStream, "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        a(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C8632dsu.a(byteArray, "");
        return byteArray;
    }
}
