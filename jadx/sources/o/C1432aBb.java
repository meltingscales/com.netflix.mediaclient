package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1432aBb implements InterfaceC8949gP<C3315awf> {
    public static final C1432aBb d = new C1432aBb();

    private C1432aBb() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3315awf b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3315awf c3315awf) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3315awf, "");
        if (c3315awf.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3315awf.a());
        }
    }
}
