package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1416aAm implements InterfaceC8949gP<C3274avr> {
    public static final C1416aAm e = new C1416aAm();

    private C1416aAm() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3274avr b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3274avr c3274avr) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3274avr, "");
        if (c3274avr.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("PreQuerySearch");
            C8953gT.e(C8953gT.d(C8953gT.c(aBS.a, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3274avr.e());
        }
        if (c3274avr.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("QuerySearch");
            C8953gT.e(C8953gT.d(C8953gT.c(aBQ.d, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3274avr.d());
        }
        if (c3274avr.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("EntitySearch");
            C8953gT.e(C8953gT.d(C8953gT.c(C1423aAt.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3274avr.a());
        }
        if (c3274avr.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("Home");
            C8953gT.e(C8953gT.d(C8953gT.c(C1429aAz.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3274avr.b());
        }
        if (c3274avr.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("Browse");
            C8953gT.e(C8953gT.d(C8953gT.c(C1408aAe.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3274avr.c());
        }
    }
}
