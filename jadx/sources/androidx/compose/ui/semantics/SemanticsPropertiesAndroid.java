package androidx.compose.ui.semantics;

import o.drX;

/* loaded from: classes.dex */
public final class SemanticsPropertiesAndroid {
    public static final SemanticsPropertiesAndroid INSTANCE = new SemanticsPropertiesAndroid();
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", false, new drX<Boolean, Boolean, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        public final Boolean invoke(Boolean bool, boolean z) {
            return bool;
        }

        @Override // o.drX
        public /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return invoke(bool, bool2.booleanValue());
        }
    });
    public static final int $stable = 8;

    public final SemanticsPropertyKey<Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }

    private SemanticsPropertiesAndroid() {
    }
}
