package com.netflix.mediaclient.ui.bulkrater.impl.view;

import android.animation.ValueAnimator;
import com.netflix.mediaclient.ui.bulkrater.impl.view.PagerViewHolder$bind$1;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Lambda;
import o.C5434byg;
import o.C5443byp;
import o.C5448byu;
import o.C5451byx;
import o.C5452byy;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public final class PagerViewHolder$bind$1 extends Lambda implements drO<dpR> {
    final /* synthetic */ C5452byy b;
    final /* synthetic */ C5451byx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerViewHolder$bind$1(C5451byx c5451byx, C5452byy c5452byy) {
        super(0);
        this.c = c5451byx;
        this.b = c5452byy;
    }

    @Override // o.drO
    public /* synthetic */ dpR invoke() {
        e();
        return dpR.c;
    }

    /* renamed from: com.netflix.mediaclient.ui.bulkrater.impl.view.PagerViewHolder$bind$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements drM<dpR, dpR> {
        final /* synthetic */ C5452byy a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C5452byy c5452byy) {
            super(1);
            this.a = c5452byy;
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(dpR dpr) {
            e(dpr);
            return dpR.c;
        }

        public final void e(dpR dpr) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            final C5452byy c5452byy = this.a;
            ofFloat.setDuration(1200L);
            ofFloat.setInterpolator(new C5443byp());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.byw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PagerViewHolder$bind$1.AnonymousClass1.b(C5452byy.this, valueAnimator);
                }
            });
            ofFloat.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C5452byy c5452byy, ValueAnimator valueAnimator) {
            C5448byu c5448byu;
            C8632dsu.c((Object) c5452byy, "");
            C8632dsu.c((Object) valueAnimator, "");
            c5448byu = c5452byy.e;
            C5434byg c5434byg = c5448byu.c;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            c5434byg.setYBias(((Float) animatedValue).floatValue());
        }
    }

    public final void e() {
        C5448byu c5448byu;
        C5448byu c5448byu2;
        Observable observable;
        Observable take;
        if (this.c.e()) {
            observable = this.b.a;
            if (observable == null || (take = observable.take(1L)) == null) {
                return;
            }
            final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b);
            take.subscribe(new Consumer() { // from class: o.byz
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PagerViewHolder$bind$1.e(drM.this, obj);
                }
            });
            return;
        }
        c5448byu = this.b.e;
        c5448byu.c.animate().cancel();
        c5448byu2 = this.b.e;
        c5448byu2.c.setYBias(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
