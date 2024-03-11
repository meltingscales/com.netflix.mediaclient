package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3418ayc implements InterfaceC8949gP<C2983aqP> {
    public static final C3418ayc c = new C3418ayc();

    private C3418ayc() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C2983aqP b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2983aqP c2983aqP) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2983aqP, "");
        if (c2983aqP.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("renoMessageId");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2983aqP.b());
        }
    }
}
