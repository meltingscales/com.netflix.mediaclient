package o;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.netflix.android.volley.Request;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes.dex */
public class aHM implements aHJ {
    private static ExperimentalCronetEngine d;
    private aHC b;
    private final Context c;

    public aHM(Context context) {
        this.c = context;
        this.b = new aHC(context);
        if (d == null) {
            ExperimentalCronetEngine d2 = aHK.d(context);
            d2.addRequestFinishedListener(aHB.d(this.b));
            d = d2;
        }
        if (Build.VERSION.SDK_INT < 28) {
            new Date().toString();
        }
    }

    @Override // o.aHJ
    public HttpURLConnection c(URL url) {
        return new C1627aIh(url, d);
    }

    @Override // o.aHJ
    public aHF a(String str, Request.Priority priority, Map<String, String> map, Object obj, List<Object> list) {
        return new aHU(d, str, priority, map, obj, list);
    }

    public void b(aHH ahh) {
        aHC ahc = this.b;
        if (ahc != null) {
            ahc.d(ahh);
        }
    }

    @Override // o.aHJ
    public int a() {
        int downstreamThroughputKbps;
        ExperimentalCronetEngine experimentalCronetEngine = d;
        if (experimentalCronetEngine == null || (downstreamThroughputKbps = experimentalCronetEngine.getDownstreamThroughputKbps()) <= 0) {
            return -1;
        }
        return downstreamThroughputKbps;
    }

    @Override // o.aHJ
    public int c() {
        int httpRttMs;
        ExperimentalCronetEngine experimentalCronetEngine = d;
        if (experimentalCronetEngine == null || (httpRttMs = experimentalCronetEngine.getHttpRttMs()) <= 0) {
            return -1;
        }
        return httpRttMs;
    }

    @Override // o.aHJ
    public int e() {
        int transportRttMs;
        ExperimentalCronetEngine experimentalCronetEngine = d;
        if (experimentalCronetEngine == null || (transportRttMs = experimentalCronetEngine.getTransportRttMs()) <= 0) {
            return -1;
        }
        return transportRttMs;
    }

    @Override // o.aHJ
    public C9865xz a(InterfaceC9854xo interfaceC9854xo, InterfaceC9857xr interfaceC9857xr, int i, boolean z, String str) {
        aHL ahl = new aHL(this.c, d, z);
        if (ahl.e()) {
            i = 1;
        }
        return new C9865xz(interfaceC9854xo, interfaceC9857xr, i, new C9855xp(new Handler(Looper.getMainLooper())), str, ahl);
    }
}
