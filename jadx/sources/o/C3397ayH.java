package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3397ayH implements InterfaceC8949gP<C3103asd> {
    public static final C3397ayH e = new C3397ayH();

    private C3397ayH() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3103asd b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3103asd c3103asd) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3103asd, "");
        if (c3103asd.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("capabilitiesBySection");
            C8953gT.e(C8953gT.d(C8953gT.c(C3436ayu.d, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3103asd.d());
        }
        if (c3103asd.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("maxTotalSections");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3103asd.b());
        }
        if (c3103asd.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("viewportWidthInBoxshots");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3103asd.c());
        }
    }
}
