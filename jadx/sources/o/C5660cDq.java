package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref;
import o.C5650cDg;
import o.C5660cDq;
import o.C8632dsu;
import o.cIE;
import o.dpR;

/* renamed from: o.cDq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5660cDq extends cCV {
    public static final e b = new e(null);
    private Disposable a;
    private b c;
    private final FrameLayout e;
    private NetflixImageView g;

    /* JADX INFO: Access modifiers changed from: protected */
    public final NetflixImageView c() {
        return this.g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5660cDq(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, FrameLayout frameLayout, LayoutTimer layoutTimer, Map<String, ? extends Style> map, Map<String, ? extends Image> map2, float f, InterfaceC9638uF interfaceC9638uF) {
        super(observable, interactiveMoments, moment, map, map2, f, interfaceC9638uF);
        final List<Integer> yOffsets;
        NetflixImageView netflixImageView;
        final NetflixImageView netflixImageView2;
        Single a;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) frameLayout, "");
        C8632dsu.c((Object) layoutTimer, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.e = frameLayout;
        AbstractC5649cDf.a(this, frameLayout, layoutTimer, null, null, 12, null);
        LayoutTimer.SpriteSheetTimer spritesheet = layoutTimer.spritesheet();
        if (spritesheet == null || (yOffsets = spritesheet.yOffsets()) == null) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, yOffsets.size() - 1);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.cDo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5660cDq.e(C5660cDq.this, valueAnimator);
            }
        });
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ofInt.setInterpolator(cBZ.a.a());
        ofInt.addListener(new d(booleanRef, this));
        a(ofInt);
        NetflixImageView netflixImageView3 = (NetflixImageView) frameLayout.findViewById(cIE.b.bT);
        if (netflixImageView3 != null) {
            C8632dsu.d(netflixImageView3);
            AbstractC5649cDf.a(this, netflixImageView3, spritesheet, null, null, 12, null);
            final Image image = map2.get(spritesheet.assetId());
            if (image != null) {
                netflixImageView2 = netflixImageView3;
                a = C5794cIp.a.a(interfaceC9638uF, netflixImageView3, image, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? 1.0f : 0.0f, (r16 & 32) != 0 ? null : moment);
                this.a = SubscribersKt.subscribeBy(a, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.SpriteTimerInteractiveUIView$1$1$3$1$1
                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        b(th);
                        return dpR.c;
                    }

                    public final void b(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        C5660cDq.e eVar = C5660cDq.b;
                    }
                }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.SpriteTimerInteractiveUIView$1$1$3$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                        a(aVar);
                        return dpR.c;
                    }

                    public final void a(GetImageRequest.a aVar) {
                        C8632dsu.c((Object) aVar, "");
                        C5660cDq c5660cDq = C5660cDq.this;
                        Bitmap b2 = aVar.b();
                        Image image2 = image;
                        List<Integer> list = yOffsets;
                        C8632dsu.a(list, "");
                        C5660cDq.b bVar = new C5660cDq.b(b2, image2, list, new Rect(0, 0, netflixImageView2.getLayoutParams().width, netflixImageView2.getLayoutParams().height));
                        netflixImageView2.setImageDrawable(bVar);
                        c5660cDq.c = bVar;
                    }
                });
            } else {
                netflixImageView2 = netflixImageView3;
            }
            netflixImageView = netflixImageView2;
        } else {
            netflixImageView = null;
        }
        this.g = netflixImageView;
    }

    /* renamed from: o.cDq$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("SpriteTimerInteractiveUIView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5660cDq c5660cDq, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) c5660cDq, "");
        C8632dsu.c((Object) valueAnimator, "");
        b bVar = c5660cDq.c;
        if (bVar != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            bVar.b(((Integer) animatedValue).intValue());
        }
        NetflixImageView netflixImageView = c5660cDq.g;
        if (netflixImageView != null) {
            netflixImageView.invalidate();
        }
    }

    /* renamed from: o.cDq$d */
    /* loaded from: classes4.dex */
    public static final class d extends AnimatorListenerAdapter {
        final /* synthetic */ C5660cDq d;
        final /* synthetic */ Ref.BooleanRef e;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        d(Ref.BooleanRef booleanRef, C5660cDq c5660cDq) {
            this.e = booleanRef;
            this.d = c5660cDq;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
            C5660cDq.b.getLogTag();
            this.e.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            if (this.e.a) {
                return;
            }
            C5660cDq.b.getLogTag();
            this.d.e(C5650cDg.d.d);
        }
    }

    @Override // o.AbstractC5649cDf
    public void f() {
        Disposable disposable = this.a;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: o.cDq$b */
    /* loaded from: classes4.dex */
    public static final class b extends Drawable {
        private int a;
        private final Image b;
        private final Bitmap c;
        private int d;
        private final Rect e;
        private final List<Integer> h;
        private Rect i;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public b(Bitmap bitmap, Image image, List<Integer> list, Rect rect) {
            C8632dsu.c((Object) bitmap, "");
            C8632dsu.c((Object) image, "");
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) rect, "");
            this.c = bitmap;
            this.b = image;
            this.h = list;
            this.e = rect;
            this.a = (list.get(1).intValue() - list.get(0).intValue()) - 1;
            int intValue = list.get(this.d).intValue();
            Integer width = image.width();
            C8632dsu.a(width, "");
            this.i = new Rect(0, intValue, width.intValue(), list.get(this.d).intValue() + this.a);
        }

        public final void b(int i) {
            int i2;
            if (i != this.d) {
                C5660cDq.b.getLogTag();
                this.d = i;
                List<Integer> list = this.h;
                i2 = C8657dts.i(i, list.size() - 1);
                int intValue = list.get(i2).intValue();
                Integer width = this.b.width();
                C8632dsu.a(width, "");
                this.i = new Rect(0, intValue, width.intValue(), this.a + intValue);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            C8632dsu.c((Object) canvas, "");
            canvas.drawBitmap(this.c, this.i, this.e, (Paint) null);
        }
    }

    @Override // o.AbstractC5649cDf
    public void c(long j) {
        b.getLogTag();
        Animator a = a();
        if (a != null) {
            cCM ccm = cCM.a;
            Context context = this.e.getContext();
            C8632dsu.a(context, "");
            a.setDuration(ccm.d(context, j));
            a.start();
        }
    }
}
