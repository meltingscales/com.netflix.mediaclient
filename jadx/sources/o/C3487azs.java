package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.azs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3487azs implements InterfaceC8949gP<C3151atY> {
    public static final C3487azs e = new C3487azs();

    private C3487azs() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3151atY b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3151atY c3151atY) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3151atY, "");
        interfaceC9069id.e(SignupConstants.Field.LANG_ID);
        C8953gT.p.e(interfaceC9069id, c9028hp, c3151atY.a());
        interfaceC9069id.e("displayedAt");
        C8950gQ.c.e(interfaceC9069id, c9028hp, c3151atY.c());
        interfaceC9069id.e("isDenied");
        C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(c3151atY.b()));
    }
}
