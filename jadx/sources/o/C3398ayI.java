package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3398ayI implements InterfaceC8949gP<C3107ash> {
    public static final C3398ayI d = new C3398ayI();

    private C3398ayI() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3107ash b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3107ash c3107ash) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3107ash, "");
        if (c3107ash.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3406ayQ.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3107ash.b());
        }
    }
}
