package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.android.widget.NetflixTagsTextView;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3895bOq;

/* loaded from: classes4.dex */
public abstract class bOG extends AbstractC3336ax<a> {
    public static final e d = new e(null);
    private String b;
    private String c;
    private List<String> i;
    private String j;

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.A;
    }

    public final void a(String str) {
        this.b = str;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public final void d(List<String> list) {
        this.i = list;
    }

    public final String i() {
        return this.c;
    }

    public final String l() {
        return this.j;
    }

    public final String m() {
        return this.b;
    }

    public final List<String> n() {
        return this.i;
    }

    public final void w_(String str) {
        this.j = str;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("GameTabletAndFoldBillboardContentModel");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // o.AbstractC3336ax
    @android.annotation.SuppressLint({"CheckResult"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.bOG.a r14) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bOG.e(o.bOG$a):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        NetflixImageView e2 = aVar.e();
        e2.setBackground(null);
        e2.setForeground(null);
        e2.onViewRecycled();
    }

    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(a.class, "iconImage", "getIconImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "tags", "getTags()Lcom/netflix/mediaclient/android/widget/NetflixTagsTextView;", 0))};
        private final dsZ d = bIF.d(this, C3895bOq.b.w, false, 2, null);
        private final dsZ b = bIF.d(this, C3895bOq.b.al, false, 2, null);
        private final dsZ a = bIF.d(this, C3895bOq.b.ai, false, 2, null);

        public final NetflixImageView e() {
            return (NetflixImageView) this.d.getValue(this, e[0]);
        }

        public final C1204Sr b() {
            return (C1204Sr) this.b.getValue(this, e[1]);
        }

        public final NetflixTagsTextView c() {
            return (NetflixTagsTextView) this.a.getValue(this, e[2]);
        }
    }
}
