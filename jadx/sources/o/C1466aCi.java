package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aCi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1466aCi implements InterfaceC8949gP<C3371axi> {
    public static final C1466aCi d = new C1466aCi();

    private C1466aCi() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3371axi b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3371axi c3371axi) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3371axi, "");
        if (c3371axi.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1405aAb.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3371axi.d());
        }
    }
}
