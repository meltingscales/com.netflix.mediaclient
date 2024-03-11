package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class TestTagKt {
    public static final Modifier testTag(Modifier modifier, final String str) {
        return SemanticsModifierKt.semantics$default(modifier, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.ui.platform.TestTagKt$testTag$1
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
                SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, str);
            }
        }, 1, null);
    }
}
