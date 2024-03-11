package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.service.pushnotification.Payload;
import o.AbstractC8997hK;

/* renamed from: o.ayg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3422ayg implements InterfaceC8949gP<C2980aqM> {
    public static final C3422ayg a = new C3422ayg();

    private C3422ayg() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C2980aqM b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2980aqM c2980aqM) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2980aqM, "");
        interfaceC9069id.e("lolomoId");
        InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
        interfaceC8949gP.e(interfaceC9069id, c9028hp, c2980aqM.b());
        interfaceC9069id.e("listId");
        interfaceC8949gP.e(interfaceC9069id, c9028hp, c2980aqM.e());
        interfaceC9069id.e(Payload.PARAM_RENO_REFRESH_LIST_CONTEXT);
        interfaceC8949gP.e(interfaceC9069id, c9028hp, c2980aqM.a());
        interfaceC9069id.e("volatileList");
        C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(c2980aqM.j()));
        if (c2980aqM.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("annotations");
            C8953gT.e(C8953gT.d(C8953gT.c(C3418ayc.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2980aqM.c());
        }
        if (c2980aqM.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("listIndex");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2980aqM.d());
        }
    }
}
