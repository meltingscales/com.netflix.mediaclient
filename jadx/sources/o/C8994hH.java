package o;

import com.apollographql.apollo3.api.json.JsonReader;

/* renamed from: o.hH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8994hH<T> implements InterfaceC8949gP<T> {
    private final InterfaceC8949gP<T> c;

    public C8994hH(InterfaceC8949gP<T> interfaceC8949gP) {
        C8632dsu.c((Object) interfaceC8949gP, "");
        this.c = interfaceC8949gP;
        if (!(!(interfaceC8949gP instanceof C8994hH))) {
            throw new IllegalStateException("The adapter is already nullable".toString());
        }
    }

    @Override // o.InterfaceC8949gP
    public T b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        if (jsonReader.l() == JsonReader.Token.f) {
            jsonReader.s();
            return null;
        }
        return this.c.b(jsonReader, c9028hp);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, T t) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        if (t == null) {
            interfaceC9069id.j();
        } else {
            this.c.e(interfaceC9069id, c9028hp, t);
        }
    }
}
