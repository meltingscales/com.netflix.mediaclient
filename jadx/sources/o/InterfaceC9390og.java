package o;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: o.og  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC9390og {
    boolean b();

    byte e();

    /* renamed from: o.og$b */
    /* loaded from: classes5.dex */
    public static class b implements InterfaceC9390og {
        public int a;
        public final InputStream b = null;
        public final byte[] c;
        public final int d;
        protected int e;

        public void d() {
            this.e = this.d;
        }

        public b(byte[] bArr, int i, int i2) {
            this.c = bArr;
            this.e = i;
            this.d = i;
            this.a = i + i2;
        }

        @Override // o.InterfaceC9390og
        public boolean b() {
            int read;
            int i = this.e;
            if (i < this.a) {
                return true;
            }
            InputStream inputStream = this.b;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this.c;
            int length = bArr.length - i;
            if (length >= 1 && (read = inputStream.read(bArr, i, length)) > 0) {
                this.a += read;
                return true;
            }
            return false;
        }

        @Override // o.InterfaceC9390og
        public byte e() {
            if (this.e >= this.a && !b()) {
                throw new EOFException("Failed auto-detect: could not read more than " + this.e + " bytes (max buffer size: " + this.c.length + ")");
            }
            byte[] bArr = this.c;
            int i = this.e;
            this.e = i + 1;
            return bArr[i];
        }
    }
}
