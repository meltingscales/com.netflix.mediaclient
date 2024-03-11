package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.azr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3486azr implements InterfaceC8949gP<C3207auc> {
    public static final C3486azr e = new C3486azr();

    private C3486azr() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3207auc b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3207auc c3207auc) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3207auc, "");
        interfaceC9069id.e(SignupConstants.Field.LANG_ID);
        C8953gT.p.e(interfaceC9069id, c9028hp, c3207auc.b());
    }
}
