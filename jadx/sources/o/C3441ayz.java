package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3441ayz implements InterfaceC8949gP<C3041arU> {
    public static final C3441ayz b = new C3441ayz();

    private C3441ayz() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3041arU b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3041arU c3041arU) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3041arU, "");
        if (c3041arU.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3406ayQ.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3041arU.d());
        }
    }
}
