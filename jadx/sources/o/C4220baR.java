package o;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.baR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4220baR implements InterfaceC4218baP {
    public static final C4220baR d = new C4220baR();
    private static final ConcurrentHashMap<String, InterfaceC4224baV> b = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, C4306bby> c = new ConcurrentHashMap<>();

    private C4220baR() {
    }

    @Override // o.InterfaceC4218baP
    public void d(final String str, InterfaceC4224baV interfaceC4224baV) {
        C8632dsu.c((Object) str, "");
        if (interfaceC4224baV != null) {
            b.put(str, interfaceC4224baV);
            C8187dfe.c(new Runnable() { // from class: o.baQ
                @Override // java.lang.Runnable
                public final void run() {
                    C4220baR.e(str);
                }
            });
            return;
        }
        b.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(String str) {
        C8632dsu.c((Object) str, "");
        d.a(str);
    }

    public final void a(String str) {
        C8632dsu.c((Object) str, "");
        ConcurrentHashMap<String, InterfaceC4224baV> concurrentHashMap = b;
        InterfaceC4224baV interfaceC4224baV = concurrentHashMap.get(str);
        if (interfaceC4224baV != null) {
            if (interfaceC4224baV.b()) {
                concurrentHashMap.remove(str);
                return;
            }
            C4306bby c4306bby = c.get(str);
            if (c4306bby != null) {
                C8632dsu.d(c4306bby);
                interfaceC4224baV.a(c4306bby);
            }
        }
    }

    public final void c(String str, C4306bby c4306bby) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c4306bby, "");
        c.put(str, c4306bby);
    }

    @Override // o.InterfaceC4218baP
    public long c(String str) {
        C8632dsu.c((Object) str, "");
        C4306bby c4306bby = c.get(str);
        if (c4306bby == null || c4306bby.a()) {
            return -1L;
        }
        return c4306bby.b();
    }
}
