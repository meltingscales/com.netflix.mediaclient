package o;

import android.content.Context;
import com.netflix.android.volley.Request;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import o.C9822xI;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* loaded from: classes3.dex */
public class aZA extends C9822xI {
    protected int a;
    private final aHJ d;
    protected Context e;

    public aZA(Context context, aHJ ahj, int i) {
        this(context, ahj, null, i);
    }

    public aZA(Context context, aHJ ahj, C9822xI.c cVar, int i) {
        this(context, ahj, cVar, null, i);
    }

    public aZA(Context context, aHJ ahj, C9822xI.c cVar, SSLSocketFactory sSLSocketFactory, int i) {
        super(cVar, sSLSocketFactory);
        this.d = ahj;
        if (context == null) {
            throw new IllegalStateException("If context is null!");
        }
        this.e = context;
        this.a = i;
    }

    @Override // o.C9822xI, o.InterfaceC9820xG
    public HttpResponse d(Request<?> request, Map<String, String> map) {
        if (request instanceof aZE) {
            return a((aZE) request, map);
        }
        return super.d(request, map);
    }

    protected HttpResponse a(aZE<?> aze, Map<String, String> map) {
        C8386djr d = aze.d(map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), 200, "OK"));
        basicHttpResponse.setEntity(a(d.b));
        basicHttpResponse.setHeaders(a(d.a));
        return basicHttpResponse;
    }

    @Override // o.C9822xI
    public HttpURLConnection d(URL url, Request<?> request) {
        HttpURLConnection d = super.d(url, request);
        request.a(d);
        return d;
    }

    @Override // o.C9822xI
    public HttpURLConnection e(URL url) {
        return this.d.c(url);
    }

    private static Header[] a(Map<String, List<String>> map) {
        Header[] headerArr = new Header[map.size()];
        int i = 0;
        for (final Map.Entry<String, List<String>> entry : map.entrySet()) {
            headerArr[i] = new Header() { // from class: o.aZA.2
                public HeaderElement[] getElements() {
                    return new HeaderElement[0];
                }

                public String getName() {
                    return "" + ((String) entry.getKey());
                }

                public String getValue() {
                    return C8124deU.a((List) entry.getValue());
                }
            };
            i++;
        }
        return headerArr;
    }

    private static HttpEntity a(byte[] bArr) {
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(bArr);
        byteArrayEntity.setContentEncoding("identity");
        byteArrayEntity.setContentType("text/plain");
        return byteArrayEntity;
    }
}
