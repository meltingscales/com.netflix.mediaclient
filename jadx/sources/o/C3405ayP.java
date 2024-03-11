package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3405ayP implements InterfaceC8949gP<C3108asi> {
    public static final C3405ayP c = new C3405ayP();

    private C3405ayP() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3108asi b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3108asi c3108asi) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3108asi, "");
        if (c3108asi.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3403ayN.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3108asi.a());
        }
    }
}
