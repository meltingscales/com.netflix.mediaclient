package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* loaded from: classes5.dex */
public interface dHN {
    boolean a(SSLSocket sSLSocket);

    String c(SSLSocket sSLSocket);

    void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list);

    boolean e();
}
