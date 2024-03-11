package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aCh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1465aCh implements InterfaceC8949gP<C3372axj> {
    public static final C1465aCh c = new C1465aCh();

    private C1465aCh() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3372axj b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3372axj c3372axj) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3372axj, "");
        if (c3372axj.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3372axj.a());
        }
    }
}
