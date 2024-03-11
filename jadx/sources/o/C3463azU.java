package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.azU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3463azU implements InterfaceC8949gP<C3264avh> {
    public static final C3463azU c = new C3463azU();

    private C3463azU() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3264avh b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3264avh c3264avh) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3264avh, "");
        if (c3264avh.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3264avh.a());
        }
    }
}
