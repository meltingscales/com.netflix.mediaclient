package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1411aAh implements InterfaceC8949gP<C3266avj> {
    public static final C1411aAh e = new C1411aAh();

    private C1411aAh() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3266avj b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3266avj c3266avj) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3266avj, "");
        if (c3266avj.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3266avj.c());
        }
    }
}
