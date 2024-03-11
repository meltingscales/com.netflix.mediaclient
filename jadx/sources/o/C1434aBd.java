package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1434aBd implements InterfaceC8949gP<C3320awk> {
    public static final C1434aBd b = new C1434aBd();

    private C1434aBd() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3320awk b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3320awk c3320awk) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3320awk, "");
        if (c3320awk.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3320awk.b());
        }
    }
}
