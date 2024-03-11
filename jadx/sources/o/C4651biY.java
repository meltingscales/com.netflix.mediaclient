package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import java.util.ArrayList;
import java.util.List;
import o.C4642biP;

/* renamed from: o.biY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4651biY extends C5273bve {
    private final C4642biP.e k;
    private final Long l;
    private final long m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13602o;
    private C5213buX[] p;
    private String q;

    public /* synthetic */ C4651biY(long j, long j2, String str, long j3, long j4, C5213buX[] c5213buXArr, C4642biP.e eVar, String str2, SegmentType segmentType, long j5, Long l, boolean z, C8627dsp c8627dsp) {
        this(j, j2, str, j3, j4, c5213buXArr, eVar, str2, segmentType, j5, l, z);
    }

    @Override // o.C5209buT
    public String a() {
        return this.n;
    }

    public final boolean b() {
        return this.f13602o;
    }

    public final C4642biP.e c() {
        return this.k;
    }

    public final void c(String str) {
        this.q = str;
    }

    public final long d() {
        return this.m;
    }

    public final Long e() {
        return this.l;
    }

    @Override // o.C5209buT
    public C5213buX[] f() {
        return this.p;
    }

    public final String h() {
        return this.q;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C4651biY(long r22, long r24, java.lang.String r26, long r27, long r29, o.C5213buX[] r31, o.C4642biP.e r32, java.lang.String r33, com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType r34, long r35, java.lang.Long r37, boolean r38) {
        /*
            r21 = this;
            r13 = r21
            r0 = r21
            r16 = r22
            r11 = r24
            r1 = r26
            r2 = r27
            r4 = r29
            r6 = r31
            r18 = r34
            java.util.List r7 = o.C8570dqm.c()
            com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap$TransitionHintType r10 = com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap.TransitionHintType.unknownTransitionHint
            java.util.List r15 = o.C8570dqm.c()
            r8 = -1
            r19 = 0
            r13 = r19
            r0.<init>(r1, r2, r4, r6, r7, r8, r10, r11, r13, r15, r16, r18)
            r1 = r32
            r0.k = r1
            r1 = r33
            r0.q = r1
            r1 = r35
            r0.m = r1
            r1 = r37
            r0.l = r1
            r1 = r38
            r0.f13602o = r1
            r1 = r26
            r0.n = r1
            r1 = r31
            r0.p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4651biY.<init>(long, long, java.lang.String, long, long, o.buX[], o.biP$e, java.lang.String, com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType, long, java.lang.Long, boolean):void");
    }

    public final void e(String str) {
        this.n = str;
        if (str != null) {
            this.p = new C5213buX[]{new C5213buX(str, 100)};
        }
    }

    /* renamed from: o.biY$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private boolean a;
        private C4642biP.e b;
        private Long d;
        private String e;
        private String g;
        private final long h;
        private long i;
        private final long k;
        private long f = -1;
        private final List<C5213buX> j = new ArrayList();

        /* renamed from: o  reason: collision with root package name */
        private SegmentType f13603o = SegmentType.a;
        private long c = -1;

        public final e a(long j) {
            this.c = j;
            return this;
        }

        public final String b() {
            return this.e;
        }

        public final e b(long j) {
            this.i = j;
            return this;
        }

        public final e b(Long l) {
            this.d = l;
            return this;
        }

        public final e b(String str) {
            this.e = str;
            return this;
        }

        public final Long c() {
            return this.d;
        }

        public final e c(long j) {
            this.f = j;
            return this;
        }

        public final String d() {
            return this.g;
        }

        public final e d(SegmentType segmentType) {
            C8632dsu.c((Object) segmentType, "");
            this.f13603o = segmentType;
            return this;
        }

        public final e d(String str) {
            this.g = str;
            return this;
        }

        public final e d(C4642biP.e eVar) {
            this.b = eVar;
            return this;
        }

        public final long e() {
            return this.h;
        }

        public final e e(boolean z) {
            this.a = z;
            return this;
        }

        public final long f() {
            return this.i;
        }

        public final long g() {
            return this.k;
        }

        public final SegmentType j() {
            return this.f13603o;
        }

        public e(long j, long j2) {
            this.h = j;
            this.k = j2;
        }

        public final e a(C5213buX c5213buX) {
            C8632dsu.c((Object) c5213buX, "");
            this.j.clear();
            this.j.add(c5213buX);
            return this;
        }

        public final C4651biY a() {
            return new C4651biY(this.h, this.k, this.e, this.i, this.f, (C5213buX[]) this.j.toArray(new C5213buX[0]), this.b, this.g, this.f13603o, this.c, this.d, this.a, null);
        }
    }
}
