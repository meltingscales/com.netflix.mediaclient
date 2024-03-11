package o;

import java.io.Reader;

/* renamed from: o.Hy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0927Hy {
    HZ a(Reader reader);

    HZ e(String str);

    /* renamed from: o.Hy$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public static HZ e(InterfaceC0927Hy interfaceC0927Hy, String str) {
            C8632dsu.c((Object) str, "");
            return interfaceC0927Hy.a(new HD(str));
        }
    }
}
