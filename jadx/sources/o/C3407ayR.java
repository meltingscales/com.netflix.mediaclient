package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.ayR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3407ayR implements InterfaceC8949gP<C3113asn> {
    public static final C3407ayR a = new C3407ayR();

    private C3407ayR() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3113asn b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3113asn c3113asn) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3113asn, "");
        if (c3113asn.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C3406ayQ.c, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3113asn.c());
        }
    }
}
