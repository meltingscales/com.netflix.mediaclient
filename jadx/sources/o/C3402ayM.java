package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3402ayM implements InterfaceC8949gP<C3110ask> {
    public static final C3402ayM d = new C3402ayM();

    private C3402ayM() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3110ask b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3110ask c3110ask) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3110ask, "");
        if (c3110ask.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3406ayQ.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3110ask.b());
        }
    }
}
