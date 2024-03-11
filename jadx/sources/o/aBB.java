package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* loaded from: classes3.dex */
public final class aBB implements InterfaceC8949gP<C3293awJ> {
    public static final aBB e = new aBB();

    private aBB() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3293awJ b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3293awJ c3293awJ) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3293awJ, "");
        interfaceC9069id.e("supportedSectionKinds");
        C8953gT.a(C8953gT.c(aBF.c, false, 1, null)).e(interfaceC9069id, c9028hp, c3293awJ.a());
        if (c3293awJ.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("supportIrmaEntity");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3293awJ.d());
        }
    }
}
