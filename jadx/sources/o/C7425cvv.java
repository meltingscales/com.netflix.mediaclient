package o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import io.reactivex.rxkotlin.SubscribersKt;
import o.AbstractC7394cvQ;
import o.C7373cuw;
import o.C8632dsu;
import o.InterfaceC7407cvd;
import o.cUH;
import o.dpR;

/* renamed from: o.cvv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7425cvv extends ConstraintLayout {
    private final NetflixImageView b;
    private final BroadcastReceiver c;
    private final C7405cvb d;
    private final TextView f;
    private final TextView h;
    private final NetflixImageView j;
    public static final c e = new c(null);
    public static final int a = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7425cvv(Context context) {
        super(context);
        C8632dsu.c((Object) context, "");
        View.inflate(context, C7373cuw.b.g, this);
        C7405cvb b = C7405cvb.b(this);
        C8632dsu.a(b, "");
        this.d = b;
        NetflixImageView netflixImageView = b.d;
        C8632dsu.a(netflixImageView, "");
        this.b = netflixImageView;
        NetflixImageView netflixImageView2 = b.b;
        C8632dsu.a(netflixImageView2, "");
        this.j = netflixImageView2;
        C1204Sr c1204Sr = b.a;
        C8632dsu.a(c1204Sr, "");
        this.f = c1204Sr;
        C1204Sr c1204Sr2 = b.c;
        C8632dsu.a(c1204Sr2, "");
        this.h = c1204Sr2;
        a(C8258dgw.a.e().j());
        this.c = new d();
    }

    /* renamed from: o.cvv$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8258dgw.a.e().e(this.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C8258dgw.a.e().d(this.c);
    }

    /* renamed from: o.cvv$d */
    /* loaded from: classes4.dex */
    public static final class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            if (C8632dsu.c((Object) (intent != null ? intent.getAction() : null), (Object) "com.netflix.mediaclient.intent.action.DOWNLOADEDFORYOU_OPT_IN")) {
                C7425cvv.this.a(C8258dgw.a.e().j());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void a(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (z) {
            this.j.setImageResource(com.netflix.mediaclient.ui.R.e.ag);
            NetflixImageView netflixImageView = this.j;
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.g);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.g);
            ViewGroup.LayoutParams layoutParams = netflixImageView.getLayoutParams();
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                marginLayoutParams.topMargin = dimensionPixelSize;
                marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
                marginLayoutParams.setMarginEnd(dimensionPixelSize2);
                netflixImageView.requestLayout();
            }
            this.f.setText(getContext().getString(com.netflix.mediaclient.ui.R.o.bv));
            this.h.setText(C8168dfL.c(getContext().getString(com.netflix.mediaclient.ui.R.o.bx)));
            setOnClickListener(new View.OnClickListener() { // from class: o.cvw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7425cvv.b(C7425cvv.this, view);
                }
            });
            return;
        }
        setOnClickListener(new View.OnClickListener() { // from class: o.cvy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7425cvv.e(C7425cvv.this, view);
            }
        });
        this.j.setImageResource(com.netflix.mediaclient.ui.R.e.k);
        NetflixImageView netflixImageView2 = this.j;
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.j);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.j);
        ViewGroup.LayoutParams layoutParams2 = netflixImageView2.getLayoutParams();
        marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
            marginLayoutParams.topMargin = dimensionPixelSize3;
            marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
            marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
            marginLayoutParams.setMarginEnd(dimensionPixelSize4);
            netflixImageView2.requestLayout();
        }
        this.f.setText(getContext().getString(com.netflix.mediaclient.ui.R.o.bs));
        this.h.setText(C8168dfL.c(getContext().getString(com.netflix.mediaclient.ui.R.o.bu)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C7425cvv c7425cvv, View view) {
        C8632dsu.c((Object) c7425cvv, "");
        Context context = c7425cvv.getContext();
        cUH.d dVar = cUH.b;
        Context context2 = c7425cvv.getContext();
        C8632dsu.a(context2, "");
        context.startActivity(dVar.e(context2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C7425cvv c7425cvv, View view) {
        C8632dsu.c((Object) c7425cvv, "");
        NetflixActivity.requireNetflixActivity(c7425cvv.getContext()).showFullScreenDialog(new C7421cvr());
    }

    @SuppressLint({"CheckResult"})
    public final void c(InterfaceC7407cvd.d dVar) {
        C8632dsu.c((Object) dVar, "");
        final Context context = this.b.getContext();
        C8632dsu.a(context, "");
        final int p = C8150deu.p(context);
        final int d2 = (dVar.d() * p) / dVar.e();
        SubscribersKt.subscribeBy(InterfaceC9638uF.a.d(context).b(GetImageRequest.c.c(this.b).a(dVar.c()).a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.lolomo.DownloadsForYouRowHeaderOldInfra$showBillboardAsset$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                C8632dsu.c((Object) th, "");
                AbstractC7394cvQ.a aVar = AbstractC7394cvQ.b;
            }
        }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.lolomo.DownloadsForYouRowHeaderOldInfra$showBillboardAsset$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                d(aVar);
                return dpR.c;
            }

            public final void d(GetImageRequest.a aVar) {
                Drawable c2;
                NetflixImageView netflixImageView;
                C8632dsu.c((Object) aVar, "");
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), aVar.c());
                bitmapDrawable.setBounds(0, 0, p, d2);
                c2 = this.c(context, bitmapDrawable);
                c2.setBounds(0, 0, p, d2);
                netflixImageView = this.b;
                netflixImageView.setImageDrawable(c2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable c(Context context, Drawable drawable) {
        return new LayerDrawable(new Drawable[]{drawable, ContextCompat.getDrawable(context, com.netflix.mediaclient.ui.R.e.i), ContextCompat.getDrawable(context, com.netflix.mediaclient.ui.R.e.j)});
    }
}
