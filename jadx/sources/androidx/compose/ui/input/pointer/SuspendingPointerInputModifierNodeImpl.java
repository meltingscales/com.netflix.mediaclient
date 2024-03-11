package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import o.C8586drb;
import o.C8590drf;
import o.C8592drh;
import o.C8627dsp;
import o.C8737dwr;
import o.C8741dwv;
import o.InterfaceC8585dra;
import o.InterfaceC8743dwx;
import o.dpR;
import o.dqW;
import o.dqZ;
import o.drM;
import o.drX;
import o.dxD;

/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope {
    private long boundsSize;
    private PointerEvent currentEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private PointerEvent lastPointerEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;
    private drX<? super PointerInputScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> pointerInputHandler;
    private dxD pointerInputJob;

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> getPointerInputHandler() {
        return this.pointerInputHandler;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getSize-YbymL2g */
    public long mo1742getSizeYbymL2g() {
        return this.boundsSize;
    }

    public SuspendingPointerInputModifierNodeImpl(drX<? super PointerInputScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        PointerEvent pointerEvent;
        this.pointerInputHandler = drx;
        pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        this.currentEvent = pointerEvent;
        this.pointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.Companion.m2551getZeroYbymL2g();
    }

    public void setPointerInputHandler(drX<? super PointerInputScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        resetPointerInputHandler();
        this.pointerInputHandler = drx;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
    public long m1773getExtendedTouchPaddingNHjbRc() {
        long mo194toSizeXkaWNTQ = mo194toSizeXkaWNTQ(getViewConfiguration().mo1873getMinimumTouchTargetSizeMYxV2XQ());
        long mo1742getSizeYbymL2g = mo1742getSizeYbymL2g();
        return SizeKt.Size(Math.max(0.0f, Size.m1176getWidthimpl(mo194toSizeXkaWNTQ) - IntSize.m2547getWidthimpl(mo1742getSizeYbymL2g)) / 2.0f, Math.max(0.0f, Size.m1174getHeightimpl(mo194toSizeXkaWNTQ) - IntSize.m2546getHeightimpl(mo1742getSizeYbymL2g)) / 2.0f);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        dxD dxd = this.pointerInputJob;
        if (dxd != null) {
            dxd.e(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo93onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        dxD c;
        this.boundsSize = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            c = C8737dwr.c(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, null);
            this.pointerInputJob = c;
        }
        dispatchPointerEvent(pointerEvent, pointerEventPass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (!(!z)) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        List<PointerInputChange> changes;
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        int size = pointerEvent.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!(!changes.get(i).getPressed())) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    PointerInputChange pointerInputChange = changes2.get(i2);
                    arrayList.add(new PointerInputChange(pointerInputChange.m1727getIdJ3iCeTQ(), pointerInputChange.getUptimeMillis(), pointerInputChange.m1729getPositionF1C5BW0(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m1729getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0L, 1536, (C8627dsp) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, InterfaceC8585dra<R> {
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl $$delegate_0;
        private final InterfaceC8585dra<R> completion;
        private InterfaceC8743dwx<? super PointerEvent> pointerAwaiter;
        private PointerEventPass awaitPass = PointerEventPass.Main;
        private final dqZ context = EmptyCoroutineContext.e;

        @Override // o.InterfaceC8585dra
        public dqZ getContext() {
            return this.context;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public int mo186roundToPxR2X_6o(long j) {
            return this.$$delegate_0.mo186roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public int mo187roundToPx0680j_4(float f) {
            return this.$$delegate_0.mo187roundToPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public float mo188toDpGaN1DYA(long j) {
            return this.$$delegate_0.mo188toDpGaN1DYA(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo189toDpu2uoSUM(float f) {
            return this.$$delegate_0.mo189toDpu2uoSUM(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo190toDpu2uoSUM(int i) {
            return this.$$delegate_0.mo190toDpu2uoSUM(i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public long mo191toDpSizekrfVVM(long j) {
            return this.$$delegate_0.mo191toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo192toPxR2X_6o(long j) {
            return this.$$delegate_0.mo192toPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public float mo193toPx0680j_4(float f) {
            return this.$$delegate_0.mo193toPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public long mo194toSizeXkaWNTQ(long j) {
            return this.$$delegate_0.mo194toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public long mo195toSp0xMU5do(float f) {
            return this.$$delegate_0.mo195toSp0xMU5do(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo196toSpkPz2Gy4(float f) {
            return this.$$delegate_0.mo196toSpkPz2Gy4(f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(InterfaceC8585dra<? super R> interfaceC8585dra) {
            this.completion = interfaceC8585dra;
            this.$$delegate_0 = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public PointerEvent getCurrentEvent() {
            return SuspendingPointerInputModifierNodeImpl.this.currentEvent;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getSize-YbymL2g */
        public long mo1684getSizeYbymL2g() {
            return SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo1683getExtendedTouchPaddingNHjbRc() {
            return SuspendingPointerInputModifierNodeImpl.this.m1773getExtendedTouchPaddingNHjbRc();
        }

        public final void offerPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
            InterfaceC8743dwx<? super PointerEvent> interfaceC8743dwx;
            if (pointerEventPass != this.awaitPass || (interfaceC8743dwx = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            Result.c cVar = Result.e;
            interfaceC8743dwx.resumeWith(Result.e(pointerEvent));
        }

        public final void cancel(Throwable th) {
            InterfaceC8743dwx<? super PointerEvent> interfaceC8743dwx = this.pointerAwaiter;
            if (interfaceC8743dwx != null) {
                interfaceC8743dwx.c(th);
            }
            this.pointerAwaiter = null;
        }

        @Override // o.InterfaceC8585dra
        public void resumeWith(Object obj) {
            MutableVector mutableVector = SuspendingPointerInputModifierNodeImpl.this.pointerHandlers;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (mutableVector) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.remove(this);
                dpR dpr = dpR.c;
            }
            this.completion.resumeWith(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object withTimeoutOrNull(long r5, o.drX<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super o.InterfaceC8585dra<? super T>, ? extends java.lang.Object> r7, o.InterfaceC8585dra<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                o.C8556dpz.d(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                o.C8556dpz.d(r8)
                r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r8 = r4.withTimeout(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeoutOrNull(long, o.drX, o.dra):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [o.dxD] */
        /* JADX WARN: Type inference failed for: r11v3, types: [o.dxD] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object withTimeout(long r11, o.drX<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super o.InterfaceC8585dra<? super T>, ? extends java.lang.Object> r13, o.InterfaceC8585dra<? super T> r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L13
                r0 = r14
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.result
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r11 = r0.L$0
                o.dxD r11 = (o.dxD) r11
                o.C8556dpz.d(r14)     // Catch: java.lang.Throwable -> L79
                goto L73
            L2d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L35:
                o.C8556dpz.d(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L54
                o.dwx<? super androidx.compose.ui.input.pointer.PointerEvent> r14 = r10.pointerAwaiter
                if (r14 == 0) goto L54
                kotlin.Result$c r2 = kotlin.Result.e
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = o.C8556dpz.a(r2)
                java.lang.Object r2 = kotlin.Result.e(r2)
                r14.resumeWith(r2)
            L54:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r14 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                o.dwU r4 = r14.getCoroutineScope()
                r5 = 0
                r6 = 0
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r7 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                o.dxD r11 = o.C8738dws.e(r4, r5, r6, r7, r8, r9)
                r0.L$0 = r11     // Catch: java.lang.Throwable -> L79
                r0.label = r3     // Catch: java.lang.Throwable -> L79
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L79
                if (r14 != r1) goto L73
                return r1
            L73:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r11.e(r12)
                return r14
            L79:
                r12 = move-exception
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r11.e(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeout(long, o.drX, o.dra):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public Object awaitPointerEvent(PointerEventPass pointerEventPass, InterfaceC8585dra<? super PointerEvent> interfaceC8585dra) {
            InterfaceC8585dra b;
            Object e;
            b = C8590drf.b(interfaceC8585dra);
            C8741dwv c8741dwv = new C8741dwv(b, 1);
            c8741dwv.h();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = c8741dwv;
            Object b2 = c8741dwv.b();
            e = C8586drb.e();
            if (b2 == e) {
                C8592drh.c(interfaceC8585dra);
            }
            return b2;
        }
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector;
        int size;
        synchronized (this.pointerHandlers) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
            mutableVector2.addAll(mutableVector2.getSize(), this.pointerHandlers);
        }
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    PointerEventHandlerCoroutine<?>[] content = mutableVector3.getContent();
                    int i2 = 0;
                    do {
                        content[i2].offerPointerEvent(pointerEvent, pointerEventPass);
                        i2++;
                    } while (i2 < size2);
                }
            } else if (i == 3 && (size = (mutableVector = this.dispatchingPointerHandlers).getSize()) > 0) {
                int i3 = size - 1;
                PointerEventHandlerCoroutine<?>[] content2 = mutableVector.getContent();
                do {
                    content2[i3].offerPointerEvent(pointerEvent, pointerEventPass);
                    i3--;
                } while (i3 >= 0);
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public <R> Object awaitPointerEventScope(drX<? super AwaitPointerEventScope, ? super InterfaceC8585dra<? super R>, ? extends Object> drx, InterfaceC8585dra<? super R> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e;
        b = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(c8741dwv);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            InterfaceC8585dra<dpR> a = dqW.a(drx, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.c cVar = Result.e;
            a.resumeWith(Result.e(dpR.c));
        }
        c8741dwv.a((drM<? super Throwable, dpR>) new drM<Throwable, dpR>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Throwable th) {
                invoke2(th);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                pointerEventHandlerCoroutine.cancel(th);
            }
        });
        Object b2 = c8741dwv.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return b2;
    }
}
