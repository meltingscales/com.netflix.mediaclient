package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.azX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3466azX implements InterfaceC8949gP<C3259avc> {
    public static final C3466azX d = new C3466azX();

    private C3466azX() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3259avc b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3259avc c3259avc) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3259avc, "");
        if (c3259avc.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3259avc.e());
        }
    }
}
