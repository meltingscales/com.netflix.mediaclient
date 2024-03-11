package o;

import androidx.media3.exoplayer.source.ShuffleOrder;
import java.util.Deque;
import java.util.LinkedList;

/* renamed from: o.bkf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4745bkf implements ShuffleOrder {
    private C4705bjZ a;
    private Deque<C4705bjZ> d = new LinkedList();

    public C4745bkf() {
    }

    public C4745bkf(C4705bjZ c4705bjZ) {
        this.a = c4705bjZ;
    }

    public void a(C4705bjZ c4705bjZ) {
        synchronized (this.d) {
            this.d.push(c4705bjZ);
        }
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public int getNextIndex(int i) {
        C4705bjZ c4705bjZ = this.a;
        if (c4705bjZ == null) {
            return -1;
        }
        return c4705bjZ.getNextIndex(i);
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public int getLength() {
        C4705bjZ c4705bjZ = this.a;
        if (c4705bjZ == null) {
            return 0;
        }
        return c4705bjZ.getLength();
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public int getPreviousIndex(int i) {
        C4705bjZ c4705bjZ = this.a;
        if (c4705bjZ == null) {
            return -1;
        }
        return c4705bjZ.getPreviousIndex(i);
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public int getLastIndex() {
        C4705bjZ c4705bjZ = this.a;
        if (c4705bjZ == null) {
            return -1;
        }
        return c4705bjZ.getLastIndex();
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public int getFirstIndex() {
        C4705bjZ c4705bjZ = this.a;
        if (c4705bjZ == null) {
            return 0;
        }
        return c4705bjZ.getFirstIndex();
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public ShuffleOrder cloneAndInsert(int i, int i2) {
        c();
        return this;
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public ShuffleOrder cloneAndRemove(int i, int i2) {
        c();
        return this;
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public ShuffleOrder cloneAndClear() {
        c();
        return this;
    }

    protected void c() {
        synchronized (this.d) {
            if (!this.d.isEmpty()) {
                this.a = this.d.pop();
            }
        }
    }

    public C5209buT d(int i) {
        C4705bjZ c4705bjZ;
        synchronized (this.d) {
            c4705bjZ = this.a;
        }
        if (c4705bjZ == null) {
            return null;
        }
        return c4705bjZ.e(i);
    }
}
