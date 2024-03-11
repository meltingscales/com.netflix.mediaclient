package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.AbstractC8997hK;

/* renamed from: o.axR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3354axR implements InterfaceC8949gP<C2880aoS> {
    public static final C3354axR c = new C3354axR();

    private C3354axR() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C2880aoS b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2880aoS c2880aoS) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2880aoS, "");
        interfaceC9069id.e(SignupConstants.Field.LANG_ID);
        C8953gT.p.e(interfaceC9069id, c9028hp, c2880aoS.f());
        if (c2880aoS.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("avatarKey");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2880aoS.b());
        }
        if (c2880aoS.j() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("name");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2880aoS.j());
        }
        if (c2880aoS.g() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("maturityLevel");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2880aoS.g());
        }
        if (c2880aoS.i() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("isKids");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2880aoS.i());
        }
        if (c2880aoS.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("enableNextEpisodeAutoplay");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2880aoS.e());
        }
        if (c2880aoS.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("enablePreviewsAutoplay");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2880aoS.a());
        }
        if (c2880aoS.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("displayLanguage");
            C8953gT.e(C8953gT.m).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2880aoS.c());
        }
        if (c2880aoS.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("contentLanguages");
            C8953gT.e(C8953gT.d(C8953gT.a(C8953gT.e))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2880aoS.d());
        }
    }
}
