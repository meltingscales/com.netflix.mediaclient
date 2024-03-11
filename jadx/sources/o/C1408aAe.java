package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1408aAe implements InterfaceC8949gP<C3275avs> {
    public static final C1408aAe c = new C1408aAe();

    private C1408aAe() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3275avs b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3275avs c3275avs) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3275avs, "");
        if (c3275avs.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1406aAc.d, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3275avs.a());
        }
        if (c3275avs.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("viewportWidthInBoxShots");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3275avs.b());
        }
    }
}
