package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1453aBw implements InterfaceC8949gP<C3288awE> {
    public static final C1453aBw c = new C1453aBw();

    private C1453aBw() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3288awE b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3288awE c3288awE) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3288awE, "");
        if (c3288awE.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1405aAb.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3288awE.a());
        }
    }
}
