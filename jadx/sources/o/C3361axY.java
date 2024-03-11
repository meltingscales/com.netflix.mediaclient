package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.axY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3361axY implements InterfaceC8949gP<C3004aqk> {
    public static final C3361axY c = new C3361axY();

    private C3361axY() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3004aqk b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3004aqk c3004aqk) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3004aqk, "");
        if (c3004aqk.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("aroCategoryId");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3004aqk.e());
        }
        interfaceC9069id.e("mapAnnotations");
        C8953gT.c(C3417ayb.c, false, 1, null).e(interfaceC9069id, c9028hp, c3004aqk.c());
        if (c3004aqk.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("cxuiAnnotations");
            C8953gT.e(C8953gT.d(C8953gT.c(C3362axZ.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3004aqk.a());
        }
    }
}
