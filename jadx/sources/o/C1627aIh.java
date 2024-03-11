package o;

import android.annotation.SuppressLint;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.NetworkExceptionImpl;

/* renamed from: o.aIh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1627aIh extends HttpURLConnection {
    private C1626aIg a;
    private List<Object> b;
    private final CronetEngine c;
    private boolean d;
    private IOException e;
    private boolean f;
    private UrlRequest g;
    private final List<Pair<String, String>> h;
    private AbstractC1625aIf i;
    private final ExecutorC1629aIj j;
    private int k;
    private UrlResponseInfo m;
    private Map<String, List<String>> n;

    /* renamed from: o  reason: collision with root package name */
    private List<Map.Entry<String, String>> f13425o;

    private boolean j() {
        return ((HttpURLConnection) this).chunkLength > 0;
    }

    public void c(int i) {
        this.k = i;
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return false;
    }

    public C1627aIh(URL url, CronetEngine cronetEngine) {
        super(url);
        this.b = new ArrayList();
        this.k = 3;
        this.c = cronetEngine;
        this.j = new ExecutorC1629aIj();
        this.a = new C1626aIg(this);
        this.h = new ArrayList();
    }

    @Override // java.net.URLConnection
    public void connect() {
        getOutputStream();
        f();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        if (((HttpURLConnection) this).connected) {
            this.g.cancel();
        }
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        a();
        return this.m.getHttpStatusText();
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        a();
        return this.m.getHttpStatusCode();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        try {
            a();
            return c();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            a();
            Map<String, List<String>> c = c();
            if (c.containsKey(str)) {
                List<String> list = c.get(str);
                return list.get(list.size() - 1);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        Map.Entry<String, String> a = a(i);
        if (a == null) {
            return null;
        }
        return a.getKey();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        Map.Entry<String, String> a = a(i);
        if (a == null) {
            return null;
        }
        return a.getValue();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        a();
        if (!((HttpURLConnection) this).instanceFollowRedirects && this.f) {
            throw new IOException("Cannot read response body of a redirect.");
        }
        if (this.m.getHttpStatusCode() < 400) {
            return this.a;
        }
        throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        if (this.i == null && ((HttpURLConnection) this).doOutput) {
            if (((HttpURLConnection) this).connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (j()) {
                this.i = new C1622aIc(this, ((HttpURLConnection) this).chunkLength, this.j);
                f();
            } else {
                long h = h();
                if (h != -1) {
                    this.i = new C1623aId(this, h, this.j);
                    f();
                } else {
                    C1044Mm.e("nf_network", "Outputstream is being buffered in memory.");
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.i = new aHZ(this);
                    } else {
                        this.i = new aHZ(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.i;
    }

    @SuppressLint({"NewApi"})
    private long h() {
        long j = ((HttpURLConnection) this).fixedContentLength;
        try {
            long j2 = getClass().getField("fixedContentLengthLong").getLong(this);
            return j2 != -1 ? j2 : j;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return j;
        }
    }

    private void f() {
        if (((HttpURLConnection) this).connected) {
            return;
        }
        ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) this.c.newUrlRequestBuilder(getURL().toString(), new e(), this.j);
        if (((HttpURLConnection) this).doOutput) {
            if (((HttpURLConnection) this).method.equals("GET")) {
                ((HttpURLConnection) this).method = "POST";
            }
            AbstractC1625aIf abstractC1625aIf = this.i;
            if (abstractC1625aIf != null) {
                builder.setUploadDataProvider(abstractC1625aIf.e(), (Executor) this.j);
                if (getRequestProperty("Content-Length") == null && !j()) {
                    addRequestProperty("Content-Length", Long.toString(this.i.e().getLength()));
                }
                this.i.b();
            } else if (getRequestProperty("Content-Length") == null) {
                addRequestProperty("Content-Length", "0");
            }
            if (getRequestProperty("Content-Type") == null) {
                addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            }
        }
        for (Object obj : this.b) {
            builder.addRequestAnnotation(obj);
        }
        builder.setPriority(this.k);
        for (Pair<String, String> pair : this.h) {
            builder.addHeader((String) pair.first, (String) pair.second);
        }
        if (!getUseCaches()) {
            builder.disableCache();
        }
        builder.setHttpMethod(((HttpURLConnection) this).method);
        this.g = builder.build();
        C1044Mm.d("nf_network", "--> %s", getURL().toString());
        this.g.start();
        ((HttpURLConnection) this).connected = true;
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        try {
            a();
            if (this.m.getHttpStatusCode() >= 400) {
                return this.a;
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        b(str, str2, false);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        b(str, str2, true);
    }

    private final void b(String str, String str2, boolean z) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot modify request property after connection is made.");
        }
        int c = c(str);
        if (c >= 0) {
            if (z) {
                this.h.remove(c);
            } else {
                throw new UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
            }
        }
        this.h.add(Pair.create(str, str2));
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Pair<String, String> pair : this.h) {
            if (treeMap.containsKey(pair.first)) {
                throw new IllegalStateException("Should not have multiple values.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) pair.second);
            treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        int c = c(str);
        if (c >= 0) {
            return (String) this.h.get(c).second;
        }
        return null;
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        C1044Mm.e("nf_network", "setConnectTimeout is not supported by CronetHttpURLConnection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ByteBuffer byteBuffer) {
        this.g.read(byteBuffer);
        this.j.b(getReadTimeout());
    }

    private int c(String str) {
        for (int i = 0; i < this.h.size(); i++) {
            if (((String) this.h.get(i).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aIh$e */
    /* loaded from: classes3.dex */
    public class e extends UrlRequest.Callback {
        public e() {
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            C1627aIh.this.m = urlResponseInfo;
            C1627aIh.this.d = true;
            C1627aIh.this.j.d();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            C1627aIh.this.m = urlResponseInfo;
            C1627aIh.this.j.d();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            C1044Mm.d("nf_network", "--- %s -> %s", urlResponseInfo.getUrl(), str);
            C1627aIh.this.f = true;
            try {
                URL url = new URL(str);
                boolean equals = url.getProtocol().equals(((HttpURLConnection) C1627aIh.this).url.getProtocol());
                if (((HttpURLConnection) C1627aIh.this).instanceFollowRedirects) {
                    ((HttpURLConnection) C1627aIh.this).url = url;
                }
                if (((HttpURLConnection) C1627aIh.this).instanceFollowRedirects && equals) {
                    C1627aIh.this.g.followRedirect();
                    return;
                }
            } catch (MalformedURLException unused) {
            }
            C1627aIh.this.m = urlResponseInfo;
            C1627aIh.this.g.cancel();
            c(null);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            C1044Mm.d("nf_network", "<-- %s %s", ((HttpURLConnection) C1627aIh.this).url, Integer.valueOf(urlResponseInfo.getHttpStatusCode()));
            C1627aIh.this.m = urlResponseInfo;
            c(null);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            if (cronetException != null) {
                C1044Mm.d("nf_network", "!!! %s %s", ((HttpURLConnection) C1627aIh.this).url, cronetException.getMessage());
                C1627aIh.this.m = urlResponseInfo;
                c(cronetException);
                return;
            }
            throw new IllegalStateException("Exception cannot be null in onFailed.");
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            C1044Mm.d("nf_network", "!!! %s CANCELED", urlResponseInfo.getUrl());
            C1627aIh.this.m = urlResponseInfo;
            c(new IOException("disconnect() called"));
        }

        private void c(IOException iOException) {
            C1627aIh.this.e = iOException;
            if (C1627aIh.this.a != null) {
                C1627aIh.this.a.b(iOException);
            }
            if (C1627aIh.this.i != null) {
                C1627aIh.this.i.d(iOException);
            }
            C1627aIh.this.d = true;
            C1627aIh.this.j.d();
        }
    }

    private void a() {
        AbstractC1625aIf abstractC1625aIf = this.i;
        if (abstractC1625aIf != null) {
            abstractC1625aIf.a();
            if (j()) {
                this.i.close();
            }
        }
        if (!this.d) {
            f();
            if (C1865aRc.m()) {
                this.j.b(getReadTimeout());
                if (!this.d) {
                    throw new NetworkExceptionImpl("responseStart timeout", 4, -1);
                }
            } else {
                this.j.c();
            }
        }
        d();
    }

    private void d() {
        if (!this.d) {
            throw new IllegalStateException("No response.");
        }
        IOException iOException = this.e;
        if (iOException != null) {
            throw iOException;
        }
        if (this.m == null) {
            throw new NullPointerException("Response info is null when there is no exception.");
        }
    }

    private Map.Entry<String, String> a(int i) {
        try {
            a();
            List<Map.Entry<String, String>> e2 = e();
            if (i >= e2.size()) {
                return null;
            }
            return e2.get(i);
        } catch (IOException unused) {
            return null;
        }
    }

    private Map<String, List<String>> c() {
        Map<String, List<String>> map = this.n;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : e()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.n = unmodifiableMap;
        return unmodifiableMap;
    }

    private List<Map.Entry<String, String>> e() {
        List<Map.Entry<String, String>> list = this.f13425o;
        if (list != null) {
            return list;
        }
        this.f13425o = new ArrayList();
        for (Map.Entry<String, String> entry : this.m.getAllHeadersAsList()) {
            if (!entry.getKey().equalsIgnoreCase("Content-Encoding")) {
                this.f13425o.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        List<Map.Entry<String, String>> unmodifiableList = Collections.unmodifiableList(this.f13425o);
        this.f13425o = unmodifiableList;
        return unmodifiableList;
    }

    public void c(Object obj) {
        this.b.add(obj);
    }

    public C9858xs b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = this.a.read(bArr, 0, 1024);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        byteArrayOutputStream.flush();
        int httpStatusCode = this.m.getHttpStatusCode();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : this.m.getAllHeadersAsList()) {
            treeMap.put(entry.getKey(), entry.getValue());
        }
        return new C9858xs(httpStatusCode, byteArrayOutputStream.toByteArray(), treeMap, false);
    }
}
