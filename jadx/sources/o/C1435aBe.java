package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1435aBe implements InterfaceC8949gP<C3319awj> {
    public static final C1435aBe a = new C1435aBe();

    private C1435aBe() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3319awj b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3319awj c3319awj) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3319awj, "");
        if (c3319awj.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3319awj.c());
        }
    }
}
