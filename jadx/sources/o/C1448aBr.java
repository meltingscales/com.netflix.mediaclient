package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1448aBr implements InterfaceC8949gP<C3334awy> {
    public static final C1448aBr d = new C1448aBr();

    private C1448aBr() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3334awy b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3334awy c3334awy) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3334awy, "");
        if (c3334awy.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3334awy.e());
        }
    }
}
