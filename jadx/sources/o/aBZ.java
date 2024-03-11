package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* loaded from: classes3.dex */
public final class aBZ implements InterfaceC8949gP<C3305awV> {
    public static final aBZ d = new aBZ();

    private aBZ() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3305awV b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3305awV c3305awV) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3305awV, "");
        if (c3305awV.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("isSynthetic");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3305awV.e());
        }
        if (c3305awV.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("comment");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3305awV.b());
        }
        interfaceC9069id.e("ttlSeconds");
        C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c3305awV.c()));
        if (c3305awV.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("abAllocations");
            C8953gT.e(C8953gT.d(C8953gT.c(C3460azR.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3305awV.d());
        }
        interfaceC9069id.e("clientCapabilities");
        C8953gT.c(C1422aAs.b, false, 1, null).e(interfaceC9069id, c9028hp, c3305awV.a());
    }
}
