package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1405aAb implements InterfaceC8949gP<C3267avk> {
    public static final C1405aAb e = new C1405aAb();

    private C1405aAb() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3267avk b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3267avk c3267avk) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3267avk, "");
        if (c3267avk.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("capabilitiesByEntityTreatment");
            C8953gT.e(C8953gT.d(C8953gT.c(C1410aAg.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3267avk.e());
        }
    }
}
