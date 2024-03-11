package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1445aBo implements InterfaceC8949gP<C3331awv> {
    public static final C1445aBo e = new C1445aBo();

    private C1445aBo() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3331awv b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3331awv c3331awv) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3331awv, "");
        if (c3331awv.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1405aAb.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3331awv.d());
        }
    }
}
