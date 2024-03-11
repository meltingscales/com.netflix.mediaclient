package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.azY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3467azY implements InterfaceC8949gP<C3257ava> {
    public static final C3467azY a = new C3467azY();

    private C3467azY() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3257ava b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3257ava c3257ava) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3257ava, "");
        if (c3257ava.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3257ava.c());
        }
    }
}
