package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.DeviceConnectionStatus;
import com.netflix.cl.model.MdxDiscoveryFinalStatus;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.dial.DeviceInfo;
import com.netflix.cl.model.event.discrete.MdxDeviceConnectionReported;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.command.CancelCommand;
import com.netflix.cl.model.event.session.command.CloseCommand;
import com.netflix.cl.model.event.session.command.SubmitCommand;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class cVU {
    public static final a b = new a(null);
    private Long a;

    /* loaded from: classes6.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("TvDiscoveryCL");
        }
    }

    public final void a(AppView appView, TrackingInfo trackingInfo) {
        C8632dsu.c((Object) appView, "");
        b();
        this.a = Logger.INSTANCE.startSession(new Presentation(appView, trackingInfo));
        b.getLogTag();
    }

    public final boolean b() {
        Long l = this.a;
        if (l != null) {
            long longValue = l.longValue();
            b.getLogTag();
            Logger.INSTANCE.endSession(Long.valueOf(longValue));
            this.a = null;
            return true;
        }
        return false;
    }

    public final void a(List<cVR> list, boolean z) {
        MdxDiscoveryFinalStatus mdxDiscoveryFinalStatus;
        C8632dsu.c((Object) list, "");
        if (z) {
            mdxDiscoveryFinalStatus = MdxDiscoveryFinalStatus.userStopConnection;
        } else {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (cVR cvr : list) {
                    if (cvr.a() != 3) {
                        mdxDiscoveryFinalStatus = MdxDiscoveryFinalStatus.connectionError;
                        break;
                    }
                }
            }
            mdxDiscoveryFinalStatus = MdxDiscoveryFinalStatus.connectionSuccess;
        }
        DeviceConnectionStatus[] deviceConnectionStatusArr = new DeviceConnectionStatus[list.size()];
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                C8569dql.h();
            }
            cVR cvr2 = (cVR) obj;
            deviceConnectionStatusArr[i] = new DeviceConnectionStatus(Boolean.valueOf(cvr2.a() == 3), new DeviceInfo(null, null, null, null, cvr2.c(), null));
            i++;
        }
        Logger.INSTANCE.logEvent(new MdxDeviceConnectionReported(mdxDiscoveryFinalStatus, deviceConnectionStatusArr));
        b.getLogTag();
    }

    public static /* synthetic */ TrackingInfo a(cVU cvu, Collection collection, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cvu.a(collection, z);
    }

    public final TrackingInfo a(final Collection<cVR> collection, final boolean z) {
        C8632dsu.c((Object) collection, "");
        return new TrackingInfo() { // from class: o.cVX
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject b2;
                b2 = cVU.b(collection, z);
                return b2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(Collection collection, boolean z) {
        C8632dsu.c((Object) collection, "");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        ArrayList<cVR> arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((cVR) obj).d() || z) {
                arrayList.add(obj);
            }
        }
        for (cVR cvr : arrayList) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uuid", cvr.c());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("devices", jSONArray);
        return jSONObject;
    }

    public final void d() {
        Map d;
        Map k;
        Throwable th;
        if (this.a != null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("screenPresentationSessionId should have been ended before", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
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
            } else {
                dVar.e().b(c1596aHd, th);
            }
            b();
        }
    }

    public final void a() {
        b.getLogTag();
        CLv2Utils.d(new SubmitCommand());
    }

    public final void c() {
        b.getLogTag();
        CLv2Utils.d(new CancelCommand());
    }

    public final void e() {
        b.getLogTag();
        CLv2Utils.d(new CloseCommand());
    }
}
