package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.azk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3479azk implements InterfaceC8949gP<C3165atm> {
    public static final C3479azk a = new C3479azk();

    private C3479azk() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3165atm b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3165atm c3165atm) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3165atm, "");
        if (c3165atm.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("supportedSectionKinds");
            C8953gT.e(C8953gT.d(C8953gT.a(C8953gT.c(C3476azh.d, false, 1, null)))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3165atm.b());
        }
        if (c3165atm.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("supportIrmaEntity");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3165atm.e());
        }
    }
}
