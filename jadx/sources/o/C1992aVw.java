package o;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: o.aVw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1992aVw extends SSLSocketFactory {
    private final SSLSocketFactory e;

    public C1992aVw() {
        SocketFactory socketFactory = SSLSocketFactory.getDefault();
        C8632dsu.d(socketFactory);
        this.e = (SSLSocketFactory) socketFactory;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.e.getDefaultCipherSuites();
        C8632dsu.a(defaultCipherSuites, "");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.e.getSupportedCipherSuites();
        C8632dsu.a(supportedCipherSuites, "");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        C8632dsu.c((Object) socket, "");
        C8632dsu.c((Object) str, "");
        Socket createSocket = this.e.createSocket(socket, str, i, z);
        C8632dsu.a(createSocket, "");
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        C8632dsu.c((Object) str, "");
        Socket createSocket = this.e.createSocket(str, i);
        C8632dsu.a(createSocket, "");
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) inetAddress, "");
        Socket createSocket = this.e.createSocket(str, i, inetAddress, i2);
        C8632dsu.a(createSocket, "");
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        C8632dsu.c((Object) inetAddress, "");
        Socket createSocket = this.e.createSocket(inetAddress, i);
        C8632dsu.a(createSocket, "");
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        C8632dsu.c((Object) inetAddress, "");
        C8632dsu.c((Object) inetAddress2, "");
        Socket createSocket = this.e.createSocket(inetAddress, i, inetAddress2, i2);
        C8632dsu.a(createSocket, "");
        return createSocket;
    }
}
