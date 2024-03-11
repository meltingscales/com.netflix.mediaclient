package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1419aAp implements InterfaceC8949gP<C3232avB> {
    public static final C1419aAp c = new C1419aAp();

    private C1419aAp() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3232avB b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3232avB c3232avB) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3232avB, "");
        if (c3232avB.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3232avB.c());
        }
        if (c3232avB.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("allowEmpty");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3232avB.a());
        }
    }
}
