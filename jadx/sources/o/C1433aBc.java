package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1433aBc implements InterfaceC8949gP<C3318awi> {
    public static final C1433aBc c = new C1433aBc();

    private C1433aBc() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3318awi b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3318awi c3318awi) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3318awi, "");
        if (c3318awi.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1405aAb.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3318awi.e());
        }
    }
}
