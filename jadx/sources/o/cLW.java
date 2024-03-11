package o;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import com.netflix.android.widgetry.widget.tabs.BadgeView;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Lazy;
import io.reactivex.Observable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.inject.Inject;
import o.AbstractC3073as;
import o.AbstractC3813bLp;
import o.AbstractC9927zH;
import o.C1026Lt;
import o.C1030Lx;
import o.C5855cKw;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC7303ctf;
import o.dpR;

/* loaded from: classes4.dex */
public final class cLW {
    private static byte e$ss2$226 = 24;
    private static int f = 0;
    private static int i = 1;
    private final Lazy<InterfaceC7303ctf> a;
    private final Activity b;
    private final boolean c;
    private final InterfaceC7249cse d;
    private final C5845cKm e;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WatchState.Simplified.values().length];
            try {
                iArr[WatchState.Simplified.EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WatchState.Simplified.NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(int i2, int i3, int i4) {
        return i2;
    }

    @Inject
    public cLW(Lazy<InterfaceC7303ctf> lazy, Activity activity, C5845cKm c5845cKm, InterfaceC7249cse interfaceC7249cse, boolean z) {
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) c5845cKm, "");
        C8632dsu.c((Object) interfaceC7249cse, "");
        this.a = lazy;
        this.b = activity;
        this.e = c5845cKm;
        this.d = interfaceC7249cse;
        this.c = z;
    }

    public final void c(InterfaceC5198buI interfaceC5198buI, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) interfaceC5198buI, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        if (interfaceC5198buI.getType() == VideoType.SHOW) {
            Activity activity = this.b;
            Activity activity2 = this.b;
            String id = interfaceC5198buI.getId();
            C8632dsu.a(id, "");
            String c = C8126deW.c();
            C8632dsu.a(c, "");
            activity.startActivity(this.a.get().a(activity2, id, c));
        } else if (interfaceC5198buI.aE_().aH_() != null) {
            Activity activity3 = this.b;
            String aH_ = interfaceC5198buI.aE_().aH_();
            C8632dsu.d((Object) aH_);
            VideoType type = interfaceC5198buI.getType();
            C8632dsu.a(type, "");
            this.a.get().e(activity3, aH_, type, TrackingInfoHolder.b(trackingInfoHolder, PlayLocationType.DOWNLOADS, false, 2, null));
        } else {
            InterfaceC3643bFl.c.a(this.b).d(this.b, interfaceC5198buI, trackingInfoHolder, "downloads");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cLW clw, C3763bJt c3763bJt, C2077aZ c2077aZ, int i2) {
        C8632dsu.c((Object) clw, "");
        C8632dsu.d(c2077aZ);
        clw.a(c2077aZ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(cLW clw, View view) {
        C8632dsu.c((Object) clw, "");
        clw.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3814bLq c3814bLq, AbstractC3813bLp.c cVar, int i2) {
        LD.e(cVar.b(), Token.Typography.aw.d, null, 2, null);
    }

    private final void b() {
        this.d.d();
        this.b.startActivity(this.a.get().e(this.b));
    }

    public final void e(InterfaceC2023aX interfaceC2023aX, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        final String b = b(interfaceC5222bug);
        final int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(C9834xU.a.aa);
        C3814bLq c3814bLq = new C3814bLq();
        String id = interfaceC5222bug.getVideo().getId();
        c3814bLq.b((CharSequence) ("download-info-text" + id));
        c3814bLq.d(C5855cKw.c.a);
        c3814bLq.d((CharSequence) (b == null ? a(interfaceC5222bug) : b));
        c3814bLq.d(new InterfaceC4467bf() { // from class: o.cMe
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i2) {
                cLW.a(dimensionPixelSize, b, this, (C3814bLq) abstractC3073as, (AbstractC3813bLp.c) obj, i2);
            }
        });
        if (b != null && this.c) {
            c3814bLq.a(new View.OnClickListener() { // from class: o.cMf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cLW.b(cLW.this, view);
                }
            });
        }
        interfaceC2023aX.add(c3814bLq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(int i2, String str, cLW clw, C3814bLq c3814bLq, AbstractC3813bLp.c cVar, int i3) {
        C8632dsu.c((Object) clw, "");
        ViewParent parent = cVar.r().getParent();
        C8632dsu.d(parent);
        C9702vQ.d((View) parent, 0, true, false, 5, null);
        C1204Sr b = cVar.b();
        LD.e(b, Token.Typography.C0681aa.e, null, 2, null);
        b.setPaddingRelative(i2, b.getPaddingTop(), i2, b.getPaddingBottom());
        if (str != null) {
            b.setTextColor(ContextCompat.getColor(clw.b, C1030Lx.d.f));
            b.setCompoundDrawablesWithIntrinsicBounds(C1026Lt.a.gW, 0, 0, 0);
            b.getCompoundDrawables()[0].setTint(cVar.b().getCurrentTextColor());
            b.setCompoundDrawablePadding(clw.b.getResources().getDimensionPixelSize(C9834xU.a.m));
            return;
        }
        b.setTextColor(ContextCompat.getColor(clw.b, C1030Lx.d.f13374o));
        b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(cLW clw, View view) {
        C8632dsu.c((Object) clw, "");
        InterfaceC7303ctf interfaceC7303ctf = clw.a.get();
        C8632dsu.a(interfaceC7303ctf, "");
        InterfaceC7303ctf.e.d(interfaceC7303ctf, clw.b, SignupConstants.Field.VIDEO_TITLE, "Expired or Not Available", null, VideoType.MOVIE, 8, null);
    }

    private final void a(C2077aZ c2077aZ) {
        final BadgeView badgeView = (BadgeView) c2077aZ.b().findViewById(C5855cKw.d.d);
        Observable<AbstractC9927zH> b = this.e.b(this.b);
        Activity activity = this.b;
        C8632dsu.d(activity);
        AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a((ComponentActivity) activity, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a2, "");
        Object as = b.as(AutoDispose.b(a2));
        C8632dsu.b(as, "");
        C9725vn.a((ObservableSubscribeProxy) as, null, null, new drM<AbstractC9927zH, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixDownloadsRowManager$observeBadging$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC9927zH abstractC9927zH) {
                b(abstractC9927zH);
                return dpR.c;
            }

            public final void b(AbstractC9927zH abstractC9927zH) {
                Activity activity2;
                Activity activity3;
                C8632dsu.c((Object) abstractC9927zH, "");
                AbstractC9927zH.a aVar = AbstractC9927zH.a.d;
                if (C8632dsu.c(abstractC9927zH, aVar)) {
                    BadgeView badgeView2 = BadgeView.this;
                    C8632dsu.a(badgeView2, "");
                    badgeView2.setVisibility(8);
                } else {
                    BadgeView badgeView3 = BadgeView.this;
                    C8632dsu.a(badgeView3, "");
                    badgeView3.setVisibility(0);
                    BadgeView badgeView4 = BadgeView.this;
                    activity2 = this.b;
                    badgeView4.setBackgroundColor(ContextCompat.getColor(activity2, R.c.u));
                    BadgeView badgeView5 = BadgeView.this;
                    activity3 = this.b;
                    badgeView5.setBackgroundShadowColor(ContextCompat.getColor(activity3, C9834xU.c.F));
                }
                if (abstractC9927zH instanceof AbstractC9927zH.b) {
                    BadgeView.this.setDisplayType(BadgeView.DisplayType.DRAWABLE);
                    BadgeView.this.setDrawable(((AbstractC9927zH.b) abstractC9927zH).e());
                } else if (C8632dsu.c(abstractC9927zH, aVar)) {
                } else {
                    if (abstractC9927zH instanceof AbstractC9927zH.d) {
                        BadgeView.this.setDisplayType(BadgeView.DisplayType.PROGRESS);
                        BadgeView.this.setProgress(((AbstractC9927zH.d) abstractC9927zH).d());
                    } else if (abstractC9927zH instanceof AbstractC9927zH.c) {
                        BadgeView.this.setDisplayType(BadgeView.DisplayType.TEXT);
                        BadgeView.this.setText(((AbstractC9927zH.c) abstractC9927zH).a());
                    }
                }
            }
        }, 3, null);
    }

    private final String a(InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug) {
        C1333Xq d;
        C8632dsu.d(interfaceC5222bug);
        OfflineAdapterData c = ((C7461cwe) interfaceC5222bug).c();
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        C8632dsu.d(video);
        C7460cwd c7460cwd = (C7460cwd) video;
        String k = c7460cwd.k();
        if (c.a().b == OfflineAdapterData.ViewType.SHOW) {
            if (k == null) {
                d = C1333Xq.d(com.netflix.mediaclient.ui.R.o.fh);
            } else {
                d = C1333Xq.d(com.netflix.mediaclient.ui.R.o.fg).d("certification", k);
            }
            C7460cwd[] b = c.b();
            C8632dsu.a(b, "");
            ArrayList<C7460cwd> arrayList = new ArrayList();
            for (C7460cwd c7460cwd2 : b) {
                if (c7460cwd2.getType() == VideoType.EPISODE) {
                    arrayList.add(c7460cwd2);
                }
            }
            ArrayList<InterfaceC5206buQ> arrayList2 = new ArrayList();
            for (C7460cwd c7460cwd3 : arrayList) {
                InterfaceC5206buQ c2 = this.a.get().a().c(c7460cwd3.aE_().aH_());
                if (c2 != null) {
                    arrayList2.add(c2);
                }
            }
            long j = 0;
            for (InterfaceC5206buQ interfaceC5206buQ : arrayList2) {
                j += interfaceC5206buQ.aP_();
            }
            return d.d("episodes", C1333Xq.d(com.netflix.mediaclient.ui.R.o.fe).a(arrayList2.size()).c()).d("download_size", C8176dfT.d(this.b, j)).c();
        } else if (c.a().b == OfflineAdapterData.ViewType.MOVIE) {
            InterfaceC5206buQ c3 = this.a.get().a().c(c7460cwd.aE_().aH_());
            Long valueOf = c3 != null ? Long.valueOf(c3.h()) : null;
            if (valueOf == null) {
                return "";
            }
            if (TextUtils.isEmpty(k)) {
                return C8176dfT.d(this.b, valueOf.longValue());
            }
            return C8168dfL.a(com.netflix.mediaclient.ui.R.o.fl, k, C8310dhv.d(C8176dfT.d(this.b, valueOf.longValue())));
        } else {
            return "";
        }
    }

    public final void a(InterfaceC2023aX interfaceC2023aX, String str) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) str, "");
        C3763bJt c3763bJt = new C3763bJt();
        c3763bJt.b((CharSequence) "my-downloads-row");
        c3763bJt.c(C5855cKw.c.c);
        c3763bJt.e(new AbstractC3073as.b() { // from class: o.cLY
            @Override // o.AbstractC3073as.b
            public final int b(int i2, int i3, int i4) {
                int b;
                b = cLW.b(i2, i3, i4);
                return b;
            }
        });
        c3763bJt.c(new InterfaceC4467bf() { // from class: o.cLX
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i2) {
                cLW.d(cLW.this, (C3763bJt) abstractC3073as, (C2077aZ) obj, i2);
            }
        });
        c3763bJt.b(new View.OnClickListener() { // from class: o.cMd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cLW.c(cLW.this, view);
            }
        });
        bJX bjx = new bJX();
        bjx.b((CharSequence) "my-downloads-row-icon");
        bjx.a(Integer.valueOf(HawkinsIcon.cQ.e.i()));
        bjx.c(Integer.valueOf(C1030Lx.d.f13374o));
        c3763bJt.add(bjx);
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) "my-downloads-row-text");
        c3814bLq.d(C5855cKw.c.f);
        c3814bLq.d((CharSequence) str);
        c3814bLq.d(new InterfaceC4467bf() { // from class: o.cMb
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i2) {
                cLW.d((C3814bLq) abstractC3073as, (AbstractC3813bLp.c) obj, i2);
            }
        });
        c3763bJt.add(c3814bLq);
        bJX bjx2 = new bJX();
        bjx2.b((CharSequence) "my-downloads-row-arrow-icon");
        bjx2.a(Integer.valueOf(HawkinsIcon.aR.d.i()));
        bjx2.c(Integer.valueOf(C1030Lx.d.f13374o));
        c3763bJt.add(bjx2);
        interfaceC2023aX.add(c3763bJt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
        if (r13 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        r13 = o.cLW.f + 29;
        o.cLW.i = r13 % 128;
        r13 = r13 % 2;
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
        r13 = o.cLW.a.a[r13.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r13 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String b(o.InterfaceC5222bug<? extends o.InterfaceC5223buh> r13) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cLW.b(o.bug):java.lang.String");
    }

    private void g(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$226);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
