package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class dGN {
    private final List<C7809dGd> b;
    private int c;
    private boolean d;
    private boolean e;

    public dGN(List<C7809dGd> list) {
        C8632dsu.d(list, "");
        this.b = list;
    }

    public final C7809dGd a(SSLSocket sSLSocket) {
        C7809dGd c7809dGd;
        C8632dsu.d(sSLSocket, "");
        int i = this.c;
        int size = this.b.size();
        while (true) {
            if (i >= size) {
                c7809dGd = null;
                break;
            }
            c7809dGd = this.b.get(i);
            i++;
            if (c7809dGd.b(sSLSocket)) {
                this.c = i;
                break;
            }
        }
        if (c7809dGd == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(',');
            sb.append(" modes=");
            sb.append(this.b);
            sb.append(',');
            sb.append(" supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            if (enabledProtocols == null) {
                C8632dsu.e();
            }
            String arrays = Arrays.toString(enabledProtocols);
            C8632dsu.b(arrays, "");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        this.e = b(sSLSocket);
        c7809dGd.c(sSLSocket, this.d);
        return c7809dGd;
    }

    public final boolean e(IOException iOException) {
        C8632dsu.d(iOException, "");
        this.d = true;
        return (!this.e || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }

    private final boolean b(SSLSocket sSLSocket) {
        int size = this.b.size();
        for (int i = this.c; i < size; i++) {
            if (this.b.get(i).b(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
