package o;

import com.netflix.android.volley.Request;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC8413dkr;

/* renamed from: o.aZe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2082aZe implements InterfaceC8413dkr {
    private final List<Object> a;
    private final List<aHF> b;
    private OutputStream c;
    private final Map<Integer, aHF> d;
    private InputStream e;
    private final Object f;
    private final Request.Priority g;
    private final aHJ h;
    private final InterfaceC2087aZj i;
    private final Map<String, String> j;
    private int l;

    /* renamed from: o  reason: collision with root package name */
    private final URL f13462o;

    public OutputStream a() {
        return this.c;
    }

    public InputStream c() {
        return this.e;
    }

    public C2082aZe(aHJ ahj, InterfaceC2087aZj interfaceC2087aZj, URL url, Object obj, List<Object> list) {
        this(ahj, interfaceC2087aZj, url, null, Request.Priority.NORMAL, obj, list);
    }

    public C2082aZe(aHJ ahj, InterfaceC2087aZj interfaceC2087aZj, URL url, Object obj, Map<String, String> map, List<Object> list) {
        this(ahj, interfaceC2087aZj, url, map, Request.Priority.NORMAL, obj, list);
    }

    public C2082aZe(aHJ ahj, InterfaceC2087aZj interfaceC2087aZj, URL url, Map<String, String> map, Request.Priority priority, Object obj, List<Object> list) {
        this.b = new ArrayList();
        this.d = new HashMap();
        this.l = 0;
        if (url == null) {
            throw new IllegalArgumentException("URL is null!");
        }
        this.h = ahj;
        this.f13462o = url;
        this.j = map;
        this.g = priority;
        this.f = obj;
        this.a = list;
        this.i = interfaceC2087aZj;
    }

    @Override // o.InterfaceC8413dkr
    public void e(int i) {
        if (C1865aRc.m()) {
            synchronized (this.b) {
                this.l = i;
                for (aHF ahf : this.b) {
                    ahf.e(i);
                }
            }
        }
    }

    public Map<String, List<String>> d(int i) {
        aHF ahf = this.d.get(Integer.valueOf(i));
        if (ahf == null) {
            C1044Mm.e("msl_MslUrlHttpURLConnectionImpl", "Connection not found for %d. This should NOT happen, check what is passed in", Integer.valueOf(i));
            return new HashMap();
        }
        Map<String, List<String>> e = ahf.e();
        InterfaceC2087aZj interfaceC2087aZj = this.i;
        if (interfaceC2087aZj != null) {
            interfaceC2087aZj.e(e);
        } else {
            C1044Mm.e("msl_MslUrlHttpURLConnectionImpl", "HttpResponseHeadersHandler not found!");
        }
        C8128deY.b("msl_MslUrlHttpURLConnectionImpl", e);
        return e;
    }

    public void b() {
        synchronized (this.b) {
            for (aHF ahf : this.b) {
                ahf.d();
            }
        }
    }

    @Override // o.InterfaceC8413dkr
    public InterfaceC8413dkr.b d() {
        C1044Mm.c("msl_MslUrlHttpURLConnectionImpl", "openConnection:: %s", this.f13462o.toString());
        final aHF a = this.h.a(this.f13462o.toString(), this.g, this.j, this.f, this.a);
        synchronized (this.b) {
            int i = this.l;
            if (i > 0) {
                a.e(i);
            }
            this.b.add(a);
        }
        return new InterfaceC8413dkr.b() { // from class: o.aZe.4
            InputStream d = null;

            @Override // o.InterfaceC8413dkr.b
            public InputStream a() {
                C1044Mm.c("msl_MslUrlHttpURLConnectionImpl", "getInputStream:: for %s", C2082aZe.this.f13462o.toString());
                if (this.d == null) {
                    this.d = new BufferedInputStream(a.c());
                    synchronized (C2082aZe.this.d) {
                        C2082aZe.this.d.put(Integer.valueOf(this.d.hashCode()), a);
                    }
                }
                return this.d;
            }

            @Override // o.InterfaceC8413dkr.b
            public OutputStream e() {
                C1044Mm.c("msl_MslUrlHttpURLConnectionImpl", "getOutputStream:: for %s", C2082aZe.this.f13462o.toString());
                return a.b();
            }
        };
    }

    /* renamed from: o.aZe$d */
    /* loaded from: classes3.dex */
    public static class d extends BufferedInputStream {
        ByteArrayOutputStream b;

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read;
            synchronized (this) {
                read = super.read();
                if (read != -1) {
                    this.b.write(read);
                }
            }
            return read;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read;
            synchronized (this) {
                read = super.read(bArr, i, i2);
                if (read != -1) {
                    this.b.write(bArr, 0, read);
                }
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr) {
            return super.read(bArr);
        }

        public byte[] e() {
            return this.b.toByteArray();
        }
    }

    /* renamed from: o.aZe$b */
    /* loaded from: classes3.dex */
    public static class b extends OutputStream {
        OutputStream a;
        ByteArrayOutputStream b;

        @Override // java.io.OutputStream
        public void write(int i) {
            this.a.write(i);
            this.b.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.a.write(bArr);
            this.b.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.a.write(bArr, i, i2);
            this.b.write(bArr, 0, i2);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.a.flush();
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        public byte[] d() {
            return this.b.toByteArray();
        }
    }
}
