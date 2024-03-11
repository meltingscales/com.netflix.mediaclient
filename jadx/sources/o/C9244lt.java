package o;

import java.io.Closeable;
import java.io.File;
import java.io.Reader;
import java.io.Writer;

/* renamed from: o.lt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C9244lt {
    C9244lt() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(Reader reader, Writer writer) {
        char[] cArr = new char[4096];
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                break;
            }
            writer.write(cArr, 0, read);
            j += read;
        }
        if (j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(File file, InterfaceC9200lB interfaceC9200lB) {
        try {
            if (file.delete()) {
                return;
            }
            file.deleteOnExit();
        } catch (Exception e) {
            interfaceC9200lB.e("Failed to delete file", e);
        }
    }
}
