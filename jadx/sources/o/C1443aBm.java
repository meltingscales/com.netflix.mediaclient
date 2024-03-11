package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aBm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1443aBm implements InterfaceC8949gP<C3328aws> {
    public static final C1443aBm d = new C1443aBm();

    private C1443aBm() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3328aws b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3328aws c3328aws) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3328aws, "");
        if (c3328aws.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3328aws.a());
        }
    }
}
