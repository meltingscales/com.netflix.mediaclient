package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* renamed from: o.dX  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7888dX implements InterfaceC7887dW {
    private final HttpURLConnection d;

    public C7888dX(HttpURLConnection httpURLConnection) {
        this.d = httpURLConnection;
    }

    @Override // o.InterfaceC7887dW
    public boolean b() {
        return this.d.getResponseCode() / 100 == 2;
    }

    @Override // o.InterfaceC7887dW
    public InputStream a() {
        return this.d.getInputStream();
    }

    @Override // o.InterfaceC7887dW
    public String d() {
        return this.d.getContentType();
    }

    @Override // o.InterfaceC7887dW
    public String e() {
        try {
            if (b()) {
                return null;
            }
            return "Unable to fetch " + this.d.getURL() + ". Failed with " + this.d.getResponseCode() + "\n" + c(this.d);
        } catch (IOException e) {
            C8909fc.a("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.disconnect();
    }

    private String c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }
}
