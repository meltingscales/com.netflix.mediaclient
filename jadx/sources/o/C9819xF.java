package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: o.xF  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9819xF {
    protected static final Comparator<byte[]> d = new Comparator<byte[]>() { // from class: o.xF.2
        @Override // java.util.Comparator
        /* renamed from: d */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };
    private final int a;
    private List<byte[]> c = new LinkedList();
    private List<byte[]> b = new ArrayList(64);
    private int e = 0;

    public C9819xF(int i) {
        this.a = i;
    }

    public byte[] d(int i) {
        synchronized (this) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                byte[] bArr = this.b.get(i2);
                if (bArr.length >= i) {
                    this.e -= bArr.length;
                    this.b.remove(i2);
                    this.c.remove(bArr);
                    return bArr;
                }
            }
            return new byte[i];
        }
    }

    public void a(byte[] bArr) {
        synchronized (this) {
            if (bArr != null) {
                if (bArr.length <= this.a) {
                    this.c.add(bArr);
                    int binarySearch = Collections.binarySearch(this.b, bArr, d);
                    if (binarySearch < 0) {
                        binarySearch = (-binarySearch) - 1;
                    }
                    this.b.add(binarySearch, bArr);
                    this.e += bArr.length;
                    e();
                }
            }
        }
    }

    private void e() {
        synchronized (this) {
            while (this.e > this.a) {
                byte[] remove = this.c.remove(0);
                this.b.remove(remove);
                this.e -= remove.length;
            }
        }
    }
}
