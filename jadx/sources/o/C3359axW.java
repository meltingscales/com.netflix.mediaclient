package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.axW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3359axW implements InterfaceC8949gP<C2917apC> {
    public static final C3359axW e = new C3359axW();

    private C3359axW() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C2917apC b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2917apC c2917apC) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2917apC, "");
        if (c2917apC.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3394ayE.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2917apC.d());
        }
    }
}
