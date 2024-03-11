package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1406aAc implements InterfaceC8949gP<C3263avg> {
    public static final C1406aAc d = new C1406aAc();

    private C1406aAc() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3263avg b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3263avg c3263avg) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3263avg, "");
        if (c3263avg.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("maxTotalSections");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3263avg.d());
        }
        if (c3263avg.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("capabilitiesBySection");
            C8953gT.e(C8953gT.d(C8953gT.c(C1414aAk.a, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3263avg.e());
        }
    }
}
