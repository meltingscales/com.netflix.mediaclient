package o;

import java.util.Map;
import o.InterfaceC9034hv.d;

/* renamed from: o.hv  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9034hv<D extends d> {

    /* renamed from: o.hv$d */
    /* loaded from: classes2.dex */
    public interface d {
    }

    C9018hf b();

    boolean c();

    void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z);

    InterfaceC8949gP<D> e();

    /* renamed from: o.hv$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final Map<String, Object> c;

        public final Map<String, Object> b() {
            return this.c;
        }

        public c(Map<String, ? extends Object> map) {
            C8632dsu.c((Object) map, "");
            this.c = map;
        }
    }
}
