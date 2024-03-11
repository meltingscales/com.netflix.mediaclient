package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.experimentation.FlexEvent;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aFL implements InterfaceC1547aFi {
    public static final c c = new c(null);
    private Boolean a;
    private final Provider<Boolean> b;
    private Boolean d;
    private final InterfaceC1551aFm<Boolean> e;
    private final C1567aGb f;
    private final InterfaceC1476aCs h;
    private final Provider<aFR> i;
    private final InterfaceC1551aFm<String> j;

    @Inject
    public aFL(C1567aGb c1567aGb, InterfaceC1476aCs interfaceC1476aCs, @Named("browseExperienceIsKids") Provider<Boolean> provider, InterfaceC1551aFm<String> interfaceC1551aFm, InterfaceC1551aFm<Boolean> interfaceC1551aFm2, Provider<aFR> provider2) {
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) interfaceC1476aCs, "");
        C8632dsu.c((Object) provider, "");
        C8632dsu.c((Object) interfaceC1551aFm, "");
        C8632dsu.c((Object) interfaceC1551aFm2, "");
        C8632dsu.c((Object) provider2, "");
        this.f = c1567aGb;
        this.h = interfaceC1476aCs;
        this.b = provider;
        this.j = interfaceC1551aFm;
        this.e = interfaceC1551aFm2;
        this.i = provider2;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("HendrixDataValidator");
        }
    }

    @Override // o.InterfaceC1547aFi
    public void d(String str) {
        FlexEvent flexEvent;
        Map b;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        c cVar = c;
        cVar.getLogTag();
        InterfaceC5283bvo e = this.h.e();
        String str2 = this.j.get();
        if (e == null && (str2 == null || str2.length() == 0)) {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.g;
            b = dqD.b(dpD.a("tag", str));
            k = dqE.k(b);
            C1596aHd c1596aHd = new C1596aHd("Unexpected state while attempting to validate hendrix data - no profile at singleton or profile scope", null, errorType, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType2.c() + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        String profileGuid = e != null ? e.getProfileGuid() : null;
        Boolean valueOf = e != null ? Boolean.valueOf(e.isKidsProfile()) : null;
        Boolean bool = this.b.get();
        Boolean bool2 = this.e.get();
        boolean z = true;
        boolean z2 = C8632dsu.c((Object) profileGuid, (Object) str2) && C8632dsu.c((Object) this.f.a(), (Object) profileGuid);
        if (!C8632dsu.c(valueOf, bool2) || !C8632dsu.c(valueOf, bool)) {
            z = false;
        }
        if (C8632dsu.c(this.a, Boolean.valueOf(z2)) && C8632dsu.c(this.d, Boolean.valueOf(z))) {
            return;
        }
        this.a = Boolean.valueOf(z2);
        this.d = Boolean.valueOf(z);
        cVar.getLogTag();
        if (!z || !z2) {
            aFR afr = this.i.get();
            JSONObject put = new JSONObject().put("userProfileIsKids", valueOf);
            C8632dsu.d(bool2);
            JSONObject put2 = put.put("hendrixIsKids", bool2.booleanValue());
            C8632dsu.d(bool);
            JSONObject put3 = put2.put("browseExperienceIsKids", bool.booleanValue()).put("userProfileGuid", profileGuid).put("hendrixProfileGuid", str2).put(Payload.PARAM_RENO_REQUEST_ID, afr.d()).put("rulesetVersion", afr.b()).put("profileGuidFromComponent", this.f.a()).put("tag", str);
            cVar.getLogTag();
            flexEvent = new FlexEvent("android.hendrix.validation.mismatch", new String[]{"AndroidHendrixValidation"}, new JSONObject(), put3);
        } else {
            flexEvent = new FlexEvent("android.hendrix.validation.match", new String[]{"AndroidHendrixValidation"}, new JSONObject(), new JSONObject().put("userProfileGuid", profileGuid));
        }
        Logger.INSTANCE.logEvent(flexEvent);
    }
}
