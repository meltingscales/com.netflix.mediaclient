package com.netflix.android.volley;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import o.C9852xm;
import o.C9858xs;
import o.C9862xw;
import o.C9864xy;
import o.C9865xz;
import o.InterfaceC9814xA;
import o.InterfaceC9817xD;
import o.InterfaceC9818xE;
import o.InterfaceC9854xo;

/* loaded from: classes2.dex */
public abstract class Request<T> implements Comparable<Request<T>> {
    protected final long b;
    private InterfaceC9818xE f;
    private final C9864xy.b g;
    private InterfaceC9817xD h;
    private int j;
    private int k;
    private final int l;
    private List<Object> m;
    private HttpURLConnection n;
    private long p;
    private InterfaceC9814xA q;
    private C9865xz t;
    private Object u;
    private String v;
    private Integer x;
    private boolean d = true;
    private ResourceLocationType s = ResourceLocationType.UNSET;
    private final C9862xw.d i = null;
    private boolean y = true;
    private boolean e = false;
    private boolean r = false;
    public int c = 0;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13124o = false;
    private InterfaceC9854xo.d a = null;

    /* loaded from: classes2.dex */
    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    /* loaded from: classes2.dex */
    public enum ResourceLocationType {
        UNSET,
        CACHE,
        NETWORK
    }

    public boolean A() {
        return this.f13124o;
    }

    public boolean C() {
        return false;
    }

    public boolean D() {
        return this.e;
    }

    public final boolean G() {
        return this.y;
    }

    public void H() {
        this.d = true;
    }

    public void I() {
        this.r = true;
    }

    public boolean N() {
        return 1 == this.l;
    }

    public void a(HttpURLConnection httpURLConnection) {
        this.n = httpURLConnection;
    }

    public void a(InterfaceC9817xD interfaceC9817xD) {
        this.h = interfaceC9817xD;
    }

    public abstract C9864xy<T> b(C9858xs c9858xs);

    public abstract void b(T t);

    public void b(C9865xz c9865xz) {
        this.t = c9865xz;
    }

    public void c(boolean z) {
        this.f13124o = z;
    }

    public InterfaceC9854xo.d d() {
        return this.a;
    }

    public void d(Object obj) {
        this.u = obj;
    }

    public void d(String str) {
        this.v = str;
    }

    public void d(InterfaceC9854xo.d dVar) {
        this.a = dVar;
    }

    public VolleyError e(VolleyError volleyError) {
        return volleyError;
    }

    public void e(String str) {
    }

    public void e(InterfaceC9814xA interfaceC9814xA) {
        this.q = interfaceC9814xA;
    }

    public final void e(boolean z) {
        this.y = z;
    }

    public InterfaceC9818xE f() {
        return this.f;
    }

    public InterfaceC9817xD g() {
        return this.h;
    }

    public int i() {
        return this.l;
    }

    public String n() {
        return "UTF-8";
    }

    public Map<String, String> o() {
        return null;
    }

    public ResourceLocationType q() {
        return this.s;
    }

    public InterfaceC9814xA t() {
        return this.q;
    }

    public String u() {
        return this.v;
    }

    public int v() {
        return this.j;
    }

    public boolean w() {
        return this.r;
    }

    public Object y() {
        return this.u;
    }

    public int z() {
        int i = this.k + 1;
        this.k = i;
        return i;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        return d((Request) ((Request) obj));
    }

    public void c(ResourceLocationType resourceLocationType) {
        if (this.s == ResourceLocationType.UNSET) {
            this.s = resourceLocationType;
        }
    }

    public void E() {
        this.p = SystemClock.elapsedRealtime();
    }

    public long h() {
        return SystemClock.elapsedRealtime() - this.p;
    }

    public Request(int i, String str, C9864xy.b bVar) {
        this.l = i;
        this.v = str;
        this.g = bVar;
        e(new C9852xm());
        this.b = SystemClock.elapsedRealtime();
        this.j = TextUtils.isEmpty(str) ? 0 : Uri.parse(str).getHost().hashCode();
    }

    public void F() {
        if (B()) {
            try {
                Object[] objArr = new Object[3];
                objArr[0] = Boolean.valueOf(this.d);
                objArr[1] = getClass().getSimpleName();
                HttpURLConnection httpURLConnection = this.n;
                objArr[2] = httpURLConnection != null ? httpURLConnection.toString() : "null";
                C9862xw.e("Request::releaseResources: Cronet:: HTTP disconnect! connected: %b, class: %s, to: %s", objArr);
                if (this.d) {
                    this.d = false;
                    this.n.disconnect();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean B() {
        HttpURLConnection httpURLConnection = this.n;
        return httpURLConnection != null && "org.chromium.net.urlconnection.CronetHttpURLConnection".equals(httpURLConnection.getClass().getName());
    }

    public void c(String str) {
        C9865xz c9865xz = this.t;
        if (c9865xz != null) {
            c9865xz.d((Request) this);
        }
        SystemClock.elapsedRealtime();
    }

    public final void d(int i) {
        this.x = Integer.valueOf(i);
    }

    public static String b(String str, String str2) {
        try {
            String uri = Uri.parse(str).buildUpon().authority(str2).build().toString();
            C9862xw.d("Redirect: oldUrl %s, newUrl %s", str, uri);
            return uri;
        } catch (Exception e) {
            C9862xw.d(e, "failed in build redirected url redirectedHost %s, oldUrl %s", str2, str);
            return str;
        }
    }

    public void b(String str) {
        this.v = b(this.v, str);
        this.j = str.hashCode();
    }

    public String b() {
        return u();
    }

    public void e() {
        this.e = true;
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        C9865xz c9865xz = this.t;
        if (c9865xz != null) {
            c9865xz.b(this);
        }
    }

    public Map<String, String> j() {
        return Collections.emptyMap();
    }

    protected Map<String, String> k() {
        return o();
    }

    protected String r() {
        return n();
    }

    public String m() {
        return a();
    }

    public byte[] l() {
        Map<String, String> k = k();
        if (k == null || k.size() <= 0) {
            return null;
        }
        return e(k, r());
    }

    public String a() {
        return "application/x-www-form-urlencoded; charset=" + n();
    }

    public byte[] Q_() {
        Map<String, String> o2 = o();
        if (o2 == null || o2.size() <= 0) {
            return null;
        }
        return e(o2, n());
    }

    private byte[] e(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append('=');
                    sb.append(URLEncoder.encode(entry.getValue(), str));
                    sb.append('&');
                }
            }
            return sb.toString().getBytes(str);
        } catch (Exception e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    public Priority s() {
        return Priority.NORMAL;
    }

    public final int x() {
        return this.q.d();
    }

    public void a_(VolleyError volleyError) {
        C9864xy.b bVar = this.g;
        if (bVar != null) {
            bVar.b(volleyError);
        }
    }

    public void c(Object obj) {
        synchronized (this) {
            if (this.m == null) {
                this.m = new CopyOnWriteArrayList();
            }
            this.m.add(obj);
        }
    }

    public List<Object> p() {
        List<Object> list = this.m;
        return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public boolean d(Class cls) {
        for (Object obj : p()) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public void b(InterfaceC9818xE interfaceC9818xE) {
        if (!interfaceC9818xE.equals(this.f)) {
            this.k = 0;
            b(interfaceC9818xE.host());
        }
        this.f = interfaceC9818xE;
    }

    public int d(Request<T> request) {
        Priority s = s();
        Priority s2 = request.s();
        if (s == s2) {
            return this.x.intValue() - request.x.intValue();
        }
        return s2.ordinal() - s.ordinal();
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(v());
        StringBuilder sb = new StringBuilder();
        sb.append(this.e ? "[X] " : "[ ] ");
        sb.append(u());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(s());
        sb.append(" ");
        sb.append(this.x);
        sb.append(" ");
        sb.append(y());
        return sb.toString();
    }
}
