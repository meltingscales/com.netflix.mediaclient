package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.azV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3464azV implements InterfaceC8949gP<C3265avi> {
    public static final C3464azV a = new C3464azV();

    private C3464azV() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3265avi b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3265avi c3265avi) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3265avi, "");
        if (c3265avi.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1405aAb.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3265avi.a());
        }
    }
}
