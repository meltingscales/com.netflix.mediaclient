package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1417aAn implements InterfaceC8949gP<C3278avv> {
    public static final C1417aAn a = new C1417aAn();

    private C1417aAn() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3278avv b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3278avv c3278avv) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3278avv, "");
        if (c3278avv.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1407aAd.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3278avv.d());
        }
    }
}
