package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3406ayQ implements InterfaceC8949gP<C3112asm> {
    public static final C3406ayQ c = new C3406ayQ();

    private C3406ayQ() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3112asm b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3112asm c3112asm) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3112asm, "");
        if (c3112asm.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("capabilitiesByEntityTreatment");
            C8953gT.e(C8953gT.d(C8953gT.c(C3435ayt.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3112asm.e());
        }
        if (c3112asm.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("maxTotalEntities");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3112asm.a());
        }
    }
}
