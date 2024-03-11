package o;

import com.apollographql.apollo3.api.json.JsonReader;

/* loaded from: classes3.dex */
public final class aAA implements InterfaceC8949gP<C3235avE> {
    public static final aAA d = new aAA();

    private aAA() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3235avE b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3235avE c3235avE) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3235avE, "");
        interfaceC9069id.e("version");
        C8953gT.p.e(interfaceC9069id, c9028hp, c3235avE.d());
    }
}
