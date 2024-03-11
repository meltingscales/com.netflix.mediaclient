package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3390ayA implements InterfaceC8949gP<C3040arT> {
    public static final C3390ayA a = new C3390ayA();

    private C3390ayA() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3040arT b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3040arT c3040arT) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3040arT, "");
        if (c3040arT.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3394ayE.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3040arT.d());
        }
    }
}
