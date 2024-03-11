package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1407aAd implements InterfaceC8949gP<C3261ave> {
    public static final C1407aAd e = new C1407aAd();

    private C1407aAd() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3261ave b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3261ave c3261ave) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3261ave, "");
        if (c3261ave.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("capabilitiesBySectionTreatment");
            C8953gT.e(C8953gT.d(C8953gT.c(C1413aAj.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3261ave.c());
        }
    }
}
