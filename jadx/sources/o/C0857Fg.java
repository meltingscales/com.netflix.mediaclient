package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.Fg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0857Fg implements InterfaceC8949gP<DY> {
    public static final C0857Fg a = new C0857Fg();

    private C0857Fg() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public DY b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, DY dy) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) dy, "");
        if (dy.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("consentId");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) dy.b());
        }
        if (dy.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("displayedAt");
            C8953gT.e(C8953gT.d(C8950gQ.c)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) dy.e());
        }
        if (dy.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("isDenied");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) dy.a());
        }
    }
}
