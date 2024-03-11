package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import o.C8657dts;
import o.InterfaceC8650dtl;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class ProgressSemanticsKt {
    public static final Modifier progressSemantics(Modifier modifier, final float f, final InterfaceC8650dtl<Float> interfaceC8650dtl, final int i) {
        return SemanticsModifierKt.semantics(modifier, true, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                Comparable b;
                b = C8657dts.b(Float.valueOf(f), interfaceC8650dtl);
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) b).floatValue(), interfaceC8650dtl, i));
            }
        });
    }

    public static final Modifier progressSemantics(Modifier modifier) {
        return SemanticsModifierKt.semantics(modifier, true, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$2
            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, ProgressBarRangeInfo.Companion.getIndeterminate());
            }
        });
    }
}
