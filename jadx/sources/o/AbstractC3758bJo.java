package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;

/* renamed from: o.bJo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3758bJo extends AbstractC3336ax<e> {
    public CharSequence b;
    public CharSequence c;
    private CharSequence d;
    private boolean g = true;
    private CharSequence h;
    private drX<? super View, ? super CharSequence, dpR> i;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.h;
    }

    public final void e(drX<? super View, ? super CharSequence, dpR> drx) {
        this.i = drx;
    }

    public final CharSequence i() {
        return this.d;
    }

    public final CharSequence k() {
        return this.h;
    }

    public final boolean m() {
        return this.g;
    }

    public final drX<View, CharSequence, dpR> o() {
        return this.i;
    }

    public final void u_(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final CharSequence n() {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            return charSequence;
        }
        C8632dsu.d("");
        return null;
    }

    public final CharSequence l() {
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            return charSequence;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        final drX<? super View, ? super CharSequence, dpR> drx = this.i;
        if (drx != null) {
            eVar.a().setOnCopyLinkClicked(new drX<View, CharSequence, dpR>() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.CopyLinkModel$bind$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(View view, CharSequence charSequence) {
                    a(view, charSequence);
                    return dpR.c;
                }

                public final void a(View view, CharSequence charSequence) {
                    C8632dsu.c((Object) view, "");
                    C8632dsu.c((Object) charSequence, "");
                    drx.invoke(view, charSequence);
                }
            });
        }
        eVar.a().setLinkText(n(), this.h);
        eVar.a().setLinkToCopy(l());
        eVar.a().setShowCopiedMessages(this.g);
        C1177Rq a = eVar.a();
        CharSequence charSequence = this.d;
        if (charSequence == null) {
            charSequence = C8168dfL.d(C9834xU.h.h);
        }
        a.setLabel(charSequence);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.a().setOnCopyLinkClicked(null);
    }

    /* renamed from: o.bJo$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        private final dsZ d = bIF.d(this, C3796bKz.a.a, false, 2, null);
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(e.class, "copyLink", "getCopyLink()Lcom/netflix/mediaclient/android/widget/CopyLinkView;", 0))};
        public static final int b = 8;

        public final C1177Rq a() {
            return (C1177Rq) this.d.getValue(this, e[0]);
        }
    }
}
