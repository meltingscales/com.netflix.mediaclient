package o;

import com.netflix.mediaclient.graphql.models.type.WatchStatus;

/* renamed from: o.aFa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1539aFa {

    /* renamed from: o.aFa$c */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WatchStatus.values().length];
            try {
                iArr[WatchStatus.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WatchStatus.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WatchStatus.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WatchStatus.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final com.netflix.mediaclient.servicemgr.interface_.details.WatchStatus e(WatchStatus watchStatus) {
        int i = watchStatus == null ? -1 : c.a[watchStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return com.netflix.mediaclient.servicemgr.interface_.details.WatchStatus.d;
                    }
                    return com.netflix.mediaclient.servicemgr.interface_.details.WatchStatus.d;
                }
                return com.netflix.mediaclient.servicemgr.interface_.details.WatchStatus.b;
            }
            return com.netflix.mediaclient.servicemgr.interface_.details.WatchStatus.e;
        }
        return com.netflix.mediaclient.servicemgr.interface_.details.WatchStatus.c;
    }
}
