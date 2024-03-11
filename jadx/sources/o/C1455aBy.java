package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1455aBy implements InterfaceC8949gP<C3285awB> {
    public static final C1455aBy a = new C1455aBy();

    private C1455aBy() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3285awB b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3285awB c3285awB) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3285awB, "");
        if (c3285awB.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3285awB.a());
        }
    }
}
