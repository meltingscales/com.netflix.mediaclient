package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.AbstractC8997hK;

/* renamed from: o.azq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3485azq implements InterfaceC8949gP<C3212auh> {
    public static final C3485azq c = new C3485azq();

    private C3485azq() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3212auh b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3212auh c3212auh) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3212auh, "");
        interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
        C8953gT.p.e(interfaceC9069id, c9028hp, c3212auh.d());
        if (c3212auh.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("profileGuid");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3212auh.e());
        }
    }
}
