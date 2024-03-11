package com.google.android.gms.measurement.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
final class zzko extends SSLSocket {
    private final SSLSocket zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzko(zzkp zzkpVar, SSLSocket sSLSocket) {
        this.zza = sSLSocket;
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.zza.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.zza.setEnabledProtocols(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledCipherSuites() {
        return this.zza.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(String[] strArr) {
        this.zza.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedProtocols() {
        return this.zza.getSupportedProtocols();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledProtocols() {
        return this.zza.getEnabledProtocols();
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
        return this.zza.getSession();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.zza.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.zza.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() {
        this.zza.startHandshake();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z) {
        this.zza.setUseClientMode(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
        return this.zza.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z) {
        this.zza.setNeedClientAuth(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z) {
        this.zza.setWantClientAuth(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
        return this.zza.getNeedClientAuth();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
        return this.zza.getWantClientAuth();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z) {
        this.zza.setEnableSessionCreation(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
        return this.zza.getEnableSessionCreation();
    }

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) {
        this.zza.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.zza.close();
        }
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) {
        this.zza.connect(socketAddress);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i) {
        this.zza.connect(socketAddress, i);
    }

    @Override // java.net.Socket
    public final SocketChannel getChannel() {
        return this.zza.getChannel();
    }

    @Override // java.net.Socket
    public final InetAddress getInetAddress() {
        return this.zza.getInetAddress();
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() {
        return this.zza.getInputStream();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() {
        return this.zza.getKeepAlive();
    }

    @Override // java.net.Socket
    public final InetAddress getLocalAddress() {
        return this.zza.getLocalAddress();
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
        return this.zza.getLocalPort();
    }

    @Override // java.net.Socket
    public final SocketAddress getLocalSocketAddress() {
        return this.zza.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        return this.zza.getOOBInline();
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() {
        return this.zza.getOutputStream();
    }

    @Override // java.net.Socket
    public final int getPort() {
        return this.zza.getPort();
    }

    @Override // java.net.Socket
    public final int getReceiveBufferSize() {
        int receiveBufferSize;
        synchronized (this) {
            receiveBufferSize = this.zza.getReceiveBufferSize();
        }
        return receiveBufferSize;
    }

    @Override // java.net.Socket
    public final SocketAddress getRemoteSocketAddress() {
        return this.zza.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() {
        return this.zza.getReuseAddress();
    }

    @Override // java.net.Socket
    public final int getSendBufferSize() {
        int sendBufferSize;
        synchronized (this) {
            sendBufferSize = this.zza.getSendBufferSize();
        }
        return sendBufferSize;
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return this.zza.getSoLinger();
    }

    @Override // java.net.Socket
    public final int getSoTimeout() {
        int soTimeout;
        synchronized (this) {
            soTimeout = this.zza.getSoTimeout();
        }
        return soTimeout;
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return this.zza.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        return this.zza.getTrafficClass();
    }

    @Override // java.net.Socket
    public final boolean isBound() {
        return this.zza.isBound();
    }

    @Override // java.net.Socket
    public final boolean isClosed() {
        return this.zza.isClosed();
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
        return this.zza.isConnected();
    }

    @Override // java.net.Socket
    public final boolean isInputShutdown() {
        return this.zza.isInputShutdown();
    }

    @Override // java.net.Socket
    public final boolean isOutputShutdown() {
        return this.zza.isOutputShutdown();
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) {
        this.zza.sendUrgentData(i);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) {
        this.zza.setKeepAlive(z);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) {
        this.zza.setOOBInline(z);
    }

    @Override // java.net.Socket
    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.zza.setPerformancePreferences(i, i2, i3);
    }

    @Override // java.net.Socket
    public final void setReceiveBufferSize(int i) {
        synchronized (this) {
            this.zza.setReceiveBufferSize(i);
        }
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) {
        this.zza.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public final void setSendBufferSize(int i) {
        synchronized (this) {
            this.zza.setSendBufferSize(i);
        }
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i) {
        this.zza.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public final void setSoTimeout(int i) {
        synchronized (this) {
            this.zza.setSoTimeout(i);
        }
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) {
        this.zza.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i) {
        this.zza.setTrafficClass(i);
    }

    @Override // java.net.Socket
    public final void shutdownInput() {
        this.zza.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() {
        this.zza.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public final String toString() {
        return this.zza.toString();
    }

    public final boolean equals(Object obj) {
        return this.zza.equals(obj);
    }
}
