package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;

/* renamed from: o.bnk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4855bnk {
    public static final C4855bnk a = new C4855bnk();

    /* renamed from: o.bnk$d */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[SegmentType.values().length];
            try {
                iArr[SegmentType.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentType.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentType.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = iArr;
        }
    }

    private C4855bnk() {
    }

    public final String d(SegmentType segmentType) {
        C8632dsu.c((Object) segmentType, "");
        int i = d.d[segmentType.ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? "padding" : "content" : "ad";
    }
}
