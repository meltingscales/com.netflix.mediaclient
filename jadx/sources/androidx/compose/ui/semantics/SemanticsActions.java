package androidx.compose.ui.semantics;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import o.InterfaceC8612dsa;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class SemanticsActions {
    public static final int $stable;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> ClearTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> Collapse;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> CopyText;
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> CutText;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> Dismiss;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> Expand;
    private static final SemanticsPropertyKey<AccessibilityAction<drM<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey<AccessibilityAction<drM<AnnotatedString, Boolean>>> InsertTextAtCursor;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> OnClick;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> OnImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> OnLongClick;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> PageDown;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> PageLeft;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> PageRight;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> PageUp;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> PasteText;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> PerformImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> RequestFocus;
    private static final SemanticsPropertyKey<AccessibilityAction<drX<Float, Float, Boolean>>> ScrollBy;
    private static final SemanticsPropertyKey<AccessibilityAction<drM<Integer, Boolean>>> ScrollToIndex;
    private static final SemanticsPropertyKey<AccessibilityAction<drM<Float, Boolean>>> SetProgress;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC8612dsa<Integer, Integer, Boolean, Boolean>>> SetSelection;
    private static final SemanticsPropertyKey<AccessibilityAction<drM<AnnotatedString, Boolean>>> SetText;
    private static final SemanticsPropertyKey<AccessibilityAction<drM<AnnotatedString, Boolean>>> SetTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<drM<Boolean, Boolean>>> ShowTextSubstitution;

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drM<List<TextLayoutResult>, Boolean>>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drM<AnnotatedString, Boolean>>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getOnImeAction() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getPageDown() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getPageLeft() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getPageRight() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getPageUp() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drO<Boolean>>> getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drX<Float, Float, Boolean>>> getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drM<Integer, Boolean>>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drM<Float, Boolean>>> getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC8612dsa<Integer, Integer, Boolean, Boolean>>> getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drM<AnnotatedString, Boolean>>> getSetText() {
        return SetText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drM<AnnotatedString, Boolean>>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<drM<Boolean, Boolean>>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }

    private SemanticsActions() {
    }

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = new drX<AccessibilityAction<T>, AccessibilityAction<T>, AccessibilityAction<T>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
            @Override // o.drX
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((AccessibilityAction) ((AccessibilityAction) obj), (AccessibilityAction) ((AccessibilityAction) obj2));
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
                if (r2 == null) goto L10;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [o.dpy] */
            /* JADX WARN: Type inference failed for: r2v6 */
            /* JADX WARN: Type inference failed for: r2v7 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> r2, androidx.compose.ui.semantics.AccessibilityAction<T> r3) {
                /*
                    r1 = this;
                    if (r2 == 0) goto L8
                    java.lang.String r0 = r2.getLabel()
                    if (r0 != 0) goto Lc
                L8:
                    java.lang.String r0 = r3.getLabel()
                Lc:
                    if (r2 == 0) goto L14
                    o.dpy r2 = r2.getAction()
                    if (r2 != 0) goto L18
                L14:
                    o.dpy r2 = r3.getAction()
                L18:
                    androidx.compose.ui.semantics.AccessibilityAction r3 = new androidx.compose.ui.semantics.AccessibilityAction
                    r3.<init>(r0, r2)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1.invoke(androidx.compose.ui.semantics.AccessibilityAction, androidx.compose.ui.semantics.AccessibilityAction):androidx.compose.ui.semantics.AccessibilityAction");
            }
        };
        GetTextLayoutResult = SemanticsPropertiesKt.AccessibilityKey("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        OnClick = SemanticsPropertiesKt.AccessibilityKey("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        OnLongClick = SemanticsPropertiesKt.AccessibilityKey("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollBy = SemanticsPropertiesKt.AccessibilityKey("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollToIndex = SemanticsPropertiesKt.AccessibilityKey("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        SetProgress = SemanticsPropertiesKt.AccessibilityKey("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        SetSelection = SemanticsPropertiesKt.AccessibilityKey("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        SetText = SemanticsPropertiesKt.AccessibilityKey("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        SetTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("SetTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        ShowTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ShowTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        ClearTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ClearTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        InsertTextAtCursor = SemanticsPropertiesKt.AccessibilityKey("InsertTextAtCursor", semanticsPropertiesKt$ActionPropertyKey$1);
        OnImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        PerformImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        CopyText = SemanticsPropertiesKt.AccessibilityKey("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        CutText = SemanticsPropertiesKt.AccessibilityKey("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        PasteText = SemanticsPropertiesKt.AccessibilityKey("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        Expand = SemanticsPropertiesKt.AccessibilityKey("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        Collapse = SemanticsPropertiesKt.AccessibilityKey("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        Dismiss = SemanticsPropertiesKt.AccessibilityKey("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        RequestFocus = SemanticsPropertiesKt.AccessibilityKey("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        CustomActions = SemanticsPropertiesKt.AccessibilityKey("CustomActions");
        PageUp = SemanticsPropertiesKt.AccessibilityKey("PageUp", semanticsPropertiesKt$ActionPropertyKey$1);
        PageLeft = SemanticsPropertiesKt.AccessibilityKey("PageLeft", semanticsPropertiesKt$ActionPropertyKey$1);
        PageDown = SemanticsPropertiesKt.AccessibilityKey("PageDown", semanticsPropertiesKt$ActionPropertyKey$1);
        PageRight = SemanticsPropertiesKt.AccessibilityKey("PageRight", semanticsPropertiesKt$ActionPropertyKey$1);
        $stable = 8;
    }
}
