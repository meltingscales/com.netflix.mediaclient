package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.service.pushnotification.Payload;
import o.AbstractC8997hK;

/* renamed from: o.ayb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3417ayb implements InterfaceC8949gP<C2973aqF> {
    public static final C3417ayb c = new C3417ayb();

    private C3417ayb() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C2973aqF b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2973aqF c2973aqF) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c2973aqF, "");
        if (c2973aqF.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("billboardPrepromotionSupported");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.e());
        }
        if (c2973aqF.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("billboardTrailerSupported");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.b());
        }
        if (c2973aqF.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("billboardUIClient");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.d());
        }
        if (c2973aqF.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("billboardMotionVideoEnabled");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.a());
        }
        interfaceC9069id.e("gpsModel");
        InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
        interfaceC8949gP.e(interfaceC9069id, c9028hp, c2973aqF.h());
        if (c2973aqF.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("allowContinueWatchingRowIfEmpty");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.c());
        }
        if (c2973aqF.m() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("includeLolomoRowData");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.m());
        }
        if (c2973aqF.n() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("installedGamesPackageNames");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.n());
        }
        if (c2973aqF.s() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("supportsLocalizedKidsProfile");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.s());
        }
        if (c2973aqF.k() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e(Payload.PARAM_RENO_REFRESH_LIST_CONTEXT);
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.k());
        }
        if (c2973aqF.g() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("fallbacksEnabled");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.g());
        }
        if (c2973aqF.q() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("useKidsCharacterRow");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.q());
        }
        if (c2973aqF.f() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("categoryId");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.f());
        }
        if (c2973aqF.j() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("clientAppCapability");
            C8953gT.e(C8953gT.d(C8953gT.c(C3416aya.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.j());
        }
        if (c2973aqF.r() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("supplementalTrackIds");
            C8953gT.e(C8953gT.d(C8953gT.a(C8953gT.t))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.r());
        }
        if (c2973aqF.p() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("renoMessageId");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.p());
        }
        if (c2973aqF.i() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("cacheResponseEnabled");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.i());
        }
        if (c2973aqF.t() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("supportedUiExperienceTypes");
            C8953gT.e(C8953gT.d(C8953gT.a(C1463aCf.d))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.t());
        }
        if (c2973aqF.o() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("parentTrackIds");
            C8953gT.e(C8953gT.d(C8953gT.a(interfaceC8949gP))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.o());
        }
        if (c2973aqF.l() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("parentPageUUID");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c2973aqF.l());
        }
    }
}
