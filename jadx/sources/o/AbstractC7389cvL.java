package o;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C7373cuw;

/* renamed from: o.cvL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7389cvL extends AbstractC3336ax<b> {
    private boolean b;
    private CompoundButton.OnCheckedChangeListener c;
    private boolean d;
    private CompoundButton.OnCheckedChangeListener f;
    private boolean g;
    private boolean h;

    public final void C_(boolean z) {
        this.b = z;
    }

    public final void D_(boolean z) {
        this.d = z;
    }

    public final void E_(boolean z) {
        this.h = z;
    }

    public final void F_(boolean z) {
        this.g = z;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C7373cuw.b.f;
    }

    public final void a_(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.c = onCheckedChangeListener;
    }

    public final void e(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f = onCheckedChangeListener;
    }

    public final boolean i() {
        return this.b;
    }

    public final CompoundButton.OnCheckedChangeListener k() {
        return this.f;
    }

    public final CompoundButton.OnCheckedChangeListener l() {
        return this.c;
    }

    public final boolean m() {
        return this.h;
    }

    public final boolean n() {
        return this.d;
    }

    public final boolean o() {
        return this.g;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        if (!this.g) {
            bVar.b().setVisibility(8);
            bVar.d().setVisibility(8);
        } else {
            bVar.c().setChecked(this.h);
            bVar.c().setOnCheckedChangeListener(this.f);
        }
        if (!this.b) {
            bVar.a().setVisibility(8);
            return;
        }
        bVar.e().setChecked(this.d);
        bVar.e().setOnCheckedChangeListener(this.c);
        bVar.h().setVisibility(this.d ? 8 : 0);
    }

    /* renamed from: o.cvL$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(b.class, "neTitle", "getNeTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "neContainer", "getNeContainer()Landroid/widget/LinearLayout;", 0)), dsA.c(new PropertyReference1Impl(b.class, "nextEpisodeSwitch", "getNextEpisodeSwitch()Landroidx/appcompat/widget/SwitchCompat;", 0)), dsA.c(new PropertyReference1Impl(b.class, "downloadedForYouSwitch", "getDownloadedForYouSwitch()Landroidx/appcompat/widget/SwitchCompat;", 0)), dsA.c(new PropertyReference1Impl(b.class, "storageContainer", "getStorageContainer()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(b.class, "d4uFullLayout", "getD4uFullLayout()Landroidx/constraintlayout/widget/ConstraintLayout;", 0))};
        public static final int e = 8;
        private final dsZ j = bIF.d(this, C7373cuw.c.C, false, 2, null);
        private final dsZ a = bIF.d(this, C7373cuw.c.D, false, 2, null);
        private final dsZ h = bIF.d(this, C7373cuw.c.A, false, 2, null);
        private final dsZ c = bIF.d(this, C7373cuw.c.j, false, 2, null);
        private final dsZ g = bIF.d(this, C7373cuw.c.i, false, 2, null);
        private final dsZ d = bIF.d(this, C7373cuw.c.g, false, 2, null);

        public final C1204Sr b() {
            return (C1204Sr) this.j.getValue(this, b[0]);
        }

        public final LinearLayout d() {
            return (LinearLayout) this.a.getValue(this, b[1]);
        }

        public final SwitchCompat c() {
            return (SwitchCompat) this.h.getValue(this, b[2]);
        }

        public final SwitchCompat e() {
            return (SwitchCompat) this.c.getValue(this, b[3]);
        }

        public final View h() {
            return (View) this.g.getValue(this, b[4]);
        }

        public final ConstraintLayout a() {
            return (ConstraintLayout) this.d.getValue(this, b[5]);
        }
    }
}
