package o;

import androidx.media3.common.Format;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.bih  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4660bih {

    /* renamed from: o.bih$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a(long j, long j2, long j3, String str, long j4);

        void a(long j, a aVar);

        void b(long j, e eVar, long j2);

        void b(long j, f fVar);

        void d(long j);

        void e(long j, long j2, long j3, long j4, long j5);

        void e(long j, String str, long j2, long j3, String str2, long j4);

        void e(long j, h hVar, long j2, boolean z);

        void e(long j, j jVar);

        void e(String str, long j, long j2);
    }

    /* renamed from: o.bih$c */
    /* loaded from: classes3.dex */
    public static class c {
        public int a;
        public String b;
        public int c;
        public String d;
        public String e;
    }

    void a(b bVar);

    /* renamed from: o.bih$d */
    /* loaded from: classes3.dex */
    public static class d {
        public int a;
        public int b;
        public long c;
        public int d;
        public int e;
        public String f;
        public boolean g;
        public int h;
        public int i;
        public String j;
        public int n;

        public d(int i, String str, String str2, int i2, int i3, int i4, boolean z, int i5, int i6, long j, int i7) {
            this.b = i;
            this.f = str;
            this.j = str2;
            this.i = i2;
            this.n = i3;
            this.e = i4;
            this.g = z;
            this.h = i5;
            this.a = i6;
            this.c = j;
            this.d = i7;
        }
    }

    /* renamed from: o.bih$e */
    /* loaded from: classes3.dex */
    public static class e {
        public int a;
        public c[] b;
        public d[] c;
        public final int d;
        public String e;
        public final int f;
        public int g;
        public String h;
        public final int i;
        public String j;
        public int k;
        public String l;
        public int m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f13604o;
        public final String q;
        public String r;

        public e(c[] cVarArr, d[] dVarArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, int i6, String str4, int i7, int i8, int i9, String str5, String str6) {
            this.b = cVarArr;
            this.c = dVarArr;
            this.a = i;
            this.g = i2;
            this.n = i3;
            this.m = i4;
            this.k = i5;
            this.l = str;
            this.r = str2;
            this.j = str3;
            this.e = str4;
            this.f = i7;
            this.i = i8;
            this.d = i9;
            this.q = str5;
            this.f13604o = i6;
            this.h = str6;
        }

        public String toString() {
            return "CdnSwitchData{cdnbwdata=" + Arrays.toString(this.b) + ", cdnInfo=" + Arrays.toString(this.c) + ", fastSelThreshold=" + this.a + ", pricdnid=" + this.g + ", selcdnbw=" + this.n + ", selcdnid=" + this.m + ", selcdnrtt=" + this.k + ", selreason='" + this.l + "', testreason='" + this.r + "', mediatype='" + this.j + "', location_id='" + this.e + "', location_level=" + this.f + ", location_rank=" + this.i + '}';
        }
    }

    /* renamed from: o.bih$g */
    /* loaded from: classes6.dex */
    public static class g {
        public i[] a;
        public String b;
        public boolean c;
        public String d;

        public void e(String str) {
            this.b = str;
        }

        public void e(boolean z) {
            this.c = z;
        }

        public g(String str, i[] iVarArr) {
            this.d = str;
            this.a = iVarArr;
        }

        public String toString() {
            return "Location{key='" + this.d + "', servers=" + Arrays.toString(this.a) + '}';
        }
    }

    /* renamed from: o.bih$i */
    /* loaded from: classes6.dex */
    public static class i {
        public String a;
        public String[] c;
        public n[] e;

        public i(String str, n[] nVarArr, String[] strArr) {
            this.a = str;
            this.e = nVarArr;
            this.c = strArr;
        }

        public String toString() {
            return "Server{cdnid=" + this.a + ", serverUse=" + Arrays.toString(this.e) + " URLPermErrorStreamIds=" + Arrays.toString(this.c) + '}';
        }
    }

    /* renamed from: o.bih$n */
    /* loaded from: classes6.dex */
    public static class n {
        public String a;
        public int b;
        public int c;
        public float d;
        public long e;
        public int i;

        public n(long j, String str, int i) {
            this.e = j;
            this.a = str;
            this.b = i;
        }

        public String toString() {
            return "ServerUse{time=" + this.e + ", reason='" + this.a + "', dur=" + this.b + ", tp=" + this.i + ", conf=" + this.d + ", bitrate=" + this.c + '}';
        }
    }

    /* renamed from: o.bih$h */
    /* loaded from: classes6.dex */
    public static class h {
        public final int a;
        public final int b;
        public final String c;
        public final g[] d;
        public final String e;
        public final String f;
        public final String g;
        public final long h;
        public final String i;
        public final String j;

        public h(g[] gVarArr, String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, long j) {
            this.i = str2;
            this.j = str3;
            this.g = str4;
            this.e = str;
            this.d = gVarArr;
            this.a = i2;
            this.b = i;
            this.c = str5;
            this.f = str6;
            this.h = j;
        }

        public String toString() {
            return "ServerSelData{locations=" + Arrays.toString(this.d) + ", mediatype='" + this.e + "', oldCDNId='" + this.i + "', newCDNId='" + this.j + "', reason='" + this.g + "', location_id='" + this.c + "', location_rank=" + this.b + ", location_level=" + this.a + ", streamId='" + this.f + "'}";
        }
    }

    /* renamed from: o.bih$l */
    /* loaded from: classes3.dex */
    public static class l {
        public final int a;
        public final Object b$728c57fe;
        public final int[] c;
        public final long d;
        public final Format e;
        public final int f;
        public final int g;
        public final int h;
        public final long i;
        public final boolean j;
        public final int m;

        public l(Format format, int[] iArr, int i, int i2, int i3, long j, int i4, long j2, int i5, boolean z, Object obj) {
            this.e = format;
            this.c = iArr;
            this.f = i;
            this.g = i2;
            this.h = i3;
            this.d = j;
            this.m = i4;
            this.i = j2;
            this.a = i5;
            this.j = z;
            this.b$728c57fe = obj;
        }

        public String toString() {
            return "StreamSelectionData{format=" + this.e + ", bitrates=" + Arrays.toString(this.c) + ", selectedBitrateIndex=" + this.f + ", observedBandwidthKbps=" + this.g + ", predictedBandwidthKbps=" + this.h + ", bufferedDurationMs=" + this.d + ", strmselDurationMs=" + this.m + ", moffms=" + this.i + ", clientPacingRate=" + this.a + '}';
        }
    }

    /* renamed from: o.bih$o */
    /* loaded from: classes3.dex */
    public static class o {
        public final int a;
        public final int b;
        public final long c;
        public final int d;
        public final int e;
        public final long h;
        public final List<Long> i;
        public final List<Long> j;

        public o(int i, int i2, int i3, int i4, long j, long j2, List<Long> list, List<Long> list2) {
            this.d = i;
            this.b = i2;
            this.e = i3;
            this.a = i4;
            this.c = j;
            this.h = j2;
            this.j = list;
            this.i = list2;
        }

        public String toString() {
            return "SwitchAwaySummary{countSwitchAwayVideo=" + this.d + ", countSwitchAwayAudio=" + this.b + ", countSwitchBackVideo=" + this.e + ", countSwitchBackAudio=" + this.a + ", lastSwitchAwayTimeAudio=" + this.c + ", lastSwitchAwayTimeVideo=" + this.h + ", switchAwayDurationsAudio=" + this.j + ", switchAwayDurationsVideo=" + this.i + '}';
        }
    }

    /* renamed from: o.bih$a */
    /* loaded from: classes6.dex */
    public static class a {
        public final int[] a;
        public final int b;
        public final int c;
        public final String d;
        public final int e;
        public final String h;

        public a(String str, int i, String str2, int i2, int i3, int[] iArr) {
            this.h = str;
            this.b = i;
            this.d = str2;
            this.e = i2;
            this.c = i3;
            this.a = iArr;
        }
    }

    /* renamed from: o.bih$j */
    /* loaded from: classes6.dex */
    public static class j {
        public final String a;
        public final int b;
        public final long c;
        public final int e;

        public j(int i, String str, int i2, long j) {
            this.e = i;
            this.a = str;
            this.b = i2;
            this.c = j;
        }
    }

    /* renamed from: o.bih$f */
    /* loaded from: classes6.dex */
    public static class f {
        public final int a;
        public final String b;
        public final int c;
        public final boolean e;

        public f(String str, int i, boolean z, int i2) {
            this.c = i;
            this.e = z;
            this.b = str;
            this.a = i2;
        }
    }
}
