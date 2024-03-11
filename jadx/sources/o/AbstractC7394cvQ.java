package o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import io.reactivex.rxkotlin.SubscribersKt;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC7394cvQ;
import o.C7373cuw;
import o.C8258dgw;
import o.C8632dsu;
import o.InterfaceC3825bMa;
import o.InterfaceC7407cvd;
import o.aLX;
import o.dpR;

/* renamed from: o.cvQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7394cvQ extends AbstractC3336ax<d> implements InterfaceC3829bMe {
    public static final a b = new a(null);
    public static final int d = 8;
    public AppView c;
    public InterfaceC7407cvd.d f;
    private InterfaceC3825bMa.a g;
    public drO<? extends TrackingInfo> h;

    @Override // o.AbstractC3073as
    public int a() {
        return C7373cuw.b.i;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.g;
    }

    /* renamed from: o.cvQ$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("DownloadsForYouRowHeaderModel");
        }
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.c;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.h;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC7407cvd.d l() {
        InterfaceC7407cvd.d dVar = this.f;
        if (dVar != null) {
            return dVar;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        super.e((AbstractC7394cvQ) dVar);
        dVar.a(l());
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        dVar.f();
        super.b((AbstractC7394cvQ) dVar);
    }

    /* renamed from: o.cvQ$d */
    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        public static final int c;
        static final /* synthetic */ dtC<Object>[] e;
        private static byte e$ss2$219 = 0;
        private static int f = 0;
        private static int m = 1;
        private final dsZ h = bIF.d(this, C7373cuw.c.s, false, 2, null);
        private final dsZ d = bIF.d(this, C7373cuw.c.k, false, 2, null);
        private final dsZ b = bIF.d(this, C7373cuw.c.n, false, 2, null);
        private final dsZ j = bIF.d(this, C7373cuw.c.p, false, 2, null);
        private final dsZ g = bIF.d(this, C7373cuw.c.m, false, 2, null);
        private final BroadcastReceiver a = new c();

        static void j() {
            e$ss2$219 = (byte) 24;
        }

        static {
            j();
            e = new dtC[]{dsA.c(new PropertyReference1Impl(d.class, "wrapper", "getWrapper()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), dsA.c(new PropertyReference1Impl(d.class, "background", "getBackground()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "icon", "getIcon()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(d.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "subtitle", "getSubtitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
            c = 8;
        }

        public final ConstraintLayout e() {
            return (ConstraintLayout) this.h.getValue(this, e[0]);
        }

        public final NetflixImageView b() {
            return (NetflixImageView) this.d.getValue(this, e[1]);
        }

        public final NetflixImageView a() {
            return (NetflixImageView) this.b.getValue(this, e[2]);
        }

        public final C1204Sr d() {
            return (C1204Sr) this.j.getValue(this, e[3]);
        }

        public final C1204Sr c() {
            return (C1204Sr) this.g.getValue(this, e[4]);
        }

        /* renamed from: o.cvQ$d$c */
        /* loaded from: classes4.dex */
        public static final class c extends BroadcastReceiver {
            c() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C8632dsu.c((Object) context, "");
                if (C8632dsu.c((Object) (intent != null ? intent.getAction() : null), (Object) "com.netflix.mediaclient.intent.action.DOWNLOADEDFORYOU_OPT_IN")) {
                    d.this.c(C8258dgw.a.e().j());
                }
            }
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            super.a(view);
            view.setTag(aLX.a.e, Boolean.TRUE);
            view.setTag(aLX.a.h, 2);
        }

        public final boolean h() {
            return b().isImageLoaded();
        }

        public final void a(InterfaceC7407cvd.d dVar) {
            C8632dsu.c((Object) dVar, "");
            C8258dgw.a aVar = C8258dgw.a;
            aVar.e().e(this.a);
            b(dVar);
            c(aVar.e().j());
        }

        public final void f() {
            C8258dgw.a.e().d(this.a);
            ConstraintLayout e2 = e();
            e2.setOnClickListener(null);
            e2.setClickable(false);
            b().setBackground(null);
            b().setForeground(null);
            b().onViewRecycled();
        }

        @SuppressLint({"CheckResult"})
        private final void b(InterfaceC7407cvd.d dVar) {
            final Context context = b().getContext();
            C8632dsu.a(context, "");
            final int p = C8150deu.p(context);
            final int d = (dVar.d() * p) / dVar.e();
            SubscribersKt.subscribeBy(InterfaceC9638uF.a.d(context).b(GetImageRequest.c.c(b()).a(dVar.c()).a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.model.DownloadsForYouRowHeaderModel$Holder$showBillboardAsset$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    AbstractC7394cvQ.a aVar = AbstractC7394cvQ.b;
                }
            }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.model.DownloadsForYouRowHeaderModel$Holder$showBillboardAsset$2
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
                    Drawable a;
                    C8632dsu.c((Object) aVar, "");
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), aVar.c());
                    bitmapDrawable.setBounds(0, 0, p, d);
                    a = this.a(context, bitmapDrawable);
                    a.setBounds(0, 0, p, d);
                    this.b().setImageDrawable(a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Context context, View view) {
            C8632dsu.c((Object) context, "");
            context.startActivity(cUH.b.e(context));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Context context, View view) {
            C8632dsu.c((Object) context, "");
            NetflixActivity.requireNetflixActivity(context).showFullScreenDialog(new C7421cvr());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Drawable a(Context context, Drawable drawable) {
            return new LayerDrawable(new Drawable[]{drawable, ContextCompat.getDrawable(context, com.netflix.mediaclient.ui.R.e.i), ContextCompat.getDrawable(context, com.netflix.mediaclient.ui.R.e.j)});
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"CheckResult"})
        public final void c(boolean z) {
            int i = 2 % 2;
            final Context context = b().getContext();
            C8632dsu.a(context, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (!z) {
                e().setOnClickListener(new View.OnClickListener() { // from class: o.cvP
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC7394cvQ.d.c(context, view);
                    }
                });
                a().setImageResource(com.netflix.mediaclient.ui.R.e.k);
                NetflixImageView a = a();
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.j);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.j);
                ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.leftMargin = marginLayoutParams2.leftMargin;
                    marginLayoutParams2.topMargin = dimensionPixelSize;
                    marginLayoutParams2.rightMargin = marginLayoutParams2.rightMargin;
                    marginLayoutParams2.bottomMargin = marginLayoutParams2.bottomMargin;
                    marginLayoutParams2.setMarginStart(C9687vB.c(marginLayoutParams2));
                    marginLayoutParams2.setMarginEnd(dimensionPixelSize2);
                    a.requestLayout();
                }
                C1204Sr d = d();
                String string = context.getString(com.netflix.mediaclient.ui.R.o.bs);
                if (!(!string.startsWith("'!#+"))) {
                    int i2 = m + 111;
                    f = i2 % 128;
                    if (i2 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        k(string.substring(4), objArr);
                        string = ((String) objArr[0]).intern();
                        int i3 = 91 / 0;
                    } else {
                        Object[] objArr2 = new Object[1];
                        k(string.substring(4), objArr2);
                        string = ((String) objArr2[0]).intern();
                    }
                }
                d.setText(string);
                C1204Sr c2 = c();
                String string2 = context.getString(com.netflix.mediaclient.ui.R.o.bu);
                if (string2.startsWith("'!#+")) {
                    int i4 = m + 43;
                    f = i4 % 128;
                    if (i4 % 2 != 0) {
                        Object[] objArr3 = new Object[1];
                        k(string2.substring(4), objArr3);
                        ((String) objArr3[0]).intern();
                        marginLayoutParams.hashCode();
                        throw null;
                    }
                    Object[] objArr4 = new Object[1];
                    k(string2.substring(4), objArr4);
                    string2 = ((String) objArr4[0]).intern();
                }
                c2.setText(C8168dfL.c(string2));
            } else {
                a().setImageResource(com.netflix.mediaclient.ui.R.e.ag);
                NetflixImageView a2 = a();
                int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.g);
                int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.g);
                ViewGroup.LayoutParams layoutParams2 = a2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    int i5 = f + 101;
                    m = i5 % 128;
                    if (i5 % 2 == 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        throw null;
                    }
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                    marginLayoutParams.topMargin = dimensionPixelSize3;
                    marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                    marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
                    marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
                    marginLayoutParams.setMarginEnd(dimensionPixelSize4);
                    a2.requestLayout();
                }
                d().setText(context.getString(com.netflix.mediaclient.ui.R.o.bv));
                C1204Sr c3 = c();
                String string3 = context.getString(com.netflix.mediaclient.ui.R.o.bx);
                if (string3.startsWith("'!#+")) {
                    Object[] objArr5 = new Object[1];
                    k(string3.substring(4), objArr5);
                    string3 = ((String) objArr5[0]).intern();
                }
                c3.setText(C8168dfL.c(string3));
                e().setOnClickListener(new View.OnClickListener() { // from class: o.cvS
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC7394cvQ.d.b(context, view);
                    }
                });
            }
            int i6 = f + 79;
            m = i6 % 128;
            int i7 = i6 % 2;
        }

        private void k(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$219);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((d) C9726vo.d(abstractC3179au, d.class)).h();
    }
}
