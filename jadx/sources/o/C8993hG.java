package o;

import com.apollographql.apollo3.api.json.JsonReader;

/* renamed from: o.hG  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8993hG<T> implements InterfaceC8949gP<T> {
    private final boolean b;
    private final InterfaceC8949gP<T> d;

    public C8993hG(InterfaceC8949gP<T> interfaceC8949gP, boolean z) {
        C8632dsu.c((Object) interfaceC8949gP, "");
        this.d = interfaceC8949gP;
        this.b = z;
    }

    @Override // o.InterfaceC8949gP
    public T b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        if (this.b) {
            jsonReader = C9076ik.c.e(jsonReader);
        }
        jsonReader.c();
        T b = this.d.b(jsonReader, c9028hp);
        jsonReader.b();
        return b;
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, T t) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        if (this.b && !(interfaceC9069id instanceof C9073ih)) {
            C9073ih c9073ih = new C9073ih();
            c9073ih.e();
            this.d.e(c9073ih, c9028hp, t);
            c9073ih.d();
            Object f = c9073ih.f();
            C8632dsu.d(f);
            C9012hZ.c(interfaceC9069id, f);
            return;
        }
        interfaceC9069id.e();
        this.d.e(interfaceC9069id, c9028hp, t);
        interfaceC9069id.d();
    }
}
