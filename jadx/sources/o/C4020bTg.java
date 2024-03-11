package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.DiscreteEvent;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.cl.util.EventListener;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.bTg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4020bTg implements InterfaceC5841cKi {
    public static final c d = new c(null);
    private static final Map<String, String> e = new LinkedHashMap();
    private final List<String> b;
    private final Map<String, Object> c = new LinkedHashMap();

    public C4020bTg() {
        List<String> j;
        j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "row", "rank", "trackId", Payload.PARAM_RENO_REQUEST_ID, "listId");
        this.b = j;
        Logger.INSTANCE.addEventListener(new EventListener() { // from class: o.bTh
            @Override // com.netflix.cl.util.EventListener
            public final void onDiscreteEvent(DiscreteEvent discreteEvent) {
                C4020bTg.e(C4020bTg.this, discreteEvent);
            }
        });
    }

    /* renamed from: o.bTg$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4020bTg c4020bTg, DiscreteEvent discreteEvent) {
        C8632dsu.c((Object) c4020bTg, "");
        C8632dsu.c((Object) discreteEvent, "");
        if (discreteEvent instanceof Presented) {
            c4020bTg.a((Presented) discreteEvent);
        }
    }

    public void a(Presented presented) {
        JSONObject jSONObject;
        CharSequence n;
        C8632dsu.c((Object) presented, "");
        TrackingInfo trackingInfo = presented.trackingInfo();
        if (trackingInfo != null && (jSONObject = trackingInfo.toJSONObject()) != null) {
            StringBuilder sb = new StringBuilder();
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            for (String str7 : this.b) {
                String b = b(jSONObject, str7);
                sb.append(str7 + "=" + b + " ");
                switch (str7.hashCode()) {
                    case -1102509479:
                        if (str7.equals("listId")) {
                            str2 = b;
                            break;
                        } else {
                            break;
                        }
                    case -1067396154:
                        if (str7.equals("trackId")) {
                            str4 = b;
                            break;
                        } else {
                            break;
                        }
                    case 113114:
                        if (str7.equals("row")) {
                            str5 = b;
                            break;
                        } else {
                            break;
                        }
                    case 3492908:
                        if (str7.equals("rank")) {
                            str6 = b;
                            break;
                        } else {
                            break;
                        }
                    case 452782838:
                        if (str7.equals(SignupConstants.Field.VIDEO_ID)) {
                            str = b;
                            break;
                        } else {
                            break;
                        }
                    case 693933066:
                        if (str7.equals(Payload.PARAM_RENO_REQUEST_ID)) {
                            str3 = b;
                            break;
                        } else {
                            break;
                        }
                }
            }
            String b2 = b(str, str2, str3, str4, str5, str6);
            this.c.put(b2, presented);
            C1044Mm.e("EpoxyPresentationTrackingDebugScreen", "log " + b2);
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            n = duD.n((CharSequence) sb2);
            if (n.toString() != null) {
                return;
            }
        }
        C8632dsu.a(presented.toJSONObject().toString(), "");
    }

    private final String b(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = e.get(str2);
        return "rid=" + str3 + " lid=" + str2 + " vid=" + str + " tid=" + str4 + " row=" + str5 + " rank=" + str6 + " lc=" + ((Object) str7);
    }

    private final String b(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            C8632dsu.a(string, "");
            return string;
        }
        return "-";
    }
}
