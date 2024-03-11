package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.axX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3360axX implements InterfaceC8949gP<C2966apz> {
    public static final C3360axX d = new C3360axX();

    private C3360axX() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C2966apz b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2966apz c2966apz) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2966apz, "");
        if (c2966apz.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3394ayE.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2966apz.b());
        }
    }
}
