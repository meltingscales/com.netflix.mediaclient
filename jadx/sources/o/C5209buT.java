package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.buT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5209buT {
    public final long a;
    public final long b;
    public final long c;
    public final List<List<Long>> d;
    protected final List<List<Long>> e;
    private final List<PlaylistMap.e> f = new CopyOnWriteArrayList();
    private final C5213buX[] g;
    private final String h;
    private String i;
    public final PlaylistMap.TransitionHintType j;

    public String a() {
        return this.h;
    }

    public C5213buX[] f() {
        return this.g;
    }

    public long j() {
        long j = this.b;
        if (j != -1) {
            long j2 = this.c;
            if (j2 != -1) {
                return j - j2;
            }
            return -2147483648L;
        }
        return -2147483648L;
    }

    public C5209buT(String str, long j, long j2, C5213buX[] c5213buXArr, List<List<Long>> list, long j3, PlaylistMap.TransitionHintType transitionHintType, List<List<Long>> list2) {
        this.h = str;
        this.c = j;
        this.b = j2;
        this.g = c5213buXArr;
        Arrays.sort(c5213buXArr);
        this.e = list;
        this.a = j3;
        this.j = transitionHintType;
        this.d = list2;
    }

    public void b(PlaylistMap.e eVar) {
        this.f.add(eVar);
    }

    public void e(PlaylistMap.e eVar) {
        this.f.remove(eVar);
    }

    public void e(C5213buX[] c5213buXArr) {
        C5213buX[] c5213buXArr2;
        for (C5213buX c5213buX : c5213buXArr) {
            for (C5213buX c5213buX2 : this.g) {
                if (c5213buX.d.equals(c5213buX2.d)) {
                    c5213buX2.e = c5213buX.e;
                }
            }
        }
        Arrays.sort(this.g);
        for (PlaylistMap.e eVar : this.f) {
            eVar.p();
        }
    }

    public long c(long j, boolean z) {
        long j2 = -1;
        for (List<Long> list : this.e) {
            if (list.size() < 2) {
                InterfaceC1598aHf.a("transition zone was size " + list.size());
            } else {
                long longValue = list.get(0).longValue();
                long longValue2 = list.get(1).longValue();
                int i = (longValue > j ? 1 : (longValue == j ? 0 : -1));
                if (i <= 0 && longValue2 >= j) {
                    return z ? longValue2 : j;
                } else if (i > 0 && (j2 == -1 || j2 > longValue)) {
                    j2 = longValue;
                }
            }
        }
        return j2;
    }

    public String toString() {
        return "BaseSegment{defaultNextSegmentId='" + a() + "', startTimeMs=" + this.c + ", endTimeMs=" + this.b + ", nextSegments=" + Arrays.toString(f()) + ", selectedNextSegmentId='" + this.i + "', earliestSkipRequestOffset=" + this.a + ", transitionHint='" + this.j + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5209buT c5209buT = (C5209buT) obj;
        return this.c == c5209buT.c && this.b == c5209buT.b && this.a == c5209buT.a && Objects.equals(this.h, c5209buT.h) && Arrays.equals(this.g, c5209buT.g) && Objects.equals(this.e, c5209buT.e) && this.j == c5209buT.j && Objects.equals(this.d, c5209buT.d);
    }

    public int hashCode() {
        String str = this.h;
        long j = this.c;
        long j2 = this.b;
        List<List<Long>> list = this.e;
        long j3 = this.a;
        return (Objects.hash(str, Long.valueOf(j), Long.valueOf(j2), list, Long.valueOf(j3), this.j, this.d) * 31) + Arrays.hashCode(this.g);
    }
}
