package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1418aAo implements InterfaceC8949gP<C3282avz> {
    public static final C1418aAo c = new C1418aAo();

    private C1418aAo() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3282avz b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3282avz c3282avz) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3282avz, "");
        if (c3282avz.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3282avz.b());
        }
    }
}
