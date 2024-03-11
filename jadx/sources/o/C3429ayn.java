package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3429ayn implements InterfaceC8949gP<C3034arN> {
    public static final C3429ayn e = new C3429ayn();

    private C3429ayn() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3034arN b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3034arN c3034arN) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3034arN, "");
        if (c3034arN.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3406ayQ.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3034arN.a());
        }
    }
}
