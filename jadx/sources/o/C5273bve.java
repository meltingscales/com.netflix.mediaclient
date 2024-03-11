package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* renamed from: o.bve  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5273bve extends C5209buT {
    public final long f;
    public final SegmentType g;
    public final long h;
    public final long i;

    public C5273bve(long j, String str, long j2, long j3, C5213buX[] c5213buXArr, List<List<Long>> list) {
        this(str, j2, j3, c5213buXArr, list, -1L, PlaylistMap.TransitionHintType.unknownTransitionHint, j, new ArrayList());
    }

    public C5273bve(long j, String str, long j2, long j3, C5213buX[] c5213buXArr) {
        this(j, str, j2, j3, c5213buXArr, new ArrayList());
    }

    public C5273bve(String str, long j, long j2, C5213buX[] c5213buXArr, List<List<Long>> list, long j3, PlaylistMap.TransitionHintType transitionHintType, long j4, List<List<Long>> list2) {
        this(str, j, j2, c5213buXArr, list, j3, transitionHintType, j4, 0L, list2, j4, SegmentType.a);
    }

    public C5273bve(String str, long j, long j2, C5213buX[] c5213buXArr, List<List<Long>> list, long j3, PlaylistMap.TransitionHintType transitionHintType, long j4, long j5, List<List<Long>> list2, long j6, SegmentType segmentType) {
        super(str, j, j2, c5213buXArr, list, j3, transitionHintType, list2);
        this.i = j4;
        this.h = j5;
        this.f = j6;
        this.g = segmentType;
    }

    @Override // o.C5209buT
    public String toString() {
        return "PlaylistSegment{viewable=" + this.i + ", " + super.toString() + '}';
    }

    public b g() {
        b bVar = new b(this.i);
        bVar.b = a();
        bVar.i = this.c;
        bVar.e = this.b;
        bVar.j.addAll(Arrays.asList(f()));
        bVar.d.addAll(this.e);
        bVar.c = this.a;
        bVar.n = this.j;
        return bVar;
    }

    /* renamed from: o.bve$b */
    /* loaded from: classes4.dex */
    public static class b {
        private String b;
        private long f;
        private long h;
        private final long m;
        private SegmentType a = SegmentType.a;
        private long i = 0;
        private long e = -1;
        private List<C5213buX> j = new ArrayList();
        private List<List<Long>> d = new ArrayList();
        private List<List<Long>> g = new ArrayList();
        private long c = -1;
        private PlaylistMap.TransitionHintType n = PlaylistMap.TransitionHintType.unknownTransitionHint;

        public b b(long j) {
            this.i = j;
            return this;
        }

        @Deprecated
        public b c(long j) {
            this.f = j;
            return this;
        }

        public b c(String str) {
            this.b = str;
            return this;
        }

        public b e(long j) {
            this.e = j;
            return this;
        }

        public b(long j) {
            this.m = j;
            this.h = j;
        }

        public C5273bve d() {
            return new C5273bve(this.b, this.i, this.e, (C5213buX[]) this.j.toArray(new C5213buX[0]), this.d, this.c, this.n, this.m, this.f, this.g, this.h, this.a);
        }

        public b e(C5213buX c5213buX) {
            this.j.add(c5213buX);
            return this;
        }
    }

    @Override // o.C5209buT
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5273bve c5273bve = (C5273bve) obj;
        return this.i == c5273bve.i && this.f == c5273bve.f && this.g == c5273bve.g && super.equals(c5273bve);
    }

    @Override // o.C5209buT
    public int hashCode() {
        long j = this.i;
        long j2 = this.f;
        return Objects.hash(Long.valueOf(j), Long.valueOf(j2), this.g);
    }
}
