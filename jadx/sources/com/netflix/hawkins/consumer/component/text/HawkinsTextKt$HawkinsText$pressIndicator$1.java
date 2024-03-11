package com.netflix.hawkins.consumer.component.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8654dtp;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes3.dex */
public final class HawkinsTextKt$HawkinsText$pressIndicator$1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MutableState<TextLayoutResult> a;
    final /* synthetic */ drM<String, dpR> b;
    final /* synthetic */ List<Pair<C8654dtp, String>> c;
    int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HawkinsTextKt$HawkinsText$pressIndicator$1(MutableState<TextLayoutResult> mutableState, List<Pair<C8654dtp, String>> list, drM<? super String, dpR> drm, InterfaceC8585dra<? super HawkinsTextKt$HawkinsText$pressIndicator$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = mutableState;
        this.c = list;
        this.b = drm;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((HawkinsTextKt$HawkinsText$pressIndicator$1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        HawkinsTextKt$HawkinsText$pressIndicator$1 hawkinsTextKt$HawkinsText$pressIndicator$1 = new HawkinsTextKt$HawkinsText$pressIndicator$1(this.a, this.c, this.b, interfaceC8585dra);
        hawkinsTextKt$HawkinsText$pressIndicator$1.e = obj;
        return hawkinsTextKt$HawkinsText$pressIndicator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.e;
            final MutableState<TextLayoutResult> mutableState = this.a;
            final List<Pair<C8654dtp, String>> list = this.c;
            final drM<String, dpR> drm = this.b;
            drM<Offset, dpR> drm2 = new drM<Offset, dpR>() { // from class: com.netflix.hawkins.consumer.component.text.HawkinsTextKt$HawkinsText$pressIndicator$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Offset offset) {
                    d(offset.m1146unboximpl());
                    return dpR.c;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void d(long j) {
                    Object obj2;
                    TextLayoutResult value = mutableState.getValue();
                    if (value != null) {
                        List<Pair<C8654dtp, String>> list2 = list;
                        drM<String, dpR> drm3 = drm;
                        int m2142getOffsetForPositionk4lQ0M = value.m2142getOffsetForPositionk4lQ0M(j);
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((C8654dtp) ((Pair) obj2).d()).a(m2142getOffsetForPositionk4lQ0M)) {
                                break;
                            }
                        }
                        Pair pair = (Pair) obj2;
                        if (pair != null) {
                            drm3.invoke(pair.a());
                        }
                    }
                }
            };
            this.d = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, drm2, this, 7, null) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
