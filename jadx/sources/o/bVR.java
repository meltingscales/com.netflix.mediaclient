package o;

import android.content.Context;
import android.util.Base64;
import androidx.lifecycle.ViewModelKt;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.home.impl.lolomo.rows.CollectionCreator$addCollectionPageEvidence$1$4;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.RecommendedTrailer;
import java.nio.charset.StandardCharsets;
import o.AbstractC3073as;
import o.AbstractC5271bvc;
import o.AbstractC6719cic;
import o.AbstractC6729cim;
import o.C1026Lt;
import o.C1030Lx;
import o.C4022bTi;

/* loaded from: classes4.dex */
public final class bVR {
    private static int a = 1;
    private static int e = 0;
    private static byte e$ss2$73 = 24;
    private final Context c;
    private final C9935zP d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i, int i2, int i3) {
        return i;
    }

    public bVR(Context context, C9935zP c9935zP) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c9935zP, "");
        this.c = context;
        this.d = c9935zP;
    }

    public final void e(InterfaceC2023aX interfaceC2023aX, InterfaceC5232buq interfaceC5232buq, TrackingInfoHolder trackingInfoHolder, int i, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
        String str;
        String Y;
        String str2;
        String ab;
        boolean g;
        boolean z;
        int i2 = 2 % 2;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) interfaceC5232buq, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C4082bVo c4082bVo = new C4082bVo();
        c4082bVo.e("collection-page-evidence-" + i);
        c4082bVo.b(C4022bTi.a.u);
        c4082bVo.e(new AbstractC3073as.b() { // from class: o.bVQ
            @Override // o.AbstractC3073as.b
            public final int b(int i3, int i4, int i5) {
                int c;
                c = bVR.c(i3, i4, i5);
                return c;
            }
        });
        RecommendedTrailer ci_ = interfaceC5232buq.ci_();
        String supplementalVideoId = ci_ != null ? ci_.getSupplementalVideoId() : null;
        String T = interfaceC5232buq.T();
        if (ci_ != null) {
            int i3 = e;
            int i4 = i3 + 51;
            a = i4 % 128;
            int i5 = i4 % 2;
            if (supplementalVideoId != null) {
                int i6 = i3 + 103;
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    C8691duz.g(supplementalVideoId);
                    throw null;
                }
                g = C8691duz.g(supplementalVideoId);
                if (!g) {
                    if (miniPlayerVideoGroupViewModel.j() == null) {
                        C8737dwr.c(ViewModelKt.getViewModelScope(miniPlayerVideoGroupViewModel), GF.e.d(this.c), null, new CollectionCreator$addCollectionPageEvidence$1$4(miniPlayerVideoGroupViewModel, null), 2, null);
                    }
                    NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(this.c, NetflixActivity.class);
                    if (!C6692ciB.a.e() || AccessibilityUtils.a(netflixActivity) || C8067ddQ.c()) {
                        z = false;
                    } else {
                        int i7 = a + 17;
                        e = i7 % 128;
                        int i8 = i7 % 2;
                        z = true;
                    }
                    AbstractC5271bvc.b bVar = new AbstractC5271bvc.b(Long.parseLong(supplementalVideoId));
                    miniPlayerVideoGroupViewModel.c(bVar);
                    miniPlayerVideoGroupViewModel.d((Integer) 0);
                    String string = this.c.getString(com.netflix.mediaclient.ui.R.o.K);
                    if (string.startsWith("'!#+")) {
                        Object[] objArr = new Object[1];
                        b(string.substring(4), objArr);
                        string = ((String) objArr[0]).intern();
                    }
                    C8632dsu.a(string, "");
                    C6734cir c6734cir = new C6734cir();
                    c6734cir.b((CharSequence) ("cpe-group-mini-player-" + i));
                    c6734cir.b(supplementalVideoId);
                    c6734cir.d(bVar.d());
                    c6734cir.c(string);
                    c6734cir.h(interfaceC5232buq.getId());
                    c6734cir.b(interfaceC5232buq.getType());
                    c6734cir.c(ci_.getSupplementalVideoRuntime());
                    c6734cir.c(Float.valueOf(1.778f));
                    c6734cir.e(T);
                    c6734cir.a(interfaceC5232buq.getBoxartId());
                    c6734cir.a(AppView.browseTitles);
                    c6734cir.j("browseTitles");
                    c6734cir.d((PlayContext) trackingInfoHolder.d(true));
                    c6734cir.a(false);
                    c6734cir.b(false);
                    c6734cir.i(ci_.getSupplementalVideoType());
                    c6734cir.b(miniPlayerVideoGroupViewModel);
                    c6734cir.e(true);
                    c6734cir.b((InterfaceC6718cib) new C6652chO(null));
                    c6734cir.b(this.d);
                    if (z) {
                        c6734cir.c(new InterfaceC4732bk() { // from class: o.bVO
                            @Override // o.InterfaceC4732bk
                            public final void b(AbstractC3073as abstractC3073as, Object obj, int i9) {
                                bVR.c(bVR.this, (C6734cir) abstractC3073as, (AbstractC6729cim.b) obj, i9);
                            }
                        });
                    }
                    c4082bVo.add(c6734cir);
                    C3814bLq c3814bLq = new C3814bLq();
                    c3814bLq.b((CharSequence) ("cpe-group-title-text-" + i));
                    c3814bLq.d(C4022bTi.a.C);
                    c3814bLq.d((CharSequence) interfaceC5232buq.getTitle());
                    c4082bVo.add(c3814bLq);
                    str = "cpe-group-supplemental-text-" + i;
                    Y = interfaceC5232buq.Y();
                    if (Y != null || Y.length() == 0) {
                        bKU bku = new bKU();
                        bku.d((CharSequence) str);
                        bku.d((Integer) 0);
                        bku.a((Integer) 0);
                        c4082bVo.add(bku);
                    } else {
                        C4082bVo c4082bVo2 = new C4082bVo();
                        c4082bVo2.e((CharSequence) ("cpe-group-supplemental-group-" + i));
                        c4082bVo2.b(C4022bTi.a.x);
                        bJX bjx = new bJX();
                        bjx.b((CharSequence) ("cpe-group-supplemental-icon-" + i));
                        bjx.a(Integer.valueOf(C1026Lt.a.jI));
                        bjx.c(Integer.valueOf(C1030Lx.d.f13374o));
                        c4082bVo2.add(bjx);
                        C3814bLq c3814bLq2 = new C3814bLq();
                        c3814bLq2.b((CharSequence) str);
                        c3814bLq2.d(C4022bTi.a.y);
                        c3814bLq2.d((CharSequence) interfaceC5232buq.Y());
                        c4082bVo2.add(c3814bLq2);
                        c4082bVo.add(c4082bVo2);
                        int i9 = e + 37;
                        a = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    str2 = "cpe-group-synopsis-text-" + i;
                    ab = interfaceC5232buq.ab();
                    if (ab != null || ab.length() == 0) {
                        bKU bku2 = new bKU();
                        bku2.d((CharSequence) str2);
                        bku2.d((Integer) 0);
                        bku2.a((Integer) 0);
                        c4082bVo.add(bku2);
                    } else {
                        C3814bLq c3814bLq3 = new C3814bLq();
                        c3814bLq3.b((CharSequence) str2);
                        c3814bLq3.d(C4022bTi.a.v);
                        c3814bLq3.d((CharSequence) interfaceC5232buq.ab());
                        c4082bVo.add(c3814bLq3);
                    }
                    interfaceC2023aX.add(c4082bVo);
                }
            }
        }
        if (T == null) {
            bKU bku3 = new bKU();
            bku3.d((CharSequence) ("cpe-group-hero-image-" + i));
            bku3.d(8);
            bku3.d((Integer) 0);
            bku3.a((Integer) 0);
            c4082bVo.add(bku3);
        } else {
            C3775bKe c3775bKe = new C3775bKe();
            c3775bKe.c((CharSequence) ("cpe-group-hero-image-" + i));
            c3775bKe.a(T);
            c4082bVo.add(c3775bKe);
        }
        C3814bLq c3814bLq4 = new C3814bLq();
        c3814bLq4.b((CharSequence) ("cpe-group-title-text-" + i));
        c3814bLq4.d(C4022bTi.a.C);
        c3814bLq4.d((CharSequence) interfaceC5232buq.getTitle());
        c4082bVo.add(c3814bLq4);
        str = "cpe-group-supplemental-text-" + i;
        Y = interfaceC5232buq.Y();
        if (Y != null) {
        }
        bKU bku4 = new bKU();
        bku4.d((CharSequence) str);
        bku4.d((Integer) 0);
        bku4.a((Integer) 0);
        c4082bVo.add(bku4);
        str2 = "cpe-group-synopsis-text-" + i;
        ab = interfaceC5232buq.ab();
        if (ab != null) {
        }
        bKU bku22 = new bKU();
        bku22.d((CharSequence) str2);
        bku22.d((Integer) 0);
        bku22.a((Integer) 0);
        c4082bVo.add(bku22);
        interfaceC2023aX.add(c4082bVo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bVR bvr, C6734cir c6734cir, AbstractC6729cim.b bVar, int i) {
        C8632dsu.c((Object) bvr, "");
        if (i == 0) {
            bvr.d.b(AbstractC6719cic.class, new AbstractC6719cic.e.c(0, 0));
        }
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$73);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
