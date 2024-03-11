package o;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC4360bcz;

/* renamed from: o.bcp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4350bcp {
    @SuppressLint({"StaticFieldLeak"})
    private static InterfaceC4360bcz.e c;
    private static List<InterfaceC5085bsB> d = Collections.synchronizedList(new ArrayList());
    @SuppressLint({"StaticFieldLeak"})
    private static InterfaceC5085bsB e;

    public static InterfaceC4360bcz.e e() {
        return c;
    }

    public static void c(InterfaceC5085bsB interfaceC5085bsB) {
        InterfaceC5085bsB c2 = c();
        if (c2 != null && interfaceC5085bsB.c().equals(c2.c())) {
            C1044Mm.c("PlaybackSessionHolderHelper", "resetLastActiveSession currentSessionId=", interfaceC5085bsB.c(), " lastSessionId=", c2.c());
            a(null);
        }
        synchronized (d) {
            Iterator<InterfaceC5085bsB> it = d.iterator();
            while (it.hasNext()) {
                if (it.next().c().equals(interfaceC5085bsB.c())) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d() {
        return b(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(int i) {
        return b() < i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC5085bsB c() {
        InterfaceC5085bsB interfaceC5085bsB;
        synchronized (C4350bcp.class) {
            interfaceC5085bsB = e;
        }
        return interfaceC5085bsB;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(InterfaceC5085bsB interfaceC5085bsB) {
        a(interfaceC5085bsB);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(InterfaceC5085bsB interfaceC5085bsB) {
        synchronized (d) {
            d.add(interfaceC5085bsB);
        }
    }

    private static int b() {
        return d.size();
    }

    private static void a(InterfaceC5085bsB interfaceC5085bsB) {
        synchronized (C4350bcp.class) {
            if (interfaceC5085bsB == null) {
                if (e != null) {
                    if (c == null) {
                        c = new InterfaceC4360bcz.e(0L, 0L);
                    }
                    c.d(e.H());
                    c.a(System.currentTimeMillis());
                }
            }
            e = interfaceC5085bsB;
        }
    }
}
