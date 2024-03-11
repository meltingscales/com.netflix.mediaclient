package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(new drX<SaverScope, TextFieldScrollerPosition, List<? extends Object>>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        @Override // o.drX
        public final List<Object> invoke(SaverScope saverScope, TextFieldScrollerPosition textFieldScrollerPosition) {
            List<Object> j;
            Object[] objArr = new Object[2];
            objArr[0] = Float.valueOf(textFieldScrollerPosition.getOffset());
            objArr[1] = Boolean.valueOf(textFieldScrollerPosition.getOrientation() == Orientation.Vertical);
            j = C8569dql.j(objArr);
            return j;
        }
    }, new drM<List<? extends Object>, TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        @Override // o.drM
        public final TextFieldScrollerPosition invoke(List<? extends Object> list) {
            Object obj = list.get(1);
            C8632dsu.d(obj);
            Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
            Object obj2 = list.get(0);
            C8632dsu.d(obj2);
            return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
        }
    });
    private final MutableFloatState maximum$delegate;
    private final MutableFloatState offset$delegate;
    private final MutableState orientation$delegate;
    private Rect previousCursorRect;
    private long previousSelection;

    /* renamed from: setPreviousSelection-5zc-tL8  reason: not valid java name */
    public final void m469setPreviousSelection5zctL8(long j) {
        this.previousSelection = j;
    }

    public TextFieldScrollerPosition(Orientation orientation, float f) {
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.maximum$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.previousCursorRect = Rect.Companion.getZero();
        this.previousSelection = TextRange.Companion.m2162getZerod9O1mEE();
        this.orientation$delegate = SnapshotStateKt.mutableStateOf(orientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f, int i, C8627dsp c8627dsp) {
        this(orientation, (i & 2) != 0 ? 0.0f : f);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }

    public final void update(Orientation orientation, Rect rect, int i, int i2) {
        float a;
        float f = i2 - i;
        setMaximum(f);
        if (rect.getLeft() != this.previousCursorRect.getLeft() || rect.getTop() != this.previousCursorRect.getTop()) {
            boolean z = orientation == Orientation.Vertical;
            coerceOffset$foundation_release(z ? rect.getTop() : rect.getLeft(), z ? rect.getBottom() : rect.getRight(), i);
            this.previousCursorRect = rect;
        }
        a = C8657dts.a(getOffset(), 0.0f, f);
        setOffset(a);
    }

    public final void coerceOffset$foundation_release(float f, float f2, int i) {
        int i2;
        float offset = getOffset();
        float f3 = i;
        float f4 = offset + f3;
        setOffset(getOffset() + ((f2 <= f4 && (f >= offset || f2 - f <= f3)) ? (i2 >= 0 || f2 - f > f3) ? 0.0f : f - offset : f2 - f4));
    }

    /* renamed from: getOffsetToFollow-5zc-tL8  reason: not valid java name */
    public final int m468getOffsetToFollow5zctL8(long j) {
        return TextRange.m2157getStartimpl(j) != TextRange.m2157getStartimpl(this.previousSelection) ? TextRange.m2157getStartimpl(j) : TextRange.m2152getEndimpl(j) != TextRange.m2152getEndimpl(this.previousSelection) ? TextRange.m2152getEndimpl(j) : TextRange.m2155getMinimpl(j);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    public final void setOffset(float f) {
        this.offset$delegate.setFloatValue(f);
    }

    public final float getMaximum() {
        return this.maximum$delegate.getFloatValue();
    }

    private final void setMaximum(float f) {
        this.maximum$delegate.setFloatValue(f);
    }

    public final Orientation getOrientation() {
        return (Orientation) this.orientation$delegate.getValue();
    }
}
