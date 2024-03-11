package o;

import android.view.View;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C7373cuw;

/* renamed from: o.cvF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7383cvF extends AbstractC3336ax<a> {
    private float b;
    private boolean f;
    private c h;
    private CharSequence i;
    private String j;
    private boolean d = true;
    private boolean c = true;

    /* renamed from: o.cvF$c */
    /* loaded from: classes4.dex */
    public interface c {
        void a(float f, float f2);
    }

    public final void A_(boolean z) {
        this.d = z;
    }

    public final void B_(boolean z) {
        this.f = z;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C7373cuw.b.b;
    }

    public final void a_(float f) {
        this.b = f;
    }

    public final void ab_(String str) {
        this.j = str;
    }

    public final void b(boolean z) {
        this.c = z;
    }

    public final void c(c cVar) {
        this.h = cVar;
    }

    public final void e(CharSequence charSequence) {
        this.i = charSequence;
    }

    public final boolean i() {
        return this.c;
    }

    public final c k() {
        return this.h;
    }

    public final float l() {
        return this.b;
    }

    public final boolean m() {
        return this.f;
    }

    public final CharSequence n() {
        return this.i;
    }

    public final boolean o() {
        return this.d;
    }

    public final String q() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // o.AbstractC3336ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(final o.AbstractC7383cvF.a r18) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC7383cvF.e(o.cvF$a):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC7383cvF abstractC7383cvF, a aVar, View view) {
        C8632dsu.c((Object) abstractC7383cvF, "");
        C8632dsu.c((Object) aVar, "");
        abstractC7383cvF.e(Math.min(abstractC7383cvF.b + 0.5f, 9.5f), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AbstractC7383cvF abstractC7383cvF, a aVar, View view) {
        C8632dsu.c((Object) abstractC7383cvF, "");
        C8632dsu.c((Object) aVar, "");
        abstractC7383cvF.e(Math.max(abstractC7383cvF.b - 0.5f, 0.0f), aVar);
    }

    private final void e(float f, a aVar) {
        float f2 = this.b;
        c cVar = this.h;
        if (cVar != null) {
            cVar.a(f2, f);
        }
    }

    private final void c(a aVar) {
        if (this.b <= 0.0f) {
            aVar.g().setEnabled(false);
            aVar.g().setAlpha(0.2f);
        } else {
            aVar.g().setEnabled(true);
            aVar.g().setAlpha(1.0f);
        }
        if (this.b >= 9.5f || !this.c) {
            aVar.h().setEnabled(false);
            aVar.h().setAlpha(0.2f);
            return;
        }
        aVar.h().setEnabled(true);
        aVar.h().setAlpha(1.0f);
    }

    /* renamed from: o.cvF$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(a.class, "name", "getName()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "avatar", "getAvatar()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "storagePlus", "getStoragePlus()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "storageMinus", "getStorageMinus()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "storageAmount", "getStorageAmount()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "divider", "getDivider()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(a.class, "overlay", "getOverlay()Landroid/view/View;", 0))};
        public static final int c = 8;
        private final dsZ b = bIF.d(this, C7373cuw.c.E, false, 2, null);
        private final dsZ e = bIF.d(this, C7373cuw.c.I, false, 2, null);
        private final dsZ j = bIF.d(this, C7373cuw.c.H, false, 2, null);
        private final dsZ f = bIF.d(this, C7373cuw.c.v, false, 2, null);
        private final dsZ g = bIF.d(this, C7373cuw.c.b, false, 2, null);
        private final dsZ d = bIF.d(this, C7373cuw.c.l, false, 2, null);
        private final dsZ h = bIF.d(this, C7373cuw.c.z, false, 2, null);

        public final C1204Sr b() {
            return (C1204Sr) this.b.getValue(this, a[0]);
        }

        public final NetflixImageView e() {
            return (NetflixImageView) this.e.getValue(this, a[1]);
        }

        public final NetflixImageView h() {
            return (NetflixImageView) this.j.getValue(this, a[2]);
        }

        public final NetflixImageView g() {
            return (NetflixImageView) this.f.getValue(this, a[3]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.g.getValue(this, a[4]);
        }

        public final View c() {
            return (View) this.d.getValue(this, a[5]);
        }

        public final View d() {
            return (View) this.h.getValue(this, a[6]);
        }
    }
}
