package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1444aBn implements InterfaceC8949gP<C3330awu> {
    public static final C1444aBn d = new C1444aBn();

    private C1444aBn() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3330awu b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3330awu c3330awu) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3330awu, "");
        if (c3330awu.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3330awu.e());
        }
    }
}
