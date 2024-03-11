package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1431aBa implements InterfaceC8949gP<C3314awe> {
    public static final C1431aBa d = new C1431aBa();

    private C1431aBa() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3314awe b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3314awe c3314awe) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3314awe, "");
        if (c3314awe.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1405aAb.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3314awe.d());
        }
        if (c3314awe.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("maxTotalEntities");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3314awe.c());
        }
    }
}
