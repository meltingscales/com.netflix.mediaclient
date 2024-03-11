package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3393ayD implements InterfaceC8949gP<C3045arY> {
    public static final C3393ayD e = new C3393ayD();

    private C3393ayD() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3045arY b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3045arY c3045arY) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3045arY, "");
        if (c3045arY.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3394ayE.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3045arY.d());
        }
    }
}
