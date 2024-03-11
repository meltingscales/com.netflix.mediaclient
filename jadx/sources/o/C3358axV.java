package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.axV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3358axV implements InterfaceC8949gP<C2915apA> {
    public static final C3358axV e = new C3358axV();

    private C3358axV() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C2915apA b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2915apA c2915apA) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2915apA, "");
        if (c2915apA.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3394ayE.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2915apA.a());
        }
    }
}
