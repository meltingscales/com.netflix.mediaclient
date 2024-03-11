package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.axQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3353axQ implements InterfaceC8949gP<C2961apu> {
    public static final C3353axQ a = new C3353axQ();

    private C3353axQ() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C2961apu b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2961apu c2961apu) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2961apu, "");
        if (c2961apu.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3394ayE.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2961apu.a());
        }
    }
}
