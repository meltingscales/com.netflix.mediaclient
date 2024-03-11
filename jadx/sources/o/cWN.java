package o;

import android.view.View;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.cWG;

/* loaded from: classes5.dex */
public abstract class cWN extends AbstractC3336ax<c> {
    private String b;
    private Integer c;
    private View.OnClickListener d;
    private String h;
    private Integer i;
    private String j;

    @Override // o.AbstractC3073as
    public int a() {
        return cWG.a.b;
    }

    public final void ah_(String str) {
        this.b = str;
    }

    public final void ai_(String str) {
        this.j = str;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void c(Integer num) {
        this.i = num;
    }

    public final void d(Integer num) {
        this.c = num;
    }

    public final String i() {
        return this.b;
    }

    public final View.OnClickListener k() {
        return this.d;
    }

    public final Integer l() {
        return this.c;
    }

    public final String m() {
        return this.j;
    }

    public final Integer n() {
        return this.i;
    }

    public final String o() {
        return this.h;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(c cVar) {
        dpR dpr;
        C8632dsu.c((Object) cVar, "");
        String str = this.j;
        if (str != null && str.length() != 0) {
            cVar.d().setText(this.j);
            cVar.d().setVisibility(0);
        } else {
            cVar.d().setVisibility(8);
        }
        cVar.a().setText(this.b);
        Integer num = this.c;
        if (num != null) {
            cVar.c().setImageResource(num.intValue());
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            cVar.c().setImageDrawable(null);
        }
        NetflixImageView b = cVar.b();
        View.OnClickListener onClickListener = this.d;
        b.setOnClickListener(onClickListener);
        b.setClickable(onClickListener != null);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.b((cWN) cVar);
        NetflixImageView b = cVar.b();
        b.setOnClickListener(null);
        b.setClickable(false);
    }

    /* loaded from: classes5.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(c.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "description", "getDescription()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "icon", "getIcon()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "close", "getClose()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        private final dsZ b = bIF.d(this, cWG.d.e, false, 2, null);
        private final dsZ e = bIF.d(this, cWG.d.c, false, 2, null);
        private final dsZ a = bIF.d(this, cWG.d.a, false, 2, null);
        private final dsZ c = bIF.d(this, cWG.d.b, false, 2, null);

        public final C1204Sr d() {
            return (C1204Sr) this.b.getValue(this, d[0]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.e.getValue(this, d[1]);
        }

        public final NetflixImageView c() {
            return (NetflixImageView) this.a.getValue(this, d[2]);
        }

        public final NetflixImageView b() {
            return (NetflixImageView) this.c.getValue(this, d[3]);
        }
    }
}
