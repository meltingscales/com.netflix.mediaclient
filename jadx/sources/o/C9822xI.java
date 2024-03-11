package o;

import com.netflix.android.volley.Request;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: o.xI  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9822xI implements InterfaceC9820xG {
    protected final c b;
    protected final SSLSocketFactory c;

    /* renamed from: o.xI$c */
    /* loaded from: classes2.dex */
    public interface c {
        String e(String str);
    }

    public C9822xI() {
        this(null);
    }

    public C9822xI(c cVar) {
        this(cVar, null);
    }

    public C9822xI(c cVar, SSLSocketFactory sSLSocketFactory) {
        this.b = cVar;
        this.c = sSLSocketFactory;
    }

    @Override // o.InterfaceC9820xG
    public HttpResponse d(Request<?> request, Map<String, String> map) {
        String u = request.u();
        HashMap hashMap = new HashMap();
        hashMap.putAll(request.j());
        hashMap.putAll(map);
        c cVar = this.b;
        if (cVar != null) {
            String e = cVar.e(u);
            if (e == null) {
                throw new IOException("URL blocked by rewriter: " + u);
            }
            u = e;
        }
        HttpURLConnection d = d(new URL(u), request);
        request.a(d);
        for (String str : hashMap.keySet()) {
            d.addRequestProperty(str, (String) hashMap.get(str));
        }
        b(d, request);
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (d.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(protocolVersion, d.getResponseCode(), d.getResponseMessage()));
        basicHttpResponse.setEntity(d(d));
        for (Map.Entry<String, List<String>> entry : d.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                int i = 0;
                if (entry.getKey().equalsIgnoreCase("Set-Cookie")) {
                    StringBuilder sb = new StringBuilder();
                    for (String str2 : entry.getValue()) {
                        if (i > 0) {
                            sb.append("; ");
                        }
                        sb.append(str2);
                        i++;
                    }
                    basicHttpResponse.addHeader(new BasicHeader(entry.getKey(), sb.toString()));
                } else {
                    basicHttpResponse.addHeader(new BasicHeader(entry.getKey(), entry.getValue().get(0)));
                }
            }
        }
        return basicHttpResponse;
    }

    private static HttpEntity d(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(errorStream);
        basicHttpEntity.setContentLength(httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    protected HttpURLConnection e(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public HttpURLConnection d(URL url, Request<?> request) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection e = e(url);
        int x = request.x();
        e.setConnectTimeout(x);
        e.setReadTimeout(x);
        e.setUseCaches(false);
        e.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.c) != null) {
            ((HttpsURLConnection) e).setSSLSocketFactory(sSLSocketFactory);
        }
        return e;
    }

    static void b(HttpURLConnection httpURLConnection, Request<?> request) {
        int i = request.i();
        if (i == -1) {
            byte[] l = request.l();
            if (l != null) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.addRequestProperty("Content-Type", request.m());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(l);
                dataOutputStream.close();
            }
        } else if (i == 0) {
            httpURLConnection.setRequestMethod("GET");
        } else if (i == 1) {
            httpURLConnection.setRequestMethod("POST");
            a(httpURLConnection, request);
        } else if (i == 2) {
            httpURLConnection.setRequestMethod("PUT");
            a(httpURLConnection, request);
        } else if (i == 3) {
            httpURLConnection.setRequestMethod("DELETE");
        } else {
            throw new IllegalStateException("Unknown method type.");
        }
    }

    private static void a(HttpURLConnection httpURLConnection, Request<?> request) {
        byte[] Q_ = request.Q_();
        if (Q_ != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", request.a());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(Q_);
            dataOutputStream.close();
        }
    }
}
