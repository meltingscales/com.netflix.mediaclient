package o;

import com.netflix.android.volley.Request;
import com.netflix.android.volley.ServerError;
import com.netflix.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import o.InterfaceC9854xo;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.impl.cookie.DateUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.xC  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9816xC implements InterfaceC9857xr {
    private static int b = 3000;
    private static int d = 4096;
    private static boolean e = false;
    protected final InterfaceC9820xG a;
    protected final C9819xF c;

    public static void d(boolean z) {
        e = z;
    }

    public static boolean d() {
        return e;
    }

    protected void c(Request request, Map<String, String> map) {
    }

    public C9816xC(InterfaceC9820xG interfaceC9820xG) {
        this(interfaceC9820xG, new C9819xF(d));
    }

    public C9816xC(InterfaceC9820xG interfaceC9820xG, C9819xF c9819xF) {
        this.a = interfaceC9820xG;
        this.c = c9819xF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0101, code lost:
        r18.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0109, code lost:
        throw new org.apache.http.client.RedirectException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010f, code lost:
        throw new java.io.IOException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0129, code lost:
        throw new java.net.HttpRetryException("retry", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC9857xr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.C9858xs e(com.netflix.android.volley.Request<?> r18) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9816xC.e(com.netflix.android.volley.Request):o.xs");
    }

    private void a(long j, Request<?> request, C9858xs c9858xs, StatusLine statusLine) {
        byte[] bArr;
        if (j > b) {
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(j);
            objArr[2] = (c9858xs == null || (bArr = c9858xs.c) == null) ? "null" : Integer.valueOf(bArr.length);
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(request.t().b());
            C9862xw.e("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    private static void c(String str, Request<?> request, VolleyError volleyError) {
        InterfaceC9814xA t = request.t();
        int x = request.x();
        try {
            t.c(volleyError);
            request.e(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(x)));
        } catch (VolleyError e2) {
            request.e(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(x)));
            throw e2;
        }
    }

    private void e(Map<String, String> map, InterfaceC9854xo.d dVar) {
        if (dVar == null) {
            return;
        }
        String str = dVar.a;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        if (dVar.e > 0) {
            map.put("If-Modified-Since", DateUtils.formatDate(new Date(dVar.e)));
        }
    }

    private byte[] c(HttpEntity httpEntity) {
        C9827xN c9827xN = new C9827xN(this.c, (int) httpEntity.getContentLength());
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new ServerError();
            }
            if (d()) {
                content = C9815xB.d(content);
            }
            byte[] d2 = this.c.d(1024);
            while (true) {
                int read = content.read(d2);
                if (read == -1) {
                    break;
                }
                c9827xN.write(d2, 0, read);
            }
            byte[] byteArray = c9827xN.toByteArray();
            try {
                httpEntity.consumeContent();
            } catch (IOException unused) {
                C9862xw.d("Error occured when calling consumingContent", new Object[0]);
            }
            this.c.a(d2);
            c9827xN.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                httpEntity.consumeContent();
            } catch (IOException unused2) {
                C9862xw.d("Error occured when calling consumingContent", new Object[0]);
            }
            this.c.a(null);
            c9827xN.close();
            throw th;
        }
    }

    private static Map<String, String> e(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        if (headerArr != null) {
            for (int i = 0; i < headerArr.length; i++) {
                Header header = headerArr[i];
                if (header == null) {
                    C9862xw.a("header is null on position " + i, new Object[0]);
                } else {
                    C9862xw.d("Header %d found: %s = %s", Integer.valueOf(i), header.getName(), headerArr[i].getValue());
                    treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
                }
            }
        }
        return treeMap;
    }

    public String e(HttpResponse httpResponse) {
        HttpEntity entity = httpResponse.getEntity();
        if (httpResponse.getStatusLine() == null || entity == null) {
            throw new NullPointerException("Status/entity is NULL. It should NOT happen!");
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(C9824xK.d(entity.getContent()));
                if (jSONObject.has("host")) {
                    return jSONObject.getString("host");
                }
            } catch (JSONException e2) {
                C9862xw.a("Json exception reading redirect response %s", e2);
            }
            return null;
        } catch (IOException e3) {
            C9862xw.a("IO exception reading redirect response %s", e3);
            return null;
        }
    }
}
