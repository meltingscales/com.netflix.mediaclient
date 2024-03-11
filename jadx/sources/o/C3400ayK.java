package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3400ayK implements InterfaceC8949gP<C3106asg> {
    public static final C3400ayK a = new C3400ayK();

    private C3400ayK() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3106asg b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3106asg c3106asg) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3106asg, "");
        if (c3106asg.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3403ayN.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3106asg.a());
        }
    }
}
