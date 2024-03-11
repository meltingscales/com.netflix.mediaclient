package org.xbill.DNS;

import java.io.EOFException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
final class TCPClient {
    private long endTime;
    private SelectionKey key;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TCPClient(long j) {
        Selector selector;
        this.endTime = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(j);
        SocketChannel open = SocketChannel.open();
        try {
            selector = Selector.open();
        } catch (Throwable th) {
            th = th;
            selector = null;
        }
        try {
            open.configureBlocking(false);
            this.key = open.register(selector, 1);
        } catch (Throwable th2) {
            th = th2;
            if (selector != null) {
                selector.close();
            }
            open.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bind(SocketAddress socketAddress) {
        ((SocketChannel) this.key.channel()).socket().bind(socketAddress);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void connect(SocketAddress socketAddress) {
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        if (socketChannel.connect(socketAddress)) {
            return;
        }
        this.key.interestOps(8);
        while (true) {
            try {
                if (socketChannel.finishConnect()) {
                    break;
                } else if (!this.key.isConnectable()) {
                    blockUntil(this.key, this.endTime);
                }
            } finally {
                if (this.key.isValid()) {
                    this.key.interestOps(0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void send(byte[] bArr) {
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        NioClient.verboseLog("TCP write", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), bArr);
        ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(new byte[]{(byte) (bArr.length >>> 8), (byte) (bArr.length & PrivateKeyType.INVALID)}), ByteBuffer.wrap(bArr)};
        this.key.interestOps(4);
        int i = 0;
        while (i < bArr.length + 2) {
            try {
                if (this.key.isWritable()) {
                    long write = socketChannel.write(byteBufferArr);
                    if (write < 0) {
                        throw new EOFException();
                    }
                    i += (int) write;
                    if (i < bArr.length + 2 && this.endTime - System.nanoTime() < 0) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    blockUntil(this.key, this.endTime);
                }
            } finally {
                if (this.key.isValid()) {
                    this.key.interestOps(0);
                }
            }
        }
    }

    private byte[] _recv(int i) {
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        byte[] bArr = new byte[i];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.key.interestOps(1);
        int i2 = 0;
        while (i2 < i) {
            try {
                if (this.key.isReadable()) {
                    long read = socketChannel.read(wrap);
                    if (read < 0) {
                        throw new EOFException();
                    }
                    i2 += (int) read;
                    if (i2 < i && System.currentTimeMillis() > this.endTime) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    blockUntil(this.key, this.endTime);
                }
            } finally {
                if (this.key.isValid()) {
                    this.key.interestOps(0);
                }
            }
        }
        return bArr;
    }

    private static void blockUntil(SelectionKey selectionKey, long j) {
        int selectNow;
        long millis = TimeUnit.NANOSECONDS.toMillis(j - System.nanoTime());
        int i = (millis > 0L ? 1 : (millis == 0L ? 0 : -1));
        if (i > 0) {
            selectNow = selectionKey.selector().select(millis);
        } else {
            if (i == 0) {
                selectNow = selectionKey.selector().selectNow();
            }
            throw new SocketTimeoutException();
        }
        if (selectNow != 0) {
            return;
        }
        throw new SocketTimeoutException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cleanup() {
        this.key.selector().close();
        this.key.channel().close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] recv() {
        byte[] _recv = _recv(2);
        byte[] _recv2 = _recv(((_recv[0] & 255) << 8) + (_recv[1] & 255));
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        NioClient.verboseLog("TCP read", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), _recv2);
        return _recv2;
    }
}
