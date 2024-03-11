package o;

import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C5503bzw;

/* renamed from: o.bzz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5506bzz extends AbstractC3336ax<a> {
    private String c;
    private String d;

    @Override // o.AbstractC3073as
    public int a() {
        return C5503bzw.d.f;
    }

    public final void a_(String str) {
        this.d = str;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final String i() {
        return this.d;
    }

    public final String n() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    public void e(a aVar) {
        boolean g;
        C8632dsu.c((Object) aVar, "");
        super.e((AbstractC5506bzz) aVar);
        String str = this.d;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                aVar.e().showImage(new ShowImageRequest().a(this.d).c(ShowImageRequest.Priority.a));
                aVar.c().setText(this.c);
            }
        }
        aVar.e().clearImage();
        aVar.c().setText(this.c);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.e().onViewRecycled();
        super.b((AbstractC5506bzz) aVar);
    }

    /* renamed from: o.bzz$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(a.class, "image", "getImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "text", "getText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ b = bIF.d(this, C5503bzw.c.d, false, 2, null);
        private final dsZ d = bIF.d(this, C5503bzw.c.h, false, 2, null);

        public final NetflixImageView e() {
            return (NetflixImageView) this.b.getValue(this, c[0]);
        }

        public final C1204Sr c() {
            return (C1204Sr) this.d.getValue(this, c[1]);
        }
    }
}
