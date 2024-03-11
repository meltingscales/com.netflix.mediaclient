package o;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: o.xR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9831xR {
    public static byte[] c(String str) {
        return a(new File(str.replaceFirst("file://", "")));
    }

    private static byte[] a(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = c(file);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            byte[] e = e(fileInputStream);
            b(fileInputStream);
            return e;
        } catch (Throwable th2) {
            th = th2;
            b(fileInputStream);
            throw th;
        }
    }

    private static FileInputStream c(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            } else if (!file.canRead()) {
                throw new IOException("File '" + file + "' cannot be read");
            } else {
                return new FileInputStream(file);
            }
        }
        throw new FileNotFoundException("File '" + file + "' does not exist");
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static long d(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }
}
