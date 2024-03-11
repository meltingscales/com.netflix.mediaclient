package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3411ayV implements InterfaceC8949gP<C3114aso> {
    public static final C3411ayV a = new C3411ayV();

    private C3411ayV() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3114aso b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3114aso c3114aso) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3114aso, "");
        if (c3114aso.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3406ayQ.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3114aso.b());
        }
    }
}
