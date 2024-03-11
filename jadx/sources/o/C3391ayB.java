package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3391ayB implements InterfaceC8949gP<C3043arW> {
    public static final C3391ayB e = new C3391ayB();

    private C3391ayB() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3043arW b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3043arW c3043arW) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3043arW, "");
        if (c3043arW.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3403ayN.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3043arW.d());
        }
    }
}
