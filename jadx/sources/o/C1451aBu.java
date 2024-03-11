package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1451aBu implements InterfaceC8949gP<C3284awA> {
    public static final C1451aBu a = new C1451aBu();

    private C1451aBu() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3284awA b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3284awA c3284awA) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3284awA, "");
        if (c3284awA.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3284awA.b());
        }
        if (c3284awA.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("allowEmpty");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3284awA.c());
        }
    }
}
