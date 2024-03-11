package o;

import java.util.Map;

/* renamed from: o.jY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9117jY implements InterfaceC9116jX {
    private final Map<String, Object> b;
    private final String d;

    @Override // o.InterfaceC9116jX
    public String b() {
        return this.d;
    }

    public final Map<String, Object> e() {
        return this.b;
    }

    public C9117jY(String str, Map<String, ? extends Object> map) {
        C8632dsu.c((Object) map, "");
        this.d = str;
        this.b = map;
    }
}
