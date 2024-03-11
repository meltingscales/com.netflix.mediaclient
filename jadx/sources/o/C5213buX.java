package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;

/* renamed from: o.buX  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5213buX implements Comparable<C5213buX> {
    public final PlaylistMap.TransitionHintType a;
    public final long b;
    public final String d;
    public int e;

    public C5213buX(String str, int i, long j, PlaylistMap.TransitionHintType transitionHintType) {
        this.d = str;
        this.e = i;
        this.b = j;
        this.a = transitionHintType;
    }

    public C5213buX(String str, int i) {
        this(str, i, -1L, PlaylistMap.TransitionHintType.unknownTransitionHint);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(C5213buX c5213buX) {
        int i = this.e;
        int i2 = c5213buX.e;
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 0 : -1;
    }

    public String toString() {
        return "NextSegment{segmentId='" + this.d + "', weight=" + this.e + ", earliestSkipRequestOffset=" + this.b + ", transitionHint='" + this.a + "'}";
    }

    /* renamed from: o.buX$a */
    /* loaded from: classes4.dex */
    public static class a {
        private String e;
        private int b = 100;
        private long c = -1;
        private PlaylistMap.TransitionHintType a = PlaylistMap.TransitionHintType.unknownTransitionHint;

        public a c(long j) {
            this.c = j;
            return this;
        }

        public a(String str) {
            this.e = str;
        }

        public C5213buX b() {
            return new C5213buX(this.e, this.b, this.c, this.a);
        }
    }
}
