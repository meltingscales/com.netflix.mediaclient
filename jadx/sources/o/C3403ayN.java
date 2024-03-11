package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3403ayN implements InterfaceC8949gP<C3109asj> {
    public static final C3403ayN b = new C3403ayN();

    private C3403ayN() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3109asj b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3109asj c3109asj) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3109asj, "");
        if (c3109asj.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("capabilitiesBySectionTreatment");
            C8953gT.e(C8953gT.d(C8953gT.c(C3438ayw.a, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3109asj.e());
        }
    }
}
