package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.AbstractC8997hK;

/* renamed from: o.axu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3383axu implements InterfaceC8949gP<C2911aox> {
    public static final C3383axu d = new C3383axu();

    private C3383axu() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C2911aox b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2911aox c2911aox) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2911aox, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        C8953gT.p.e(interfaceC9069id, c9028hp, c2911aox.a());
        if (c2911aox.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("profileGuid");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2911aox.c());
        }
    }
}
