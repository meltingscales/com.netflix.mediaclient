package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3433ayr implements InterfaceC8949gP<C3032arL> {
    public static final C3433ayr e = new C3433ayr();

    private C3433ayr() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3032arL b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3032arL c3032arL) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3032arL, "");
        if (c3032arL.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3406ayQ.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3032arL.d());
        }
    }
}
