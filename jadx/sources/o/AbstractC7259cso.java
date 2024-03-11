package o;

import android.content.Context;
import android.text.SpannableString;
import android.util.Base64;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import java.nio.charset.StandardCharsets;
import java.util.List;
import o.C1030Lx;
import o.C7373cuw;
import o.C9834xU;

/* renamed from: o.cso  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7259cso extends AbstractC7258csn<b> {
    public static final a c;
    public static final int d;
    private static byte e$ss2$199 = 0;
    private static int l = 1;
    private static int n;
    public List<e> b;
    public String f;
    public String g;
    private View.OnClickListener h;
    private View.OnLongClickListener i;
    private String j;

    static {
        q();
        c = new a(null);
        d = 8;
    }

    static void q() {
        e$ss2$199 = (byte) 24;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.O;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public final void c(String str) {
        this.j = str;
    }

    public final void d(View.OnLongClickListener onLongClickListener) {
        this.i = onLongClickListener;
    }

    public final View.OnClickListener l() {
        return this.h;
    }

    public final String o() {
        return this.j;
    }

    public final View.OnLongClickListener r() {
        return this.i;
    }

    /* renamed from: o.cso$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("DownloadedShowModel");
        }
    }

    public final String t() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    public final String p() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    public final List<e> k() {
        List<e> list = this.b;
        if (list != null) {
            return list;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    @Override // o.AbstractC7258csn, o.AbstractC3336ax
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC7259cso.b r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            o.Sr r1 = r5.h()
            java.lang.CharSequence r2 = r4.n()
            r1.setText(r2)
            o.Sr r1 = r5.b()
            java.lang.String r2 = r4.c(r5)
            r1.setText(r2)
            o.Sr r1 = r5.b()
            android.content.Context r1 = r1.getContext()
            o.C8632dsu.a(r1, r0)
            java.lang.CharSequence r0 = r4.d(r1)
            o.Sr r1 = r5.f()
            r1.setText(r0)
            o.Sr r1 = r5.f()
            boolean r0 = o.C8168dfL.b(r0)
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L40
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            r1.setVisibility(r0)
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r5.c()
            boolean r1 = r4.N()
            if (r1 == 0) goto L52
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            goto L54
        L52:
            r1 = 1065353216(0x3f800000, float:1.0)
        L54:
            o.C9702vQ.a(r0, r1)
            java.lang.String r0 = r4.i()
            if (r0 == 0) goto L70
            boolean r0 = o.C8684dus.a(r0)
            if (r0 == 0) goto L64
            goto L70
        L64:
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r5.c()
            java.lang.String r1 = r4.i()
            r0.showImage(r1)
            goto L7f
        L70:
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r5.c()
            com.netflix.mediaclient.util.gfx.ImageLoader$c r1 = com.netflix.mediaclient.ui.experience.BrowseExperience.b()
            int r1 = r1.b()
            r0.setImageResource(r1)
        L7f:
            android.widget.ImageView r0 = r5.d()
            boolean r1 = r4.K()
            if (r1 == 0) goto L8b
            r1 = r2
            goto L8c
        L8b:
            r1 = r3
        L8c:
            r0.setVisibility(r1)
            android.widget.CheckBox r0 = r5.e()
            boolean r1 = r4.K()
            if (r1 == 0) goto L9a
            r2 = r3
        L9a:
            r0.setVisibility(r2)
            android.widget.CheckBox r0 = r5.e()
            boolean r1 = r4.N()
            r0.setChecked(r1)
            android.widget.CheckBox r0 = r5.e()
            r0.setClickable(r3)
            android.widget.CheckBox r0 = r5.e()
            java.lang.CharSequence r1 = r4.n()
            r0.setContentDescription(r1)
            android.view.View r0 = r5.a()
            android.view.View$OnClickListener r1 = r4.h
            r0.setOnClickListener(r1)
            if (r1 == 0) goto Lc6
            r3 = 1
        Lc6:
            r0.setClickable(r3)
            android.view.View r5 = r5.a()
            android.view.View$OnLongClickListener r0 = r4.i
            r5.setOnLongClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC7259cso.e(o.cso$b):void");
    }

    private final String c(b bVar) {
        C1333Xq d2;
        if (this.j == null) {
            d2 = bVar.j();
        } else {
            d2 = bVar.i().d("certification", this.j);
        }
        String c2 = bVar.g().a(k().size()).c();
        String c3 = d2.d("episodes", c2).d("download_size", C8176dfT.d(bVar.b().getContext(), m())).c();
        C8632dsu.a(c3, "");
        return c3;
    }

    /* renamed from: o.cso$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3179au {
        public CheckBox a;
        public View b;
        public C1204Sr c;
        public ImageView d;
        public NetflixImageView e;
        public C1204Sr f;
        private final C1333Xq g;
        private final C1333Xq h;
        public C1204Sr i;
        private final C1333Xq j;

        public final void a(View view) {
            C8632dsu.c((Object) view, "");
            this.b = view;
        }

        public final void a(C1204Sr c1204Sr) {
            C8632dsu.c((Object) c1204Sr, "");
            this.c = c1204Sr;
        }

        public final void c(CheckBox checkBox) {
            C8632dsu.c((Object) checkBox, "");
            this.a = checkBox;
        }

        public final void d(ImageView imageView) {
            C8632dsu.c((Object) imageView, "");
            this.d = imageView;
        }

        public final void d(NetflixImageView netflixImageView) {
            C8632dsu.c((Object) netflixImageView, "");
            this.e = netflixImageView;
        }

        public final void d(C1204Sr c1204Sr) {
            C8632dsu.c((Object) c1204Sr, "");
            this.f = c1204Sr;
        }

        public final void e(C1204Sr c1204Sr) {
            C8632dsu.c((Object) c1204Sr, "");
            this.i = c1204Sr;
        }

        public final C1333Xq g() {
            return this.g;
        }

        public final C1333Xq i() {
            return this.h;
        }

        public final C1333Xq j() {
            return this.j;
        }

        public b() {
            C1333Xq d = C1333Xq.d(com.netflix.mediaclient.ui.R.o.fe);
            C8632dsu.a(d, "");
            this.g = d;
            C1333Xq d2 = C1333Xq.d(com.netflix.mediaclient.ui.R.o.fh);
            C8632dsu.a(d2, "");
            this.j = d2;
            C1333Xq d3 = C1333Xq.d(com.netflix.mediaclient.ui.R.o.fg);
            C8632dsu.a(d3, "");
            this.h = d3;
        }

        public final View a() {
            View view = this.b;
            if (view != null) {
                return view;
            }
            C8632dsu.d("");
            return null;
        }

        public final C1204Sr h() {
            C1204Sr c1204Sr = this.f;
            if (c1204Sr != null) {
                return c1204Sr;
            }
            C8632dsu.d("");
            return null;
        }

        public final C1204Sr b() {
            C1204Sr c1204Sr = this.c;
            if (c1204Sr != null) {
                return c1204Sr;
            }
            C8632dsu.d("");
            return null;
        }

        public final C1204Sr f() {
            C1204Sr c1204Sr = this.i;
            if (c1204Sr != null) {
                return c1204Sr;
            }
            C8632dsu.d("");
            return null;
        }

        public final NetflixImageView c() {
            NetflixImageView netflixImageView = this.e;
            if (netflixImageView != null) {
                return netflixImageView;
            }
            C8632dsu.d("");
            return null;
        }

        public final CheckBox e() {
            CheckBox checkBox = this.a;
            if (checkBox != null) {
                return checkBox;
            }
            C8632dsu.d("");
            return null;
        }

        public final ImageView d() {
            ImageView imageView = this.d;
            if (imageView != null) {
                return imageView;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.AbstractC3179au
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            a(view);
            View findViewById = view.findViewById(C7373cuw.c.P);
            C8632dsu.a(findViewById, "");
            d((C1204Sr) findViewById);
            View findViewById2 = view.findViewById(com.netflix.mediaclient.ui.R.g.cF);
            C8632dsu.a(findViewById2, "");
            a((C1204Sr) findViewById2);
            View findViewById3 = view.findViewById(com.netflix.mediaclient.ui.R.g.fZ);
            C8632dsu.a(findViewById3, "");
            e((C1204Sr) findViewById3);
            View findViewById4 = view.findViewById(com.netflix.mediaclient.ui.R.g.ac);
            C8632dsu.a(findViewById4, "");
            d((NetflixImageView) findViewById4);
            View findViewById5 = view.findViewById(com.netflix.mediaclient.ui.R.g.as);
            C8632dsu.a(findViewById5, "");
            c((CheckBox) findViewById5);
            View findViewById6 = view.findViewById(com.netflix.mediaclient.ui.R.g.fH);
            C8632dsu.a(findViewById6, "");
            d((ImageView) findViewById6);
        }
    }

    /* renamed from: o.cso$e */
    /* loaded from: classes4.dex */
    public static final class e {
        private final String a;
        private final DownloadState b;
        private final Status c;
        private final int d;
        private final StopReason e;
        private final WatchState i;
        private final long j;

        public final DownloadState b() {
            return this.b;
        }

        public final int d() {
            return this.d;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.c, eVar.c) && this.i == eVar.i && this.b == eVar.b && this.e == eVar.e && this.d == eVar.d && this.j == eVar.j;
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.i.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Long.hashCode(this.j);
        }

        public String toString() {
            String str = this.a;
            Status status = this.c;
            WatchState watchState = this.i;
            DownloadState downloadState = this.b;
            StopReason stopReason = this.e;
            int i = this.d;
            long j = this.j;
            return "EpisodeInfo(playableId=" + str + ", persistentStatus=" + status + ", watchState=" + watchState + ", downloadState=" + downloadState + ", stopReason=" + stopReason + ", progress=" + i + ", totalSize=" + j + ")";
        }

        public e(String str, Status status, WatchState watchState, DownloadState downloadState, StopReason stopReason, int i, long j) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) status, "");
            C8632dsu.c((Object) watchState, "");
            C8632dsu.c((Object) downloadState, "");
            C8632dsu.c((Object) stopReason, "");
            this.a = str;
            this.c = status;
            this.i = watchState;
            this.b = downloadState;
            this.e = stopReason;
            this.d = i;
            this.j = j;
        }

        public final boolean a() {
            DownloadState downloadState;
            return C7353cuc.a(this.c, this.b, this.e) || (downloadState = this.b) == DownloadState.CreateFailed || (downloadState == DownloadState.Complete && this.i.c());
        }
    }

    public final CharSequence d(Context context) {
        int i = 2 % 2;
        C8632dsu.c((Object) context, "");
        for (e eVar : k()) {
            int i2 = n + 123;
            l = i2 % 128;
            int i3 = i2 % 2;
            if (eVar.a()) {
                String string = context.getString(com.netflix.mediaclient.ui.R.o.jf);
                if (string.startsWith("'!#+")) {
                    int i4 = l + 121;
                    n = i4 % 128;
                    int i5 = i4 % 2;
                    Object[] objArr = new Object[1];
                    s(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                }
                SpannableString d2 = C8168dfL.d(context, string, C1030Lx.d.f);
                int i6 = l + 23;
                n = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 16 / 0;
                }
                return d2;
            }
        }
        String e2 = e(context);
        if (e2 != null) {
            return C8168dfL.d(context, e2, C9834xU.c.I);
        }
        int i8 = n + 87;
        l = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    private final String e(Context context) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (e eVar : k()) {
            if (eVar.b() == DownloadState.InProgress) {
                i++;
            } else {
                DownloadState b2 = eVar.b();
                DownloadState downloadState = DownloadState.Stopped;
                if ((b2 == downloadState && eVar.d() == 0) || eVar.b() == DownloadState.Creating || eVar.b() == DownloadState.CreateFailed) {
                    i4++;
                } else if (eVar.b() == downloadState && eVar.d() > 0) {
                    i2++;
                }
            }
            if (eVar.b() != DownloadState.Complete) {
                i3++;
            }
        }
        if (i > 0) {
            return context.getString(com.netflix.mediaclient.ui.R.o.jd, Integer.valueOf(i), Integer.valueOf(i3));
        }
        if (i2 > 0) {
            return C1333Xq.d(com.netflix.mediaclient.ui.R.o.jg).a(i2 + i4).c();
        }
        if (i4 > 0) {
            return context.getString(com.netflix.mediaclient.ui.R.o.jl, Integer.valueOf(i4));
        }
        return null;
    }

    private void s(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$199);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
