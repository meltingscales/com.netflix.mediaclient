package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1422aAs implements InterfaceC8949gP<C3279avw> {
    public static final C1422aAs b = new C1422aAs();

    private C1422aAs() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3279avw b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3279avw c3279avw) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3279avw, "");
        if (c3279avw.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("generalProperties");
            C8953gT.e(C8953gT.d(C8953gT.c(aAC.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3279avw.c());
        }
        if (c3279avw.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("abTestCapabilities");
            C8953gT.e(C8953gT.d(C8953gT.a(C8953gT.c(C3459azQ.d, false, 1, null)))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3279avw.b());
        }
        if (c3279avw.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("capabilitiesByPage");
            C8953gT.e(C8953gT.d(C8953gT.c(C1416aAm.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3279avw.e());
        }
        if (c3279avw.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("lolomoCapabilities");
            C8953gT.e(C8953gT.d(C8953gT.c(C1442aBl.d, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3279avw.a());
        }
        if (c3279avw.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("pinotSearchClientCapabilities");
            C8953gT.e(C8953gT.d(C8953gT.c(aBB.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3279avw.d());
        }
    }
}
