package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3440ayy implements InterfaceC8949gP<C3042arV> {
    public static final C3440ayy c = new C3440ayy();

    private C3440ayy() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3042arV b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3042arV c3042arV) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3042arV, "");
        if (c3042arV.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3406ayQ.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3042arV.e());
        }
    }
}
