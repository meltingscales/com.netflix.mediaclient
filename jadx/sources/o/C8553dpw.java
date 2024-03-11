package o;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dpw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8553dpw {
    public static String b(Throwable th) {
        C8632dsu.c((Object) th, "");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        C8632dsu.a(stringWriter2, "");
        return stringWriter2;
    }

    public static void c(Throwable th, Throwable th2) {
        C8632dsu.c((Object) th, "");
        C8632dsu.c((Object) th2, "");
        if (th != th2) {
            C8596drl.a.c(th, th2);
        }
    }

    public static List<Throwable> d(Throwable th) {
        C8632dsu.c((Object) th, "");
        return C8596drl.a.e(th);
    }
}
