package androidx.compose.foundation.selection;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class SelectableGroupKt {
    public static final Modifier selectableGroup(Modifier modifier) {
        return SemanticsModifierKt.semantics$default(modifier, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.foundation.selection.SelectableGroupKt$selectableGroup$1
            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
            }
        }, 1, null);
    }
}
