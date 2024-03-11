package o;

import android.widget.CompoundButton;
import com.netflix.mediaclient.android.lottie.drawables.RemindMeCheckableDrawable;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC3678bGp;
import o.C3670bGh;
import o.C9834xU;

/* renamed from: o.bGp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3678bGp extends AbstractC3336ax<d> {
    private CharSequence b;
    private CharSequence c;
    private boolean d;
    private CompoundButton.OnCheckedChangeListener g;
    private boolean h;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.x;
    }

    public final void a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.g = onCheckedChangeListener;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final void d_(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final CharSequence i() {
        return this.c;
    }

    public final CharSequence k() {
        return this.b;
    }

    public final boolean l() {
        return this.h;
    }

    public final CompoundButton.OnCheckedChangeListener m() {
        return this.g;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        super.e((AbstractC3678bGp) dVar);
        dVar.e().setText(this.b);
        C1206St e = dVar.e();
        CharSequence charSequence = this.c;
        if (charSequence == null) {
            charSequence = this.b;
        }
        e.setContentDescription(charSequence);
        if (dVar.e().getTag(C3670bGh.a.u) == null) {
            C9696vK.a(dVar.e(), dVar.c(), null, null, null, 14, null);
            dVar.e().setTag(C3670bGh.a.u, dVar.c());
        }
        this.d = true;
        dVar.e().setChecked(this.h);
        this.d = false;
        dVar.e().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.bGr
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AbstractC3678bGp.b(AbstractC3678bGp.this, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC3678bGp abstractC3678bGp, CompoundButton compoundButton, boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C8632dsu.c((Object) abstractC3678bGp, "");
        if (abstractC3678bGp.d || (onCheckedChangeListener = abstractC3678bGp.g) == null) {
            return;
        }
        onCheckedChangeListener.onCheckedChanged(compoundButton, z);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        super.b((AbstractC3678bGp) dVar);
        dVar.e().setText((CharSequence) null);
        dVar.e().setCompoundDrawablesRelative(null, null, null, null);
        C1206St e = dVar.e();
        e.setOnClickListener(null);
        e.setClickable(false);
    }

    /* renamed from: o.bGp$d */
    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(d.class, "button", "getButton()Lcom/netflix/mediaclient/android/widget/NetflixToggleButton;", 0))};
        private final InterfaceC8554dpx b;
        private final dsZ e = bIF.d(this, C3670bGh.a.u, false, 2, null);

        public d() {
            InterfaceC8554dpx b;
            b = dpB.b(new drO<RemindMeCheckableDrawable>() { // from class: com.netflix.mediaclient.ui.detailspage.impl.epoxymodels.DpCtaRemindMeButtonModel$Holder$remindMeDrawable$2
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: c */
                public final RemindMeCheckableDrawable invoke() {
                    RemindMeCheckableDrawable remindMeCheckableDrawable = new RemindMeCheckableDrawable();
                    AbstractC3678bGp.d dVar = AbstractC3678bGp.d.this;
                    remindMeCheckableDrawable.setTintColor(dVar.e().getResources().getColor(C9834xU.c.b, dVar.e().getContext().getTheme()));
                    return remindMeCheckableDrawable;
                }
            });
            this.b = b;
        }

        public final C1206St e() {
            return (C1206St) this.e.getValue(this, c[0]);
        }

        public final RemindMeCheckableDrawable c() {
            return (RemindMeCheckableDrawable) this.b.getValue();
        }
    }
}
