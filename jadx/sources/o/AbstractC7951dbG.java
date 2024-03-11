package o;

import android.content.Context;
import android.view.View;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC7951dbG;
import o.C3796bKz;
import o.C7939dav;
import o.C8632dsu;
import o.ST;

/* renamed from: o.dbG  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7951dbG extends AbstractC3336ax<d> {
    private View.OnClickListener b;
    private String c;
    private String d;

    @Override // o.AbstractC3073as
    public int a() {
        return C7939dav.a.X;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final void al_(String str) {
        this.c = str;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public final View.OnClickListener i() {
        return this.b;
    }

    public final String k() {
        return this.d;
    }

    public final String n() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        dVar.d(this.d, this.c);
        NetflixImageView e = dVar.e();
        View.OnClickListener onClickListener = this.b;
        e.setOnClickListener(onClickListener);
        e.setClickable(onClickListener != null);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        dVar.e().onViewRecycled();
        NetflixImageView e = dVar.e();
        e.setOnClickListener(null);
        e.setClickable(false);
    }

    /* renamed from: o.dbG$d */
    /* loaded from: classes5.dex */
    public static final class d extends bIG {
        private final dsZ a;
        private Runnable b;
        private final InterfaceC8554dpx c;
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(d.class, "imageView", "getImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        public static final a d = new a(null);

        public d() {
            InterfaceC8554dpx b;
            b = dpB.b(new drO<ST>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.TitleTreatmentModel$Holder$titleDrawable$2
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: d */
                public final ST invoke() {
                    Context context = AbstractC7951dbG.d.this.e().getContext();
                    C8632dsu.a(context, "");
                    ST st = new ST(context);
                    AbstractC7951dbG.d dVar = AbstractC7951dbG.d.this;
                    st.d(true);
                    st.d(dVar.r().getResources().getInteger(C3796bKz.c.d));
                    st.b(BrowseExperience.a(dVar.r().getContext(), R.a.e));
                    st.e(dVar.r().getResources().getDimensionPixelSize(C3796bKz.d.b));
                    return st;
                }
            });
            this.c = b;
            this.a = bIF.d(this, C7939dav.d.E, false, 2, null);
        }

        /* renamed from: o.dbG$d$a */
        /* loaded from: classes5.dex */
        public static final class a {
            public /* synthetic */ a(C8627dsp c8627dsp) {
                this();
            }

            private a() {
            }
        }

        private final ST c() {
            return (ST) this.c.getValue();
        }

        public final NetflixImageView e() {
            return (NetflixImageView) this.a.getValue(this, e[0]);
        }

        public final void d(String str, final String str2) {
            boolean g;
            e().showImage((String) null);
            e().setContentDescription(str2);
            Runnable runnable = this.b;
            if (runnable != null) {
                r().removeCallbacks(runnable);
                this.b = null;
            }
            if (str != null) {
                g = C8691duz.g(str);
                if (!g) {
                    e().showImage(new ShowImageRequest().a(str).a(true).d(true).c(ShowImageRequest.Priority.a));
                    this.b = new Runnable() { // from class: o.dbL
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC7951dbG.d.a(str2, this);
                        }
                    };
                    r().postDelayed(this.b, 2000L);
                    return;
                }
            }
            NetflixImageView e2 = e();
            ST c = c();
            c.d(str2);
            e2.setImageDrawable(c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(String str, d dVar) {
            C8632dsu.c((Object) dVar, "");
            if (str != null && dVar.e().getDrawable() == null) {
                NetflixImageView e2 = dVar.e();
                ST c = dVar.c();
                c.d(str);
                e2.setImageDrawable(c);
            }
            dVar.b = null;
        }
    }
}
