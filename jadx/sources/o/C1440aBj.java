package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1440aBj implements InterfaceC8949gP<C3322awm> {
    public static final C1440aBj c = new C1440aBj();

    private C1440aBj() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3322awm b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3322awm c3322awm) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3322awm, "");
        if (c3322awm.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3322awm.c());
        }
    }
}
