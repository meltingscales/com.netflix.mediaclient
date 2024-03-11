package o;

import android.os.Build;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;

/* loaded from: classes4.dex */
public abstract class bGM extends AbstractC3336ax<e> {
    private String b;
    private Integer c;
    private String d;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.s;
    }

    public final void b(Integer num) {
        this.c = num;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void e(String str) {
        this.d = str;
    }

    public final String i() {
        return this.d;
    }

    public final String k() {
        return this.b;
    }

    public final Integer l() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        super.e((bGM) eVar);
        Integer num = this.c;
        if (num != null) {
            eVar.c().setImageResource(num.intValue());
        }
        String str = this.d;
        if (str != null) {
            eVar.c().setContentDescription(str);
        }
        String str2 = this.b;
        if (str2 == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        eVar.c().setTooltipText(str2);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        super.b((bGM) eVar);
        eVar.c().setImageDrawable(null);
        eVar.c().setContentDescription(null);
        if (Build.VERSION.SDK_INT >= 26) {
            eVar.c().setTooltipText(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(e.class, "badge", "getBadge()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        private final dsZ a = bIF.d(this, C3670bGh.a.g, false, 2, null);

        public final NetflixImageView c() {
            return (NetflixImageView) this.a.getValue(this, c[0]);
        }
    }
}
