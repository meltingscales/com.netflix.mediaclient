package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1425aAv implements InterfaceC8949gP<C3281avy> {
    public static final C1425aAv e = new C1425aAv();

    private C1425aAv() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3281avy b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3281avy c3281avy) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3281avy, "");
        if (c3281avy.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1405aAb.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3281avy.d());
        }
    }
}
