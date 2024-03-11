package o;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import com.netflix.mediaclient.media.VideoResolutionRange;
import com.netflix.mediaclient.service.net.NetworkType;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioStreamConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import o.InterfaceC4657bie;

/* renamed from: o.bht  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4619bht extends BroadcastReceiver implements InterfaceC4657bie {
    private final ActivityManager a;
    private NetworkCapabilities b;
    private C4598bhY c;
    private final C4612bhm e;
    private final Gson f;
    private final Context h;
    private int i;
    private final aOV j;
    private final boolean k;
    private final aHJ m;
    private final ConnectivityManager.NetworkCallback n;
    private final Map<StreamProfileType, Integer> d = new HashMap();
    private final List<InterfaceC4657bie.b> g = new CopyOnWriteArrayList();

    /* renamed from: o  reason: collision with root package name */
    private final ActivityManager.MemoryInfo f13598o = new ActivityManager.MemoryInfo();
    private int l = -1;

    @Override // o.InterfaceC4657bie
    public NetworkCapabilities a() {
        return this.b;
    }

    @Override // o.InterfaceC4657bie
    public C4598bhY e() {
        return this.c;
    }

    public C4619bht(Context context, aOV aov, aHJ ahj) {
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: o.bht.5
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                NetworkCapabilities networkCapabilities;
                if (Build.VERSION.SDK_INT >= 26 || (networkCapabilities = ((ConnectivityManager) C4619bht.this.h.getSystemService("connectivity")).getNetworkCapabilities(network)) == null) {
                    return;
                }
                onCapabilitiesChanged(network, networkCapabilities);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                String str;
                WifiInfo connectionInfo;
                NetworkType b;
                C4619bht.this.b = networkCapabilities;
                int i = 1;
                if (networkCapabilities.hasTransport(1)) {
                    str = "WIFI";
                } else {
                    i = 0;
                    if (networkCapabilities.hasTransport(0)) {
                        str = "MOBILE";
                    } else {
                        i = 9;
                        str = "ETHERNET";
                    }
                }
                int i2 = i;
                String str2 = str;
                boolean d = d(networkCapabilities);
                C1044Mm.c("AsePlatformContext", "has active network  %s .", str2);
                String b2 = ConnectivityUtils.b(C4619bht.this.h);
                if (C4598bhY.b(i2)) {
                    NetworkInfo a = ConnectivityUtils.a(C4619bht.this.h);
                    if (a == null) {
                        b = NetworkType.NONE;
                    } else {
                        b = NetworkType.b(a.getSubtype());
                    }
                    C4619bht.this.c = new C4670bir(str2, i2, true, d, b2, b, -1, -1);
                } else if (C4598bhY.a(i2)) {
                    WifiManager j = ConnectivityUtils.j(C4619bht.this.h);
                    C4619bht.this.c = new C4667bio(str2, i2, true, d, b2, (j == null || (connectionInfo = j.getConnectionInfo()) == null) ? -1 : connectionInfo.getNetworkId());
                } else {
                    C4619bht.this.c = new C4598bhY(str2, i2, true, d, b2);
                }
                for (InterfaceC4657bie.b bVar : C4619bht.this.g) {
                    bVar.d(C4619bht.this.c);
                }
            }

            private boolean d(NetworkCapabilities networkCapabilities) {
                NetworkInfo a;
                return ((networkCapabilities.hasTransport(4) && (a = ConnectivityUtils.a(C4619bht.this.h)) != null && a.getType() == 1) || networkCapabilities.hasCapability(11) || b(networkCapabilities)) ? false : true;
            }

            private boolean b(NetworkCapabilities networkCapabilities) {
                return Build.VERSION.SDK_INT >= 30 && C4618bhs.a.d().bJ().contains(ConnectivityUtils.i(C4619bht.this.h)) && networkCapabilities.hasCapability(25);
            }
        };
        this.n = networkCallback;
        this.h = context;
        this.j = aov;
        this.m = ahj;
        C4618bhs c4618bhs = C4618bhs.a;
        aov.a(c4618bhs);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && c4618bhs.d().cb()) {
            this.k = true;
            this.c = new C4598bhY("NONE", 1, false, false, null);
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } else {
            this.k = false;
            a(context);
            ContextCompat.registerReceiver(context, this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
        }
        this.a = (ActivityManager) context.getSystemService("activity");
        GsonBuilder gsonBuilder = new GsonBuilder();
        try {
            Object obj = C1043Ml.p.get(9190152);
            if (obj == null) {
                obj = ((Class) C1043Ml.c((char) 0, 5, 112)).getMethod("c", null);
                C1043Ml.p.put(9190152, obj);
            }
            Gson create = gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory) ((Method) obj).invoke(null, null)).create();
            this.f = create;
            this.e = new C4612bhm(create, context);
            this.i = aov.A();
            l();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // o.InterfaceC4657bie
    public Object b$42498405() {
        return this.e.d$42498405();
    }

    @Override // o.InterfaceC4657bie
    public void n() {
        this.e.b();
    }

    @Override // o.InterfaceC4657bie
    public AseConfig b(StreamProfileType streamProfileType, String str) {
        return C4618bhs.a.b(streamProfileType, str);
    }

    @Override // o.InterfaceC4657bie
    public int h() {
        return Math.max(this.l, 16778240);
    }

    @Override // o.InterfaceC4657bie
    public void c() {
        this.a.getMemoryInfo(this.f13598o);
        ActivityManager.MemoryInfo memoryInfo = this.f13598o;
        long j = memoryInfo.availMem;
        long j2 = memoryInfo.threshold;
        Runtime runtime = Runtime.getRuntime();
        this.l = (((int) Math.min(2147483647L, Math.min(j - j2, (runtime.maxMemory() - runtime.totalMemory()) + runtime.freeMemory()))) >> 21) << 20;
        if (this.j.E() > 0) {
            this.l = Math.min(this.l, this.j.E());
        }
    }

    @Override // o.InterfaceC4657bie
    public int i() {
        return h() + 3145728;
    }

    @Override // o.InterfaceC4657bie
    public int d(StreamProfileType streamProfileType) {
        if (this.d.get(streamProfileType) != null) {
            return this.d.get(streamProfileType).intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // o.InterfaceC4657bie
    public boolean g() {
        return C4598bhY.a(e().b());
    }

    @Override // o.InterfaceC4657bie
    public StreamRange e(AseConfig aseConfig, boolean z) {
        if (InterfaceC4657bie.e(this) || (z && aseConfig.bH())) {
            if (o()) {
                if (k()) {
                    return aseConfig.ao();
                }
                return aseConfig.bF();
            }
            return aseConfig.aL();
        }
        return aseConfig.bd();
    }

    @Override // o.InterfaceC4657bie
    public AudioStreamConfig a(AseConfig aseConfig, boolean z) {
        if (InterfaceC4657bie.e(this) || (z && aseConfig.bH())) {
            if (o()) {
                if (k()) {
                    return aseConfig.aq();
                }
                return aseConfig.bG();
            }
            return aseConfig.aC();
        }
        return aseConfig.aZ();
    }

    public int a$1a64f078(int i, AseConfig aseConfig, Object[] objArr, boolean z) {
        try {
            Object[] objArr2 = {Integer.valueOf(i), aseConfig, objArr, Integer.valueOf(i()), Boolean.valueOf(z)};
            Object obj = C4755bkv.q.get(612741390);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 19864, 5, 2557)).getMethod("d", Integer.TYPE, AseConfig.class, Array.newInstance((Class) C4755bkv.b((char) 0, 117, 2358), 0).getClass(), Integer.TYPE, Boolean.TYPE);
                C4755bkv.q.put(612741390, obj);
            }
            return ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public void m() {
        n();
        if (!this.k) {
            this.h.unregisterReceiver(this);
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.h.getSystemService("connectivity");
        if (connectivityManager != null) {
            connectivityManager.unregisterNetworkCallback(this.n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d A[LOOP:0: B:26:0x0087->B:28:0x008d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r11) {
        /*
            r10 = this;
            android.net.NetworkInfo r0 = com.netflix.mediaclient.util.ConnectivityUtils.a(r11)
            if (r0 == 0) goto L99
            int r3 = r0.getType()
            java.lang.String r2 = r0.getTypeName()
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r4 = "AsePlatformContext"
            java.lang.String r5 = "has active network  %s ."
            o.C1044Mm.c(r4, r5, r1)
            boolean r4 = r0.isConnectedOrConnecting()
            java.lang.String r6 = com.netflix.mediaclient.util.ConnectivityUtils.b(r11)
            boolean r1 = o.C4598bhY.b(r3)
            r5 = -1
            if (r1 == 0) goto L55
            org.json.JSONObject r11 = com.netflix.mediaclient.util.ConnectivityUtils.c(r11)
            if (r11 == 0) goto L41
            java.lang.String r1 = "mnc"
            int r1 = r11.getInt(r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = "mcc"
            int r11 = r11.getInt(r7)     // Catch: org.json.JSONException -> L3e
            r8 = r11
            r9 = r1
            goto L43
        L3d:
            r1 = r5
        L3e:
            r9 = r1
            r8 = r5
            goto L43
        L41:
            r8 = r5
            r9 = r8
        L43:
            int r11 = r0.getSubtype()
            com.netflix.mediaclient.service.net.NetworkType r7 = com.netflix.mediaclient.service.net.NetworkType.b(r11)
            o.bir r11 = new o.bir
            r5 = 1
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.c = r11
            goto L81
        L55:
            boolean r0 = o.C4598bhY.a(r3)
            if (r0 == 0) goto L78
            android.net.wifi.WifiManager r11 = com.netflix.mediaclient.util.ConnectivityUtils.j(r11)
            if (r11 == 0) goto L81
            android.net.wifi.WifiInfo r11 = r11.getConnectionInfo()
            if (r11 == 0) goto L6d
            int r11 = r11.getNetworkId()
            r7 = r11
            goto L6e
        L6d:
            r7 = r5
        L6e:
            o.bio r11 = new o.bio
            r5 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.c = r11
            goto L81
        L78:
            o.bhY r11 = new o.bhY
            r5 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r10.c = r11
        L81:
            java.util.List<o.bie$b> r11 = r10.g
            java.util.Iterator r11 = r11.iterator()
        L87:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r0 = r11.next()
            o.bie$b r0 = (o.InterfaceC4657bie.b) r0
            o.bhY r1 = r10.c
            r0.d(r1)
            goto L87
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4619bht.a(android.content.Context):void");
    }

    @Override // o.InterfaceC4657bie
    public void c(InterfaceC4657bie.b bVar) {
        this.g.add(bVar);
    }

    @Override // o.InterfaceC4657bie
    public void b(InterfaceC4657bie.b bVar) {
        this.g.remove(bVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
    }

    @Override // o.InterfaceC4657bie
    public boolean o() {
        return C1613aHu.k(this.h);
    }

    public boolean k() {
        return C1613aHu.i(this.h);
    }

    public void d(VideoResolutionRange videoResolutionRange) {
        if (videoResolutionRange.getMaxHeight() != this.i) {
            this.i = videoResolutionRange.getMaxHeight();
            for (InterfaceC4657bie.b bVar : this.g) {
                bVar.a(this.i);
            }
        }
    }

    public void l() {
        p();
    }

    private void p() {
        StreamProfileType[] values;
        this.d.clear();
        for (StreamProfileType streamProfileType : StreamProfileType.values()) {
            int d = C1613aHu.d(this.h, this.j.b(streamProfileType));
            if (d > 0) {
                this.d.put(streamProfileType, Integer.valueOf(d));
            }
        }
    }

    @Override // o.InterfaceC4657bie
    public int d() {
        return this.m.a();
    }

    @Override // o.InterfaceC4657bie
    public int f() {
        return this.m.c();
    }

    @Override // o.InterfaceC4657bie
    public int j() {
        return this.m.e();
    }
}
