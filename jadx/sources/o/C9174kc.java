package o;

import java.util.Map;

/* renamed from: o.kc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9174kc implements InterfaceC9116jX {
    private final Map<String, Object> a;
    private final String b;

    public final Map<String, Object> a() {
        return this.a;
    }

    @Override // o.InterfaceC9116jX
    public String b() {
        return this.b;
    }

    public C9174kc(String str, Map<String, ? extends Object> map) {
        this.b = str;
        this.a = map;
    }
}
