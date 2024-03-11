package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationCallback;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTransactionManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.ProcessResult;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import o.C8586drb;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpL;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drO;
import o.dsH;
import o.dsT;

/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, PositionCalculator, DefaultLifecycleObserver {
    private static Method getBooleanMethod;
    private static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final InputModeManagerImpl _inputModeManager;
    private final MutableState _viewTreeOwners$delegate;
    private final WindowInfoImpl _windowInfo;
    private final AndroidAccessibilityManager accessibilityManager;
    private final AutofillTree autofillTree;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboardManager clipboardManager;
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    private drM<? super Configuration, dpR> configurationChangeObserver;
    private final dqZ coroutineContext;
    private int currentFontWeightAdjustment;
    private Density density;
    private final List<OwnedLayer> dirtyLayers;
    private final DragAndDropManager dragAndDropManager;
    private final DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener;
    private final MutableVector<drO<dpR>> endApplyChangesListeners;
    private final FocusOwner focusOwner;
    private final MutableState fontFamilyResolver$delegate;
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isRenderNodeCompatible;
    private final Modifier keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private final WeakCache<OwnedLayer> layerCache;
    private final MutableState layoutDirection$delegate;
    private final TextInputServiceAndroid legacyTextInputServiceAndroid;
    private final CalculateMatrixToWindow matrixToWindow;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final ModifierLocalManager modifierLocalManager;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private drM<? super ViewTreeOwners, dpR> onViewTreeOwnersAvailable;
    private final PointerIconService pointerIconService;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private List<OwnedLayer> postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private long relayoutTime;
    private final drO<dpR> resendMotionEventOnLayout;
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private final LayoutNode root;
    private final RootForTest rootForTest;
    private final Modifier rotaryInputModifier;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final EmptySemanticsElement semanticsModifier;
    private final SemanticsOwner semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private final SoftwareKeyboardController softwareKeyboardController;
    private boolean superclassInitComplete;
    private final TextInputService textInputService;
    private final AtomicReference<SessionMutex.Session<Object>> textInputSessionMutex;
    private final TextToolbar textToolbar;
    private final float[] tmpMatrix;
    private final int[] tmpPositionArray;
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private final State viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private final boolean autofillSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public dqZ getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner
    public Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.Owner
    public DragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    @Override // androidx.compose.ui.node.Owner
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.node.Owner
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNode getRoot() {
        return this.root;
    }

    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.Owner
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.node.Owner
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onAttach(LayoutNode layoutNode) {
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    public final void setConfigurationChangeObserver(drM<? super Configuration, dpR> drm) {
        this.configurationChangeObserver = drm;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r11v14, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(Context context, dqZ dqz) {
        super(context);
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        CalculateMatrixToWindow calculateMatrixToWindowApi21;
        this.coroutineContext = dqz;
        Offset.Companion companion = Offset.Companion;
        this.lastDownPointerPosition = companion.m1148getUnspecifiedF1C5BW0();
        this.superclassInitComplete = true;
        this.sharedDrawScope = new LayoutNodeDrawScope(null, 1, null);
        this.density = AndroidDensity_androidKt.Density(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.INSTANCE;
        this.semanticsModifier = emptySemanticsElement;
        this.focusOwner = new FocusOwnerImpl(new drM<drO<? extends dpR>, dpR>() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusOwner$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(drO<? extends dpR> dro) {
                invoke2((drO<dpR>) dro);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(drO<dpR> dro) {
                AndroidComposeView.this.registerOnEndApplyChangesListener(dro);
            }
        });
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new AndroidComposeView$dragAndDropModifierOnDragListener$1(this));
        this.dragAndDropModifierOnDragListener = dragAndDropModifierOnDragListener;
        this.dragAndDropManager = dragAndDropModifierOnDragListener;
        this._windowInfo = new WindowInfoImpl();
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, new drM<KeyEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m1973invokeZmokQxo(keyEvent.m1649unboximpl());
            }

            /* renamed from: invoke-ZmokQxo  reason: not valid java name */
            public final Boolean m1973invokeZmokQxo(android.view.KeyEvent keyEvent) {
                FocusDirection m1970getFocusDirectionP8AzH3I = AndroidComposeView.this.m1970getFocusDirectionP8AzH3I(keyEvent);
                return (m1970getFocusDirectionP8AzH3I == null || !KeyEventType.m1652equalsimpl0(KeyEvent_androidKt.m1660getTypeZmokQxo(keyEvent), KeyEventType.Companion.m1656getKeyDownCS__XNY())) ? Boolean.FALSE : Boolean.valueOf(AndroidComposeView.this.getFocusOwner().mo1090moveFocus3ESFkO8(m1970getFocusDirectionP8AzH3I.m1081unboximpl()));
            }
        });
        this.keyInputModifier = onKeyEvent;
        Modifier onRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(companion2, new drM<RotaryScrollEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // o.drM
            public final Boolean invoke(RotaryScrollEvent rotaryScrollEvent) {
                return Boolean.FALSE;
            }
        });
        this.rotaryInputModifier = onRotaryScrollEvent;
        this.canvasHolder = new CanvasHolder();
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setModifier(companion2.then(emptySemanticsElement).then(onRotaryScrollEvent).then(getFocusOwner().getModifier()).then(onKeyEvent).then(dragAndDropModifierOnDragListener.getModifier()));
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = new drM<Configuration, dpR>() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Configuration configuration) {
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Configuration configuration) {
                invoke2(configuration);
                return dpR.c;
            }
        };
        this._autofill = autofillSupported() ? new AndroidAutofill(this, getAutofillTree()) : null;
        this.clipboardManager = new AndroidClipboardManager(context);
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        this.viewConfiguration = new AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        this.globalPosition = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        float[] m1370constructorimpl$default = Matrix.m1370constructorimpl$default(null, 1, null);
        this.tmpMatrix = m1370constructorimpl$default;
        this.viewToWindowMatrix = Matrix.m1370constructorimpl$default(null, 1, null);
        this.windowToViewMatrix = Matrix.m1370constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = companion.m1147getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._viewTreeOwners$delegate = mutableStateOf$default;
        this.viewTreeOwners$delegate = SnapshotStateKt.derivedStateOf(new drO<ViewTreeOwners>() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final AndroidComposeView.ViewTreeOwners invoke() {
                AndroidComposeView.ViewTreeOwners viewTreeOwners;
                viewTreeOwners = AndroidComposeView.this.get_viewTreeOwners();
                return viewTreeOwners;
            }
        });
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.this.updatePositionCacheAndDispatch();
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda3
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.this.updatePositionCacheAndDispatch();
            }
        };
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda4
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.touchModeChangeListener$lambda$3(AndroidComposeView.this, z);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        this.legacyTextInputServiceAndroid = textInputServiceAndroid;
        this.textInputService = new TextInputService(AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(textInputServiceAndroid));
        this.textInputSessionMutex = SessionMutex.m1057constructorimpl();
        this.softwareKeyboardController = new DelegatingSoftwareKeyboardController(getTextInputService());
        this.fontLoader = new AndroidFontResourceLoader(context);
        this.fontFamilyResolver$delegate = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(context.getResources().getConfiguration());
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AndroidComposeView_androidKt.getLocaleLayoutDirection(context.getResources().getConfiguration()), null, 2, null);
        this.layoutDirection$delegate = mutableStateOf$default2;
        this.hapticFeedBack = new PlatformHapticFeedback(this);
        this._inputModeManager = new InputModeManagerImpl(isInTouchMode() ? InputMode.Companion.m1622getTouchaOaMEAU() : InputMode.Companion.m1621getKeyboardaOaMEAU(), new drM<InputMode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ Boolean invoke(InputMode inputMode) {
                return m1971invokeiuPiT84(inputMode.m1620unboximpl());
            }

            /* renamed from: invoke-iuPiT84  reason: not valid java name */
            public final Boolean m1971invokeiuPiT84(int i) {
                boolean requestFocusFromTouch;
                InputMode.Companion companion3 = InputMode.Companion;
                if (InputMode.m1617equalsimpl0(i, companion3.m1622getTouchaOaMEAU())) {
                    requestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
                } else {
                    requestFocusFromTouch = InputMode.m1617equalsimpl0(i, companion3.m1621getKeyboardaOaMEAU()) ? AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true : false;
                }
                return Boolean.valueOf(requestFocusFromTouch);
            }
        }, null);
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new WeakCache<>();
        this.endApplyChangesListeners = new MutableVector<>(new drO[16], 0);
        this.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                MotionEvent motionEvent;
                long j;
                AndroidComposeView.this.removeCallbacks(this);
                motionEvent = AndroidComposeView.this.previousMotionEvent;
                if (motionEvent != null) {
                    boolean z = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    j = androidComposeView.relayoutTime;
                    androidComposeView.sendSimulatedEvent(motionEvent, i, j, false);
                }
            }
        };
        this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.sendHoverExitEvent$lambda$5(AndroidComposeView.this);
            }
        };
        this.resendMotionEventOnLayout = new drO<dpR>() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                MotionEvent motionEvent;
                AndroidComposeView$resendMotionEventRunnable$1 androidComposeView$resendMotionEventRunnable$1;
                motionEvent = AndroidComposeView.this.previousMotionEvent;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        AndroidComposeView.this.relayoutTime = SystemClock.uptimeMillis();
                        AndroidComposeView androidComposeView = AndroidComposeView.this;
                        androidComposeView$resendMotionEventRunnable$1 = androidComposeView.resendMotionEventRunnable;
                        androidComposeView.post(androidComposeView$resendMotionEventRunnable$1);
                    }
                }
            }
        };
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            calculateMatrixToWindowApi21 = new CalculateMatrixToWindowApi29();
        } else {
            calculateMatrixToWindowApi21 = new CalculateMatrixToWindowApi21(m1370constructorimpl$default, null);
        }
        this.matrixToWindow = calculateMatrixToWindowApi21;
        setWillNotDraw(false);
        setFocusable(true);
        if (i >= 26) {
            AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        drM<ViewRootForTest, dpR> onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().attach$ui_release(this);
        if (i >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        }
        this.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            private PointerIcon currentIcon = PointerIcon.Companion.getDefault();

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setIcon(PointerIcon pointerIcon) {
                if (pointerIcon == null) {
                    pointerIcon = PointerIcon.Companion.getDefault();
                }
                this.currentIcon = pointerIcon;
                AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(AndroidComposeView.this, pointerIcon);
            }
        };
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        C8632dsu.d(androidViewsHandler2);
        return androidViewsHandler2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchModeChangeListener$lambda$3(AndroidComposeView androidComposeView, boolean z) {
        androidComposeView._inputModeManager.m1624setInputModeiuPiT84(z ? InputMode.Companion.m1622getTouchaOaMEAU() : InputMode.Companion.m1621getKeyboardaOaMEAU());
    }

    @Override // androidx.compose.ui.node.Owner
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            return i;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$5(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        C8632dsu.d(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
        }
        androidComposeView.m1968sendMotionEvent8iAsVTc(motionEvent);
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        dpR dpr;
        int e;
        int e2;
        int e3;
        int e4;
        androidx.compose.ui.geometry.Rect focusRect = getFocusOwner().getFocusRect();
        if (focusRect != null) {
            e = dsT.e(focusRect.getLeft());
            rect.left = e;
            e2 = dsT.e(focusRect.getTop());
            rect.top = e2;
            e3 = dsT.e(focusRect.getRight());
            rect.right = e3;
            e4 = dsT.e(focusRect.getBottom());
            rect.bottom = e4;
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
    }

    @Override // android.view.View
    protected void onFocusChanged(final boolean z, int i, Rect rect) {
        MutableVector mutableVector;
        boolean z2;
        super.onFocusChanged(z, i, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z + ')');
        FocusTransactionManager focusTransactionManager = getFocusOwner().getFocusTransactionManager();
        drO<dpR> dro = new drO<dpR>() { // from class: androidx.compose.ui.platform.AndroidComposeView$onFocusChanged$1
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
                if (z) {
                    this.clearFocus();
                } else {
                    this.requestFocus();
                }
            }
        };
        mutableVector = focusTransactionManager.cancellationListener;
        mutableVector.add(dro);
        z2 = focusTransactionManager.ongoingTransaction;
        if (z2) {
            if (z) {
                getFocusOwner().takeFocus();
                return;
            } else {
                getFocusOwner().releaseFocus();
                return;
            }
        }
        try {
            focusTransactionManager.beginTransaction();
            if (z) {
                getFocusOwner().takeFocus();
            } else {
                getFocusOwner().releaseFocus();
            }
            dpR dpr = dpR.c;
        } finally {
            focusTransactionManager.commitTransaction();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        boolean isShowingLayoutBounds;
        this._windowInfo.setWindowFocused(z);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z);
        if (!z || getShowLayoutBounds() == (isShowingLayoutBounds = Companion.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (isFocused()) {
            this._windowInfo.m2017setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m1747constructorimpl(keyEvent.getMetaState()));
            return getFocusOwner().mo1092dispatchKeyEventZmokQxo(KeyEvent.m1645constructorimpl(keyEvent)) || super.dispatchKeyEvent(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().mo1091dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent.m1645constructorimpl(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.onNodeDetached(layoutNode);
        requestClearInvalidObservations();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        while (this.endApplyChangesListeners.isNotEmpty()) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i = 0; i < size; i++) {
                drO<dpR> dro = this.endApplyChangesListeners.getContent()[i];
                this.endApplyChangesListeners.set(i, null);
                if (dro != null) {
                    dro.invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(drO<dpR> dro) {
        if (this.endApplyChangesListeners.contains(dro)) {
            return;
        }
        this.endApplyChangesListeners.add(dro);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startDrag-12SF9DM  reason: not valid java name */
    public final boolean m1969startDrag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j, drM<? super DrawScope, dpR> drm) {
        Resources resources = getContext().getResources();
        return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, dragAndDropTransferData, new ComposeDragShadowBuilder(DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j, drm, null));
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Integer num;
        if (C8632dsu.c((Object) str, (Object) this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui_release())) {
            Integer num2 = this.composeAccessibilityDelegate.getIdToBeforeMap$ui_release().get(Integer.valueOf(i));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
            }
        } else if (!C8632dsu.c((Object) str, (Object) this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal$ui_release()) || (num = this.composeAccessibilityDelegate.getIdToAfterMap$ui_release().get(Integer.valueOf(i))) == null) {
        } else {
            accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
        }
    }

    public final void addAndroidView(AndroidViewHolder androidViewHolder, final LayoutNode layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        ViewCompat.setImportantForAccessibility(androidViewHolder, 1);
        ViewCompat.setAccessibilityDelegate(androidViewHolder, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
                if (r6.intValue() == r5.this$0.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) goto L27;
             */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onInitializeAccessibilityNodeInfo(android.view.View r6, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7) {
                /*
                    r5 = this;
                    super.onInitializeAccessibilityNodeInfo(r6, r7)
                    androidx.compose.ui.platform.AndroidComposeView r6 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r6)
                    boolean r6 = r6.isEnabledForAccessibility$ui_release()
                    if (r6 == 0) goto L13
                    r6 = 0
                    r7.setVisibleToUser(r6)
                L13:
                    androidx.compose.ui.node.LayoutNode r6 = r2
                    androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 r0 = new o.drM<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1
                        static {
                            /*
                                androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1
                                r0.<init>()
                                
                                // error: 0x0005: SPUT  (r0 I:androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1) androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.INSTANCE androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.<clinit>():void");
                        }

                        {
                            /*
                                r1 = this;
                                r0 = 1
                                r1.<init>(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.<init>():void");
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
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
                        }

                        @Override // o.drM
                        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r1) {
                            /*
                                r0 = this;
                                androidx.compose.ui.node.LayoutNode r1 = (androidx.compose.ui.node.LayoutNode) r1
                                java.lang.Boolean r1 = r0.invoke(r1)
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.invoke(java.lang.Object):java.lang.Object");
                        }
                    }
                    androidx.compose.ui.node.LayoutNode r6 = androidx.compose.ui.semantics.SemanticsNodeKt.findClosestParentNode(r6, r0)
                    if (r6 == 0) goto L26
                    int r6 = r6.getSemanticsId()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    goto L27
                L26:
                    r6 = 0
                L27:
                    if (r6 == 0) goto L3d
                    androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.semantics.SemanticsOwner r0 = r0.getSemanticsOwner()
                    androidx.compose.ui.semantics.SemanticsNode r0 = r0.getUnmergedRootSemanticsNode()
                    int r0 = r0.getId()
                    int r1 = r6.intValue()
                    if (r1 != r0) goto L42
                L3d:
                    r6 = -1
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                L42:
                    androidx.compose.ui.platform.AndroidComposeView r0 = r3
                    int r6 = r6.intValue()
                    r7.setParent(r0, r6)
                    androidx.compose.ui.node.LayoutNode r6 = r2
                    int r6 = r6.getSemanticsId()
                    androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r0)
                    java.util.HashMap r0 = r0.getIdToBeforeMap$ui_release()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    if (r0 == 0) goto L93
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeView r2 = r3
                    int r3 = r0.intValue()
                    androidx.compose.ui.platform.AndroidViewsHandler r4 = r1.getAndroidViewsHandler$ui_release()
                    int r0 = r0.intValue()
                    android.view.View r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(r4, r0)
                    if (r0 == 0) goto L81
                    r7.setTraversalBefore(r0)
                    goto L84
                L81:
                    r7.setTraversalBefore(r2, r3)
                L84:
                    android.view.accessibility.AccessibilityNodeInfo r0 = r7.unwrap()
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    java.lang.String r2 = r2.getExtraDataTestTraversalBeforeVal$ui_release()
                    androidx.compose.ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r1, r6, r0, r2)
                L93:
                    androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r0)
                    java.util.HashMap r0 = r0.getIdToAfterMap$ui_release()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    if (r0 == 0) goto Ld5
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeView r2 = r3
                    int r3 = r0.intValue()
                    androidx.compose.ui.platform.AndroidViewsHandler r4 = r1.getAndroidViewsHandler$ui_release()
                    int r0 = r0.intValue()
                    android.view.View r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(r4, r0)
                    if (r0 == 0) goto Lc3
                    r7.setTraversalAfter(r0)
                    goto Lc6
                Lc3:
                    r7.setTraversalAfter(r2, r3)
                Lc6:
                    android.view.accessibility.AccessibilityNodeInfo r7 = r7.unwrap()
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    java.lang.String r0 = r0.getExtraDataTestTraversalAfterVal$ui_release()
                    androidx.compose.ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r1, r6, r7, r0)
                Ld5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
            }
        });
    }

    public final void removeAndroidView(final AndroidViewHolder androidViewHolder) {
        registerOnEndApplyChangesListener(new drO<dpR>() { // from class: androidx.compose.ui.platform.AndroidComposeView$removeAndroidView$1
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
                AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(androidViewHolder);
                HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                dsH.d(layoutNodeToHolder).remove(AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder));
                ViewCompat.setImportantForAccessibility(androidViewHolder, 0);
            }
        });
    }

    public final void drawAndroidView(AndroidViewHolder androidViewHolder, Canvas canvas) {
        getAndroidViewsHandler$ui_release().drawView(androidViewHolder, canvas);
    }

    static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(layoutNode)) {
                layoutNode = layoutNode.getParent$ui_release();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        LayoutNode parent$ui_release;
        return this.wasMeasuredWithMultipleConstraints || !((parent$ui_release = layoutNode.getParent$ui_release()) == null || parent$ui_release.getHasFixedInnerContentConstraints$ui_release());
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean z) {
        drO<dpR> dro;
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    dro = this.resendMotionEventOnLayout;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                dro = null;
            }
            if (this.measureAndLayoutDelegate.measureAndLayout(dro)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            dpR dpr = dpR.c;
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, z);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2, boolean z3) {
        if (z) {
            if (this.measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z2) && z3) {
                scheduleMeasureAndLayout(layoutNode);
            }
        } else if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode, z2) && z3) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2) {
        if (z) {
            if (this.measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z2)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, z2)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    /* renamed from: pack-ZIaKswc  reason: not valid java name */
    private final long m1967packZIaKswc(int i, int i2) {
        return dpL.b(dpL.b(i2) | dpL.b(dpL.b(i) << 32));
    }

    /* renamed from: convertMeasureSpec-I7RO_PI  reason: not valid java name */
    private final long m1965convertMeasureSpecI7RO_PI(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return m1967packZIaKswc(size, size);
                }
                throw new IllegalStateException();
            }
            return m1967packZIaKswc(0, Integer.MAX_VALUE);
        }
        return m1967packZIaKswc(0, size);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j = this.globalPosition;
        int m2526component1impl = IntOffset.m2526component1impl(j);
        int m2527component2impl = IntOffset.m2527component2impl(j);
        int[] iArr = this.tmpPositionArray;
        boolean z = false;
        int i = iArr[0];
        if (m2526component1impl != i || m2527component2impl != iArr[1]) {
            this.globalPosition = IntOffsetKt.IntOffset(i, iArr[1]);
            if (m2526component1impl != Integer.MAX_VALUE && m2527component2impl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                z = true;
            }
        }
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnedLayer createLayer(drM<? super androidx.compose.ui.graphics.Canvas, dpR> drm, drO<dpR> dro) {
        DrawChildContainer viewLayerContainer;
        OwnedLayer pop = this.layerCache.pop();
        if (pop != null) {
            pop.reuseLayer(drm, dro);
            return pop;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, drm, dro);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.Companion;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            if (companion.getShouldUseDispatchDraw()) {
                viewLayerContainer = new DrawChildContainer(getContext());
            } else {
                viewLayerContainer = new ViewLayerContainer(getContext());
            }
            this.viewLayersContainer = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.viewLayersContainer;
        C8632dsu.d(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, drm, dro);
    }

    public final boolean recycle$ui_release(OwnedLayer ownedLayer) {
        if (this.viewLayersContainer != null) {
            ViewLayer.Companion.getShouldUseDispatchDraw();
        }
        this.layerCache.push(ownedLayer);
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui_release();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui_release(layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(onLayoutCompletedListener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    /* renamed from: getFocusDirection-P8AzH3I  reason: not valid java name */
    public FocusDirection m1970getFocusDirectionP8AzH3I(android.view.KeyEvent keyEvent) {
        long m1659getKeyZmokQxo = KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1643getTabEK5gGoQ())) {
            return FocusDirection.m1075boximpl(KeyEvent_androidKt.m1664isShiftPressedZmokQxo(keyEvent) ? FocusDirection.Companion.m1087getPreviousdhqQ8s() : FocusDirection.Companion.m1086getNextdhqQ8s());
        } else if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1636getDirectionRightEK5gGoQ())) {
            return FocusDirection.m1075boximpl(FocusDirection.Companion.m1088getRightdhqQ8s());
        } else {
            if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1635getDirectionLeftEK5gGoQ())) {
                return FocusDirection.m1075boximpl(FocusDirection.Companion.m1085getLeftdhqQ8s());
            }
            if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1637getDirectionUpEK5gGoQ()) || Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1642getPageUpEK5gGoQ())) {
                return FocusDirection.m1075boximpl(FocusDirection.Companion.m1089getUpdhqQ8s());
            }
            if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1634getDirectionDownEK5gGoQ()) || Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1641getPageDownEK5gGoQ())) {
                return FocusDirection.m1075boximpl(FocusDirection.Companion.m1082getDowndhqQ8s());
            }
            if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1633getDirectionCenterEK5gGoQ()) || Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1638getEnterEK5gGoQ()) || Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1640getNumPadEnterEK5gGoQ())) {
                return FocusDirection.m1075boximpl(FocusDirection.Companion.m1083getEnterdhqQ8s());
            }
            if (Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1632getBackEK5gGoQ()) || Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1639getEscapeEK5gGoQ())) {
                return FocusDirection.m1075boximpl(FocusDirection.Companion.m1084getExitdhqQ8s());
            }
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, null);
        Snapshot.Companion.sendApplyNotifications();
        this.isDrawingContent = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas());
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i = 0; i < size; i++) {
                this.dirtyLayers.get(i).updateDisplayList();
            }
        }
        if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<OwnedLayer> list = this.postponedDirtyLayers;
        if (list != null) {
            C8632dsu.d(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    public final void notifyLayerIsDirty$ui_release(OwnedLayer ownedLayer, boolean z) {
        if (!z) {
            if (this.isDrawingContent) {
                return;
            }
            this.dirtyLayers.remove(ownedLayer);
            List<OwnedLayer> list = this.postponedDirtyLayers;
            if (list != null) {
                list.remove(ownedLayer);
            }
        } else if (!this.isDrawingContent) {
            this.dirtyLayers.add(ownedLayer);
        } else {
            List list2 = this.postponedDirtyLayers;
            if (list2 == null) {
                list2 = new ArrayList();
                this.postponedDirtyLayers = list2;
            }
            list2.add(ownedLayer);
        }
    }

    public final void setOnViewTreeOwnersAvailable(drM<? super ViewTreeOwners, dpR> drm) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            drm.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = drm;
    }

    public final Object boundsUpdatesEventLoop(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object boundsUpdatesEventLoop$ui_release = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui_release(interfaceC8585dra);
        e = C8586drb.e();
        return boundsUpdatesEventLoop$ui_release == e ? boundsUpdatesEventLoop$ui_release : dpR.c;
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        int i = 0;
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, layoutNode, false, 2, null);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                invalidateLayoutNodeMeasurement(content[i]);
                i++;
            } while (i < size);
        }
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                invalidateLayers(content[i]);
                i++;
            } while (i < size);
        }
    }

    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (lifecycleOwner2 != null && savedStateRegistryOwner != null && (lifecycleOwner2 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwner == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner2.getLifecycle().addObserver(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner2, savedStateRegistryOwner);
            set_viewTreeOwners(viewTreeOwners2);
            drM<? super ViewTreeOwners, dpR> drm = this.onViewTreeOwnersAvailable;
            if (drm != null) {
                drm.invoke(viewTreeOwners2);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        this._inputModeManager.m1624setInputModeiuPiT84(isInTouchMode() ? InputMode.Companion.m1622getTouchaOaMEAU() : InputMode.Companion.m1621getKeyboardaOaMEAU());
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        C8632dsu.d(viewTreeOwners3);
        viewTreeOwners3.getLifecycleOwner().getLifecycle().addObserver(this);
        ViewTreeOwners viewTreeOwners4 = getViewTreeOwners();
        C8632dsu.d(viewTreeOwners4);
        viewTreeOwners4.getLifecycleOwner().getLifecycle().addObserver(this.composeAccessibilityDelegate);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this, AndroidComposeView$$ExternalSyntheticApiModelOutline1.m(new AndroidComposeViewTranslationCallback()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2;
        Lifecycle lifecycle2;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner2 = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle2.removeObserver(this);
        }
        ViewTreeOwners viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (lifecycleOwner = viewTreeOwners2.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.composeAccessibilityDelegate);
        }
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        AndroidAutofill androidAutofill;
        if (!autofillSupported() || viewStructure == null || (androidAutofill = this._autofill) == null) {
            return;
        }
        AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        AndroidAutofill androidAutofill;
        if (!autofillSupported() || (androidAutofill = this._autofill) == null) {
            return;
        }
        AndroidAutofill_androidKt.performAutofill(androidAutofill, sparseArray);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        this.composeAccessibilityDelegate.onCreateVirtualViewTranslationRequests$ui_release(jArr, iArr, consumer);
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        this.composeAccessibilityDelegate.onVirtualViewTranslationResponses$ui_release(longSparseArray);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                return handleRotaryEvent(motionEvent);
            }
            if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
                return super.dispatchGenericMotionEvent(motionEvent);
            }
            return ProcessResult.m1769getDispatchedToAPointerInputModifierimpl(m1966handleMotionEvent8iAsVTc(motionEvent));
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            C8632dsu.d(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() != 2 || isPositionChanged(motionEvent)) {
            int m1966handleMotionEvent8iAsVTc = m1966handleMotionEvent8iAsVTc(motionEvent);
            if (ProcessResult.m1768getAnyMovementConsumedimpl(m1966handleMotionEvent8iAsVTc)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return ProcessResult.m1769getDispatchedToAPointerInputModifierimpl(m1966handleMotionEvent8iAsVTc);
        }
        return false;
    }

    private final boolean handleRotaryEvent(MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        float scaledVerticalScrollFactor = ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext());
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(f * scaledVerticalScrollFactor, f * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    /* renamed from: handleMotionEvent-8iAsVTc  reason: not valid java name */
    private final int m1966handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.previousMotionEvent;
            boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
            if (motionEvent2 != null && hasChangedDevices(motionEvent, motionEvent2)) {
                if (isDevicePressEvent(motionEvent2)) {
                    this.pointerInputEventProcessor.processCancel();
                } else if (motionEvent2.getActionMasked() != 10 && z2) {
                    sendSimulatedEvent$default(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z = false;
            }
            if (!z2 && z && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                sendSimulatedEvent$default(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
            int m1968sendMotionEvent8iAsVTc = m1968sendMotionEvent8iAsVTc(motionEvent);
            Trace.endSection();
            return m1968sendMotionEvent8iAsVTc;
        } finally {
            this.forceUseMatrixCache = false;
        }
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    /* renamed from: sendMotionEvent-8iAsVTc  reason: not valid java name */
    private final int m1968sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m2017setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m1747constructorimpl(motionEvent.getMetaState()));
        }
        PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, this);
        if (convertToPointerInputEvent$ui_release != null) {
            List<PointerInputEventData> pointers = convertToPointerInputEvent$ui_release.getPointers();
            int size = pointers.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    pointerInputEventData = pointers.get(size);
                    if (pointerInputEventData.getDown()) {
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            pointerInputEventData = null;
            PointerInputEventData pointerInputEventData2 = pointerInputEventData;
            if (pointerInputEventData2 != null) {
                this.lastDownPointerPosition = pointerInputEventData2.m1736getPositionF1C5BW0();
            }
            int m1740processBIzXfog = this.pointerInputEventProcessor.m1740processBIzXfog(convertToPointerInputEvent$ui_release, this, isInBounds(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && !ProcessResult.m1769getDispatchedToAPointerInputModifierimpl(m1740processBIzXfog)) {
                this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
                return m1740processBIzXfog;
            }
            return m1740processBIzXfog;
        }
        this.pointerInputEventProcessor.processCancel();
        return PointerInputEventProcessorKt.ProcessResult(false, false);
    }

    static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i, j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
            i2 = -1;
        } else {
            if (i != 9 && i != 10) {
                i2 = 0;
            }
            i2 = -1;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            long mo1764localToScreenMKHz9U = mo1764localToScreenMKHz9U(OffsetKt.Offset(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = Offset.m1137getXimpl(mo1764localToScreenMKHz9U);
            pointerCoords.y = Offset.m1138getYimpl(mo1764localToScreenMKHz9U);
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(obtain, this);
        C8632dsu.d(convertToPointerInputEvent$ui_release);
        this.pointerInputEventProcessor.m1740processBIzXfog(convertToPointerInputEvent$ui_release, this, true);
        obtain.recycle();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.composeAccessibilityDelegate.m1976canScroll0AR0LA0$ui_release(false, i, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.composeAccessibilityDelegate.m1976canScroll0AR0LA0$ui_release(true, i, this.lastDownPointerPosition);
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo1764localToScreenMKHz9U(long j) {
        recalculateWindowPosition();
        long m1373mapMKHz9U = Matrix.m1373mapMKHz9U(this.viewToWindowMatrix, j);
        return OffsetKt.Offset(Offset.m1137getXimpl(m1373mapMKHz9U) + Offset.m1137getXimpl(this.windowPosition), Offset.m1138getYimpl(m1373mapMKHz9U) + Offset.m1138getYimpl(this.windowPosition));
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-58bKbWc */
    public void mo1763localToScreen58bKbWc(float[] fArr) {
        recalculateWindowPosition();
        Matrix.m1378timesAssign58bKbWc(fArr, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.m1983preTranslatecG2Xzmc(fArr, Offset.m1137getXimpl(this.windowPosition), Offset.m1138getYimpl(this.windowPosition), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo1765screenToLocalMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m1373mapMKHz9U(this.windowToViewMatrix, OffsetKt.Offset(Offset.m1137getXimpl(j) - Offset.m1137getXimpl(this.windowPosition), Offset.m1138getYimpl(j) - Offset.m1138getYimpl(this.windowPosition)));
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = OffsetKt.Offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        long m1373mapMKHz9U = Matrix.m1373mapMKHz9U(this.viewToWindowMatrix, OffsetKt.Offset(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = OffsetKt.Offset(motionEvent.getRawX() - Offset.m1137getXimpl(m1373mapMKHz9U), motionEvent.getRawY() - Offset.m1138getYimpl(m1373mapMKHz9U));
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo1984calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m2002invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m1060getCurrentSessionimpl(this.textInputSessionMutex);
        if (androidPlatformTextInputSession == null) {
            return this.legacyTextInputServiceAndroid.isEditorFocused();
        }
        return androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m1060getCurrentSessionimpl(this.textInputSessionMutex);
        if (androidPlatformTextInputSession == null) {
            return this.legacyTextInputServiceAndroid.createInputConnection(editorInfo);
        }
        return androidPlatformTextInputSession.createInputConnection(editorInfo);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo1947calculateLocalPositionMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m1373mapMKHz9U(this.windowToViewMatrix, j);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo1948calculatePositionInWindowMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m1373mapMKHz9U(this.viewToWindowMatrix, j);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.density = AndroidDensity_androidKt.Density(getContext());
        if (getFontWeightAdjustmentCompat(configuration) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        LayoutDirection layoutDirectionFromInt;
        if (this.superclassInitComplete) {
            layoutDirectionFromInt = AndroidComposeView_androidKt.layoutDirectionFromInt(i);
            setLayoutDirection(layoutDirectionFromInt);
            getFocusOwner().setLayoutDirection(layoutDirectionFromInt);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.composeAccessibilityDelegate.dispatchHoverEvent$ui_release(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && isInBounds(motionEvent)) {
                if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                    MotionEvent motionEvent2 = this.previousMotionEvent;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                    this.hoverExitReceived = true;
                    post(this.sendHoverExitEvent);
                    return false;
                }
                return false;
            }
        } else if (!isPositionChanged(motionEvent)) {
            return false;
        }
        return ProcessResult.m1769getDispatchedToAPointerInputModifierimpl(m1966handleMotionEvent8iAsVTc(motionEvent));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[LOOP:0: B:22:0x004c->B:39:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[EDGE_INSN: B:41:0x0085->B:40:0x0085 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isBadMotionEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L85
            int r1 = r7.getPointerCount()
            r4 = r3
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            androidx.compose.ui.platform.MotionEventVerifierApi29 r0 = androidx.compose.ui.platform.MotionEventVerifierApi29.INSTANCE
            boolean r0 = r0.isValidMotionEvent(r7, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = r2
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.isBadMotionEvent(android.view.MotionEvent):boolean");
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.previousMotionEvent) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (C8632dsu.c(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i, viewGroup.getChildAt(i2));
                    if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                        return findViewByAccessibilityIdRootedAtCurrentView;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0031 -> B:10:0x0032). Please submit an issue!!! */
    public final View findViewByAccessibilityIdTraversal(int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        }
        return findViewByAccessibilityIdRootedAtCurrentView(i, this);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = invoke instanceof Boolean ? invoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class ViewTreeOwners {
        private final LifecycleOwner lifecycleOwner;
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }

        public ViewTreeOwners(LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }
    }

    /* loaded from: classes.dex */
    static final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {
        public boolean onShowTranslation(View view) {
            C8632dsu.d(view);
            ((AndroidComposeView) view).composeAccessibilityDelegate.onShowTranslation$ui_release();
            return true;
        }

        public boolean onHideTranslation(View view) {
            C8632dsu.d(view);
            ((AndroidComposeView) view).composeAccessibilityDelegate.onHideTranslation$ui_release();
            return true;
        }

        public boolean onClearTranslation(View view) {
            C8632dsu.d(view);
            ((AndroidComposeView) view).composeAccessibilityDelegate.onClearTranslation$ui_release();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this._viewTreeOwners$delegate.getValue();
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners$delegate.setValue(viewTreeOwners);
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver$delegate.getValue();
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver$delegate.setValue(resolver);
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: measureAndLayout-0kLqBqw */
    public void mo1949measureAndLayout0kLqBqw(LayoutNode layoutNode, long j) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m1900measureAndLayout0kLqBqw(layoutNode, j);
            if (!this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            }
            dpR dpr = dpR.c;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (androidx.compose.ui.unit.Constraints.m2466equalsimpl0(r0.m2478unboximpl(), r8) == false) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "AndroidOwner:onMeasure"
            android.os.Trace.beginSection(r0)
            boolean r0 = r7.isAttachedToWindow()     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto L12
            androidx.compose.ui.node.LayoutNode r0 = r7.getRoot()     // Catch: java.lang.Throwable -> La5
            r7.invalidateLayoutNodeMeasurement(r0)     // Catch: java.lang.Throwable -> La5
        L12:
            long r0 = r7.m1965convertMeasureSpecI7RO_PI(r8)     // Catch: java.lang.Throwable -> La5
            r8 = 32
            long r2 = r0 >>> r8
            long r2 = o.dpL.b(r2)     // Catch: java.lang.Throwable -> La5
            int r2 = (int) r2     // Catch: java.lang.Throwable -> La5
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            long r0 = o.dpL.b(r0)     // Catch: java.lang.Throwable -> La5
            int r0 = (int) r0     // Catch: java.lang.Throwable -> La5
            long r5 = r7.m1965convertMeasureSpecI7RO_PI(r9)     // Catch: java.lang.Throwable -> La5
            long r8 = r5 >>> r8
            long r8 = o.dpL.b(r8)     // Catch: java.lang.Throwable -> La5
            int r8 = (int) r8     // Catch: java.lang.Throwable -> La5
            long r3 = r3 & r5
            long r3 = o.dpL.b(r3)     // Catch: java.lang.Throwable -> La5
            int r9 = (int) r3     // Catch: java.lang.Throwable -> La5
            long r8 = androidx.compose.ui.unit.ConstraintsKt.Constraints(r2, r0, r8, r9)     // Catch: java.lang.Throwable -> La5
            androidx.compose.ui.unit.Constraints r0 = r7.onMeasureConstraints     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto L4d
            androidx.compose.ui.unit.Constraints r0 = androidx.compose.ui.unit.Constraints.m2461boximpl(r8)     // Catch: java.lang.Throwable -> La5
            r7.onMeasureConstraints = r0     // Catch: java.lang.Throwable -> La5
            r0 = 0
            r7.wasMeasuredWithMultipleConstraints = r0     // Catch: java.lang.Throwable -> La5
            goto L5d
        L4d:
            if (r0 != 0) goto L50
            goto L5a
        L50:
            long r0 = r0.m2478unboximpl()     // Catch: java.lang.Throwable -> La5
            boolean r0 = androidx.compose.ui.unit.Constraints.m2466equalsimpl0(r0, r8)     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto L5d
        L5a:
            r0 = 1
            r7.wasMeasuredWithMultipleConstraints = r0     // Catch: java.lang.Throwable -> La5
        L5d:
            androidx.compose.ui.node.MeasureAndLayoutDelegate r0 = r7.measureAndLayoutDelegate     // Catch: java.lang.Throwable -> La5
            r0.m1901updateRootConstraintsBRTryo0(r8)     // Catch: java.lang.Throwable -> La5
            androidx.compose.ui.node.MeasureAndLayoutDelegate r8 = r7.measureAndLayoutDelegate     // Catch: java.lang.Throwable -> La5
            r8.measureOnly()     // Catch: java.lang.Throwable -> La5
            androidx.compose.ui.node.LayoutNode r8 = r7.getRoot()     // Catch: java.lang.Throwable -> La5
            int r8 = r8.getWidth()     // Catch: java.lang.Throwable -> La5
            androidx.compose.ui.node.LayoutNode r9 = r7.getRoot()     // Catch: java.lang.Throwable -> La5
            int r9 = r9.getHeight()     // Catch: java.lang.Throwable -> La5
            r7.setMeasuredDimension(r8, r9)     // Catch: java.lang.Throwable -> La5
            androidx.compose.ui.platform.AndroidViewsHandler r8 = r7._androidViewsHandler     // Catch: java.lang.Throwable -> La5
            if (r8 == 0) goto L9f
            androidx.compose.ui.platform.AndroidViewsHandler r8 = r7.getAndroidViewsHandler$ui_release()     // Catch: java.lang.Throwable -> La5
            androidx.compose.ui.node.LayoutNode r9 = r7.getRoot()     // Catch: java.lang.Throwable -> La5
            int r9 = r9.getWidth()     // Catch: java.lang.Throwable -> La5
            r0 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)     // Catch: java.lang.Throwable -> La5
            androidx.compose.ui.node.LayoutNode r1 = r7.getRoot()     // Catch: java.lang.Throwable -> La5
            int r1 = r1.getHeight()     // Catch: java.lang.Throwable -> La5
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)     // Catch: java.lang.Throwable -> La5
            r8.measure(r9, r0)     // Catch: java.lang.Throwable -> La5
        L9f:
            o.dpR r8 = o.dpR.c     // Catch: java.lang.Throwable -> La5
            android.os.Trace.endSection()
            return
        La5:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onMeasure(int, int):void");
    }
}
