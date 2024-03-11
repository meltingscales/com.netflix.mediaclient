package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1452aBv implements InterfaceC8949gP<C3333awx> {
    public static final C1452aBv d = new C1452aBv();

    private C1452aBv() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3333awx b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3333awx c3333awx) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3333awx, "");
        if (c3333awx.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3333awx.b());
        }
    }
}
