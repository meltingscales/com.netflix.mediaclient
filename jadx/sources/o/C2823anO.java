package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation;
import com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerType;
import com.netflix.mediaclient.graphql.models.type.NGPRedeemBeaconFailureReason;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2823anO {
    private static final List<AbstractC9025hm> a;
    public static final C2823anO b = new C2823anO();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> a() {
        return j;
    }

    private C2823anO() {
    }

    static {
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> e2;
        List e3;
        List e4;
        List<AbstractC9025hm> j4;
        List<C9021hi> j5;
        List<AbstractC9025hm> e5;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, C9019hg.d(eVar.e())).d(), new C9018hf.a("value", C9019hg.d(eVar.e())).d());
        a = j2;
        j3 = C8569dql.j(new C9018hf.a("connectionSecret", C9019hg.d(eVar.e())).d(), new C9018hf.a("gameId", C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("gameplaySessionId", C9019hg.d(eVar.e())).d(), new C9018hf.a("connectionUrl", C9019hg.d(eVar.e())).d(), new C9018hf.a("controllerUiUrl", C9019hg.d(eVar.e())).d(), new C9018hf.a("controllerUiParameters", C9019hg.d(C9019hg.a(C9019hg.d(C2989aqV.e.e())))).e(j2).d(), new C9018hf.a("controllerUiOrientations", C9019hg.d(C9019hg.a(C9019hg.d(NGPBeaconControllerOrientation.a.d())))).d(), new C9018hf.a("controllerUiType", C9019hg.d(NGPBeaconControllerType.c.e())).d(), new C9018hf.a("ocgaUuid", C9019hg.d(eVar.e())).d());
        c = j3;
        e2 = C8566dqi.e(new C9018hf.a("reason", C9019hg.d(NGPRedeemBeaconFailureReason.j.c())).d());
        e = e2;
        e3 = C8566dqi.e("NGPRedeemBeaconSuccess");
        e4 = C8566dqi.e("NGPRedeemBeaconFailed");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("NGPRedeemBeaconSuccess", e3).b(j3).a(), new C9017he.d("NGPRedeemBeaconFailed", e4).b(e2).a());
        d = j4;
        C9018hf.a aVar = new C9018hf.a("ngpRedeemBeacon", C3049arc.d.c());
        j5 = C8569dql.j(new C9021hi.d("beaconCode").b(new C9027ho("beaconCode")).b(), new C9021hi.d("secondScreenDeviceRegistrationToken").b());
        e5 = C8566dqi.e(aVar.b(j5).e(j4).d());
        j = e5;
    }
}
