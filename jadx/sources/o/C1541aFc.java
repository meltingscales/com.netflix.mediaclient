package o;

import com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: o.aFc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1541aFc {
    public static final C1541aFc d = new C1541aFc();

    /* renamed from: o.aFc$e */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ThumbRating.values().length];
            try {
                iArr[ThumbRating.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThumbRating.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThumbRating.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ThumbRating.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[com.netflix.mediaclient.graphql.models.type.ThumbRating.values().length];
            try {
                iArr2[com.netflix.mediaclient.graphql.models.type.ThumbRating.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.netflix.mediaclient.graphql.models.type.ThumbRating.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.netflix.mediaclient.graphql.models.type.ThumbRating.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.netflix.mediaclient.graphql.models.type.ThumbRating.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.netflix.mediaclient.graphql.models.type.ThumbRating.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr2;
        }
    }

    private C1541aFc() {
    }

    public final com.netflix.mediaclient.graphql.models.type.ThumbRating e(ThumbRating thumbRating) {
        C8632dsu.c((Object) thumbRating, "");
        int i = e.a[thumbRating.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return com.netflix.mediaclient.graphql.models.type.ThumbRating.e;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return com.netflix.mediaclient.graphql.models.type.ThumbRating.b;
            }
            return com.netflix.mediaclient.graphql.models.type.ThumbRating.c;
        }
        return com.netflix.mediaclient.graphql.models.type.ThumbRating.d;
    }

    public final ThumbRating d(com.netflix.mediaclient.graphql.models.type.ThumbRating thumbRating) {
        C8632dsu.c((Object) thumbRating, "");
        int i = e.b[thumbRating.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return ThumbRating.b;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return ThumbRating.c;
                }
                return ThumbRating.e;
            }
            return ThumbRating.a;
        }
        return ThumbRating.b;
    }
}
