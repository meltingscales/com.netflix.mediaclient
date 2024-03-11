package o;

import com.apollographql.apollo3.api.json.JsonReader;

/* renamed from: o.Fa  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0851Fa implements InterfaceC8949gP<DR> {
    public static final C0851Fa c = new C0851Fa();

    private C0851Fa() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public DR b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, DR dr) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) dr, "");
        interfaceC9069id.e("name");
        C8953gT.p.e(interfaceC9069id, c9028hp, dr.b());
        interfaceC9069id.e("value");
        C8953gT.c(EW.e, false, 1, null).e(interfaceC9069id, c9028hp, dr.e());
    }
}
