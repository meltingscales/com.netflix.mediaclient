package o;

import java.io.File;
import java.util.List;
import kotlin.Pair;

/* renamed from: o.mw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9300mw {
    public static final C9300mw b = new C9300mw();

    private C9300mw() {
    }

    public static final void e(File file) {
        List<Pair> j;
        File file2 = new File(file, "bugsnag");
        if (!file2.isDirectory()) {
            file2.mkdirs();
        }
        j = C8569dql.j(dpD.a("last-run-info", "last-run-info"), dpD.a("bugsnag-sessions", "sessions"), dpD.a("user-info", "user-info"), dpD.a("bugsnag-native", "native"), dpD.a("bugsnag-errors", "errors"));
        for (Pair pair : j) {
            String str = (String) pair.c();
            File file3 = new File(file, (String) pair.b());
            if (file3.exists()) {
                file3.renameTo(new File(file2, str));
            }
        }
    }
}
