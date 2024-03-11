package org.xbill.DNS;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class DNSInput {
    private ByteBuffer byteBuffer;
    private int saved_pos = -1;
    private int saved_end = -1;

    public DNSInput(byte[] bArr) {
        this.byteBuffer = ByteBuffer.wrap(bArr);
    }

    public int current() {
        return this.byteBuffer.position();
    }

    public int remaining() {
        return this.byteBuffer.remaining();
    }

    private void require(int i) {
        if (i > remaining()) {
            throw new WireParseException("end of input");
        }
    }

    public void setActive(int i) {
        if (i > this.byteBuffer.capacity() - this.byteBuffer.position()) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        ByteBuffer byteBuffer = this.byteBuffer;
        byteBuffer.limit(byteBuffer.position() + i);
    }

    public void clearActive() {
        ByteBuffer byteBuffer = this.byteBuffer;
        byteBuffer.limit(byteBuffer.capacity());
    }

    public int saveActive() {
        return this.byteBuffer.limit();
    }

    public void restoreActive(int i) {
        if (i > this.byteBuffer.capacity()) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        this.byteBuffer.limit(i);
    }

    public void jump(int i) {
        if (i >= this.byteBuffer.capacity()) {
            throw new IllegalArgumentException("cannot jump past end of input");
        }
        this.byteBuffer.position(i);
        ByteBuffer byteBuffer = this.byteBuffer;
        byteBuffer.limit(byteBuffer.capacity());
    }

    public void save() {
        this.saved_pos = this.byteBuffer.position();
        this.saved_end = this.byteBuffer.limit();
    }

    public void restore() {
        int i = this.saved_pos;
        if (i < 0) {
            throw new IllegalStateException("no previous state");
        }
        this.byteBuffer.position(i);
        this.byteBuffer.limit(this.saved_end);
        this.saved_pos = -1;
        this.saved_end = -1;
    }

    public int readU8() {
        require(1);
        return this.byteBuffer.get() & 255;
    }

    public int readU16() {
        require(2);
        return this.byteBuffer.getShort() & 65535;
    }

    public long readU32() {
        require(4);
        return this.byteBuffer.getInt() & 4294967295L;
    }

    public void readByteArray(byte[] bArr, int i, int i2) {
        require(i2);
        this.byteBuffer.get(bArr, i, i2);
    }

    public byte[] readByteArray(int i) {
        require(i);
        byte[] bArr = new byte[i];
        this.byteBuffer.get(bArr, 0, i);
        return bArr;
    }

    public byte[] readByteArray() {
        int remaining = remaining();
        byte[] bArr = new byte[remaining];
        this.byteBuffer.get(bArr, 0, remaining);
        return bArr;
    }

    public byte[] readCountedString() {
        return readByteArray(readU8());
    }
}
