package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3401ayL implements InterfaceC8949gP<C3105asf> {
    public static final C3401ayL b = new C3401ayL();

    private C3401ayL() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3105asf b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3105asf c3105asf) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3105asf, "");
        if (c3105asf.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3397ayH.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3105asf.a());
        }
    }
}
