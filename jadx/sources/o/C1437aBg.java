package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1437aBg implements InterfaceC8949gP<C3317awh> {
    public static final C1437aBg c = new C1437aBg();

    private C1437aBg() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3317awh b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3317awh c3317awh) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3317awh, "");
        if (c3317awh.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1405aAb.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3317awh.c());
        }
        if (c3317awh.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("maxTotalEntities");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3317awh.a());
        }
    }
}
