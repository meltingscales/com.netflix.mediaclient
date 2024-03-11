package o;

import androidx.media3.exoplayer.source.ShuffleOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.bjZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4705bjZ implements ShuffleOrder {
    private final Map<String, String> b;
    private final Map<String, C5209buT> c;
    private final List<String> d;
    private final Map<String, Integer> a = new HashMap();
    private boolean e = false;

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public int getFirstIndex() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public int getLastIndex() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public int getPreviousIndex(int i) {
        return 0;
    }

    public C4705bjZ(ArrayList<String> arrayList, Map<String, C5209buT> map, Map<String, String> map2) {
        this.d = new ArrayList(arrayList);
        this.c = map;
        this.b = new HashMap(map2);
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public int getNextIndex(int i) {
        if (i >= this.d.size()) {
            if (!this.e) {
                InterfaceC1597aHe.b(new C1596aHd("existing segment not found in shuffle order " + i));
                this.e = true;
            }
            return -1;
        }
        String str = this.d.get(i);
        C5209buT c5209buT = this.c.get(str);
        if (c5209buT == null) {
            C1044Mm.e("PlaygraphShuffleOrder", "window index %s, segment id %s not in segment map: ", Integer.valueOf(i), str);
            return -1;
        }
        String str2 = this.b.get(str);
        C5213buX[] f = c5209buT.f();
        if (str2 == null && f != null && f.length == 1 && f[0].d.equals(c5209buT.a())) {
            str2 = c5209buT.a();
        }
        if (str2 != null) {
            Integer num = c().get(str2);
            if (num == null) {
                C1044Mm.j("PlaygraphShuffleOrder", "unable to find next segment %s for window %s", str2, str);
                return -1;
            }
            return num.intValue();
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public int getLength() {
        return this.d.size();
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public ShuffleOrder cloneAndInsert(int i, int i2) {
        throw new IllegalStateException("not implemented");
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public ShuffleOrder cloneAndRemove(int i, int i2) {
        throw new IllegalStateException("not implemented");
    }

    @Override // androidx.media3.exoplayer.source.ShuffleOrder
    public ShuffleOrder cloneAndClear() {
        throw new IllegalStateException("not implemented");
    }

    private Map<String, Integer> c() {
        Map<String, Integer> map;
        synchronized (this) {
            if (this.a.isEmpty()) {
                for (int i = 0; i < this.d.size(); i++) {
                    this.a.put(this.d.get(i), Integer.valueOf(i));
                }
            }
            map = this.a;
        }
        return map;
    }

    public C5209buT e(int i) {
        if (i < 0 || i > getLength()) {
            C1044Mm.e("PlaygraphShuffleOrder", "attempted to get branching segment of bad index %s", Integer.valueOf(i));
            return null;
        }
        int i2 = i;
        for (int i3 = 0; i3 < 20; i3++) {
            if (i2 >= this.d.size()) {
                C1044Mm.j("PlaygraphShuffleOrder", "getNextBranchingSegment - branch pointed to a segment that does not exist in Timeline yet");
                return null;
            }
            C5209buT c5209buT = this.c.get(this.d.get(i2));
            if (c5209buT == null) {
                return null;
            }
            i2 = getNextIndex(i2);
            if (i2 == -1) {
                if (c5209buT.f() == null || c5209buT.f().length <= 0) {
                    return null;
                }
                return c5209buT;
            } else if (i2 == i) {
                return null;
            } else {
                if (c5209buT.a > 0) {
                    return c5209buT;
                }
            }
        }
        return null;
    }
}
