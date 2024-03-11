package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* loaded from: classes3.dex */
public final class aAC implements InterfaceC8949gP<C3236avF> {
    public static final aAC e = new aAC();

    private aAC() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3236avF b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3236avF c3236avF) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3236avF, "");
        if (c3236avF.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("resolution");
            C8953gT.e(C8953gT.d(C1426aAw.d)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3236avF.a());
        }
        if (c3236avF.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("level");
            C8953gT.e(C8953gT.d(C1427aAx.d)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3236avF.c());
        }
        if (c3236avF.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("hawkins");
            C8953gT.e(C8953gT.d(C8953gT.c(aAA.d, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3236avF.d());
        }
        if (c3236avF.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("installedApps");
            C8953gT.e(C8953gT.d(C8953gT.a(C8953gT.p))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3236avF.b());
        }
    }
}
