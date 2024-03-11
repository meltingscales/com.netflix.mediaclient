package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.lomo.BaselineBillboardView$loadBillboardGradients$2;
import com.netflix.mediaclient.ui.lomo.BaselineBillboardView$setBackground$2$onSuccess$1;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.model.leafs.originals.BillboardAsset;
import com.netflix.model.leafs.originals.BillboardSummary;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import o.C6472cdu;

/* renamed from: o.cdk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6462cdk extends C6467cdp implements dwU, InterfaceC6441cdP {
    private final C9879yM<C6472cdu.b> B;
    private View.OnLayoutChangeListener E;
    private int G;
    private NetflixImageView H;
    private final dxN I;
    private View d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC6462cdk(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC6462cdk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public abstract BillboardAsset a(BillboardSummary billboardSummary);

    @Override // o.dwU
    /* renamed from: a */
    public dxN getCoroutineContext() {
        return this.I;
    }

    @Override // o.C6467cdp
    protected void d(BillboardSummary billboardSummary) {
        C8632dsu.c((Object) billboardSummary, "");
    }

    public int h() {
        return this.G;
    }

    @Override // o.C6467cdp, com.netflix.mediaclient.ui.lomo.BillboardView
    public int i() {
        return -1;
    }

    public /* synthetic */ AbstractC6462cdk(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6462cdk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        C8632dsu.c((Object) context, "");
        this.B = new C9879yM<>();
        setClipToPadding(false);
        setClipChildren(false);
        setGravity(49);
        this.I = GF.e.d(context);
    }

    @Override // o.C6467cdp, com.netflix.mediaclient.ui.lomo.BillboardView
    public void b() {
        super.b();
        ViewParent parent = findViewById(com.netflix.mediaclient.ui.R.g.E).getParent();
        C8632dsu.d(parent);
        this.d = (View) parent;
        View findViewById = findViewById(com.netflix.mediaclient.ui.R.g.t);
        C8632dsu.a(findViewById, "");
        NetflixImageView netflixImageView = (NetflixImageView) findViewById;
        this.H = netflixImageView;
        if (netflixImageView == null) {
            C8632dsu.d("");
            netflixImageView = null;
        }
        netflixImageView.setVisibility(4);
    }

    @Override // o.C6467cdp, com.netflix.mediaclient.ui.lomo.BillboardView
    public void g() {
        super.g();
        Button button = ((C6467cdp) this).a;
        C8632dsu.a(button, "");
        button.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C6467cdp
    public void b(InterfaceC5180btr interfaceC5180btr, BillboardSummary billboardSummary, String str) {
        C8632dsu.c((Object) interfaceC5180btr, "");
        C8632dsu.c((Object) billboardSummary, "");
        c(billboardSummary, str);
        f(billboardSummary);
        e(a(billboardSummary), billboardSummary);
    }

    protected GradientDrawable a(int i) {
        return C6472cdu.b.e(true, i, getContext().getResources().getConfiguration().getLayoutDirection() == 1);
    }

    private final void e(BillboardAsset billboardAsset, BillboardSummary billboardSummary) {
        if (billboardAsset != null && billboardAsset.getWidth() != null && billboardAsset.getHeight() != null) {
            String url = billboardAsset.getUrl();
            NetflixImageView netflixImageView = (NetflixImageView) findViewById(com.netflix.mediaclient.ui.R.g.t);
            Integer dominantBackgroundColor = billboardAsset.getDominantBackgroundColor();
            if (dominantBackgroundColor != null) {
                d(a(dominantBackgroundColor.intValue()));
            }
            netflixImageView.showImage(new ShowImageRequest().a(url).c(ShowImageRequest.Priority.a).a(new c(url, netflixImageView, billboardAsset, this)));
            netflixImageView.setContentDescription(getContentDescription());
            return;
        }
        ViewUtils.d((View) ((C6467cdp) this).c, false);
        j(billboardSummary);
    }

    /* renamed from: o.cdk$c */
    /* loaded from: classes4.dex */
    public static final class c implements SingleObserver<ShowImageRequest.a> {
        final /* synthetic */ AbstractC6462cdk a;
        final /* synthetic */ NetflixImageView b;
        final /* synthetic */ BillboardAsset d;
        final /* synthetic */ String e;

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            C8632dsu.c((Object) th, "");
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            C8632dsu.c((Object) disposable, "");
        }

        c(String str, NetflixImageView netflixImageView, BillboardAsset billboardAsset, AbstractC6462cdk abstractC6462cdk) {
            this.e = str;
            this.b = netflixImageView;
            this.d = billboardAsset;
            this.a = abstractC6462cdk;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void onSuccess(ShowImageRequest.a aVar) {
            BitmapDrawable bitmapDrawable;
            TransitionDrawable transitionDrawable;
            C8632dsu.c((Object) aVar, "");
            if (this.e == null || !this.b.isImageLoaded()) {
                return;
            }
            Drawable drawable = this.b.getDrawable();
            NetflixImageView netflixImageView = null;
            if (drawable instanceof TransitionDrawable) {
                Drawable drawable2 = ((TransitionDrawable) drawable).getDrawable(transitionDrawable.getNumberOfLayers() - 1);
                if (drawable2 instanceof BitmapDrawable) {
                    bitmapDrawable = (BitmapDrawable) drawable2;
                }
                bitmapDrawable = null;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    bitmapDrawable = (BitmapDrawable) drawable;
                }
                bitmapDrawable = null;
            }
            if (this.d.getDominantBackgroundColor() == null && bitmapDrawable != null) {
                AbstractC6462cdk abstractC6462cdk = this.a;
                C8737dwr.c(abstractC6462cdk, null, null, new BaselineBillboardView$setBackground$2$onSuccess$1(abstractC6462cdk, bitmapDrawable, this.e, null), 3, null);
            }
            if (bitmapDrawable != null) {
                NetflixImageView netflixImageView2 = this.a.H;
                if (netflixImageView2 == null) {
                    C8632dsu.d("");
                } else {
                    netflixImageView = netflixImageView2;
                }
                netflixImageView.setVisibility(0);
            }
        }
    }

    public void d(final Drawable drawable) {
        NetflixImageView netflixImageView = (NetflixImageView) findViewById(com.netflix.mediaclient.ui.R.g.F);
        View.OnLayoutChangeListener onLayoutChangeListener = this.E;
        if (onLayoutChangeListener != null) {
            netflixImageView.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, netflixImageView.getWidth(), netflixImageView.getHeight());
        }
        netflixImageView.setImageDrawable(drawable);
        View.OnLayoutChangeListener onLayoutChangeListener2 = new View.OnLayoutChangeListener() { // from class: o.cdj
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                AbstractC6462cdk.a(drawable, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        netflixImageView.addOnLayoutChangeListener(onLayoutChangeListener2);
        this.E = onLayoutChangeListener2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Drawable drawable, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (drawable != null) {
            drawable.setBounds(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Bitmap bitmap, String str, InterfaceC8585dra<? super C6472cdu.b> interfaceC8585dra) {
        return this.B.c(new BaselineBillboardView$loadBillboardGradients$2(this, bitmap, str, null), interfaceC8585dra);
    }

    @Override // com.netflix.mediaclient.ui.lomo.BillboardView
    public int d() {
        return C6469cdr.c(getContext(), true) + h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C6467cdp
    public void b(BillboardSummary billboardSummary) {
        super.b(billboardSummary);
        Button button = ((C6467cdp) this).a;
        C8632dsu.a(button, "");
        button.setVisibility(8);
    }

    @Override // com.netflix.mediaclient.ui.lomo.BillboardView
    public void d(InterfaceC5180btr interfaceC5180btr) {
        super.d(interfaceC5180btr);
        Button button = ((C6467cdp) this).a;
        C8632dsu.a(button, "");
        button.setVisibility(8);
    }

    @Override // o.InterfaceC6441cdP
    public void setTopActionBarPadding(int i) {
        if (i != this.G) {
            this.G = i;
            setPadding(getPaddingLeft(), i, getPaddingRight(), getPaddingBottom());
        }
    }
}
