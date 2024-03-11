package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;

/* loaded from: classes.dex */
public interface ContentScale {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: computeScaleFactor-H7hwNQA  reason: not valid java name */
    long mo1794computeScaleFactorH7hwNQA(long j, long j2);

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo1794computeScaleFactorH7hwNQA(long j, long j2) {
                float m1796access$computeFillMaxDimensioniLBOSCw = ContentScaleKt.m1796access$computeFillMaxDimensioniLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m1796access$computeFillMaxDimensioniLBOSCw, m1796access$computeFillMaxDimensioniLBOSCw);
            }
        };
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo1794computeScaleFactorH7hwNQA(long j, long j2) {
                float m1797access$computeFillMinDimensioniLBOSCw = ContentScaleKt.m1797access$computeFillMinDimensioniLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m1797access$computeFillMinDimensioniLBOSCw, m1797access$computeFillMinDimensioniLBOSCw);
            }
        };
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo1794computeScaleFactorH7hwNQA(long j, long j2) {
                float m1795access$computeFillHeightiLBOSCw = ContentScaleKt.m1795access$computeFillHeightiLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m1795access$computeFillHeightiLBOSCw, m1795access$computeFillHeightiLBOSCw);
            }
        };
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo1794computeScaleFactorH7hwNQA(long j, long j2) {
                float m1798access$computeFillWidthiLBOSCw = ContentScaleKt.m1798access$computeFillWidthiLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m1798access$computeFillWidthiLBOSCw, m1798access$computeFillWidthiLBOSCw);
            }
        };
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo1794computeScaleFactorH7hwNQA(long j, long j2) {
                if (Size.m1176getWidthimpl(j) <= Size.m1176getWidthimpl(j2) && Size.m1174getHeightimpl(j) <= Size.m1174getHeightimpl(j2)) {
                    return ScaleFactorKt.ScaleFactor(1.0f, 1.0f);
                }
                float m1797access$computeFillMinDimensioniLBOSCw = ContentScaleKt.m1797access$computeFillMinDimensioniLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m1797access$computeFillMinDimensioniLBOSCw, m1797access$computeFillMinDimensioniLBOSCw);
            }
        };
        private static final FixedScale None = new FixedScale(1.0f);
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo1794computeScaleFactorH7hwNQA(long j, long j2) {
                return ScaleFactorKt.ScaleFactor(ContentScaleKt.m1798access$computeFillWidthiLBOSCw(j, j2), ContentScaleKt.m1795access$computeFillHeightiLBOSCw(j, j2));
            }
        };

        public final ContentScale getCrop() {
            return Crop;
        }

        public final ContentScale getFillBounds() {
            return FillBounds;
        }

        public final ContentScale getFit() {
            return Fit;
        }

        public final ContentScale getInside() {
            return Inside;
        }

        private Companion() {
        }
    }
}
