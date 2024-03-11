package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aCa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1458aCa implements InterfaceC8949gP<C3365axc> {
    public static final C1458aCa d = new C1458aCa();

    private C1458aCa() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3365axc b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3365axc c3365axc) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3365axc, "");
        if (c3365axc.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1405aAb.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3365axc.d());
        }
        if (c3365axc.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("maxTotalEntities");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3365axc.c());
        }
    }
}
