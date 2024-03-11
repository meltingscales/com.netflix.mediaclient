package androidx.compose.ui.layout;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.drX;
import o.dsN;

/* loaded from: classes.dex */
final /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements drX<Integer, Integer, Integer> {
    public static final AlignmentLineKt$FirstBaseline$1 INSTANCE = new AlignmentLineKt$FirstBaseline$1();

    AlignmentLineKt$FirstBaseline$1() {
        super(2, dsN.class, "min", "min(II)I", 1);
    }

    public final Integer invoke(int i, int i2) {
        return Integer.valueOf(Math.min(i, i2));
    }

    @Override // o.drX
    public /* synthetic */ Integer invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }
}
