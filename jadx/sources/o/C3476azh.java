package o;

import com.apollographql.apollo3.api.json.JsonReader;

/* renamed from: o.azh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3476azh implements InterfaceC8949gP<C3168atp> {
    public static final C3476azh d = new C3476azh();

    private C3476azh() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3168atp b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3168atp c3168atp) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3168atp, "");
        interfaceC9069id.e("sectionKind");
        C3482azn.d.e(interfaceC9069id, c9028hp, c3168atp.d());
        interfaceC9069id.e("supportedEntityKinds");
        C8953gT.a(C3481azm.c).e(interfaceC9069id, c9028hp, c3168atp.a());
    }
}
