package o;

import com.apollographql.apollo3.api.json.JsonReader;

/* renamed from: o.azy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3493azy implements InterfaceC8949gP<C3223aus> {
    public static final C3493azy b = new C3493azy();

    private C3493azy() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3223aus b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3223aus c3223aus) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3223aus, "");
        interfaceC9069id.e("consentStates");
        C8953gT.a(C8953gT.c(C3487azs.e, false, 1, null)).e(interfaceC9069id, c9028hp, c3223aus.a());
    }
}
