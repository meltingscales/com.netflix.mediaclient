package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3410ayU implements InterfaceC8949gP<C3115asp> {
    public static final C3410ayU a = new C3410ayU();

    private C3410ayU() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3115asp b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3115asp c3115asp) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3115asp, "");
        if (c3115asp.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3406ayQ.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3115asp.d());
        }
    }
}
