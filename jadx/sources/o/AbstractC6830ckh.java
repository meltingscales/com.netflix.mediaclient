package o;

import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6832ckj;

/* renamed from: o.ckh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6830ckh extends AbstractC3336ax<a> {
    private String b;
    private String c;
    private String d;

    public final void T_(String str) {
        this.c = str;
    }

    public final void U_(String str) {
        this.d = str;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C6832ckj.b.c;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final String i() {
        return this.b;
    }

    public final String k() {
        return this.d;
    }

    public final String n() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(a aVar) {
        boolean g;
        C8632dsu.c((Object) aVar, "");
        super.e((AbstractC6830ckh) aVar);
        String str = this.b;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                aVar.a().showImage(new ShowImageRequest().a(this.b).c(ShowImageRequest.Priority.a));
                aVar.d().setText(this.c);
                aVar.e().setText(this.d);
            }
        }
        aVar.a().clearImage();
        aVar.a().setVisibility(8);
        aVar.d().setText(this.c);
        aVar.e().setText(this.d);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.a().onViewRecycled();
        super.b((AbstractC6830ckh) aVar);
    }

    /* renamed from: o.ckh$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(a.class, "image", "getImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "label", "getLabel()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, SignupConstants.Field.PROFILE_NAME, "getProfileName()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ d = bIF.d(this, C6832ckj.e.b, false, 2, null);
        private final dsZ b = bIF.d(this, C6832ckj.e.a, false, 2, null);
        private final dsZ e = bIF.d(this, C6832ckj.e.d, false, 2, null);

        public final NetflixImageView a() {
            return (NetflixImageView) this.d.getValue(this, a[0]);
        }

        public final C1204Sr d() {
            return (C1204Sr) this.b.getValue(this, a[1]);
        }

        public final C1204Sr e() {
            return (C1204Sr) this.e.getValue(this, a[2]);
        }
    }
}
