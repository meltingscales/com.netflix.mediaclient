package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1454aBx implements InterfaceC8949gP<C3289awF> {
    public static final C1454aBx c = new C1454aBx();

    private C1454aBx() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3289awF b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3289awF c3289awF) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3289awF, "");
        if (c3289awF.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3289awF.e());
        }
    }
}
