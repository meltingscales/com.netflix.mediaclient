package o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.netflix.cl.Logger;
import com.netflix.cl.model.context.LolomoDataModel;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONObject;

/* renamed from: o.bTf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4019bTf implements InterfaceC3994bSh {
    public static final c a = new c(null);
    private boolean c;
    private boolean d;
    private long e;
    private final NetflixFrag h;

    public boolean a() {
        return this.d;
    }

    public long c() {
        return this.e;
    }

    @Override // o.InterfaceC3994bSh
    public void d(boolean z) {
        this.d = z;
    }

    @Override // o.InterfaceC3994bSh
    public void e(boolean z) {
        this.c = z;
    }

    public boolean e() {
        return this.c;
    }

    @Inject
    public C4019bTf(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        this.h = (NetflixFrag) C9726vo.d(fragment, NetflixFrag.class);
    }

    /* renamed from: o.bTf$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("HomeTrackingImpl");
        }
    }

    @Override // o.InterfaceC3994bSh
    public void e(InterfaceC5155btS interfaceC5155btS, TrackingInfoHolder trackingInfoHolder) {
        Map l;
        C8632dsu.c((Object) interfaceC5155btS, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(interfaceC5155btS, linkedHashMap);
        l = dqE.l(linkedHashMap);
        Logger.INSTANCE.addContext(new LolomoDataModel(trackingInfoHolder.c(new JSONObject(l))));
    }

    @Override // o.InterfaceC3994bSh
    public Map<String, String> d(InterfaceC5155btS interfaceC5155btS) {
        a.getLogTag();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(interfaceC5155btS, linkedHashMap);
        linkedHashMap.put("isThisFragmentFirstStartForProcess", String.valueOf(e()));
        linkedHashMap.put("isNavigationViaAppColdStart", String.valueOf(a()));
        return linkedHashMap;
    }

    @Override // o.InterfaceC3994bSh
    public void e(InterfaceC5155btS interfaceC5155btS, Map<String, String> map) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) map, "");
        c cVar = a;
        cVar.getLogTag();
        if (interfaceC5155btS != null) {
            if (interfaceC5155btS.getId() == null) {
                InterfaceC1593aHa.c.a(String.valueOf(interfaceC5155btS));
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("SPY-33735 - lolomo summary.id is null, nothing to populate.", null, null, false, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b);
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
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                    return;
                } else {
                    dVar.e().b(c1596aHd, th);
                    return;
                }
            } else if (this.h.getContext() != null) {
                map.put("lolomoId", interfaceC5155btS.getId());
                map.put("isFromCache", String.valueOf(interfaceC5155btS.isFromCache()));
                long currentTimeMillis = System.currentTimeMillis();
                map.put("lolomoAge", String.valueOf(currentTimeMillis - interfaceC5155btS.getCreateTime()));
                map.put("timeToExpiry", String.valueOf(interfaceC5155btS.getExpiryTimeStamp() - currentTimeMillis));
                map.put("lolomoBeforePrefetchTimeSinceExpiry", String.valueOf(currentTimeMillis - c()));
                C1918aTb c1918aTb = C1918aTb.a;
                Context requireContext = this.h.requireContext();
                C8632dsu.a(requireContext, "");
                map.put("timeSinceInsomniaInMins", String.valueOf(TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis - c1918aTb.e(requireContext, currentTimeMillis))));
                if (this.h.bl_() != null) {
                    InterfaceC5283bvo b2 = C8126deW.b();
                    map.put("clientProfileGuid", String.valueOf(b2 != null ? b2.getProfileGuid() : null));
                    map.put("isKidsProfile", String.valueOf(b2 != null ? Boolean.valueOf(b2.isKidsProfile()) : null));
                    return;
                }
                return;
            } else {
                cVar.getLogTag();
                return;
            }
        }
        cVar.getLogTag();
    }
}
