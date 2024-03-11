package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aCc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1460aCc implements InterfaceC8949gP<C3366axd> {
    public static final C1460aCc c = new C1460aCc();

    private C1460aCc() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3366axd b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3366axd c3366axd) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3366axd, "");
        if (c3366axd.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3366axd.a());
        }
    }
}
