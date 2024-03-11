package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1404aAa implements InterfaceC8949gP<C3262avf> {
    public static final C1404aAa b = new C1404aAa();

    private C1404aAa() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3262avf b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3262avf c3262avf) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3262avf, "");
        if (c3262avf.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("canHandleEntityKinds");
            C8953gT.e(C8953gT.d(C8953gT.a(aBT.a))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3262avf.c());
        }
    }
}
