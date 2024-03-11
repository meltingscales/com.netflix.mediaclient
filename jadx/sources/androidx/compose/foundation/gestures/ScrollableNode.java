package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import o.C8737dwr;
import o.dpR;
import o.drM;
import o.drO;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollableNode extends DelegatingNode implements ObserverModifierNode, CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, KeyInputModifierNode {
    private final ContentInViewNode contentInViewNode;
    private final DefaultFlingBehavior defaultFlingBehavior;
    private boolean enabled;
    private FlingBehavior flingBehavior;
    private MutableInteractionSource interactionSource;
    private final ScrollableNestedScrollConnection nestedScrollConnection;
    private final NestedScrollDispatcher nestedScrollDispatcher;
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    private boolean reverseDirection;
    private final ModifierLocalScrollableContainerProvider scrollableContainer;
    private final ScrollableGesturesNode scrollableGesturesNode;
    private final ScrollingLogic scrollingLogic;
    private ScrollableState state;

    public final ContentInViewNode getContentInViewNode() {
        return this.contentInViewNode;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo94onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    public ScrollableNode(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        ScrollableKt$UnityDensity$1 scrollableKt$UnityDensity$1;
        this.state = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = z;
        this.reverseDirection = z2;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        scrollableKt$UnityDensity$1 = ScrollableKt.UnityDensity;
        DefaultFlingBehavior defaultFlingBehavior = new DefaultFlingBehavior(SplineBasedDecayKt.splineBasedDecay(scrollableKt$UnityDensity$1), null, 2, null);
        this.defaultFlingBehavior = defaultFlingBehavior;
        ScrollableState scrollableState2 = this.state;
        Orientation orientation2 = this.orientation;
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        boolean z3 = this.reverseDirection;
        FlingBehavior flingBehavior2 = this.flingBehavior;
        ScrollingLogic scrollingLogic = new ScrollingLogic(scrollableState2, orientation2, overscrollEffect2, z3, flingBehavior2 == null ? defaultFlingBehavior : flingBehavior2, nestedScrollDispatcher);
        this.scrollingLogic = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, this.enabled);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        ContentInViewNode contentInViewNode = (ContentInViewNode) delegate(new ContentInViewNode(this.orientation, this.state, this.reverseDirection, bringIntoViewSpec));
        this.contentInViewNode = contentInViewNode;
        this.scrollableContainer = (ModifierLocalScrollableContainerProvider) delegate(new ModifierLocalScrollableContainerProvider(this.enabled));
        delegate(NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        delegate(FocusTargetModifierNodeKt.FocusTargetModifierNode());
        delegate(new BringIntoViewResponderNode(contentInViewNode));
        delegate(new FocusedBoundsObserverNode(new drM<LayoutCoordinates, dpR>() { // from class: androidx.compose.foundation.gestures.ScrollableNode.1
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                ScrollableNode.this.getContentInViewNode().onFocusBoundsChanged(layoutCoordinates);
            }
        }));
        this.scrollableGesturesNode = (ScrollableGesturesNode) delegate(new ScrollableGesturesNode(scrollingLogic, this.orientation, this.enabled, nestedScrollDispatcher, this.interactionSource));
    }

    public final void update(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        if (this.enabled != z) {
            this.nestedScrollConnection.setEnabled(z);
            this.scrollableContainer.setEnabled(z);
        }
        this.scrollingLogic.update(scrollableState, orientation, overscrollEffect, z2, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.scrollableGesturesNode.update(orientation, z, mutableInteractionSource);
        this.contentInViewNode.update(orientation, scrollableState, z2, bringIntoViewSpec);
        this.state = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = z;
        this.reverseDirection = z2;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDefaultFlingBehavior();
        ObserverModifierNodeKt.observeReads(this, new drO<dpR>() { // from class: androidx.compose.foundation.gestures.ScrollableNode$onAttach$1
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
                CompositionLocalConsumerModifierNodeKt.currentValueOf(ScrollableNode.this, CompositionLocalsKt.getLocalDensity());
            }
        });
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateDefaultFlingBehavior();
    }

    private final void updateDefaultFlingBehavior() {
        this.defaultFlingBehavior.setFlingDecay(SplineBasedDecayKt.splineBasedDecay((Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalDensity())));
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo92onKeyEventZmokQxo(KeyEvent keyEvent) {
        long Offset;
        if (this.enabled) {
            long m1659getKeyZmokQxo = KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent);
            Key.Companion companion = Key.Companion;
            if ((Key.m1628equalsimpl0(m1659getKeyZmokQxo, companion.m1641getPageDownEK5gGoQ()) || Key.m1628equalsimpl0(KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent), companion.m1642getPageUpEK5gGoQ())) && KeyEventType.m1652equalsimpl0(KeyEvent_androidKt.m1660getTypeZmokQxo(keyEvent), KeyEventType.Companion.m1656getKeyDownCS__XNY()) && !KeyEvent_androidKt.m1663isCtrlPressedZmokQxo(keyEvent)) {
                ScrollingLogic scrollingLogic = this.scrollingLogic;
                if (this.orientation == Orientation.Vertical) {
                    int m2546getHeightimpl = IntSize.m2546getHeightimpl(this.contentInViewNode.m159getViewportSizeYbymL2g$foundation_release());
                    Offset = OffsetKt.Offset(0.0f, Key.m1628equalsimpl0(KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent), companion.m1642getPageUpEK5gGoQ()) ? m2546getHeightimpl : -m2546getHeightimpl);
                } else {
                    int m2547getWidthimpl = IntSize.m2547getWidthimpl(this.contentInViewNode.m159getViewportSizeYbymL2g$foundation_release());
                    Offset = OffsetKt.Offset(Key.m1628equalsimpl0(KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent), companion.m1642getPageUpEK5gGoQ()) ? m2547getWidthimpl : -m2547getWidthimpl, 0.0f);
                }
                C8737dwr.c(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1$1(scrollingLogic, Offset, null), 3, null);
                return true;
            }
        }
        return false;
    }
}
