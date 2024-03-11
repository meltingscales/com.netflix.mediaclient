package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.Fc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0853Fc implements InterfaceC8949gP<DU> {
    public static final C0853Fc c = new C0853Fc();

    private C0853Fc() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public DU b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, DU du) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) du, "");
        if (du.i() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("isConsumptionOnly");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) du.i());
        }
        if (du.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("ignoreSnoozing");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) du.e());
        }
        if (du.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("supportedVideoFormat");
            C8953gT.e(C8953gT.d(C0866Fp.c)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) du.a());
        }
        if (du.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("hasGooglePlayService");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) du.b());
        }
        if (du.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("rdidAccessState");
            C8953gT.e(C8953gT.d(C0859Fi.a)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) du.d());
        }
        if (du.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("rdidConsentStates");
            C8953gT.e(C8953gT.d(C8953gT.a(C8953gT.c(C0857Fg.a, false, 1, null)))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) du.c());
        }
    }
}
