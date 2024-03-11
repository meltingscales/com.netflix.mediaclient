package o;

import com.netflix.android.volley.Request;
import com.netflix.android.volley.ServerError;
import com.netflix.mediaclient.net.WrappedVolleyIOException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.chromium.net.ExperimentalCronetEngine;
import org.linphone.core.Privacy;

/* loaded from: classes3.dex */
public class aHU implements aHF {
    private C1627aIh a;
    private InputStream b;

    public aHU(ExperimentalCronetEngine experimentalCronetEngine, String str, Request.Priority priority, Map<String, String> map, Object obj, List<Object> list) {
        this.a = new C1627aIh(new URL(str), experimentalCronetEngine);
        if (C1865aRc.m()) {
            this.a.setChunkedStreamingMode(Privacy.DEFAULT);
        } else {
            this.a.setChunkedStreamingMode(1024);
        }
        this.a.setDoOutput(true);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.a.addRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        if (obj != null) {
            this.a.c(obj);
        }
        if (list != null) {
            for (Object obj2 : list) {
                this.a.c(obj2);
            }
        }
        this.a.c(aHD.e(priority));
    }

    @Override // o.aHF
    public Map<String, List<String>> e() {
        return this.a.getHeaderFields();
    }

    @Override // o.aHF
    public InputStream c() {
        return new InputStream() { // from class: o.aHU.4
            private IOException a;

            @Override // java.io.InputStream
            public int read() {
                c();
                return aHU.this.b.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                c();
                return aHU.this.b.read(bArr, i, i2);
            }

            private void c() {
                if (aHU.this.b == null && this.a == null) {
                    try {
                        aHU ahu = aHU.this;
                        ahu.b = ahu.a.getInputStream();
                    } catch (IOException e) {
                        e = e;
                        if (aHU.this.a.getResponseCode() >= 400) {
                            e = new WrappedVolleyIOException(new ServerError(aHU.this.a.b()));
                        }
                        this.a = e;
                    }
                }
                IOException iOException = this.a;
                if (iOException != null) {
                    throw iOException;
                }
            }
        };
    }

    @Override // o.aHF
    public OutputStream b() {
        return this.a.getOutputStream();
    }

    @Override // o.aHF
    public void d() {
        e(false);
        this.a.disconnect();
        e(true);
    }

    @Override // o.aHF
    public void e(int i) {
        this.a.setReadTimeout(i);
    }

    private void e(boolean z) {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            try {
                if (z) {
                    while (this.b.read() >= 0) {
                    }
                } else {
                    inputStream.read();
                }
            } catch (Exception unused) {
            }
        }
    }
}
