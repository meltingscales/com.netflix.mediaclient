package o;

import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.Iterator;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.Vm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1277Vm implements TrackingInfo {
    public static final a c = new a(null);
    private final JSONObject d;

    @Override // com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return this.d;
    }

    public C1277Vm(String str, InterfaceC5281bvm interfaceC5281bvm, int i, String str2, int i2, long j, JSONObject jSONObject) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) interfaceC5281bvm, "");
        String requestId = interfaceC5281bvm.getRequestId();
        String impressionToken = interfaceC5281bvm.getImpressionToken();
        int trackId = interfaceC5281bvm.getTrackId();
        int listPos = interfaceC5281bvm.getListPos();
        JSONObject jSONObject2 = new JSONObject();
        this.d = jSONObject2;
        if (str != null) {
            jSONObject2.putOpt("listId", str);
        }
        jSONObject2.putOpt("time", Long.valueOf(j));
        jSONObject2.putOpt(SignupConstants.Field.VIDEO_ID, Integer.valueOf(i));
        jSONObject2.putOpt(Payload.PARAM_RENO_REQUEST_ID, requestId);
        if (impressionToken != null) {
            jSONObject2.putOpt("impressionToken", impressionToken);
        }
        jSONObject2.putOpt("trackId", Integer.valueOf(trackId));
        jSONObject2.putOpt("row", Integer.valueOf(listPos));
        jSONObject2.putOpt("rank", Integer.valueOf(i2));
        jSONObject2.putOpt("isHero", Boolean.FALSE);
        if (C8168dfL.h(str2)) {
            jSONObject2.putOpt("imageKey", str2);
        }
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                if (str3 != null) {
                    try {
                        this.d.put(str3, jSONObject.get(str3));
                    } catch (JSONException e) {
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        d = dqE.d();
                        k = dqE.k(d);
                        C1596aHd c1596aHd = new C1596aHd("Failed to add additional info for key: " + str3 + " to Tracking Info json " + jSONObject + ".", e, null, true, k, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            c1596aHd.e.put("errorType", errorType.c());
                            String b = c1596aHd.b();
                            if (b != null) {
                                c1596aHd.a(errorType.c() + " " + b);
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
                    }
                }
            }
        }
    }

    /* renamed from: o.Vm$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
