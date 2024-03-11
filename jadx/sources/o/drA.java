package o;

import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class drA extends drB {
    public static String b(File file) {
        String c;
        C8632dsu.c((Object) file, "");
        String name = file.getName();
        C8632dsu.a(name, "");
        c = duD.c(name, '.', "");
        return c;
    }

    public static String j(File file) {
        String g;
        C8632dsu.c((Object) file, "");
        String name = file.getName();
        C8632dsu.a(name, "");
        g = duD.g(name, ".", (String) null, 2, (Object) null);
        return g;
    }
}
