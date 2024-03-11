package o;

import android.content.Context;
import android.view.View;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC7953dbI;
import o.C3796bKz;
import o.C7939dav;
import o.C8632dsu;
import o.ST;

/* renamed from: o.dbI  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7953dbI extends AbstractC3336ax<c> {
    private String b;
    private View.OnClickListener c;
    private String d;

    @Override // o.AbstractC3073as
    public int a() {
        return C7939dav.a.aa;
    }

    public final void am_(String str) {
        this.d = str;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final void e(String str) {
        this.b = str;
    }

    public final View.OnClickListener i() {
        return this.c;
    }

    public final String m() {
        return this.b;
    }

    public final String o() {
        return this.d;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.b(this.d, this.b);
        C7968dbX d = cVar.d();
        View.OnClickListener onClickListener = this.c;
        d.setOnClickListener(onClickListener);
        d.setClickable(onClickListener != null);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.d().onViewRecycled();
        C7968dbX d = cVar.d();
        d.setOnClickListener(null);
        d.setClickable(false);
    }

    /* renamed from: o.dbI$c */
    /* loaded from: classes5.dex */
    public static final class c extends bIG {
        private final dsZ a;
        private Runnable b;
        private final InterfaceC8554dpx e;
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(c.class, "imageView", "getImageView()Lcom/netflix/mediaclient/ui/upnextfeed/impl/widget/TitleTreatmentImageView;", 0))};
        public static final a c = new a(null);

        public c() {
            InterfaceC8554dpx b;
            b = dpB.b(new drO<ST>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.TitleTreatmentV2Model$Holder$titleDrawable$2
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: b */
                public final ST invoke() {
                    Context context = AbstractC7953dbI.c.this.d().getContext();
                    C8632dsu.a(context, "");
                    ST st = new ST(context);
                    AbstractC7953dbI.c cVar = AbstractC7953dbI.c.this;
                    st.d(true);
                    st.d(cVar.r().getResources().getInteger(C3796bKz.c.d));
                    st.b(BrowseExperience.a(cVar.r().getContext(), R.a.e));
                    st.e(cVar.r().getResources().getDimensionPixelSize(C3796bKz.d.b));
                    return st;
                }
            });
            this.e = b;
            this.a = bIF.d(this, C7939dav.d.E, false, 2, null);
        }

        /* renamed from: o.dbI$c$a */
        /* loaded from: classes5.dex */
        public static final class a {
            public /* synthetic */ a(C8627dsp c8627dsp) {
                this();
            }

            private a() {
            }
        }

        private final ST c() {
            return (ST) this.e.getValue();
        }

        public final C7968dbX d() {
            return (C7968dbX) this.a.getValue(this, d[0]);
        }

        public final void b(String str, final String str2) {
            boolean g;
            d().setIdealHeightPx(r().getContext().getResources().getDimensionPixelSize(C7939dav.e.c));
            d().setMaxHeightPx(C1875aRm.a.d() ? d().c() : r().getContext().getResources().getDimensionPixelSize(C7939dav.e.e));
            d().showImage((String) null);
            d().setContentDescription(str2);
            Runnable runnable = this.b;
            if (runnable != null) {
                r().removeCallbacks(runnable);
                this.b = null;
            }
            if (str != null) {
                g = C8691duz.g(str);
                if (!g) {
                    d().showImage(new ShowImageRequest().a(str).a(true).d(true).c(ShowImageRequest.Priority.a));
                    this.b = new Runnable() { // from class: o.dbH
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC7953dbI.c.a(str2, this);
                        }
                    };
                    r().postDelayed(this.b, 2000L);
                    return;
                }
            }
            C7968dbX d2 = d();
            ST c2 = c();
            c2.d(str2);
            d2.setImageDrawable(c2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(String str, c cVar) {
            C8632dsu.c((Object) cVar, "");
            if (str != null && cVar.d().getDrawable() == null) {
                C7968dbX d2 = cVar.d();
                ST c2 = cVar.c();
                c2.d(str);
                d2.setImageDrawable(c2);
            }
            cVar.b = null;
        }
    }
}
