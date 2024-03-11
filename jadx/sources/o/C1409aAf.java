package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1409aAf implements InterfaceC8949gP<C3270avn> {
    public static final C1409aAf c = new C1409aAf();

    private C1409aAf() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3270avn b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3270avn c3270avn) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3270avn, "");
        if (c3270avn.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3270avn.b());
        }
    }
}
