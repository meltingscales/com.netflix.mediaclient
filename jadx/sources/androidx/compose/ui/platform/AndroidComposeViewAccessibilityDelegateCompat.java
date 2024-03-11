package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import o.C8563dqf;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.C8799dyz;
import o.InterfaceC8612dsa;
import o.InterfaceC8650dtl;
import o.InterfaceC8792dys;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;
import o.dsT;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat implements DefaultLifecycleObserver {
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    private final InterfaceC8792dys<dpR> boundsUpdateChannel;
    private final ArrayMap<Integer, ViewStructureCompat> bufferedContentCaptureAppearedNodes;
    private final ArraySet<Integer> bufferedContentCaptureDisappearedNodes;
    private boolean checkingForSemanticsChanges;
    private boolean contentCaptureForceEnabledForTesting;
    private ContentCaptureSessionCompat contentCaptureSession;
    private Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private AccessibilityNodeInfo currentlyFocusedANI;
    private List<AccessibilityServiceInfo> enabledServices;
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    private final Handler handler;
    private HashMap<Integer, Integer> idToAfterMap;
    private HashMap<Integer, Integer> idToBeforeMap;
    private SparseArrayCompat<Map<CharSequence, Integer>> labelToActionId;
    private AccessibilityNodeProviderCompat nodeProvider;
    private ArraySet<Integer> paneDisplayed;
    private final HashMap<Integer, ScrollAxisRange> pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final HashMap<Integer, ScrollAxisRange> pendingVerticalScrollEvents;
    private Map<Integer, SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final drM<ScrollObservationScope, dpR> scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private TranslateStatus translateStatus;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] AccessibilityActionsResourceIds = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private drM<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new drM<AccessibilityEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(1);
        }

        @Override // o.drM
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(AndroidComposeViewAccessibilityDelegateCompat.this.getView().getParent().requestSendAccessibilityEvent(AndroidComposeViewAccessibilityDelegateCompat.this.getView(), accessibilityEvent));
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum TranslateStatus {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean isAccessibilityFocused(int i) {
        return this.focusedVirtualViewId == i;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        return this.nodeProvider;
    }

    public final boolean getContentCaptureForceEnabledForTesting$ui_release() {
        return this.contentCaptureForceEnabledForTesting;
    }

    public final String getExtraDataTestTraversalAfterVal$ui_release() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    public final String getExtraDataTestTraversalBeforeVal$ui_release() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    public final HashMap<Integer, Integer> getIdToAfterMap$ui_release() {
        return this.idToAfterMap;
    }

    public final HashMap<Integer, Integer> getIdToBeforeMap$ui_release() {
        return this.idToBeforeMap;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final void setContentCaptureSession$ui_release(ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.contentCaptureSession = contentCaptureSessionCompat;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        Map<Integer, SemanticsNodeWithAdjustedBounds> d;
        Map d2;
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        C8632dsu.d(systemService);
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat.this, z);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda1
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat.this, z);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new AccessibilityNodeProviderCompat(new ComposeAccessibilityNodeProvider());
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new HashMap<>();
        this.pendingVerticalScrollEvents = new HashMap<>();
        this.actionIdToLabel = new SparseArrayCompat<>(0, 1, null);
        this.labelToActionId = new SparseArrayCompat<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>(0, 1, null);
        this.boundsUpdateChannel = C8799dyz.e(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.bufferedContentCaptureAppearedNodes = new ArrayMap<>();
        this.bufferedContentCaptureDisappearedNodes = new ArraySet<>(0, 1, null);
        d = dqE.d();
        this.currentSemanticsNodes = d;
        this.paneDisplayed = new ArraySet<>(0, 1, null);
        this.idToBeforeMap = new HashMap<>();
        this.idToAfterMap = new HashMap<>();
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = new LinkedHashMap();
        SemanticsNode unmergedRootSemanticsNode = androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode();
        d2 = dqE.d();
        this.previousSemanticsRoot = new SemanticsNodeCopy(unmergedRootSemanticsNode, d2);
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
                if (AndroidComposeViewAccessibilityDelegateCompat.this.getContentCaptureForceEnabledForTesting$ui_release()) {
                    return;
                }
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = AndroidComposeViewAccessibilityDelegateCompat.this;
                androidComposeViewAccessibilityDelegateCompat2.setContentCaptureSession$ui_release(androidComposeViewAccessibilityDelegateCompat2.getContentCaptureSessionCompat(view));
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
                AndroidComposeViewAccessibilityDelegateCompat.this.setContentCaptureSession$ui_release(null);
            }
        });
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$46(AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new drM<ScrollObservationScope, dpR>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(ScrollObservationScope scrollObservationScope) {
                invoke2(scrollObservationScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ScrollObservationScope scrollObservationScope) {
                AndroidComposeViewAccessibilityDelegateCompat.this.scheduleScrollEventIfNeeded(scrollObservationScope);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        List<AccessibilityServiceInfo> i;
        if (z) {
            i = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        } else {
            i = C8569dql.i();
        }
        androidComposeViewAccessibilityDelegateCompat.enabledServices = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean isEnabled() {
        return isEnabledForAccessibility$ui_release() || isEnabledForContentCapture();
    }

    public final boolean isEnabledForAccessibility$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && (this.enabledServices.isEmpty() ^ true);
    }

    private final boolean isEnabledForContentCapture() {
        return !AndroidComposeViewAccessibilityDelegateCompat_androidKt.getDisableContentCapture() && (this.contentCaptureSession != null || this.contentCaptureForceEnabledForTesting);
    }

    private final boolean isTouchExplorationEnabled() {
        return this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.node = semanticsNode;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Integer, SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        Map<Integer, SemanticsNodeWithAdjustedBounds> allUncoveredSemanticsNodesToMap;
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            allUncoveredSemanticsNodesToMap = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodes = allUncoveredSemanticsNodesToMap;
            if (isEnabledForAccessibility$ui_release()) {
                setTraversalValues();
            }
        }
        return this.currentSemanticsNodes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class SemanticsNodeCopy {
        private final Set<Integer> children = new LinkedHashSet();
        private final SemanticsNode semanticsNode;
        private final SemanticsConfiguration unmergedConfig;

        public final Set<Integer> getChildren() {
            return this.children;
        }

        public final SemanticsNode getSemanticsNode() {
            return this.semanticsNode;
        }

        public final SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public SemanticsNodeCopy(SemanticsNode semanticsNode, Map<Integer, SemanticsNodeWithAdjustedBounds> map) {
            this.semanticsNode = semanticsNode;
            this.unmergedConfig = semanticsNode.getUnmergedConfig$ui_release();
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
                if (map.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                    this.children.add(Integer.valueOf(semanticsNode2.getId()));
                }
            }
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        initContentCapture(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        initContentCapture(false);
    }

    /* renamed from: canScroll-0AR0LA0$ui_release  reason: not valid java name */
    public final boolean m1976canScroll0AR0LA0$ui_release(boolean z, int i, long j) {
        if (C8632dsu.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m1975canScrollmoWRBKg(getCurrentSemanticsNodes().values(), z, i, j);
        }
        return false;
    }

    /* renamed from: canScroll-moWRBKg  reason: not valid java name */
    private final boolean m1975canScrollmoWRBKg(Collection<SemanticsNodeWithAdjustedBounds> collection, boolean z, int i, long j) {
        SemanticsPropertyKey<ScrollAxisRange> horizontalScrollAxisRange;
        ScrollAxisRange scrollAxisRange;
        if (Offset.m1134equalsimpl0(j, Offset.Companion.m1148getUnspecifiedF1C5BW0()) || !Offset.m1140isValidimpl(j)) {
            return false;
        }
        if (z) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else if (!z) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Collection<SemanticsNodeWithAdjustedBounds> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        for (SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds : collection2) {
            if (RectHelper_androidKt.toComposeRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m1153containsk4lQ0M(j) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getConfig(), horizontalScrollAxisRange)) != null) {
                int i2 = scrollAxisRange.getReverseScrolling() ? -i : i;
                if ((i == 0 && scrollAxisRange.getReverseScrolling()) || i2 < 0) {
                    if (scrollAxisRange.getValue().invoke().floatValue() > 0.0f) {
                        return true;
                    }
                } else if (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessibilityNodeInfo createNodeInfo(int i) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (i == -1) {
            ViewParent parentForAccessibility = ViewCompat.getParentForAccessibility(this.view);
            obtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            Integer valueOf = parent != null ? Integer.valueOf(parent.getId()) : null;
            if (valueOf == null) {
                throw new IllegalStateException(("semanticsNode " + i + " has null parent").toString());
            }
            int intValue = valueOf.intValue();
            obtain.setParent(this.view, intValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? intValue : -1);
        }
        obtain.setSource(this.view, i);
        obtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(i, obtain, semanticsNode);
        return obtain.unwrap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect boundsInScreen(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        long mo1764localToScreenMKHz9U = this.view.mo1764localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long mo1764localToScreenMKHz9U2 = this.view.mo1764localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        return new Rect((int) Math.floor(Offset.m1137getXimpl(mo1764localToScreenMKHz9U)), (int) Math.floor(Offset.m1138getYimpl(mo1764localToScreenMKHz9U)), (int) Math.ceil(Offset.m1137getXimpl(mo1764localToScreenMKHz9U2)), (int) Math.ceil(Offset.m1138getYimpl(mo1764localToScreenMKHz9U2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class TopBottomBoundsComparator implements Comparator<Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>> {
        public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

        private TopBottomBoundsComparator() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair, Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair2) {
            return compare2((Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>) pair, (Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>) pair2);
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair, Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair2) {
            int compare = Float.compare(pair.d().getTop(), pair2.d().getTop());
            return compare != 0 ? compare : Float.compare(pair.d().getBottom(), pair2.d().getBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class LtrBoundsComparator implements Comparator<SemanticsNode> {
        public static final LtrBoundsComparator INSTANCE = new LtrBoundsComparator();

        private LtrBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
            androidx.compose.ui.geometry.Rect boundsInWindow = semanticsNode.getBoundsInWindow();
            androidx.compose.ui.geometry.Rect boundsInWindow2 = semanticsNode2.getBoundsInWindow();
            int compare = Float.compare(boundsInWindow.getLeft(), boundsInWindow2.getLeft());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return compare3 != 0 ? compare3 : Float.compare(boundsInWindow.getRight(), boundsInWindow2.getRight());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class RtlBoundsComparator implements Comparator<SemanticsNode> {
        public static final RtlBoundsComparator INSTANCE = new RtlBoundsComparator();

        private RtlBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
            androidx.compose.ui.geometry.Rect boundsInWindow = semanticsNode.getBoundsInWindow();
            androidx.compose.ui.geometry.Rect boundsInWindow2 = semanticsNode2.getBoundsInWindow();
            int compare = Float.compare(boundsInWindow2.getRight(), boundsInWindow.getRight());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return compare3 != 0 ? compare3 : Float.compare(boundsInWindow2.getLeft(), boundsInWindow.getLeft());
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0085 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<androidx.compose.ui.semantics.SemanticsNode> sortByGeometryGroupings(boolean r10, java.util.ArrayList<androidx.compose.ui.semantics.SemanticsNode> r11, java.util.Map<java.lang.Integer, java.util.List<androidx.compose.ui.semantics.SemanticsNode>> r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = o.C8570dqm.a(r11)
            r2 = 0
            if (r1 < 0) goto L34
            r3 = r2
        Ld:
            java.lang.Object r4 = r11.get(r3)
            androidx.compose.ui.semantics.SemanticsNode r4 = (androidx.compose.ui.semantics.SemanticsNode) r4
            if (r3 == 0) goto L1b
            boolean r5 = sortByGeometryGroupings$placedEntryRowOverlaps(r0, r4)
            if (r5 != 0) goto L2f
        L1b:
            androidx.compose.ui.geometry.Rect r5 = r4.getBoundsInWindow()
            androidx.compose.ui.semantics.SemanticsNode[] r4 = new androidx.compose.ui.semantics.SemanticsNode[]{r4}
            kotlin.Pair r6 = new kotlin.Pair
            java.util.List r4 = o.C8570dqm.c(r4)
            r6.<init>(r5, r4)
            r0.add(r6)
        L2f:
            if (r3 == r1) goto L34
            int r3 = r3 + 1
            goto Ld
        L34:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator r11 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TopBottomBoundsComparator.INSTANCE
            o.C8570dqm.a(r0, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r1 = r0.size()
            r3 = r2
        L43:
            if (r3 >= r1) goto L77
            java.lang.Object r4 = r0.get(r3)
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.a()
            java.util.List r5 = (java.util.List) r5
            if (r10 == 0) goto L56
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$RtlBoundsComparator r6 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.RtlBoundsComparator.INSTANCE
            goto L58
        L56:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$LtrBoundsComparator r6 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.LtrBoundsComparator.INSTANCE
        L58:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1 r7 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1
            androidx.compose.ui.node.LayoutNode$Companion r8 = androidx.compose.ui.node.LayoutNode.Companion
            java.util.Comparator r8 = r8.getZComparator$ui_release()
            r7.<init>()
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2 r6 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2
            r6.<init>()
            o.C8570dqm.a(r5, r6)
            java.lang.Object r4 = r4.a()
            java.util.Collection r4 = (java.util.Collection) r4
            r11.addAll(r4)
            int r3 = r3 + 1
            goto L43
        L77:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda3 r10 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda3
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 r0 = new o.drX<androidx.compose.ui.semantics.SemanticsNode, androidx.compose.ui.semantics.SemanticsNode, java.lang.Integer>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2
                static {
                    /*
                        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2) androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.INSTANCE androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 2
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.<init>():void");
                }

                @Override // o.drX
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.semantics.SemanticsNode r1, androidx.compose.ui.semantics.SemanticsNode r2) {
                    /*
                        r0 = this;
                        androidx.compose.ui.semantics.SemanticsNode r1 = (androidx.compose.ui.semantics.SemanticsNode) r1
                        androidx.compose.ui.semantics.SemanticsNode r2 = (androidx.compose.ui.semantics.SemanticsNode) r2
                        java.lang.Integer r1 = r0.invoke(r1, r2)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }

                @Override // o.drX
                public final java.lang.Integer invoke(androidx.compose.ui.semantics.SemanticsNode r4, androidx.compose.ui.semantics.SemanticsNode r5) {
                    /*
                        r3 = this;
                        androidx.compose.ui.semantics.SemanticsConfiguration r4 = r4.getConfig()
                        androidx.compose.ui.semantics.SemanticsProperties r0 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
                        androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r0.getTraversalIndex()
                        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1 r2 = new o.drO<java.lang.Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1
                            static {
                                /*
                                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1
                                    r0.<init>()
                                    
                                    // error: 0x0005: SPUT  (r0 I:androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1) androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1.INSTANCE androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1.<clinit>():void");
                            }

                            {
                                /*
                                    r1 = this;
                                    r0 = 0
                                    r1.<init>(r0)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1.<init>():void");
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // o.drO
                            public final java.lang.Float invoke() {
                                /*
                                    r1 = this;
                                    r0 = 0
                                    java.lang.Float r0 = java.lang.Float.valueOf(r0)
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1.invoke():java.lang.Float");
                            }

                            @Override // o.drO
                            public /* bridge */ /* synthetic */ java.lang.Float invoke() {
                                /*
                                    r1 = this;
                                    java.lang.Float r0 = r1.invoke()
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1.invoke():java.lang.Object");
                            }
                        }
                        java.lang.Object r4 = r4.getOrElse(r1, r2)
                        java.lang.Number r4 = (java.lang.Number) r4
                        float r4 = r4.floatValue()
                        androidx.compose.ui.semantics.SemanticsConfiguration r5 = r5.getConfig()
                        androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.getTraversalIndex()
                        java.lang.Object r5 = r5.getOrElse(r0, r2)
                        java.lang.Number r5 = (java.lang.Number) r5
                        float r5 = r5.floatValue()
                        int r4 = java.lang.Float.compare(r4, r5)
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.invoke(androidx.compose.ui.semantics.SemanticsNode, androidx.compose.ui.semantics.SemanticsNode):java.lang.Integer");
                }
            }
            r10.<init>()
            o.C8570dqm.a(r11, r10)
        L81:
            int r10 = o.C8570dqm.a(r11)
            if (r2 > r10) goto Lbb
            java.lang.Object r10 = r11.get(r2)
            androidx.compose.ui.semantics.SemanticsNode r10 = (androidx.compose.ui.semantics.SemanticsNode) r10
            int r10 = r10.getId()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r12.get(r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto Lb8
            java.lang.Object r0 = r11.get(r2)
            androidx.compose.ui.semantics.SemanticsNode r0 = (androidx.compose.ui.semantics.SemanticsNode) r0
            boolean r0 = r9.isScreenReaderFocusable(r0)
            if (r0 != 0) goto Lad
            r11.remove(r2)
            goto Laf
        Lad:
            int r2 = r2 + 1
        Laf:
            r11.addAll(r2, r10)
            int r10 = r10.size()
            int r2 = r2 + r10
            goto L81
        Lb8:
            int r2 = r2 + 1
            goto L81
        Lbb:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(boolean, java.util.ArrayList, java.util.Map):java.util.List");
    }

    private static final boolean sortByGeometryGroupings$placedEntryRowOverlaps(ArrayList<Pair<androidx.compose.ui.geometry.Rect, List<SemanticsNode>>> arrayList, SemanticsNode semanticsNode) {
        int t;
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        boolean z = top >= bottom;
        t = C8569dql.t(arrayList);
        if (t >= 0) {
            int i = 0;
            while (true) {
                androidx.compose.ui.geometry.Rect d = arrayList.get(i).d();
                boolean z2 = d.getTop() >= d.getBottom();
                if (!z && !z2 && Math.max(top, d.getTop()) < Math.min(bottom, d.getBottom())) {
                    arrayList.set(i, new Pair<>(d.intersect(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i).a()));
                    arrayList.get(i).a().add(semanticsNode);
                    return true;
                } else if (i == t) {
                    break;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$7(drX drx, Object obj, Object obj2) {
        return ((Number) drx.invoke(obj, obj2)).intValue();
    }

    private final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean z, List<SemanticsNode> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<SemanticsNode> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(list.get(i), arrayList, linkedHashMap);
        }
        return sortByGeometryGroupings(z, arrayList, linkedHashMap);
    }

    private final void setTraversalValues() {
        List<SemanticsNode> f;
        int t;
        this.idToBeforeMap.clear();
        this.idToAfterMap.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        C8632dsu.d(semanticsNode);
        int i = 1;
        boolean z = semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
        f = C8569dql.f(semanticsNode);
        List<SemanticsNode> subtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(z, f);
        t = C8569dql.t(subtreeSortedByGeometryGrouping);
        if (1 > t) {
            return;
        }
        while (true) {
            int id = subtreeSortedByGeometryGrouping.get(i - 1).getId();
            int id2 = subtreeSortedByGeometryGrouping.get(i).getId();
            this.idToBeforeMap.put(Integer.valueOf(id), Integer.valueOf(id2));
            this.idToAfterMap.put(Integer.valueOf(id2), Integer.valueOf(id));
            if (i == t) {
                return;
            }
            i++;
        }
    }

    private final boolean isScreenReaderFocusable(SemanticsNode semanticsNode) {
        String infoContentDescriptionOrNull;
        infoContentDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoContentDescriptionOrNull(semanticsNode);
        return semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || (semanticsNode.isUnmergedLeafNode$ui_release() && (infoContentDescriptionOrNull != null || getInfoText(semanticsNode) != null || getInfoStateDescriptionOrNull(semanticsNode) != null || getInfoIsCheckable(semanticsNode)));
    }

    private final void populateAccessibilityNodeInfoProperties(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
        boolean isImportantForAccessibility;
        String infoContentDescriptionOrNull;
        boolean enabled;
        boolean isVisible;
        boolean enabled2;
        boolean enabled3;
        List m;
        boolean enabled4;
        boolean enabled5;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        boolean enabled6;
        float c;
        float h;
        boolean excludeLineAndPageGranularities;
        boolean enabled7;
        boolean enabled8;
        String m1978toLegacyClassNameV4PA4sw;
        accessibilityNodeInfoCompat.setClassName("android.view.View");
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getRole());
        if (role != null) {
            role.m2035unboximpl();
            if (semanticsNode.isFake$ui_release() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                Role.Companion companion = Role.Companion;
                if (Role.m2032equalsimpl0(role.m2035unboximpl(), companion.m2042getTabo7Vup1c())) {
                    accessibilityNodeInfoCompat.setRoleDescription(this.view.getContext().getResources().getString(R.string.tab));
                } else if (!Role.m2032equalsimpl0(role.m2035unboximpl(), companion.m2041getSwitcho7Vup1c())) {
                    m1978toLegacyClassNameV4PA4sw = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m1978toLegacyClassNameV4PA4sw(role.m2035unboximpl());
                    if (!Role.m2032equalsimpl0(role.m2035unboximpl(), companion.m2039getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui_release() || semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
                        accessibilityNodeInfoCompat.setClassName(m1978toLegacyClassNameV4PA4sw);
                    }
                } else {
                    accessibilityNodeInfoCompat.setRoleDescription(this.view.getContext().getResources().getString(R.string.switch_role));
                }
            }
            dpR dpr = dpR.c;
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText())) {
            accessibilityNodeInfoCompat.setClassName("android.widget.EditText");
        }
        if (semanticsNode.getConfig().contains(semanticsProperties.getText())) {
            accessibilityNodeInfoCompat.setClassName("android.widget.TextView");
        }
        accessibilityNodeInfoCompat.setPackageName(this.view.getContext().getPackageName());
        isImportantForAccessibility = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isImportantForAccessibility(semanticsNode);
        accessibilityNodeInfoCompat.setImportantForAccessibility(isImportantForAccessibility);
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i2);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode$ui_release());
                if (androidViewHolder != null) {
                    accessibilityNodeInfoCompat.addChild(androidViewHolder);
                } else {
                    accessibilityNodeInfoCompat.addChild(this.view, semanticsNode2.getId());
                }
            }
        }
        if (i == this.focusedVirtualViewId) {
            accessibilityNodeInfoCompat.setAccessibilityFocused(true);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            accessibilityNodeInfoCompat.setAccessibilityFocused(false);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        setText(semanticsNode, accessibilityNodeInfoCompat);
        setContentInvalid(semanticsNode, accessibilityNodeInfoCompat);
        setStateDescription(semanticsNode, accessibilityNodeInfoCompat);
        setIsCheckable(semanticsNode, accessibilityNodeInfoCompat);
        SemanticsConfiguration unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release2, semanticsProperties2.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                accessibilityNodeInfoCompat.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                accessibilityNodeInfoCompat.setChecked(false);
            }
            dpR dpr2 = dpR.c;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int m2042getTabo7Vup1c = Role.Companion.m2042getTabo7Vup1c();
            if (role != null && Role.m2032equalsimpl0(role.m2035unboximpl(), m2042getTabo7Vup1c)) {
                accessibilityNodeInfoCompat.setSelected(booleanValue);
            } else {
                accessibilityNodeInfoCompat.setChecked(booleanValue);
            }
            dpR dpr3 = dpR.c;
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            infoContentDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoContentDescriptionOrNull(semanticsNode);
            accessibilityNodeInfoCompat.setContentDescription(infoContentDescriptionOrNull);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getTestTag());
        if (str != null) {
            SemanticsNode semanticsNode3 = semanticsNode;
            while (true) {
                if (semanticsNode3 == null) {
                    break;
                }
                SemanticsConfiguration unmergedConfig$ui_release3 = semanticsNode3.getUnmergedConfig$ui_release();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
                if (unmergedConfig$ui_release3.contains(semanticsPropertiesAndroid.getTestTagsAsResourceId())) {
                    if (((Boolean) semanticsNode3.getUnmergedConfig$ui_release().get(semanticsPropertiesAndroid.getTestTagsAsResourceId())).booleanValue()) {
                        accessibilityNodeInfoCompat.setViewIdResourceName(str);
                    }
                } else {
                    semanticsNode3 = semanticsNode3.getParent();
                }
            }
        }
        SemanticsConfiguration unmergedConfig$ui_release4 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.INSTANCE;
        if (((dpR) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release4, semanticsProperties3.getHeading())) != null) {
            accessibilityNodeInfoCompat.setHeading(true);
            dpR dpr4 = dpR.c;
        }
        accessibilityNodeInfoCompat.setPassword(semanticsNode.getConfig().contains(semanticsProperties3.getPassword()));
        SemanticsConfiguration unmergedConfig$ui_release5 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        accessibilityNodeInfoCompat.setEditable(unmergedConfig$ui_release5.contains(semanticsActions.getSetText()));
        enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        accessibilityNodeInfoCompat.setEnabled(enabled);
        accessibilityNodeInfoCompat.setFocusable(semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getFocused()));
        int i3 = 2;
        if (accessibilityNodeInfoCompat.isFocusable()) {
            accessibilityNodeInfoCompat.setFocused(((Boolean) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties3.getFocused())).booleanValue());
            if (accessibilityNodeInfoCompat.isFocused()) {
                accessibilityNodeInfoCompat.addAction(2);
            } else {
                accessibilityNodeInfoCompat.addAction(1);
            }
        }
        isVisible = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(semanticsNode);
        accessibilityNodeInfoCompat.setVisibleToUser(isVisible);
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getLiveRegion());
        if (liveRegionMode != null) {
            int m2026unboximpl = liveRegionMode.m2026unboximpl();
            LiveRegionMode.Companion companion2 = LiveRegionMode.Companion;
            accessibilityNodeInfoCompat.setLiveRegion((LiveRegionMode.m2023equalsimpl0(m2026unboximpl, companion2.m2028getPolite0phEisY()) || !LiveRegionMode.m2023equalsimpl0(m2026unboximpl, companion2.m2027getAssertive0phEisY())) ? 1 : 1);
            dpR dpr5 = dpR.c;
        }
        accessibilityNodeInfoCompat.setClickable(false);
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnClick());
        if (accessibilityAction != null) {
            boolean c2 = C8632dsu.c(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getSelected()), Boolean.TRUE);
            accessibilityNodeInfoCompat.setClickable(!c2);
            enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled8 && !c2) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            dpR dpr6 = dpR.c;
        }
        accessibilityNodeInfoCompat.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnLongClick());
        if (accessibilityAction2 != null) {
            accessibilityNodeInfoCompat.setLongClickable(true);
            enabled7 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled7) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            dpR dpr7 = dpR.c;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCopyText());
        if (accessibilityAction3 != null) {
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            dpR dpr8 = dpR.c;
        }
        enabled2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled2) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getSetText());
            if (accessibilityAction4 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                dpR dpr9 = dpR.c;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnImeAction());
            if (accessibilityAction5 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908372, accessibilityAction5.getLabel()));
                dpR dpr10 = dpR.c;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCutText());
            if (accessibilityAction6 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(AleCryptoBouncyCastle.MAX_RANDOM_BYTES, accessibilityAction6.getLabel()));
                dpR dpr11 = dpR.c;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPasteText());
            if (accessibilityAction7 != null) {
                if (accessibilityNodeInfoCompat.isFocused() && this.view.getClipboardManager().hasText()) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(Privacy.DEFAULT, accessibilityAction7.getLabel()));
                }
                dpR dpr12 = dpR.c;
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            accessibilityNodeInfoCompat.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getSetSelection());
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            accessibilityNodeInfoCompat.addAction(JSONzip.end);
            accessibilityNodeInfoCompat.addAction(512);
            accessibilityNodeInfoCompat.setMovementGranularities(11);
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getContentDescription());
            if ((list == null || list.isEmpty()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getGetTextLayoutResult())) {
                excludeLineAndPageGranularities = AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode);
                if (!excludeLineAndPageGranularities) {
                    accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat.getMovementGranularities() | 20);
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("androidx.compose.ui.semantics.id");
            CharSequence text = accessibilityNodeInfoCompat.getText();
            if (text != null && text.length() != 0 && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getGetTextLayoutResult())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getTestTag())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            AccessibilityNodeInfoVerificationHelperMethods.INSTANCE.setAvailableExtraData(accessibilityNodeInfoCompat.unwrap(), arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getSetProgress())) {
                accessibilityNodeInfoCompat.setClassName("android.widget.SeekBar");
            } else {
                accessibilityNodeInfoCompat.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().h().floatValue(), progressBarRangeInfo.getRange().g().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getSetProgress())) {
                enabled6 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                if (enabled6) {
                    float current = progressBarRangeInfo.getCurrent();
                    c = C8657dts.c(progressBarRangeInfo.getRange().g().floatValue(), progressBarRangeInfo.getRange().h().floatValue());
                    if (current < c) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    }
                    float current2 = progressBarRangeInfo.getCurrent();
                    h = C8657dts.h(progressBarRangeInfo.getRange().h().floatValue(), progressBarRangeInfo.getRange().g().floatValue());
                    if (current2 > h) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    }
                }
            }
        }
        Api24Impl.addSetProgressAction(accessibilityNodeInfoCompat, semanticsNode);
        CollectionInfo_androidKt.setCollectionInfo(semanticsNode, accessibilityNodeInfoCompat);
        CollectionInfo_androidKt.setCollectionItemInfo(semanticsNode, accessibilityNodeInfoCompat);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                accessibilityNodeInfoCompat.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            enabled5 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled5) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    if (semanticsNode.getLayoutInfo().getLayoutDirection() != LayoutDirection.Rtl) {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    accessibilityNodeInfoCompat.addAction(accessibilityActionCompat2);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    if (semanticsNode.getLayoutInfo().getLayoutDirection() != LayoutDirection.Rtl) {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    accessibilityNodeInfoCompat.addAction(accessibilityActionCompat);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                accessibilityNodeInfoCompat.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            enabled4 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled4) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (i4 >= 29) {
            Api29Impl.addPageActions(accessibilityNodeInfoCompat, semanticsNode);
        }
        accessibilityNodeInfoCompat.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getPaneTitle()));
        enabled3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled3) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getExpand());
            if (accessibilityAction10 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                dpR dpr13 = dpR.c;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCollapse());
            if (accessibilityAction11 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                dpR dpr14 = dpR.c;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getDismiss());
            if (accessibilityAction12 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                dpR dpr15 = dpR.c;
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getCustomActions())) {
                List list2 = (List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getCustomActions());
                int size2 = list2.size();
                int[] iArr = AccessibilityActionsResourceIds;
                if (size2 >= iArr.length) {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
                SparseArrayCompat<CharSequence> sparseArrayCompat = new SparseArrayCompat<>(0, 1, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (this.labelToActionId.containsKey(i)) {
                    Map<CharSequence, Integer> map = this.labelToActionId.get(i);
                    m = C8563dqf.m(iArr);
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list2.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list2.get(i5);
                        C8632dsu.d(map);
                        if (map.containsKey(customAccessibilityAction.getLabel())) {
                            Integer num = map.get(customAccessibilityAction.getLabel());
                            C8632dsu.d(num);
                            sparseArrayCompat.put(num.intValue(), customAccessibilityAction.getLabel());
                            linkedHashMap.put(customAccessibilityAction.getLabel(), num);
                            m.remove(num);
                            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(num.intValue(), customAccessibilityAction.getLabel()));
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i6);
                        int intValue = ((Number) m.get(i6)).intValue();
                        sparseArrayCompat.put(intValue, customAccessibilityAction2.getLabel());
                        linkedHashMap.put(customAccessibilityAction2.getLabel(), Integer.valueOf(intValue));
                        accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(intValue, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list2.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list2.get(i7);
                        int i8 = AccessibilityActionsResourceIds[i7];
                        sparseArrayCompat.put(i8, customAccessibilityAction3.getLabel());
                        linkedHashMap.put(customAccessibilityAction3.getLabel(), Integer.valueOf(i8));
                        accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i8, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.put(i, sparseArrayCompat);
                this.labelToActionId.put(i, linkedHashMap);
            }
        }
        accessibilityNodeInfoCompat.setScreenReaderFocusable(isScreenReaderFocusable(semanticsNode));
        Integer num2 = this.idToBeforeMap.get(Integer.valueOf(i));
        if (num2 != null) {
            num2.intValue();
            View semanticsIdToView = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (semanticsIdToView != null) {
                accessibilityNodeInfoCompat.setTraversalBefore(semanticsIdToView);
            } else {
                accessibilityNodeInfoCompat.setTraversalBefore(this.view, num2.intValue());
            }
            addExtraDataToAccessibilityNodeInfoHelper(i, accessibilityNodeInfoCompat.unwrap(), this.ExtraDataTestTraversalBeforeVal, null);
            dpR dpr16 = dpR.c;
        }
        Integer num3 = this.idToAfterMap.get(Integer.valueOf(i));
        if (num3 != null) {
            num3.intValue();
            View semanticsIdToView2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (semanticsIdToView2 != null) {
                accessibilityNodeInfoCompat.setTraversalAfter(semanticsIdToView2);
                addExtraDataToAccessibilityNodeInfoHelper(i, accessibilityNodeInfoCompat.unwrap(), this.ExtraDataTestTraversalAfterVal, null);
            }
            dpR dpr17 = dpR.c;
        }
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling());
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling());
    }

    private final void setContentInvalid(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getError())) {
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getError()));
        }
    }

    private final String getInfoStateDescriptionOrNull(SemanticsNode semanticsNode) {
        float a;
        int e;
        int c;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        if (toggleableState != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i == 1) {
                int m2041getSwitcho7Vup1c = Role.Companion.m2041getSwitcho7Vup1c();
                if (role != null && Role.m2032equalsimpl0(role.m2035unboximpl(), m2041getSwitcho7Vup1c) && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(R.string.on);
                }
            } else if (i == 2) {
                int m2041getSwitcho7Vup1c2 = Role.Companion.m2041getSwitcho7Vup1c();
                if (role != null && Role.m2032equalsimpl0(role.m2035unboximpl(), m2041getSwitcho7Vup1c2) && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(R.string.off);
                }
            } else if (i == 3 && orNull == null) {
                orNull = this.view.getContext().getResources().getString(R.string.indeterminate);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int m2042getTabo7Vup1c = Role.Companion.m2042getTabo7Vup1c();
            if ((role == null || !Role.m2032equalsimpl0(role.m2035unboximpl(), m2042getTabo7Vup1c)) && orNull == null) {
                if (booleanValue) {
                    orNull = this.view.getContext().getResources().getString(R.string.selected);
                } else {
                    orNull = this.view.getContext().getResources().getString(R.string.not_selected);
                }
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                if (orNull == null) {
                    InterfaceC8650dtl<Float> range = progressBarRangeInfo.getRange();
                    a = C8657dts.a(range.g().floatValue() - range.h().floatValue() == 0.0f ? 0.0f : (progressBarRangeInfo.getCurrent() - range.h().floatValue()) / (range.g().floatValue() - range.h().floatValue()), 0.0f, 1.0f);
                    if (a == 0.0f) {
                        c = 0;
                    } else if (a == 1.0f) {
                        c = 100;
                    } else {
                        e = dsT.e(a * 100);
                        c = C8657dts.c(e, 1, 99);
                    }
                    orNull = this.view.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(c));
                }
            } else if (orNull == null) {
                orNull = this.view.getContext().getResources().getString(R.string.in_progress);
            }
        }
        return (String) orNull;
    }

    private final void setStateDescription(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setStateDescription(getInfoStateDescriptionOrNull(semanticsNode));
    }

    private final boolean getInfoIsCheckable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        boolean z = true;
        boolean z2 = toggleableState != null;
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getSelected());
        if (bool != null) {
            bool.booleanValue();
            int m2042getTabo7Vup1c = Role.Companion.m2042getTabo7Vup1c();
            if (role != null && Role.m2032equalsimpl0(role.m2035unboximpl(), m2042getTabo7Vup1c)) {
                z = z2;
            }
            return z;
        }
        return z2;
    }

    private final void setIsCheckable(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setCheckable(getInfoIsCheckable(semanticsNode));
    }

    private final SpannableString getInfoText(SemanticsNode semanticsNode) {
        Object x;
        FontFamily.Resolver fontFamilyResolver = this.view.getFontFamilyResolver();
        AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
        SpannableString spannableString = null;
        SpannableString spannableString2 = (SpannableString) trimToSize(textForTextField != null ? AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(textForTextField, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache) : null, 100000);
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (list != null) {
            x = C8576dqs.x(list);
            AnnotatedString annotatedString = (AnnotatedString) x;
            if (annotatedString != null) {
                spannableString = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache);
            }
        }
        return spannableString2 == null ? (SpannableString) trimToSize(spannableString, 100000) : spannableString2;
    }

    private final void setText(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setText(getInfoText(semanticsNode));
    }

    private final boolean requestAccessibilityFocus(int i) {
        if (isTouchExplorationEnabled() && !isAccessibilityFocused(i)) {
            int i2 = this.focusedVirtualViewId;
            if (i2 != Integer.MIN_VALUE) {
                sendEventForVirtualView$default(this, i2, AleCryptoBouncyCastle.MAX_RANDOM_BYTES, null, null, 12, null);
            }
            this.focusedVirtualViewId = i;
            this.view.invalidate();
            sendEventForVirtualView$default(this, i, Privacy.DEFAULT, null, null, 12, null);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final boolean sendEventForVirtualView(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !isEnabled()) {
            return false;
        }
        AccessibilityEvent createEvent = createEvent(i, i2);
        if (num != null) {
            createEvent.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            createEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
        }
        return sendEvent(createEvent);
    }

    private final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (isEnabledForAccessibility$ui_release()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                this.sendingFocusAffectingEvent = true;
            }
            try {
                return this.onSendAccessibilityEvent.invoke(accessibilityEvent).booleanValue();
            } finally {
                this.sendingFocusAffectingEvent = false;
            }
        }
        return false;
    }

    private final AccessibilityEvent createEvent(int i, int i2) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, i);
        if (isEnabledForAccessibility$ui_release() && (semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i))) != null) {
            obtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
        }
        return obtain;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent createEvent = createEvent(i, 8192);
        if (num != null) {
            createEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            createEvent.getText().add(charSequence);
        }
        return createEvent;
    }

    private final boolean clearAccessibilityFocus(int i) {
        if (isAccessibilityFocused(i)) {
            this.focusedVirtualViewId = Integer.MIN_VALUE;
            this.currentlyFocusedANI = null;
            this.view.invalidate();
            sendEventForVirtualView$default(this, i, AleCryptoBouncyCastle.MAX_RANDOM_BYTES, null, null, 12, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00da -> B:55:0x00db). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performActionHelper(int r17, int r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 1698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f) {
        return (f < 0.0f && scrollAxisRange.getValue().invoke().floatValue() > 0.0f) || (f > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue());
    }

    private static final float performActionHelper$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (C8632dsu.c((Object) str, (Object) this.ExtraDataTestTraversalBeforeVal)) {
            Integer num = this.idToBeforeMap.get(Integer.valueOf(i));
            if (num != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
            }
        } else if (C8632dsu.c((Object) str, (Object) this.ExtraDataTestTraversalAfterVal)) {
            Integer num2 = this.idToAfterMap.get(Integer.valueOf(i));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
            }
        } else if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && bundle != null && C8632dsu.c((Object) str, (Object) "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                    TextLayoutResult textLayoutResult = getTextLayoutResult(semanticsNode.getUnmergedConfig$ui_release());
                    if (textLayoutResult == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = i2 + i4;
                        if (i5 >= textLayoutResult.getLayoutInput().getText().length()) {
                            arrayList.add(null);
                        } else {
                            arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i5)));
                        }
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
        } else {
            SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (unmergedConfig$ui_release.contains(semanticsProperties.getTestTag()) && bundle != null && C8632dsu.c((Object) str, (Object) "androidx.compose.ui.semantics.testTag")) {
                String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getTestTag());
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                }
            } else if (C8632dsu.c((Object) str, (Object) "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo.getExtras().putInt(str, semanticsNode.getId());
            }
        }
    }

    private final RectF toScreenCoords(SemanticsNode semanticsNode, androidx.compose.ui.geometry.Rect rect) {
        if (semanticsNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect m1160translatek4lQ0M = rect.m1160translatek4lQ0M(semanticsNode.m2044getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect intersect = m1160translatek4lQ0M.overlaps(boundsInRoot) ? m1160translatek4lQ0M.intersect(boundsInRoot) : null;
        if (intersect != null) {
            long mo1764localToScreenMKHz9U = this.view.mo1764localToScreenMKHz9U(OffsetKt.Offset(intersect.getLeft(), intersect.getTop()));
            long mo1764localToScreenMKHz9U2 = this.view.mo1764localToScreenMKHz9U(OffsetKt.Offset(intersect.getRight(), intersect.getBottom()));
            return new RectF(Offset.m1137getXimpl(mo1764localToScreenMKHz9U), Offset.m1138getYimpl(mo1764localToScreenMKHz9U), Offset.m1137getXimpl(mo1764localToScreenMKHz9U2), Offset.m1138getYimpl(mo1764localToScreenMKHz9U2));
        }
        return null;
    }

    public final boolean dispatchHoverEvent$ui_release(MotionEvent motionEvent) {
        if (isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int hitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(motionEvent.getX(), motionEvent.getY());
                boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                updateHoveredVirtualView(hitTestSemanticsAt$ui_release);
                if (hitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                    return dispatchGenericMotionEvent;
                }
                return true;
            } else if (action != 10) {
                return false;
            } else {
                if (this.hoveredVirtualViewId != Integer.MIN_VALUE) {
                    updateHoveredVirtualView(Integer.MIN_VALUE);
                    return true;
                }
                return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            }
        }
        return false;
    }

    public final int hitTestSemanticsAt$ui_release(float f, float f2) {
        Object D;
        NodeChain nodes$ui_release;
        boolean isVisible;
        Owner.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        this.view.getRoot().m1870hitTestSemanticsM_7yMNQ$ui_release(OffsetKt.Offset(f, f2), hitTestResult, (r13 & 4) != 0, (r13 & 8) != 0);
        D = C8576dqs.D((List<? extends Object>) hitTestResult);
        Modifier.Node node = (Modifier.Node) D;
        LayoutNode requireLayoutNode = node != null ? DelegatableNodeKt.requireLayoutNode(node) : null;
        if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null && nodes$ui_release.m1905hasH91voCI$ui_release(NodeKind.m1935constructorimpl(8))) {
            isVisible = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(SemanticsNodeKt.SemanticsNode(requireLayoutNode, false));
            if (isVisible && this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(requireLayoutNode) == null) {
                return semanticsNodeIdToAccessibilityVirtualNodeId(requireLayoutNode.getSemanticsId());
            }
        }
        return Integer.MIN_VALUE;
    }

    private final void updateHoveredVirtualView(int i) {
        int i2 = this.hoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.hoveredVirtualViewId = i;
        sendEventForVirtualView$default(this, i, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i2, JSONzip.end, null, null, 12, null);
    }

    private final <T extends CharSequence> T trimToSize(T t, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("size should be greater than 0".toString());
        }
        if (t == null || t.length() == 0 || t.length() <= i) {
            return t;
        }
        int i2 = i - 1;
        if (Character.isHighSurrogate(t.charAt(i2)) && Character.isLowSurrogate(t.charAt(i))) {
            i = i2;
        }
        T t2 = (T) t.subSequence(0, i);
        C8632dsu.d(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$46(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
        androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
        androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:34:0x008b, B:36:0x0091, B:38:0x009a, B:39:0x00ab, B:41:0x00b2, B:42:0x00bb, B:18:0x004e), top: B:51:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00d8 -> B:14:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(o.InterfaceC8585dra<? super o.dpR> r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop$ui_release(o.dra):java.lang.Object");
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.d((InterfaceC8792dys<dpR>) dpR.c);
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRange = this.pendingHorizontalScrollEvents.get(Integer.valueOf(semanticsId));
            ScrollAxisRange scrollAxisRange2 = this.pendingVerticalScrollEvents.get(Integer.valueOf(semanticsId));
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent createEvent = createEvent(semanticsId, 4096);
            if (scrollAxisRange != null) {
                createEvent.setScrollX((int) scrollAxisRange.getValue().invoke().floatValue());
                createEvent.setMaxScrollX((int) scrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (scrollAxisRange2 != null) {
                createEvent.setScrollY((int) scrollAxisRange2.getValue().invoke().floatValue());
                createEvent.setMaxScrollY((int) scrollAxisRange2.getMaxValue().invoke().floatValue());
            }
            sendEvent(createEvent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(r8, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void sendSubtreeChangeAccessibilityEvents(androidx.compose.ui.node.LayoutNode r8, androidx.collection.ArraySet<java.lang.Integer> r9) {
        /*
            r7 = this;
            boolean r0 = r8.isAttached()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.view
            androidx.compose.ui.platform.AndroidViewsHandler r0 = r0.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.getLayoutNodeToHolder()
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L18
            return
        L18:
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r0 = r7.subtreeChangedLayoutNodes
            int r0 = r0.size()
            r1 = 0
        L1f:
            if (r1 >= r0) goto L33
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r2 = r7.subtreeChangedLayoutNodes
            java.lang.Object r2 = r2.valueAt(r1)
            androidx.compose.ui.node.LayoutNode r2 = (androidx.compose.ui.node.LayoutNode) r2
            boolean r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isAncestorOf(r2, r8)
            if (r2 == 0) goto L30
            return
        L30:
            int r1 = r1 + 1
            goto L1f
        L33:
            androidx.compose.ui.node.NodeChain r0 = r8.getNodes$ui_release()
            r1 = 8
            int r1 = androidx.compose.ui.node.NodeKind.m1935constructorimpl(r1)
            boolean r0 = r0.m1905hasH91voCI$ui_release(r1)
            if (r0 == 0) goto L44
            goto L4a
        L44:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1 r0 = new o.drM<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                static {
                    /*
                        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  
  (r0 I:androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1)
 androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.INSTANCE androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.<init>():void");
                }

                @Override // o.drM
                public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r2) {
                    /*
                        r1 = this;
                        androidx.compose.ui.node.NodeChain r2 = r2.getNodes$ui_release()
                        r0 = 8
                        int r0 = androidx.compose.ui.node.NodeKind.m1935constructorimpl(r0)
                        boolean r2 = r2.m1905hasH91voCI$ui_release(r0)
                        java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r1) {
                    /*
                        r0 = this;
                        androidx.compose.ui.node.LayoutNode r1 = (androidx.compose.ui.node.LayoutNode) r1
                        java.lang.Boolean r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            androidx.compose.ui.node.LayoutNode r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(r8, r0)
        L4a:
            if (r8 == 0) goto L84
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r8.getCollapsedSemantics$ui_release()
            if (r0 != 0) goto L53
            goto L84
        L53:
            boolean r0 = r0.isMergingSemanticsOfDescendants()
            if (r0 != 0) goto L62
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 r0 = new o.drM<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                static {
                    /*
                        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  
  (r0 I:androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1)
 androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.<init>():void");
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r1) {
                    /*
                        r0 = this;
                        androidx.compose.ui.node.LayoutNode r1 = (androidx.compose.ui.node.LayoutNode) r1
                        java.lang.Boolean r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.invoke(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
                    if (r2.isMergingSemanticsOfDescendants() == true) goto L5;
                 */
                @Override // o.drM
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r2) {
                    /*
                        r1 = this;
                        androidx.compose.ui.semantics.SemanticsConfiguration r2 = r2.getCollapsedSemantics$ui_release()
                        if (r2 == 0) goto Le
                        boolean r2 = r2.isMergingSemanticsOfDescendants()
                        r0 = 1
                        if (r2 != r0) goto Le
                        goto Lf
                    Le:
                        r0 = 0
                    Lf:
                        java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
                }
            }
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(r8, r0)
            if (r0 == 0) goto L62
            r8 = r0
        L62:
            int r8 = r8.getSemanticsId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r9 = r9.add(r0)
            if (r9 != 0) goto L71
            return
        L71:
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r8)
            r2 = 2048(0x800, float:2.87E-42)
            r8 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents(androidx.compose.ui.node.LayoutNode, androidx.collection.ArraySet):void");
    }

    private final void checkForSemanticsChanges() {
        if (isEnabledForAccessibility$ui_release()) {
            sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        }
        if (isEnabledForContentCapture()) {
            sendContentCaptureSemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        }
        sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
        updateSemanticsNodesCopyAndPanes();
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        boolean hasPaneTitle;
        SemanticsConfiguration unmergedConfig;
        boolean hasPaneTitle2;
        ArraySet<? extends Integer> arraySet = new ArraySet<>(0, 1, null);
        Iterator<Integer> it = this.paneDisplayed.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(intValue));
            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
            if (semanticsNode != null) {
                hasPaneTitle2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(semanticsNode);
                if (!hasPaneTitle2) {
                }
            }
            arraySet.add(Integer.valueOf(intValue));
            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(Integer.valueOf(intValue));
            sendPaneChangeEvents(intValue, 32, (semanticsNodeCopy == null || (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) == null) ? null : (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle()));
        }
        this.paneDisplayed.removeAll(arraySet);
        this.previousSemanticsNodes.clear();
        for (Map.Entry<Integer, SemanticsNodeWithAdjustedBounds> entry : getCurrentSemanticsNodes().entrySet()) {
            hasPaneTitle = AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(entry.getValue().getSemanticsNode());
            if (hasPaneTitle && this.paneDisplayed.add(entry.getKey())) {
                sendPaneChangeEvents(entry.getKey().intValue(), 16, (String) entry.getValue().getSemanticsNode().getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getPaneTitle()));
            }
            this.previousSemanticsNodes.put(entry.getKey(), new SemanticsNodeCopy(entry.getValue().getSemanticsNode(), getCurrentSemanticsNodes()));
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x03b6, code lost:
        if (r14.getConfig().contains(r6.getPassword()) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x05ab, code lost:
        if (r0.containsAll(r2) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x05da, code lost:
        if (r0 == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x05dd, code lost:
        r17 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void sendSemanticsPropertyChangeEvents(java.util.Map<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> r28) {
        /*
            Method dump skipped, instructions count: 1566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents(java.util.Map):void");
    }

    private final void sendContentCaptureTextUpdateEvent(int i, String str) {
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat != null && Build.VERSION.SDK_INT >= 29) {
            AutofillId newAutofillId = contentCaptureSessionCompat.newAutofillId(i);
            if (newAutofillId == null) {
                throw new IllegalStateException("Invalid content capture ID".toString());
            }
            contentCaptureSessionCompat.notifyViewTextChanged(newAutofillId, str);
        }
    }

    private final boolean registerScrollingId(int i, List<ScrollObservationScope> list) {
        ScrollObservationScope findById;
        boolean z;
        findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(list, i);
        if (findById != null) {
            z = false;
        } else {
            findById = new ScrollObservationScope(i, this.scrollObservationScopes, null, null, null, null);
            z = true;
        }
        this.scrollObservationScopes.add(findById);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new drO<dpR>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    int semanticsNodeIdToAccessibilityVirtualNodeId;
                    SemanticsNode semanticsNode;
                    LayoutNode layoutNode$ui_release;
                    HashMap hashMap;
                    HashMap hashMap2;
                    AccessibilityNodeInfo accessibilityNodeInfo;
                    Rect boundsInScreen;
                    ScrollAxisRange horizontalScrollAxisRange = ScrollObservationScope.this.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = ScrollObservationScope.this.getVerticalScrollAxisRange();
                    Float oldXValue = ScrollObservationScope.this.getOldXValue();
                    Float oldYValue = ScrollObservationScope.this.getOldYValue();
                    float floatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
                    float floatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
                    if (floatValue != 0.0f || floatValue2 != 0.0f) {
                        semanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(ScrollObservationScope.this.getSemanticsNodeId());
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().get(Integer.valueOf(this.focusedVirtualViewId));
                        if (semanticsNodeWithAdjustedBounds != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                accessibilityNodeInfo = androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI;
                                if (accessibilityNodeInfo != null) {
                                    boundsInScreen = androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds);
                                    accessibilityNodeInfo.setBoundsInScreen(boundsInScreen);
                                    dpR dpr = dpR.c;
                                }
                            } catch (IllegalStateException unused) {
                                dpR dpr2 = dpR.c;
                            }
                        }
                        this.getView().invalidate();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().get(Integer.valueOf(semanticsNodeIdToAccessibilityVirtualNodeId));
                        if (semanticsNodeWithAdjustedBounds2 != null && (semanticsNode = semanticsNodeWithAdjustedBounds2.getSemanticsNode()) != null && (layoutNode$ui_release = semanticsNode.getLayoutNode$ui_release()) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            if (horizontalScrollAxisRange != null) {
                                hashMap2 = androidComposeViewAccessibilityDelegateCompat2.pendingHorizontalScrollEvents;
                                hashMap2.put(Integer.valueOf(semanticsNodeIdToAccessibilityVirtualNodeId), horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                hashMap = androidComposeViewAccessibilityDelegateCompat2.pendingVerticalScrollEvents;
                                hashMap.put(Integer.valueOf(semanticsNodeIdToAccessibilityVirtualNodeId), verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat2.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode$ui_release);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        ScrollObservationScope.this.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        ScrollObservationScope.this.setOldYValue(verticalScrollAxisRange.getValue().invoke());
                    }
                }
            });
        }
    }

    private final void sendPaneChangeEvents(int i, int i2, String str) {
        AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i), 32);
        createEvent.setContentChangeTypes(i2);
        if (str != null) {
            createEvent.getText().add(str);
        }
        sendEvent(createEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    private final TextLayoutResult getTextLayoutResult(SemanticsConfiguration semanticsConfiguration) {
        drM drm;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getGetTextLayoutResult());
        if (accessibilityAction == null || (drm = (drM) accessibilityAction.getAction()) == null || !((Boolean) drm.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
        r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m1978toLegacyClassNameV4PA4sw(r1.m2035unboximpl());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.compose.ui.platform.coreshims.ViewStructureCompat toViewStructure(androidx.compose.ui.semantics.SemanticsNode r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.toViewStructure(androidx.compose.ui.semantics.SemanticsNode):androidx.compose.ui.platform.coreshims.ViewStructureCompat");
    }

    private final void bufferContentCaptureViewAppeared(int i, ViewStructureCompat viewStructureCompat) {
        if (viewStructureCompat == null) {
            return;
        }
        if (this.bufferedContentCaptureDisappearedNodes.contains(Integer.valueOf(i))) {
            this.bufferedContentCaptureDisappearedNodes.remove(Integer.valueOf(i));
        } else {
            this.bufferedContentCaptureAppearedNodes.put(Integer.valueOf(i), viewStructureCompat);
        }
    }

    private final void bufferContentCaptureViewDisappeared(int i) {
        if (this.bufferedContentCaptureAppearedNodes.containsKey(Integer.valueOf(i))) {
            this.bufferedContentCaptureAppearedNodes.remove(Integer.valueOf(i));
        } else {
            this.bufferedContentCaptureDisappearedNodes.add(Integer.valueOf(i));
        }
    }

    private final void notifyContentCaptureChanges() {
        List U;
        long[] k;
        List U2;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat != null && Build.VERSION.SDK_INT >= 29) {
            if (!this.bufferedContentCaptureAppearedNodes.isEmpty()) {
                U2 = C8576dqs.U(this.bufferedContentCaptureAppearedNodes.values());
                ArrayList arrayList = new ArrayList(U2.size());
                int size = U2.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((ViewStructureCompat) U2.get(i)).toViewStructure());
                }
                contentCaptureSessionCompat.notifyViewsAppeared(arrayList);
                this.bufferedContentCaptureAppearedNodes.clear();
            }
            if (!this.bufferedContentCaptureDisappearedNodes.isEmpty()) {
                U = C8576dqs.U(this.bufferedContentCaptureDisappearedNodes);
                ArrayList arrayList2 = new ArrayList(U.size());
                int size2 = U.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(Long.valueOf(((Number) U.get(i2)).intValue()));
                }
                k = C8576dqs.k(arrayList2);
                contentCaptureSessionCompat.notifyViewsDisappeared(k);
                this.bufferedContentCaptureDisappearedNodes.clear();
            }
        }
    }

    private final void updateContentCaptureBuffersOnAppeared(SemanticsNode semanticsNode) {
        if (isEnabledForContentCapture()) {
            updateTranslationOnAppeared(semanticsNode);
            bufferContentCaptureViewAppeared(semanticsNode.getId(), toViewStructure(semanticsNode));
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                updateContentCaptureBuffersOnAppeared(replacedChildren$ui_release.get(i));
            }
        }
    }

    private final void updateContentCaptureBuffersOnDisappeared(SemanticsNode semanticsNode) {
        if (isEnabledForContentCapture()) {
            bufferContentCaptureViewDisappeared(semanticsNode.getId());
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                updateContentCaptureBuffersOnDisappeared(replacedChildren$ui_release.get(i));
            }
        }
    }

    private final void updateTranslationOnAppeared(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        drM drm;
        drM drm2;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && C8632dsu.c(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 == null || (drm2 = (drM) accessibilityAction2.getAction()) == null) {
                return;
            }
            Boolean bool2 = (Boolean) drm2.invoke(Boolean.FALSE);
        } else if (this.translateStatus != TranslateStatus.SHOW_TRANSLATED || !C8632dsu.c(bool, Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) == null || (drm = (drM) accessibilityAction.getAction()) == null) {
        } else {
            Boolean bool3 = (Boolean) drm.invoke(Boolean.TRUE);
        }
    }

    public final void onShowTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    public final void onHideTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onClearTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    private final void showTranslatedText() {
        AccessibilityAction accessibilityAction;
        drM drm;
        for (SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds : getCurrentSemanticsNodes().values()) {
            SemanticsConfiguration unmergedConfig$ui_release = semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui_release();
            if (C8632dsu.c(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (drm = (drM) accessibilityAction.getAction()) != null) {
                Boolean bool = (Boolean) drm.invoke(Boolean.TRUE);
            }
        }
    }

    private final void hideTranslatedText() {
        AccessibilityAction accessibilityAction;
        drM drm;
        for (SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds : getCurrentSemanticsNodes().values()) {
            SemanticsConfiguration unmergedConfig$ui_release = semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui_release();
            if (C8632dsu.c(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (drm = (drM) accessibilityAction.getAction()) != null) {
                Boolean bool = (Boolean) drm.invoke(Boolean.FALSE);
            }
        }
    }

    private final void clearTranslatedText() {
        AccessibilityAction accessibilityAction;
        drO dro;
        for (SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds : getCurrentSemanticsNodes().values()) {
            SemanticsConfiguration unmergedConfig$ui_release = semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui_release();
            if (SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (dro = (drO) accessibilityAction.getAction()) != null) {
                Boolean bool = (Boolean) dro.invoke();
            }
        }
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                if (!semanticsNodeCopy.getChildren().contains(Integer.valueOf(semanticsNode2.getId()))) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.getId()));
            }
        }
        for (Integer num : semanticsNodeCopy.getChildren()) {
            if (!linkedHashSet.contains(Integer.valueOf(num.intValue()))) {
                notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                return;
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode3.getId()));
                C8632dsu.d(semanticsNodeCopy2);
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    private final void initContentCapture(boolean z) {
        if (z) {
            updateContentCaptureBuffersOnAppeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        } else {
            updateContentCaptureBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        }
        notifyContentCaptureChanges();
    }

    private final void sendContentCaptureSemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId())) && !semanticsNodeCopy.getChildren().contains(Integer.valueOf(semanticsNode2.getId()))) {
                updateContentCaptureBuffersOnAppeared(semanticsNode2);
            }
        }
        for (Map.Entry<Integer, SemanticsNodeCopy> entry : this.previousSemanticsNodes.entrySet()) {
            if (!getCurrentSemanticsNodes().containsKey(entry.getKey())) {
                bufferContentCaptureViewDisappeared(entry.getKey().intValue());
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode3.getId())) && this.previousSemanticsNodes.containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode3.getId()));
                C8632dsu.d(semanticsNodeCopy2);
                sendContentCaptureSemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i) {
        if (i == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i;
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int id = semanticsNode.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(semanticsNode.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        boolean z3 = false;
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            AccessibilityIterators.TextSegmentIterator iteratorForGranularity = getIteratorForGranularity(semanticsNode, i);
            if (iteratorForGranularity == null) {
                return false;
            }
            int accessibilitySelectionEnd = getAccessibilitySelectionEnd(semanticsNode);
            if (accessibilitySelectionEnd == -1) {
                accessibilitySelectionEnd = z ? 0 : iterableTextForAccessibility.length();
            }
            int[] following = z ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
            if (following == null) {
                return false;
            }
            int i4 = following[0];
            z3 = true;
            int i5 = following[1];
            if (z2 && isAccessibilitySelectionExtendable(semanticsNode)) {
                i2 = getAccessibilitySelectionStart(semanticsNode);
                if (i2 == -1) {
                    i2 = z ? i4 : i5;
                }
                i3 = z ? i5 : i4;
            } else {
                i2 = z ? i5 : i4;
                i3 = i2;
            }
            this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, z ? JSONzip.end : 512, i, i4, i5, SystemClock.uptimeMillis());
            setAccessibilitySelection(semanticsNode, i2, i3, true);
        }
        return z3;
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (i != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                createEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                createEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                createEvent.setAction(pendingTextTraversedEvent.getAction());
                createEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                createEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(createEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String iterableTextForAccessibility;
        boolean enabled;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsActions.getSetSelection())) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                InterfaceC8612dsa interfaceC8612dsa = (InterfaceC8612dsa) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getSetSelection())).getAction();
                if (interfaceC8612dsa != null) {
                    return ((Boolean) interfaceC8612dsa.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
                }
                return false;
            }
        }
        if ((i == i2 && i2 == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null) {
            return false;
        }
        this.accessibilityCursorPosition = (i < 0 || i != i2 || i2 > iterableTextForAccessibility.length()) ? -1 : -1;
        boolean z2 = iterableTextForAccessibility.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
        sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
        return true;
    }

    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m2157getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m2161unboximpl());
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m2152getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m2161unboximpl());
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return !unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getEditableText());
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode semanticsNode, int i) {
        String iterableTextForAccessibility;
        TextLayoutResult textLayoutResult;
        if (semanticsNode == null || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (i == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator companion = AccessibilityIterators.CharacterTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion.initialize(iterableTextForAccessibility);
            return companion;
        } else if (i == 2) {
            AccessibilityIterators.WordTextSegmentIterator companion2 = AccessibilityIterators.WordTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion2.initialize(iterableTextForAccessibility);
            return companion2;
        } else {
            if (i != 4) {
                if (i == 8) {
                    AccessibilityIterators.ParagraphTextSegmentIterator companion3 = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
                    companion3.initialize(iterableTextForAccessibility);
                    return companion3;
                } else if (i != 16) {
                    return null;
                }
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && (textLayoutResult = getTextLayoutResult(semanticsNode.getUnmergedConfig$ui_release())) != null) {
                if (i == 4) {
                    AccessibilityIterators.LineTextSegmentIterator companion4 = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
                    companion4.initialize(iterableTextForAccessibility, textLayoutResult);
                    return companion4;
                }
                AccessibilityIterators.PageTextSegmentIterator companion5 = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
                companion5.initialize(iterableTextForAccessibility, textLayoutResult, semanticsNode);
                return companion5;
            }
            return null;
        }
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        Object x;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText())) {
            AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getText());
        if (list != null) {
            x = C8576dqs.x(list);
            AnnotatedString annotatedString = (AnnotatedString) x;
            if (annotatedString != null) {
                return annotatedString.getText();
            }
            return null;
        }
        return null;
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    /* loaded from: classes.dex */
    final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProvider {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            AccessibilityNodeInfo createNodeInfo = AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(i);
            if (AndroidComposeViewAccessibilityDelegateCompat.this.sendingFocusAffectingEvent && i == AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId) {
                AndroidComposeViewAccessibilityDelegateCompat.this.currentlyFocusedANI = createNodeInfo;
            }
            return createNodeInfo;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(i, i2, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i, accessibilityNodeInfo, str, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        public static final void addSetProgressAction(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            boolean enabled;
            AccessibilityAction accessibilityAction;
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (!enabled || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908349, accessibilityAction.getLabel()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        public static final void addPageActions(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            boolean enabled;
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908358, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908359, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908360, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908361, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class ViewTranslationHelperMethodsS {
        public static final ViewTranslationHelperMethodsS INSTANCE = new ViewTranslationHelperMethodsS();

        private ViewTranslationHelperMethodsS() {
        }

        public final void onVirtualViewTranslationResponses(final AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (C8632dsu.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                doTranslation(androidComposeViewAccessibilityDelegateCompat, longSparseArray);
            } else {
                androidComposeViewAccessibilityDelegateCompat.getView().post(new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeViewAccessibilityDelegateCompat.ViewTranslationHelperMethodsS.onVirtualViewTranslationResponses$lambda$1(AndroidComposeViewAccessibilityDelegateCompat.this, longSparseArray);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVirtualViewTranslationResponses$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, LongSparseArray longSparseArray) {
            INSTANCE.doTranslation(androidComposeViewAccessibilityDelegateCompat, longSparseArray);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
            r3 = r3.getValue("android:text");
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
            r3 = r3.getText();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void doTranslation(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r11, android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> r12) {
            /*
                r10 = this;
                o.dqx r0 = androidx.core.util.LongSparseArrayKt.keyIterator(r12)
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6c
                long r1 = r0.nextLong()
                java.lang.Object r3 = r12.get(r1)
                android.view.translation.ViewTranslationResponse r3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS$$ExternalSyntheticApiModelOutline4.m(r3)
                if (r3 == 0) goto L4
                java.lang.String r4 = "android:text"
                android.view.translation.TranslationResponseValue r3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS$$ExternalSyntheticApiModelOutline5.m(r3, r4)
                if (r3 == 0) goto L4
                java.lang.CharSequence r3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS$$ExternalSyntheticApiModelOutline6.m(r3)
                if (r3 == 0) goto L4
                java.util.Map r4 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$getCurrentSemanticsNodes(r11)
                int r1 = (int) r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r1 = r4.get(r1)
                androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r1 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r1
                if (r1 == 0) goto L4
                androidx.compose.ui.semantics.SemanticsNode r1 = r1.getSemanticsNode()
                if (r1 == 0) goto L4
                androidx.compose.ui.semantics.SemanticsConfiguration r1 = r1.getUnmergedConfig$ui_release()
                androidx.compose.ui.semantics.SemanticsActions r2 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
                androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.getSetTextSubstitution()
                java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r1, r2)
                androidx.compose.ui.semantics.AccessibilityAction r1 = (androidx.compose.ui.semantics.AccessibilityAction) r1
                if (r1 == 0) goto L4
                o.dpy r1 = r1.getAction()
                o.drM r1 = (o.drM) r1
                if (r1 == 0) goto L4
                androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
                java.lang.String r5 = r3.toString()
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9)
                java.lang.Object r1 = r1.invoke(r2)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                goto L4
            L6c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ViewTranslationHelperMethodsS.doTranslation(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, android.util.LongSparseArray):void");
        }

        public final void onCreateVirtualViewTranslationRequests(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
            SemanticsNode semanticsNode;
            AutofillId autofillId;
            String textForTranslation;
            TranslationRequestValue forText;
            ViewTranslationRequest build;
            for (long j : jArr) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().get(Integer.valueOf((int) j));
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                    AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS$$ExternalSyntheticApiModelOutline8.m();
                    autofillId = androidComposeViewAccessibilityDelegateCompat.getView().getAutofillId();
                    ViewTranslationRequest.Builder m = AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS$$ExternalSyntheticApiModelOutline7.m(autofillId, semanticsNode.getId());
                    textForTranslation = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getTextForTranslation(semanticsNode);
                    if (textForTranslation != null) {
                        forText = TranslationRequestValue.forText(new AnnotatedString(textForTranslation, null, null, 6, null));
                        m.setValue("android:text", forText);
                        build = m.build();
                        consumer.accept(build);
                    }
                }
            }
        }
    }

    public final void onCreateVirtualViewTranslationRequests$ui_release(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        ViewTranslationHelperMethodsS.INSTANCE.onCreateVirtualViewTranslationRequests(this, jArr, iArr, consumer);
    }

    public final void onVirtualViewTranslationResponses$ui_release(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        ViewTranslationHelperMethodsS.INSTANCE.onVirtualViewTranslationResponses(this, longSparseArray);
    }

    private final void geometryDepthFirstSearch(SemanticsNode semanticsNode, ArrayList<SemanticsNode> arrayList, Map<Integer, List<SemanticsNode>> map) {
        List<SemanticsNode> n;
        boolean z = semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
        boolean booleanValue = ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), new drO<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$isTraversalGroup$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue();
        if ((booleanValue || isScreenReaderFocusable(semanticsNode)) && getCurrentSemanticsNodes().keySet().contains(Integer.valueOf(semanticsNode.getId()))) {
            arrayList.add(semanticsNode);
        }
        if (booleanValue) {
            int id = semanticsNode.getId();
            n = C8576dqs.n(semanticsNode.getChildren());
            map.put(Integer.valueOf(id), subtreeSortedByGeometryGrouping(z, n));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(children.get(i), arrayList, map);
        }
    }
}
