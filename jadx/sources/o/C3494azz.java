package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.SSOTokenNotRenewedReason;

/* renamed from: o.azz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3494azz implements InterfaceC8949gP<SSOTokenNotRenewedReason> {
    public static final C3494azz b = new C3494azz();

    private C3494azz() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public SSOTokenNotRenewedReason b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return SSOTokenNotRenewedReason.c.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, SSOTokenNotRenewedReason sSOTokenNotRenewedReason) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) sSOTokenNotRenewedReason, "");
        interfaceC9069id.d(sSOTokenNotRenewedReason.b());
    }
}
