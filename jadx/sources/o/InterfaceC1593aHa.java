package o;

import java.util.List;

/* renamed from: o.aHa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1593aHa {
    public static final a c = a.b;

    static void b(String str) {
        c.a(str);
    }

    List<String> a();

    void d(String str);

    /* renamed from: o.aHa$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a b = new a();

        private a() {
        }

        public final void a(String str) {
            InterfaceC1593aHa b2 = InterfaceC1601aHi.c.b();
            if (b2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            b2.d(str);
        }
    }
}
