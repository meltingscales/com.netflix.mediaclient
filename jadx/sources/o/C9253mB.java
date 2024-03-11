package o;

import android.content.pm.ApplicationInfo;
import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: o.mB  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9253mB {
    public static final C9253mB d = new C9253mB();

    private C9253mB() {
    }

    public final String a(ApplicationInfo applicationInfo) {
        byte[] e;
        try {
            e = e(applicationInfo);
        } catch (Throwable unused) {
        }
        if (e == null) {
            return null;
        }
        return C9254mC.a(e);
    }

    private final byte[] e(ApplicationInfo applicationInfo) {
        File file = new File(applicationInfo.sourceDir);
        if (file.canRead()) {
            return e(file);
        }
        return null;
    }

    public final byte[] e(File file) {
        C9253mB c9253mB;
        byte[] a;
        ZipFile zipFile = new ZipFile(file, 1);
        try {
            ZipEntry entry = zipFile.getEntry("classes.dex");
            if (entry == null) {
                C8608drx.a(zipFile, null);
                return null;
            }
            byte[] a2 = d.a(zipFile, entry);
            if (a2 == null) {
                C8608drx.a(zipFile, null);
                return null;
            }
            int i = 2;
            while (true) {
                ZipEntry entry2 = zipFile.getEntry("classes" + i + ".dex");
                if (entry2 == null || (a = (c9253mB = d).a(zipFile, entry2)) == null) {
                    break;
                }
                c9253mB.e(a2, a);
                i++;
            }
            C8608drx.a(zipFile, null);
            return a2;
        } finally {
        }
    }

    private final void e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - 1;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            if (i2 > length) {
                return;
            }
            i = i2;
        }
    }

    private final byte[] a(ZipFile zipFile, ZipEntry zipEntry) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            byte[] bArr = new byte[32];
            byte[] e = inputStream.read(bArr, 0, 32) == 32 ? d.e(bArr) : null;
            C8608drx.a(inputStream, null);
            return e;
        } finally {
        }
    }

    public final byte[] e(byte[] bArr) {
        byte[] c;
        if (d(bArr)) {
            c = C8564dqg.c(bArr, 12, 32);
            return c;
        }
        return null;
    }

    private final boolean d(byte[] bArr) {
        return (bArr[0] & 255) == 100 && (bArr[1] & 255) == 101 && (bArr[2] & 255) == 120 && (bArr[3] & 255) == 10 && (bArr[7] & 255) == 0;
    }
}
