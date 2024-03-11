package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.AbstractC8997hK;

/* renamed from: o.aCm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1470aCm implements InterfaceC8949gP<C3381axs> {
    public static final C1470aCm e = new C1470aCm();

    private C1470aCm() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3381axs b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3381axs c3381axs) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3381axs, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
        interfaceC8949gP.e(interfaceC9069id, c9028hp, c3381axs.c());
        if (c3381axs.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("trackId");
            C8953gT.e(C8953gT.d(interfaceC8949gP)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3381axs.b());
        }
        if (c3381axs.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("signature");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3381axs.a());
        }
        if (c3381axs.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("profileGuid");
            C8953gT.e(C8953gT.d(interfaceC8949gP)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3381axs.e());
        }
    }
}
