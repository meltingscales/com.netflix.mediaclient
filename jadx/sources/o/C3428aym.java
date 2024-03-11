package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aym  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3428aym implements InterfaceC8949gP<C3027arG> {
    public static final C3428aym e = new C3428aym();

    private C3428aym() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3027arG b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3027arG c3027arG) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3027arG, "");
        if (c3027arG.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3394ayE.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3027arG.b());
        }
    }
}
