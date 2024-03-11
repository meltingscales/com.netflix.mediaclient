package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.ui.notifications.multititle.RatingInfoTitle$ViewHolder$bind$1$2;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.model.leafs.social.multititle.NotificationRatingAction;
import com.netflix.model.leafs.social.multititle.NotificationRatingInfoModule;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;
import o.AbstractC7118cqF;
import o.C7124cqL;
import o.C9834xU;
import o.InterfaceC9638uF;
import o.dpR;

/* renamed from: o.cqL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7124cqL extends AbstractC7118cqF {
    private final NotificationRatingInfoModule a;
    private final int b;
    private final String d;

    public final NotificationRatingInfoModule b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    @Override // o.AbstractC7118cqF
    public int d() {
        return this.b;
    }

    public /* synthetic */ C7124cqL(int i, NotificationRatingInfoModule notificationRatingInfoModule, String str, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 5 : i, notificationRatingInfoModule, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7124cqL(int i, NotificationRatingInfoModule notificationRatingInfoModule, String str) {
        super(false);
        C8632dsu.c((Object) notificationRatingInfoModule, "");
        C8632dsu.c((Object) str, "");
        this.b = i;
        this.a = notificationRatingInfoModule;
        this.d = str;
    }

    /* renamed from: o.cqL$a */
    /* loaded from: classes4.dex */
    public static final class a extends RecyclerView.ViewHolder implements AbstractC7118cqF.a {
        private final NetflixImageView a;
        private final NetflixImageView b;
        private Disposable c;
        private final InterfaceC8554dpx d;
        private final LinearLayout e;
        private final NetflixImageView f;
        private final ProgressBar g;
        private final NetflixImageView h;
        private final C1204Sr i;
        private final NetflixImageView j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7144cqf c7144cqf) {
            super(c7144cqf.d());
            InterfaceC8554dpx b;
            C8632dsu.c((Object) c7144cqf, "");
            NetflixImageView netflixImageView = c7144cqf.b;
            C8632dsu.a(netflixImageView, "");
            this.a = netflixImageView;
            NetflixImageView netflixImageView2 = c7144cqf.f;
            C8632dsu.a(netflixImageView2, "");
            this.b = netflixImageView2;
            C1204Sr c1204Sr = c7144cqf.h;
            C8632dsu.a(c1204Sr, "");
            this.i = c1204Sr;
            LinearLayout linearLayout = c7144cqf.j;
            C8632dsu.a(linearLayout, "");
            this.e = linearLayout;
            NetflixImageView netflixImageView3 = c7144cqf.d;
            C8632dsu.a(netflixImageView3, "");
            this.j = netflixImageView3;
            NetflixImageView netflixImageView4 = c7144cqf.e;
            C8632dsu.a(netflixImageView4, "");
            this.f = netflixImageView4;
            NetflixImageView netflixImageView5 = c7144cqf.a;
            C8632dsu.a(netflixImageView5, "");
            this.h = netflixImageView5;
            ProgressBar progressBar = c7144cqf.c;
            C8632dsu.a(progressBar, "");
            this.g = progressBar;
            b = dpB.b(new drO<GradientDrawable>() { // from class: com.netflix.mediaclient.ui.notifications.multititle.RatingInfoTitle$ViewHolder$blurGradientDrawable$2
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: d */
                public final GradientDrawable invoke() {
                    NetflixImageView netflixImageView6;
                    netflixImageView6 = C7124cqL.a.this.a;
                    int color = netflixImageView6.getContext().getResources().getColor(C9834xU.c.b);
                    return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb((int) (Color.alpha(color) * 0.2f), Color.red(color), Color.green(color), Color.blue(color)), color});
                }
            });
            this.d = b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GradientDrawable c() {
            return (GradientDrawable) this.d.getValue();
        }

        public final void a(C7124cqL c7124cqL) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            C8632dsu.c((Object) c7124cqL, "");
            NotificationRatingInfoModule b = c7124cqL.b();
            this.b.showImage(new ShowImageRequest().a(b.boxshotWebp()).c(ShowImageRequest.Priority.a));
            if (C8632dsu.c((Object) c7124cqL.c(), (Object) "ratingInput")) {
                this.e.setVisibility(0);
                Context context = this.itemView.getContext();
                int b2 = ViewUtils.b(context);
                int d = ViewUtils.d(context);
                NetflixImageView netflixImageView = this.b;
                ViewGroup.LayoutParams layoutParams = netflixImageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.leftMargin = marginLayoutParams2.leftMargin;
                    marginLayoutParams2.topMargin = b2 + (d * 2);
                    marginLayoutParams2.rightMargin = marginLayoutParams2.rightMargin;
                    marginLayoutParams2.bottomMargin = marginLayoutParams2.bottomMargin;
                    marginLayoutParams2.setMarginStart(C9687vB.c(marginLayoutParams2));
                    marginLayoutParams2.setMarginEnd(C9687vB.b(marginLayoutParams2));
                    netflixImageView.requestLayout();
                }
                this.a.setVisibility(8);
                this.i.setText(b.bodyCopy());
                this.i.setTextAppearance(context, C9834xU.o.k);
                C1204Sr c1204Sr = this.i;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(C9834xU.a.q);
                ViewGroup.LayoutParams layoutParams2 = c1204Sr.getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                    marginLayoutParams.topMargin = dimensionPixelSize;
                    marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                    marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
                    marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
                    marginLayoutParams.setMarginEnd(C9687vB.b(marginLayoutParams));
                    c1204Sr.requestLayout();
                }
                List<NotificationRatingAction> actions = b.actions();
                NetflixImageView netflixImageView2 = this.j;
                C8632dsu.d(actions);
                a("thumbsDown", netflixImageView2, actions);
                a("thumbsUp", this.f, actions);
                a("thumbsUpDouble", this.h, actions);
                return;
            }
            this.e.setVisibility(8);
            final Context context2 = this.i.getContext();
            int d2 = ViewUtils.d(context2);
            int b3 = ViewUtils.b(context2);
            double d3 = C8632dsu.c((Object) c7124cqL.c(), (Object) "thumbsDown") ? d2 * 0.7d : 0.0d;
            NetflixImageView netflixImageView3 = this.b;
            int i = (int) d3;
            ViewGroup.LayoutParams layoutParams3 = netflixImageView3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.leftMargin = marginLayoutParams3.leftMargin;
                marginLayoutParams3.topMargin = b3 + d2 + i;
                marginLayoutParams3.rightMargin = marginLayoutParams3.rightMargin;
                marginLayoutParams3.bottomMargin = marginLayoutParams3.bottomMargin;
                marginLayoutParams3.setMarginStart(C9687vB.c(marginLayoutParams3));
                marginLayoutParams3.setMarginEnd(C9687vB.b(marginLayoutParams3));
                netflixImageView3.requestLayout();
            }
            this.a.setVisibility(0);
            GetImageRequest c = GetImageRequest.c.c(this.a);
            String boxshotWebp = b.boxshotWebp();
            C8632dsu.a(boxshotWebp, "");
            GetImageRequest.e a = c.a(boxshotWebp).b(true).a();
            InterfaceC9638uF.e eVar = InterfaceC9638uF.a;
            C8632dsu.d(context2);
            Single<GetImageRequest.a> b4 = eVar.d(context2).b(a);
            final drM<GetImageRequest.a, dpR> drm = new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.notifications.multititle.RatingInfoTitle$ViewHolder$bind$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                    e(aVar);
                    return dpR.c;
                }

                public final void e(GetImageRequest.a aVar) {
                    NetflixImageView netflixImageView4;
                    NetflixImageView netflixImageView5;
                    GradientDrawable c2;
                    netflixImageView4 = C7124cqL.a.this.a;
                    netflixImageView4.setBackground(new BitmapDrawable(context2.getResources(), aVar.b()));
                    netflixImageView5 = C7124cqL.a.this.a;
                    c2 = C7124cqL.a.this.c();
                    NetflixImageView.addOverlay$default(netflixImageView5, c2, 0, 2, null);
                }
            };
            Consumer<? super GetImageRequest.a> consumer = new Consumer() { // from class: o.cqM
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7124cqL.a.b(drM.this, obj);
                }
            };
            final RatingInfoTitle$ViewHolder$bind$1$2 ratingInfoTitle$ViewHolder$bind$1$2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.notifications.multititle.RatingInfoTitle$ViewHolder$bind$1$2
                public final void a(Throwable th) {
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    a(th);
                    return dpR.c;
                }
            };
            this.c = b4.subscribe(consumer, new Consumer() { // from class: o.cqK
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7124cqL.a.c(drM.this, obj);
                }
            });
            this.i.setTextAppearance(context2, C9834xU.o.s);
            if (C8632dsu.c((Object) c7124cqL.c(), (Object) "thumbsDown")) {
                this.i.setText(b.bodyCopyConfirmationThumbsDown());
                C1204Sr c1204Sr2 = this.i;
                int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(C9834xU.a.ai);
                ViewGroup.LayoutParams layoutParams4 = c1204Sr2.getLayoutParams();
                marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                    marginLayoutParams.topMargin = dimensionPixelSize2;
                    marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                    marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
                    marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
                    marginLayoutParams.setMarginEnd(C9687vB.b(marginLayoutParams));
                    c1204Sr2.requestLayout();
                }
                this.i.setGravity(1);
                return;
            }
            this.i.setText(b.bodyCopyConfirmationThumbsUp());
            if (C8632dsu.c((Object) c7124cqL.c(), (Object) "thumbsUpDouble")) {
                b.bodyCopyConfirmationThumbsUpDouble();
            } else {
                b.bodyCopyConfirmationThumbsUp();
            }
            C1204Sr c1204Sr3 = this.i;
            int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(C9834xU.a.f13911o);
            ViewGroup.LayoutParams layoutParams5 = c1204Sr3.getLayoutParams();
            marginLayoutParams = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                marginLayoutParams.topMargin = dimensionPixelSize3;
                marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
                marginLayoutParams.setMarginEnd(C9687vB.b(marginLayoutParams));
                c1204Sr3.requestLayout();
            }
            this.i.setGravity(8388611);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            drm.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            drm.invoke(obj);
        }

        private final void a(String str, View view, List<NotificationRatingAction> list) {
            Object obj;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((NotificationRatingAction) obj).actionType(), (Object) str)) {
                    break;
                }
            }
            final NotificationRatingAction notificationRatingAction = (NotificationRatingAction) obj;
            if (notificationRatingAction != null) {
                view.setVisibility(0);
                view.setOnClickListener(new View.OnClickListener() { // from class: o.cqJ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C7124cqL.a.b(C7124cqL.a.this, notificationRatingAction, view2);
                    }
                });
                view.setClickable(true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(a aVar, NotificationRatingAction notificationRatingAction, View view) {
            C8632dsu.c((Object) aVar, "");
            C8632dsu.c((Object) notificationRatingAction, "");
            aVar.b(notificationRatingAction);
        }

        private final void b(NotificationRatingAction notificationRatingAction) {
            this.g.setVisibility(0);
            a(false);
            CLv2Utils.INSTANCE.b(AppView.notificationLandingItem, CommandValue.SetThumbRatingCommand, (TrackingInfo) null);
            String action = notificationRatingAction.action();
            if (action != null) {
                Context context = this.itemView.getContext();
                C8632dsu.a(context, "");
                C1588aGw.e((Activity) C9737vz.e(context, NetflixActivity.class)).c(bEX.b.e(new Intent("android.intent.action.VIEW", Uri.parse(action))));
            }
        }

        private final void a(boolean z) {
            this.f.setEnabled(z);
            this.h.setEnabled(z);
            this.j.setEnabled(z);
        }

        @Override // o.AbstractC7118cqF.a
        public void a() {
            a(true);
            this.g.setVisibility(8);
            Disposable disposable = this.c;
            if (disposable != null) {
                disposable.dispose();
            }
            this.a.removeOverlay(c());
        }
    }
}
