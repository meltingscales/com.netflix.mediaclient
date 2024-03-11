package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* loaded from: classes3.dex */
public final class aBY implements InterfaceC8949gP<C3307awX> {
    public static final aBY a = new aBY();

    private aBY() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3307awX b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3307awX c3307awX) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3307awX, "");
        if (c3307awX.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1407aAd.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3307awX.d());
        }
    }
}
