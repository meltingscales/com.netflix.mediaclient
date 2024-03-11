package androidx.compose.ui.layout;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.drX;
import o.dsN;

/* loaded from: classes.dex */
final /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements drX<Integer, Integer, Integer> {
    public static final AlignmentLineKt$LastBaseline$1 INSTANCE = new AlignmentLineKt$LastBaseline$1();

    AlignmentLineKt$LastBaseline$1() {
        super(2, dsN.class, "max", "max(II)I", 1);
    }

    public final Integer invoke(int i, int i2) {
        return Integer.valueOf(Math.max(i, i2));
    }

    @Override // o.drX
    public /* synthetic */ Integer invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }
}
