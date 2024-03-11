package o;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes5.dex */
public class drC extends drE {
    public static byte[] d(File file) {
        C8632dsu.c((Object) file, "");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArr = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int read = fileInputStream.read(bArr, i3, i2);
                if (read < 0) {
                    break;
                }
                i2 -= read;
                i3 += read;
            }
            if (i2 > 0) {
                bArr = Arrays.copyOf(bArr, i3);
                C8632dsu.a(bArr, "");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    C8609dry c8609dry = new C8609dry(8193);
                    c8609dry.write(read2);
                    C8607drw.a(fileInputStream, c8609dry, 0, 2, null);
                    int size = c8609dry.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] d = c8609dry.d();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    C8632dsu.a(copyOf, "");
                    bArr = C8564dqg.d(d, copyOf, i, 0, c8609dry.size());
                }
            }
            C8608drx.a(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C8608drx.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void e(File file, byte[] bArr) {
        C8632dsu.c((Object) file, "");
        C8632dsu.c((Object) bArr, "");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            dpR dpr = dpR.c;
            C8608drx.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final String c(File file, Charset charset) {
        C8632dsu.c((Object) file, "");
        C8632dsu.c((Object) charset, "");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String e = drJ.e(inputStreamReader);
            C8608drx.a(inputStreamReader, null);
            return e;
        } finally {
        }
    }

    public static /* synthetic */ String c(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C8674dui.i;
        }
        return c(file, charset);
    }

    public static /* synthetic */ void a(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C8674dui.i;
        }
        b(file, str, charset);
    }

    public static final void b(File file, String str, Charset charset) {
        C8632dsu.c((Object) file, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) charset, "");
        byte[] bytes = str.getBytes(charset);
        C8632dsu.a(bytes, "");
        e(file, bytes);
    }

    public static final void d(File file, Charset charset, drM<? super String, dpR> drm) {
        C8632dsu.c((Object) file, "");
        C8632dsu.c((Object) charset, "");
        C8632dsu.c((Object) drm, "");
        drJ.e(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), drm);
    }

    public static /* synthetic */ List e(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C8674dui.i;
        }
        return d(file, charset);
    }

    public static final List<String> d(File file, Charset charset) {
        C8632dsu.c((Object) file, "");
        C8632dsu.c((Object) charset, "");
        final ArrayList arrayList = new ArrayList();
        d(file, charset, new drM<String, dpR>() { // from class: kotlin.io.FilesKt__FileReadWriteKt$readLines$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void c(String str) {
                C8632dsu.c((Object) str, "");
                arrayList.add(str);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(String str) {
                c(str);
                return dpR.c;
            }
        });
        return arrayList;
    }
}
