package com.fasterxml.jackson.core.io;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import o.C9395ol;
import o.InterfaceC9327nW;

/* loaded from: classes2.dex */
public class SerializedString implements InterfaceC9327nW, Serializable {
    private static final C9395ol f = C9395ol.a();
    private static final long serialVersionUID = 1;
    protected transient String a;
    protected char[] b;
    protected final String c;
    protected byte[] d;
    protected byte[] e;

    @Override // o.InterfaceC9327nW
    public final String b() {
        return this.c;
    }

    public final String toString() {
        return this.c;
    }

    public SerializedString(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.c = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeUTF(this.c);
    }

    protected Object readResolve() {
        return new SerializedString(this.a);
    }

    @Override // o.InterfaceC9327nW
    public final char[] e() {
        char[] cArr = this.b;
        if (cArr == null) {
            char[] c = f.c(this.c);
            this.b = c;
            return c;
        }
        return cArr;
    }

    @Override // o.InterfaceC9327nW
    public final byte[] d() {
        byte[] bArr = this.e;
        if (bArr == null) {
            byte[] d = f.d(this.c);
            this.e = d;
            return d;
        }
        return bArr;
    }

    @Override // o.InterfaceC9327nW
    public final byte[] c() {
        byte[] bArr = this.d;
        if (bArr == null) {
            byte[] e = f.e(this.c);
            this.d = e;
            return e;
        }
        return bArr;
    }

    @Override // o.InterfaceC9327nW
    public int c(char[] cArr, int i) {
        char[] cArr2 = this.b;
        if (cArr2 == null) {
            cArr2 = f.c(this.c);
            this.b = cArr2;
        }
        int length = cArr2.length;
        if (i + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArr2, 0, cArr, i, length);
        return length;
    }

    @Override // o.InterfaceC9327nW
    public int b(byte[] bArr, int i) {
        byte[] bArr2 = this.e;
        if (bArr2 == null) {
            bArr2 = f.d(this.c);
            this.e = bArr2;
        }
        int length = bArr2.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        return length;
    }

    @Override // o.InterfaceC9327nW
    public int e(char[] cArr, int i) {
        String str = this.c;
        int length = str.length();
        if (i + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i);
        return length;
    }

    @Override // o.InterfaceC9327nW
    public int e(byte[] bArr, int i) {
        byte[] bArr2 = this.d;
        if (bArr2 == null) {
            bArr2 = f.e(this.c);
            this.d = bArr2;
        }
        int length = bArr2.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        return length;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.c.equals(((SerializedString) obj).c);
    }
}
