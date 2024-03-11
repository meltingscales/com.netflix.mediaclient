package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3394ayE implements InterfaceC8949gP<C3046arZ> {
    public static final C3394ayE c = new C3394ayE();

    private C3394ayE() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3046arZ b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3046arZ c3046arZ) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3046arZ, "");
        if (c3046arZ.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("canHandleEntityKinds");
            C8953gT.e(C8953gT.d(C8953gT.a(C3474azf.a))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3046arZ.b());
        }
    }
}
