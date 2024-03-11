package o;

import android.view.View;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C7212cru;

/* renamed from: o.crs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7210crs extends AbstractC3336ax<e> {
    private View.OnClickListener b;
    public C7201crj c;

    @Override // o.AbstractC3073as
    public int a() {
        return C7212cru.c.c;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public final View.OnClickListener n() {
        return this.b;
    }

    public final C7201crj i() {
        C7201crj c7201crj = this.c;
        if (c7201crj != null) {
            return c7201crj;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        if (i().f() != null) {
            eVar.d().setText(i().f());
            eVar.d().setVisibility(0);
        } else {
            eVar.d().setVisibility(8);
        }
        eVar.e().setText(i().b());
        eVar.c().setText(i().e().a());
        C1203Sq c = eVar.c();
        View.OnClickListener onClickListener = this.b;
        c.setOnClickListener(onClickListener);
        c.setClickable(onClickListener != null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        super.b((AbstractC7210crs) eVar);
        C1203Sq c = eVar.c();
        c.setOnClickListener(null);
        c.setClickable(false);
    }

    /* renamed from: o.crs$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(e.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "description", "getDescription()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "cta", "getCta()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        private final dsZ d = bIF.d(this, C7212cru.d.i, false, 2, null);
        private final dsZ c = bIF.d(this, C7212cru.d.a, false, 2, null);
        private final dsZ e = bIF.d(this, C7212cru.d.e, false, 2, null);

        public final C1204Sr d() {
            return (C1204Sr) this.d.getValue(this, b[0]);
        }

        public final C1204Sr e() {
            return (C1204Sr) this.c.getValue(this, b[1]);
        }

        public final C1203Sq c() {
            return (C1203Sq) this.e.getValue(this, b[2]);
        }
    }
}
