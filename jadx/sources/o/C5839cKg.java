package o;

import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: o.cKg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5839cKg {
    private final HashMap<String, Long> c = new HashMap<>();
    public static final a b = new a(null);
    public static final int a = 8;

    /* renamed from: o.cKg$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    public final void d(String str, AppView appView, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        long currentTimeMillis = System.currentTimeMillis();
        Long l = this.c.get(str);
        if (l == null) {
            l = Long.valueOf(currentTimeMillis);
        }
        if (currentTimeMillis >= l.longValue()) {
            this.c.put(str, Long.valueOf(currentTimeMillis + 60000));
            CLv2Utils.b(false, appView, trackingInfoHolder.c((JSONObject) null), null);
        }
    }
}
