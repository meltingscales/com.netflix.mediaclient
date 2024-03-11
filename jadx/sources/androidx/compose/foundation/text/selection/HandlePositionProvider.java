package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.NoWhenBranchMatchedException;
import o.dsT;

/* loaded from: classes.dex */
public final class HandlePositionProvider implements PopupPositionProvider {
    private final HandleReferencePoint handleReferencePoint;
    private final OffsetProvider positionProvider;
    private long prevPosition = Offset.Companion.m1149getZeroF1C5BW0();

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HandleReferencePoint.values().length];
            try {
                iArr[HandleReferencePoint.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HandleReferencePoint.TopMiddle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HandleReferencePoint.TopRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HandlePositionProvider(HandleReferencePoint handleReferencePoint, OffsetProvider offsetProvider) {
        this.handleReferencePoint = handleReferencePoint;
        this.positionProvider = offsetProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4  reason: not valid java name */
    public long mo521calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        int i;
        int e;
        int e2;
        long mo403provideF1C5BW0 = this.positionProvider.mo403provideF1C5BW0();
        if (!OffsetKt.m1151isSpecifiedk4lQ0M(mo403provideF1C5BW0)) {
            mo403provideF1C5BW0 = this.prevPosition;
        }
        this.prevPosition = mo403provideF1C5BW0;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.handleReferencePoint.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = IntSize.m2547getWidthimpl(j2) / 2;
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            i = IntSize.m2547getWidthimpl(j2);
        }
        e = dsT.e(Offset.m1137getXimpl(mo403provideF1C5BW0));
        e2 = dsT.e(Offset.m1138getYimpl(mo403provideF1C5BW0));
        long IntOffset = IntOffsetKt.IntOffset(e, e2);
        return IntOffsetKt.IntOffset((intRect.getLeft() + IntOffset.m2533getXimpl(IntOffset)) - i, intRect.getTop() + IntOffset.m2534getYimpl(IntOffset));
    }
}
