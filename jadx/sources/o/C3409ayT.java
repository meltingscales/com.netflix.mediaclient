package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3409ayT implements InterfaceC8949gP<C3116asq> {
    public static final C3409ayT a = new C3409ayT();

    private C3409ayT() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3116asq b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3116asq c3116asq) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3116asq, "");
        if (c3116asq.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3394ayE.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3116asq.c());
        }
    }
}
