package o;

import com.apollographql.apollo3.api.json.JsonReader;

/* loaded from: classes3.dex */
public final class aBF implements InterfaceC8949gP<C3294awK> {
    public static final aBF c = new aBF();

    private aBF() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3294awK b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3294awK c3294awK) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3294awK, "");
        interfaceC9069id.e("sectionKind");
        aBI.c.e(interfaceC9069id, c9028hp, c3294awK.d());
        interfaceC9069id.e("supportedEntityKinds");
        C8953gT.a(aBT.a).e(interfaceC9069id, c9028hp, c3294awK.c());
    }
}
