package androidx.compose.ui.node;

import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public interface Owner {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U  reason: not valid java name */
    long mo1947calculateLocalPositionMKHz9U(long j);

    /* renamed from: calculatePositionInWindow-MK-Hz9U  reason: not valid java name */
    long mo1948calculatePositionInWindowMKHz9U(long j);

    OwnedLayer createLayer(drM<? super Canvas, dpR> drm, drO<dpR> dro);

    void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z);

    AccessibilityManager getAccessibilityManager();

    Autofill getAutofill();

    AutofillTree getAutofillTree();

    ClipboardManager getClipboardManager();

    dqZ getCoroutineContext();

    Density getDensity();

    DragAndDropManager getDragAndDropManager();

    FocusOwner getFocusOwner();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    ModifierLocalManager getModifierLocalManager();

    PointerIconService getPointerIconService();

    LayoutNode getRoot();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    SoftwareKeyboardController getSoftwareKeyboardController();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    void measureAndLayout(boolean z);

    /* renamed from: measureAndLayout-0kLqBqw  reason: not valid java name */
    void mo1949measureAndLayout0kLqBqw(LayoutNode layoutNode, long j);

    void onAttach(LayoutNode layoutNode);

    void onDetach(LayoutNode layoutNode);

    void onEndApplyChanges();

    void onLayoutChange(LayoutNode layoutNode);

    void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2, boolean z3);

    void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(drO<dpR> dro);

    void registerOnLayoutCompletedListener(OnLayoutCompletedListener onLayoutCompletedListener);

    boolean requestFocus();

    void requestOnPositionedCallback(LayoutNode layoutNode);

    void setShowLayoutBounds(boolean z);

    static /* synthetic */ void onRequestMeasure$default(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        owner.onRequestMeasure(layoutNode, z, z2, z3);
    }

    static /* synthetic */ void onRequestRelayout$default(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        owner.onRequestRelayout(layoutNode, z, z2);
    }

    static /* synthetic */ void measureAndLayout$default(Owner owner, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        owner.measureAndLayout(z);
    }

    static /* synthetic */ void forceMeasureTheSubtree$default(Owner owner, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        owner.forceMeasureTheSubtree(layoutNode, z);
    }

    default Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions;

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        private Companion() {
        }
    }
}
