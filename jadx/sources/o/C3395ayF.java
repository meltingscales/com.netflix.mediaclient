package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3395ayF implements InterfaceC8949gP<C3102asc> {
    public static final C3395ayF d = new C3395ayF();

    private C3395ayF() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3102asc b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3102asc c3102asc) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3102asc, "");
        if (c3102asc.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3403ayN.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3102asc.e());
        }
    }
}
