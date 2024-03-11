package o;

import android.content.Context;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;

/* renamed from: o.bSn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4000bSn {
    public static final C4000bSn d = new C4000bSn();

    public static final int d(int i, int i2) {
        if (i == 2) {
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    return 5;
                }
                return i2 != 4 ? 2 : 6;
            }
            return 3;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return 3;
            }
            if (i2 == 3 || i2 == 4) {
                return 4;
            }
        }
        return 2;
    }

    private C4000bSn() {
    }

    public static final int b(Context context, LoMoType loMoType) {
        int d2;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) loMoType, "");
        if (loMoType == LoMoType.FEED) {
            return 10;
        }
        if (loMoType == LoMoType.BILLBOARD) {
            return 3;
        }
        if (loMoType == LoMoType.FLAT_GENRE) {
            return 40;
        }
        if (loMoType == LoMoType.COLLECTION_PAGE_EVIDENCE || loMoType == LoMoType.COLLECTION_VIDEO_PAGE_EVIDENCE) {
            return 1;
        }
        if (C8153dex.A()) {
            return 5;
        }
        int i = context.getResources().getConfiguration().screenLayout & 15;
        if (C8151dev.f()) {
            d2 = d(2, i);
        } else {
            d2 = d(1, i);
        }
        return d2 * 2;
    }

    public static final int e(Context context) {
        C8632dsu.c((Object) context, "");
        return d(context.getResources().getConfiguration().orientation, context.getResources().getConfiguration().screenLayout & 15);
    }

    public static final int d(Context context) {
        C8632dsu.c((Object) context, "");
        int i = context.getResources().getConfiguration().orientation;
        int i2 = context.getResources().getConfiguration().screenLayout & 15;
        if (i == 2) {
            if (i2 == 1) {
                return 1;
            }
            if (i2 != 2) {
                return (i2 == 3 || i2 == 4) ? 3 : 1;
            }
        } else if (i2 == 1 || i2 == 2) {
            return 1;
        } else {
            if (i2 != 3 && i2 != 4) {
                return 1;
            }
        }
        return 2;
    }
}
