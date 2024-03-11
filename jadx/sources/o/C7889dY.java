package o;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: o.dY  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7889dY implements InterfaceC8856ec {
    @Override // o.InterfaceC8856ec
    public InterfaceC7887dW a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C7888dX(httpURLConnection);
    }
}
