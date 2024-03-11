package androidx.compose.foundation.layout;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import o.C8627dsp;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    private static boolean testInsets;
    private int accessCount;
    private final AndroidWindowInsets captionBar;
    private final ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;
    private final AndroidWindowInsets displayCutout;
    private final AndroidWindowInsets ime;
    private final ValueInsets imeAnimationSource;
    private final ValueInsets imeAnimationTarget;
    private final InsetsListener insetsListener;
    private final AndroidWindowInsets mandatorySystemGestures;
    private final AndroidWindowInsets navigationBars;
    private final ValueInsets navigationBarsIgnoringVisibility;
    private final WindowInsets safeContent;
    private final WindowInsets safeDrawing;
    private final WindowInsets safeGestures;
    private final AndroidWindowInsets statusBars;
    private final ValueInsets statusBarsIgnoringVisibility;
    private final AndroidWindowInsets systemBars;
    private final ValueInsets systemBarsIgnoringVisibility;
    private final AndroidWindowInsets systemGestures;
    private final AndroidWindowInsets tappableElement;
    private final ValueInsets tappableElementIgnoringVisibility;
    private final ValueInsets waterfall;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final WeakHashMap<View, WindowInsetsHolder> viewMap = new WeakHashMap<>();

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, C8627dsp c8627dsp) {
        this(windowInsetsCompat, view);
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    private WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view) {
        Insets insets;
        DisplayCutoutCompat displayCutout;
        Companion companion = Companion;
        this.captionBar = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBar");
        AndroidWindowInsets systemInsets = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.displayCutout(), "displayCutout");
        this.displayCutout = systemInsets;
        AndroidWindowInsets systemInsets2 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "ime");
        this.ime = systemInsets2;
        AndroidWindowInsets systemInsets3 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.mandatorySystemGestures(), "mandatorySystemGestures");
        this.mandatorySystemGestures = systemInsets3;
        this.navigationBars = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBars");
        this.statusBars = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBars");
        AndroidWindowInsets systemInsets4 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBars");
        this.systemBars = systemInsets4;
        AndroidWindowInsets systemInsets5 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.systemGestures(), "systemGestures");
        this.systemGestures = systemInsets5;
        AndroidWindowInsets systemInsets6 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElement");
        this.tappableElement = systemInsets6;
        ValueInsets ValueInsets = WindowInsets_androidKt.ValueInsets((windowInsetsCompat == null || (displayCutout = windowInsetsCompat.getDisplayCutout()) == null || (insets = displayCutout.getWaterfallInsets()) == null) ? Insets.NONE : insets, "waterfall");
        this.waterfall = ValueInsets;
        WindowInsets union = WindowInsetsKt.union(WindowInsetsKt.union(systemInsets4, systemInsets2), systemInsets);
        this.safeDrawing = union;
        WindowInsets union2 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(systemInsets6, systemInsets3), systemInsets5), ValueInsets);
        this.safeGestures = union2;
        this.safeContent = WindowInsetsKt.union(union, union2);
        this.captionBarIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationTarget");
        this.imeAnimationSource = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationSource");
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new InsetsListener(this);
    }

    public final void incrementAccessors(View view) {
        if (this.accessCount == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            ViewCompat.setWindowInsetsAnimationCallback(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void decrementAccessors(View view) {
        int i = this.accessCount - 1;
        this.accessCount = i;
        if (i == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, null);
            ViewCompat.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i);
    }

    public final void update(WindowInsetsCompat windowInsetsCompat, int i) {
        if (testInsets) {
            android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            C8632dsu.d(windowInsets);
            windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        }
        this.captionBar.update$foundation_layout_release(windowInsetsCompat, i);
        this.ime.update$foundation_layout_release(windowInsetsCompat, i);
        this.displayCutout.update$foundation_layout_release(windowInsetsCompat, i);
        this.navigationBars.update$foundation_layout_release(windowInsetsCompat, i);
        this.statusBars.update$foundation_layout_release(windowInsetsCompat, i);
        this.systemBars.update$foundation_layout_release(windowInsetsCompat, i);
        this.systemGestures.update$foundation_layout_release(windowInsetsCompat, i);
        this.tappableElement.update$foundation_layout_release(windowInsetsCompat, i);
        this.mandatorySystemGestures.update$foundation_layout_release(windowInsetsCompat, i);
        if (i == 0) {
            this.captionBarIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.captionBar())));
            this.navigationBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars())));
            this.statusBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.statusBars())));
            this.systemBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars())));
            this.tappableElementIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement())));
            DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
            if (displayCutout != null) {
                this.waterfall.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(displayCutout.getWaterfallInsets()));
            }
        }
        Snapshot.Companion.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(WindowInsetsCompat windowInsetsCompat) {
        this.imeAnimationSource.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime())));
    }

    public final void updateImeAnimationTarget(WindowInsetsCompat windowInsetsCompat) {
        this.imeAnimationTarget.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime())));
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final WindowInsetsHolder current(Composer composer, int i) {
            composer.startReplaceableGroup(-1366542614);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            final WindowInsetsHolder orCreateFor = getOrCreateFor(view);
            EffectsKt.DisposableEffect(orCreateFor, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    WindowInsetsHolder.this.incrementAccessors(view);
                    final WindowInsetsHolder windowInsetsHolder = WindowInsetsHolder.this;
                    final View view2 = view;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            WindowInsetsHolder.this.decrementAccessors(view2);
                        }
                    };
                }
            }, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return orCreateFor;
        }

        private final WindowInsetsHolder getOrCreateFor(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.viewMap) {
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new WindowInsetsHolder(null, view, null);
                    weakHashMap.put(view, obj);
                }
                windowInsetsHolder = (WindowInsetsHolder) obj;
            }
            return windowInsetsHolder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidWindowInsets systemInsets(WindowInsetsCompat windowInsetsCompat, int i, String str) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(i, str);
            if (windowInsetsCompat != null) {
                androidWindowInsets.update$foundation_layout_release(windowInsetsCompat, i);
            }
            return androidWindowInsets;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ValueInsets valueInsetsIgnoringVisibility(WindowInsetsCompat windowInsetsCompat, int i, String str) {
            Insets insets;
            if (windowInsetsCompat == null || (insets = windowInsetsCompat.getInsetsIgnoringVisibility(i)) == null) {
                insets = Insets.NONE;
            }
            return WindowInsets_androidKt.ValueInsets(insets, str);
        }
    }
}
