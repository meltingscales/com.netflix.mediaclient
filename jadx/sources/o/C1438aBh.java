package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1438aBh implements InterfaceC8949gP<C3325awp> {
    public static final C1438aBh b = new C1438aBh();

    private C1438aBh() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3325awp b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3325awp c3325awp) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3325awp, "");
        if (c3325awp.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3325awp.a());
        }
    }
}
