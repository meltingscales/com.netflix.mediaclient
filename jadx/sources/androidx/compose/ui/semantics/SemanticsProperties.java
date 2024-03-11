package androidx.compose.ui.semantics;

import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class SemanticsProperties {
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();
    private static final SemanticsPropertyKey<List<String>> ContentDescription = SemanticsPropertiesKt.AccessibilityKey("ContentDescription", new drX<List<? extends String>, List<? extends String>, List<? extends String>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // o.drX
        public /* bridge */ /* synthetic */ List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            return invoke2((List<String>) list, (List<String>) list2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
            r1 = o.C8576dqs.n(r1);
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<java.lang.String> invoke2(java.util.List<java.lang.String> r1, java.util.List<java.lang.String> r2) {
            /*
                r0 = this;
                if (r1 == 0) goto Lc
                java.util.List r1 = o.C8570dqm.h(r1)
                if (r1 == 0) goto Lc
                r1.addAll(r2)
                r2 = r1
            Lc:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1.invoke2(java.util.List, java.util.List):java.util.List");
        }
    });
    private static final SemanticsPropertyKey<String> StateDescription = SemanticsPropertiesKt.AccessibilityKey("StateDescription");
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = SemanticsPropertiesKt.AccessibilityKey("ProgressBarRangeInfo");
    private static final SemanticsPropertyKey<String> PaneTitle = SemanticsPropertiesKt.AccessibilityKey("PaneTitle", new drX<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // o.drX
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });
    private static final SemanticsPropertyKey<dpR> SelectableGroup = SemanticsPropertiesKt.AccessibilityKey("SelectableGroup");
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionInfo");
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionItemInfo");
    private static final SemanticsPropertyKey<dpR> Heading = SemanticsPropertiesKt.AccessibilityKey("Heading");
    private static final SemanticsPropertyKey<dpR> Disabled = SemanticsPropertiesKt.AccessibilityKey("Disabled");
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = SemanticsPropertiesKt.AccessibilityKey("LiveRegion");
    private static final SemanticsPropertyKey<Boolean> Focused = SemanticsPropertiesKt.AccessibilityKey("Focused");
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = SemanticsPropertiesKt.AccessibilityKey("IsTraversalGroup");
    private static final SemanticsPropertyKey<dpR> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", new drX<dpR, dpR, dpR>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // o.drX
        public final dpR invoke(dpR dpr, dpR dpr2) {
            return dpr;
        }
    });
    private static final SemanticsPropertyKey<Float> TraversalIndex = SemanticsPropertiesKt.AccessibilityKey("TraversalIndex", new drX<Float, Float, Float>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        public final Float invoke(Float f, float f2) {
            return f;
        }

        @Override // o.drX
        public /* synthetic */ Float invoke(Float f, Float f2) {
            return invoke(f, f2.floatValue());
        }
    });
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("HorizontalScrollAxisRange");
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("VerticalScrollAxisRange");
    private static final SemanticsPropertyKey<dpR> IsPopup = SemanticsPropertiesKt.AccessibilityKey("IsPopup", new drX<dpR, dpR, dpR>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // o.drX
        public final dpR invoke(dpR dpr, dpR dpr2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });
    private static final SemanticsPropertyKey<dpR> IsDialog = SemanticsPropertiesKt.AccessibilityKey("IsDialog", new drX<dpR, dpR, dpR>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // o.drX
        public final dpR invoke(dpR dpr, dpR dpr2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });
    private static final SemanticsPropertyKey<Role> Role = SemanticsPropertiesKt.AccessibilityKey("Role", new drX<Role, Role, Role>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        /* renamed from: invoke-qtA-w6s  reason: not valid java name */
        public final Role m2046invokeqtAw6s(Role role, int i) {
            return role;
        }

        @Override // o.drX
        public /* synthetic */ Role invoke(Role role, Role role2) {
            return m2046invokeqtAw6s(role, role2.m2035unboximpl());
        }
    });
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, new drX<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // o.drX
        public final String invoke(String str, String str2) {
            return str;
        }
    });
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = SemanticsPropertiesKt.AccessibilityKey("Text", new drX<List<? extends AnnotatedString>, List<? extends AnnotatedString>, List<? extends AnnotatedString>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // o.drX
        public /* bridge */ /* synthetic */ List<? extends AnnotatedString> invoke(List<? extends AnnotatedString> list, List<? extends AnnotatedString> list2) {
            return invoke2((List<AnnotatedString>) list, (List<AnnotatedString>) list2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
            r1 = o.C8576dqs.n(r1);
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<androidx.compose.ui.text.AnnotatedString> invoke2(java.util.List<androidx.compose.ui.text.AnnotatedString> r1, java.util.List<androidx.compose.ui.text.AnnotatedString> r2) {
            /*
                r0 = this;
                if (r1 == 0) goto Lc
                java.util.List r1 = o.C8570dqm.h(r1)
                if (r1 == 0) goto Lc
                r1.addAll(r2)
                r2 = r1
            Lc:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsProperties$Text$1.invoke2(java.util.List, java.util.List):java.util.List");
        }
    });
    private static final SemanticsPropertyKey<AnnotatedString> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", null, 2, null);
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", null, 2, null);
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = SemanticsPropertiesKt.AccessibilityKey("EditableText");
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = SemanticsPropertiesKt.AccessibilityKey("TextSelectionRange");
    private static final SemanticsPropertyKey<ImeAction> ImeAction = SemanticsPropertiesKt.AccessibilityKey("ImeAction");
    private static final SemanticsPropertyKey<Boolean> Selected = SemanticsPropertiesKt.AccessibilityKey("Selected");
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = SemanticsPropertiesKt.AccessibilityKey("ToggleableState");
    private static final SemanticsPropertyKey<dpR> Password = SemanticsPropertiesKt.AccessibilityKey("Password");
    private static final SemanticsPropertyKey<String> Error = SemanticsPropertiesKt.AccessibilityKey("Error");
    private static final SemanticsPropertyKey<drM<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", null, 2, null);
    public static final int $stable = 8;

    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    public final SemanticsPropertyKey<dpR> getDisabled() {
        return Disabled;
    }

    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    public final SemanticsPropertyKey<dpR> getHeading() {
        return Heading;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    public final SemanticsPropertyKey<drM<Object, Integer>> getIndexForKey() {
        return IndexForKey;
    }

    public final SemanticsPropertyKey<dpR> getInvisibleToUser() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey<dpR> getIsDialog() {
        return IsDialog;
    }

    public final SemanticsPropertyKey<dpR> getIsPopup() {
        return IsPopup;
    }

    public final SemanticsPropertyKey<Boolean> getIsShowingTextSubstitution() {
        return IsShowingTextSubstitution;
    }

    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey<dpR> getPassword() {
        return Password;
    }

    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    public final SemanticsPropertyKey<dpR> getSelectableGroup() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey<AnnotatedString> getTextSubstitution() {
        return TextSubstitution;
    }

    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return TraversalIndex;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }

    private SemanticsProperties() {
    }
}
