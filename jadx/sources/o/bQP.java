package o;

import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3895bOq;

/* loaded from: classes4.dex */
public abstract class bQP extends AbstractC3336ax<e> {
    private String b;
    private CharSequence c;

    public final void B_(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.Q;
    }

    public final void d(String str) {
        this.b = str;
    }

    public final String i() {
        return this.b;
    }

    public final CharSequence n() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.e().setText(this.c);
        eVar.b().showImage(new ShowImageRequest().a(this.b).c(ShowImageRequest.Priority.a).d());
    }

    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(e.class, SignupConstants.Field.PROFILE_NAME, "getProfileName()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "avatar", "getAvatar()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        private final dsZ c = bIF.d(this, C3895bOq.b.V, false, 2, null);
        private final dsZ d = bIF.d(this, C3895bOq.b.c, false, 2, null);

        public final C1204Sr e() {
            return (C1204Sr) this.c.getValue(this, a[0]);
        }

        public final NetflixImageView b() {
            return (NetflixImageView) this.d.getValue(this, a[1]);
        }
    }
}
