package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1436aBf implements InterfaceC8949gP<C3321awl> {
    public static final C1436aBf d = new C1436aBf();

    private C1436aBf() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3321awl b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3321awl c3321awl) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3321awl, "");
        if (c3321awl.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3321awl.b());
        }
    }
}