package o;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public final class aPD {
    public static final String c(Throwable th) {
        C8632dsu.c((Object) th, "");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        C8632dsu.a(stringWriter2, "");
        return stringWriter2;
    }
}
