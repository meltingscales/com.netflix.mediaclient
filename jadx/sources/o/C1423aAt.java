package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1423aAt implements InterfaceC8949gP<C3233avC> {
    public static final C1423aAt b = new C1423aAt();

    private C1423aAt() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3233avC b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3233avC c3233avC) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3233avC, "");
        if (c3233avC.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1406aAc.d, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3233avC.e());
        }
    }
}
