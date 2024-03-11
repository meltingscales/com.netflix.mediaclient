package o;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes5.dex */
public final class drJ {
    public static final dtQ<String> e(BufferedReader bufferedReader) {
        dtQ<String> n;
        C8632dsu.c((Object) bufferedReader, "");
        n = dtY.n(new drD(bufferedReader));
        return n;
    }

    public static final String e(Reader reader) {
        C8632dsu.c((Object) reader, "");
        StringWriter stringWriter = new StringWriter();
        c(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        C8632dsu.a(stringWriter2, "");
        return stringWriter2;
    }

    public static /* synthetic */ long c(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return e(reader, writer, i);
    }

    public static final long e(Reader reader, Writer writer, int i) {
        C8632dsu.c((Object) reader, "");
        C8632dsu.c((Object) writer, "");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static final void e(Reader reader, drM<? super String, dpR> drm) {
        C8632dsu.c((Object) reader, "");
        C8632dsu.c((Object) drm, "");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            for (String str : e(bufferedReader)) {
                drm.invoke(str);
            }
            dpR dpr = dpR.c;
            C8608drx.a(bufferedReader, null);
        } finally {
        }
    }
}
