package androidx.compose.foundation.gestures;

import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CoroutineStart;
import o.C8586drb;
import o.C8590drf;
import o.C8592drh;
import o.C8632dsu;
import o.C8737dwr;
import o.C8741dwv;
import o.InterfaceC8585dra;
import o.InterfaceC8743dwx;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode {
    private final UpdatableAnimationState animationState;
    private BringIntoViewSpec bringIntoViewSpec;
    private LayoutCoordinates coordinates;
    private LayoutCoordinates focusedChild;
    private Rect focusedChildBoundsFromPreviousRemeasure;
    private boolean isAnimationRunning;
    private Orientation orientation;
    private boolean reverseDirection;
    private ScrollableState scrollState;
    private boolean trackingFocusedChild;
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private long viewportSize = IntSize.Companion.m2551getZeroYbymL2g();

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: getViewportSize-YbymL2g$foundation_release  reason: not valid java name */
    public final long m159getViewportSizeYbymL2g$foundation_release() {
        return this.viewportSize;
    }

    public final void onFocusBoundsChanged(LayoutCoordinates layoutCoordinates) {
        this.focusedChild = layoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.coordinates = layoutCoordinates;
    }

    public final void update(Orientation orientation, ScrollableState scrollableState, boolean z, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollState = scrollableState;
        this.reverseDirection = z;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    public ContentInViewNode(Orientation orientation, ScrollableState scrollableState, boolean z, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollState = scrollableState;
        this.reverseDirection = z;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.animationState = new UpdatableAnimationState(this.bringIntoViewSpec.getScrollAnimationSpec());
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect calculateRectForParent(Rect rect) {
        if (!(!IntSize.m2545equalsimpl0(this.viewportSize, IntSize.Companion.m2551getZeroYbymL2g()))) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
        }
        return m155computeDestinationO0kMr_c(rect, this.viewportSize);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object bringChildIntoView(drO<Rect> dro, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e;
        Object e2;
        Rect invoke = dro.invoke();
        if (invoke == null || m157isMaxVisibleO0kMr_c$default(this, invoke, 0L, 1, null)) {
            return dpR.c;
        }
        b = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        if (this.bringIntoViewRequests.enqueue(new Request(dro, c8741dwv)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        Object b2 = c8741dwv.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        e2 = C8586drb.e();
        return b2 == e2 ? b2 : dpR.c;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    public void mo160onRemeasuredozmzZPI(long j) {
        Rect focusedChildBounds;
        long j2 = this.viewportSize;
        this.viewportSize = j;
        if (m153compareToTemP2vQ(j, j2) < 0 && (focusedChildBounds = getFocusedChildBounds()) != null) {
            Rect rect = this.focusedChildBoundsFromPreviousRemeasure;
            if (rect == null) {
                rect = focusedChildBounds;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && m156isMaxVisibleO0kMr_c(rect, j2) && !m156isMaxVisibleO0kMr_c(focusedChildBounds, j)) {
                this.trackingFocusedChild = true;
                launchAnimation();
            }
            this.focusedChildBoundsFromPreviousRemeasure = focusedChildBounds;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.focusedChild) != null) {
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        if (!this.isAnimationRunning) {
            C8737dwr.c(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new ContentInViewNode$launchAnimation$2(this, null), 1, null);
            return;
        }
        throw new IllegalStateException("launchAnimation called when previous animation was running".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta() {
        if (IntSize.m2545equalsimpl0(this.viewportSize, IntSize.Companion.m2551getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect findBringIntoViewRequest = findBringIntoViewRequest();
        if (findBringIntoViewRequest == null) {
            findBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (findBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long m2553toSizeozmzZPI = IntSizeKt.m2553toSizeozmzZPI(this.viewportSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return this.bringIntoViewSpec.calculateScrollDistance(findBringIntoViewRequest.getTop(), findBringIntoViewRequest.getBottom() - findBringIntoViewRequest.getTop(), Size.m1174getHeightimpl(m2553toSizeozmzZPI));
        } else if (i == 2) {
            return this.bringIntoViewSpec.calculateScrollDistance(findBringIntoViewRequest.getLeft(), findBringIntoViewRequest.getRight() - findBringIntoViewRequest.getLeft(), Size.m1176getWidthimpl(m2553toSizeozmzZPI));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: computeDestination-O0kMr_c  reason: not valid java name */
    private final Rect m155computeDestinationO0kMr_c(Rect rect, long j) {
        return rect.m1160translatek4lQ0M(Offset.m1145unaryMinusF1C5BW0(m158relocationOffsetBMxPBkI(rect, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: isMaxVisible-O0kMr_c$default  reason: not valid java name */
    public static /* synthetic */ boolean m157isMaxVisibleO0kMr_c$default(ContentInViewNode contentInViewNode, Rect rect, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewNode.viewportSize;
        }
        return contentInViewNode.m156isMaxVisibleO0kMr_c(rect, j);
    }

    /* renamed from: isMaxVisible-O0kMr_c  reason: not valid java name */
    private final boolean m156isMaxVisibleO0kMr_c(Rect rect, long j) {
        long m158relocationOffsetBMxPBkI = m158relocationOffsetBMxPBkI(rect, j);
        return Math.abs(Offset.m1137getXimpl(m158relocationOffsetBMxPBkI)) <= 0.5f && Math.abs(Offset.m1138getYimpl(m158relocationOffsetBMxPBkI)) <= 0.5f;
    }

    /* renamed from: relocationOffset-BMxPBkI  reason: not valid java name */
    private final long m158relocationOffsetBMxPBkI(Rect rect, long j) {
        long m2553toSizeozmzZPI = IntSizeKt.m2553toSizeozmzZPI(j);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return OffsetKt.Offset(0.0f, this.bringIntoViewSpec.calculateScrollDistance(rect.getTop(), rect.getBottom() - rect.getTop(), Size.m1174getHeightimpl(m2553toSizeozmzZPI)));
        } else if (i == 2) {
            return OffsetKt.Offset(this.bringIntoViewSpec.calculateScrollDistance(rect.getLeft(), rect.getRight() - rect.getLeft(), Size.m1176getWidthimpl(m2553toSizeozmzZPI)), 0.0f);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: compareTo-TemP2vQ  reason: not valid java name */
    private final int m153compareToTemP2vQ(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C8632dsu.d(IntSize.m2547getWidthimpl(j), IntSize.m2547getWidthimpl(j2));
            }
            throw new NoWhenBranchMatchedException();
        }
        return C8632dsu.d(IntSize.m2546getHeightimpl(j), IntSize.m2546getHeightimpl(j2));
    }

    /* renamed from: compareTo-iLBOSCw  reason: not valid java name */
    private final int m154compareToiLBOSCw(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Float.compare(Size.m1176getWidthimpl(j), Size.m1176getWidthimpl(j2));
            }
            throw new NoWhenBranchMatchedException();
        }
        return Float.compare(Size.m1174getHeightimpl(j), Size.m1174getHeightimpl(j2));
    }

    /* loaded from: classes.dex */
    public static final class Request {
        private final InterfaceC8743dwx<dpR> continuation;
        private final drO<Rect> currentBounds;

        public final InterfaceC8743dwx<dpR> getContinuation() {
            return this.continuation;
        }

        public final drO<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Request(drO<Rect> dro, InterfaceC8743dwx<? super dpR> interfaceC8743dwx) {
            this.currentBounds = dro;
            this.continuation = interfaceC8743dwx;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
            if (r0 == null) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                o.dwx<o.dpR> r0 = r4.continuation
                o.dqZ r0 = r0.getContext()
                o.dwR$b r1 = o.dwR.e
                o.dqZ$b r0 = r0.get(r1)
                o.dwR r0 = (o.dwR) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.e()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = o.C8666dua.e(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = ""
                o.C8632dsu.a(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                o.drO<androidx.compose.ui.geometry.Rect> r0 = r4.currentBounds
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                o.dwx<o.dpR> r0 = r4.continuation
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewNode.Request.toString():java.lang.String");
        }
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector;
        mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize();
        Rect rect = null;
        if (size > 0) {
            int i = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                Rect invoke = ((Request) content[i]).getCurrentBounds().invoke();
                if (invoke != null) {
                    if (m154compareToiLBOSCw(invoke.m1157getSizeNHjbRc(), IntSizeKt.m2553toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect == null ? invoke : rect;
                    }
                    rect = invoke;
                }
                i--;
            } while (i >= 0);
            return rect;
        }
        return rect;
    }
}
