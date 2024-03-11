package com.netflix.mediaclient.service.webclient.ftl;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import com.netflix.cl.Logger;
import com.netflix.cl.model.context.ftl.Target;
import com.netflix.cl.model.context.ftl.Via;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.ftl.BackgroundSession;
import com.netflix.cl.model.event.session.ftl.ColdStartSession;
import com.netflix.cl.model.event.session.ftl.ConfigChangedSession;
import com.netflix.cl.model.event.session.ftl.NetworkChangeSession;
import com.netflix.cl.model.event.session.ftl.WarmStartSession;
import com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.FtlTarget;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C1044Mm;
import o.C5032brB;
import o.C5033brC;
import o.C5036brF;
import o.C5044brN;
import o.C5082brz;
import o.C8193dfk;
import o.C9858xs;
import o.InterfaceC9817xD;
import o.InterfaceC9818xE;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class FtlSession implements InterfaceC9817xD {
    private static final long c = TimeUnit.SECONDS.toMillis(30);
    public Type a;
    public final FtlConfig b;
    private boolean e;
    private int f;
    private InterfaceC9818xE g;
    private long h;
    private int i;
    private int j;
    private boolean k;
    private long l;
    private final C5033brC m;
    private JSONObject n;

    /* renamed from: o  reason: collision with root package name */
    private String f13232o;
    private Long r;
    private int s;
    private boolean q = true;
    private AtomicBoolean p = new AtomicBoolean(false);
    public final String d = C8193dfk.b();
    private final long t = SystemClock.elapsedRealtime();

    public int a() {
        return this.f;
    }

    public void a(boolean z) {
        this.q = z;
    }

    @Override // o.InterfaceC9817xD
    public InterfaceC9818xE b() {
        return this.g;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public JSONObject c() {
        return this.n;
    }

    public int d() {
        return this.i;
    }

    public int e() {
        return this.s;
    }

    public String g() {
        return this.f13232o;
    }

    public boolean i() {
        return this.q;
    }

    public boolean j() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FtlSession(C5033brC c5033brC, Type type, FtlConfig ftlConfig) {
        this.m = c5033brC;
        this.a = type;
        this.b = ftlConfig;
        this.g = ftlConfig.nextTarget(null);
        Logger logger = Logger.INSTANCE;
        this.r = logger.startSession(n());
        logger.addContext(new Target(this.g.name(), this.g.host()));
        m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.p.getAndSet(true)) {
            return;
        }
        Logger logger = Logger.INSTANCE;
        logger.removeExclusiveContext(Via.class);
        logger.removeExclusiveContext(Target.class);
        logger.endSession(this.r);
    }

    public long h() {
        return SystemClock.elapsedRealtime() - this.t;
    }

    @Override // o.InterfaceC9817xD
    public void e(Request request) {
        synchronized (this) {
            if (request.C()) {
                this.s++;
            }
        }
    }

    @Override // o.InterfaceC9817xD
    public void b(Request request, C9858xs c9858xs, VolleyError volleyError) {
        synchronized (this) {
            if (request.C()) {
                if (c9858xs == null && volleyError != null) {
                    c9858xs = volleyError.b;
                }
                c(c9858xs);
                C5032brB e = C5032brB.e(c9858xs, volleyError);
                if (e != null && !e.e && !this.q && !this.e) {
                    C1044Mm.d("nf_ftl", "%s occurred, but network is disconnected. ignoring error", e);
                    e = null;
                }
                C5032brB c5032brB = e;
                boolean z = false;
                if (c5032brB == null) {
                    this.i = 0;
                    this.j = 0;
                    this.k = false;
                } else {
                    this.f++;
                    this.i++;
                    if (request.f() == this.g) {
                        this.j++;
                    }
                    if ((request.z() < this.b.maxTries() && !c5032brB.e) || !c(request, c5032brB)) {
                        boolean isStickyTarget = this.b.isStickyTarget(request.f());
                        boolean z2 = isStickyTarget && this.k;
                        if (isStickyTarget && this.j >= this.b.errorsThrottleLimit()) {
                            z = true;
                        }
                        if (!z2) {
                            this.m.a(new C5082brz(this, request, c5032brB, false, z));
                        }
                        if (z) {
                            this.k = true;
                        }
                    }
                }
            }
        }
    }

    public boolean e(String str) {
        try {
            String host = Uri.parse(str).getHost();
            if (this.b.hosts().contains(host)) {
                return true;
            }
            for (FtlTarget ftlTarget : this.b.targets()) {
                if (ftlTarget.host().equals(host)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            C1044Mm.b("nf_ftl", e, "unable to determine if URL %s is eligible for FTL", str);
            return false;
        }
    }

    public String a(String str) {
        try {
            if (this.b.hostMap().isEmpty()) {
                return null;
            }
            return this.b.hostMap().get(Uri.parse(str).getHost().toLowerCase(Locale.US));
        } catch (Exception e) {
            C1044Mm.b("nf_ftl", e, "unable to determine if URL %s is eligible for FTL", str);
            return null;
        }
    }

    private void m() {
        synchronized (this) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cell", this.b.cell());
                jSONObject.put("target", b().name());
                jSONObject.put("hostname", b().host());
                jSONObject.put("via", g());
                jSONObject.put("session_type", this.a.toString());
                jSONObject.put("session_id", this.d);
                jSONObject.put("targets", new JSONArray(this.b.getTargetNames()));
                this.n = jSONObject;
            } catch (JSONException e) {
                C1044Mm.b("nf_ftl", e, "unable to create logblob snapshot", new Object[0]);
            }
        }
    }

    private void c(C9858xs c9858xs) {
        String d = C5044brN.d(c9858xs);
        if (d != null) {
            c(d);
        }
    }

    private void c(String str) {
        synchronized (this) {
            if (!this.p.get() && !TextUtils.equals(str, this.f13232o)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f13232o == null || elapsedRealtime >= this.l + c) {
                    Logger logger = Logger.INSTANCE;
                    logger.removeExclusiveContext(Via.class);
                    if (str != null) {
                        logger.addContext(new Via(str));
                    }
                    this.f13232o = str;
                    this.l = elapsedRealtime;
                    m();
                }
            }
        }
    }

    private boolean c(Request request, C5032brB c5032brB) {
        InterfaceC9818xE nextTarget;
        synchronized (this) {
            InterfaceC9818xE f = request.f();
            if (f == null) {
                C1044Mm.d("nf_ftl", "ignoring fallback request - could not find target for existing request");
            }
            if (this.g != f) {
                C1044Mm.b("nf_ftl", "ignoring fallback request - fallback already occurred from another request");
                return false;
            }
            boolean z = this.h > 0 && SystemClock.elapsedRealtime() - this.h < this.b.targetResetDelay();
            if (this.b.allowTargetReset() && z && !c5032brB.e) {
                C1044Mm.b("nf_ftl", "ignoring fallback request - all paths failed and currently within target reset delay");
                return false;
            }
            InterfaceC9818xE nextTarget2 = this.b.nextTarget(f);
            if (nextTarget2 == f && this.b.allowTargetReset() && nextTarget2 != (nextTarget = this.b.nextTarget(null))) {
                this.h = SystemClock.elapsedRealtime();
                nextTarget2 = nextTarget;
            }
            if (nextTarget2 == f) {
                C1044Mm.e("nf_ftl", "ignoring fallback request - no more targets available in config");
                return false;
            }
            C1044Mm.c("nf_ftl", "falling over from %s to %s", this.g, nextTarget2);
            this.m.a(new C5082brz(this, request, c5032brB, true, false));
            c((String) null);
            Logger logger = Logger.INSTANCE;
            logger.removeExclusiveContext(Target.class);
            this.g = nextTarget2;
            this.j = 0;
            logger.addContext(new Target(nextTarget2.name(), this.g.host()));
            if (this.b.sendFallbackFtlSessionLog()) {
                Type type = Type.FALLBACK;
                this.a = type;
                m();
                this.m.a(new C5036brF(type, this));
            } else {
                m();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.webclient.ftl.FtlSession$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[Type.values().length];
            d = iArr;
            try {
                iArr[Type.COLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[Type.WARM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[Type.NETWORKCHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[Type.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[Type.CONFIGCHANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private Session n() {
        long cell = this.b.cell();
        int i = AnonymousClass2.d[this.a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return new ConfigChangedSession(Long.valueOf(cell), this.b.getTargetNames());
                    }
                    return new BackgroundSession(Long.valueOf(cell), this.b.getTargetNames());
                }
                return new NetworkChangeSession(Long.valueOf(cell), this.b.getTargetNames());
            }
            return new WarmStartSession(Long.valueOf(cell), this.b.getTargetNames());
        }
        return new ColdStartSession(Long.valueOf(cell), this.b.getTargetNames());
    }

    /* loaded from: classes4.dex */
    public enum Type {
        COLD("cold"),
        WARM("warm"),
        NETWORKCHANGE("networkchange"),
        BACKGROUND("background"),
        CONFIGCHANGE("configchange"),
        FALLBACK("fallback");
        
        private final String g;

        @Override // java.lang.Enum
        public String toString() {
            return this.g;
        }

        Type(String str) {
            this.g = str;
        }
    }
}
