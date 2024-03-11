package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment;
import com.netflix.mediaclient.android.sharing.impl.types.ExtrasShareable;
import com.netflix.mediaclient.android.sharing.impl.types.GameSharable;
import com.netflix.mediaclient.android.sharing.impl.types.InteractiveShareable;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable;
import com.netflix.mediaclient.android.sharing.impl.types.WatchVideoShareable;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.UpNextFeedListItem;
import com.netflix.model.leafs.UpNextFeedVideoEvidence;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Qe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1139Qe implements InterfaceC1126Pr {
    private final Activity a;

    @Inject
    public C1139Qe(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.a = activity;
    }

    @Override // o.InterfaceC1126Pr
    public void c(String str, VideoType videoType, String str2, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        a(new ExtrasShareable(new ExtrasShareable.ExtrasFeedItemParcelable(str2, null, str, videoType, true, null, trackingInfoHolder)));
    }

    @Override // o.InterfaceC1126Pr
    public void e(String str, VideoType videoType, String str2, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        a(new GameSharable(new VideoDetailsShareable.VideoDetailsParcelable(str, videoType, str2, null, trackingInfoHolder, null, 40, null)));
    }

    @Override // o.InterfaceC1126Pr
    public void a(UpNextFeedListItem upNextFeedListItem, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) upNextFeedListItem, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC8366diy video = upNextFeedListItem.getVideo();
        if (video != null) {
            if (video.aJ() != null) {
                GameDetails aJ = video.aJ();
                C8632dsu.d(aJ);
                a(aJ, trackingInfoHolder);
                return;
            }
            InterfaceC8366diy aH = video.aH();
            if (aH != null) {
                UpNextFeedVideoEvidence itemEvidence = upNextFeedListItem.getItemEvidence();
                String title = itemEvidence != null ? itemEvidence.getTitle() : null;
                String id = aH.getId();
                C8632dsu.a(id, "");
                VideoType type = aH.getType();
                C8632dsu.a(type, "");
                a(new ExtrasShareable(new ExtrasShareable.ExtrasFeedItemParcelable(title, null, id, type, true, null, trackingInfoHolder)));
            }
        }
    }

    @Override // o.InterfaceC1126Pr
    public void b(InterfaceC5223buh interfaceC5223buh, String str, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) interfaceC5223buh, "");
        String id = interfaceC5223buh.getId();
        C8632dsu.a(id, "");
        VideoType type = interfaceC5223buh.getType();
        C8632dsu.a(type, "");
        String title = interfaceC5223buh.getTitle();
        C8632dsu.a(title, "");
        a(new VideoDetailsShareable(new VideoDetailsShareable.VideoDetailsParcelable(id, type, title, str, trackingInfoHolder, null, 32, null)));
    }

    @Override // o.InterfaceC1126Pr
    public void b(String str, VideoType videoType, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) str2, "");
        a(new VideoDetailsShareable(new VideoDetailsShareable.VideoDetailsParcelable(str, videoType, str2, null, null, null, 56, null)));
    }

    @Override // o.InterfaceC1126Pr
    public void a(InterfaceC5185btw interfaceC5185btw, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) interfaceC5185btw, "");
        String id = interfaceC5185btw.getId();
        C8632dsu.a(id, "");
        VideoType type = interfaceC5185btw.getType();
        C8632dsu.a(type, "");
        String title = interfaceC5185btw.getTitle();
        C8632dsu.a(title, "");
        a(new GameSharable(new VideoDetailsShareable.VideoDetailsParcelable(id, type, title, null, trackingInfoHolder, null, 40, null)));
    }

    @Override // o.InterfaceC1126Pr
    public void e(InterfaceC5198buI interfaceC5198buI, String str) {
        C8632dsu.c((Object) interfaceC5198buI, "");
        C8632dsu.c((Object) str, "");
        String id = interfaceC5198buI.getId();
        C8632dsu.a(id, "");
        VideoType type = interfaceC5198buI.getType();
        C8632dsu.a(type, "");
        String title = interfaceC5198buI.getTitle();
        C8632dsu.a(title, "");
        a(new InteractiveShareable(str, new VideoDetailsShareable.VideoDetailsParcelable(id, type, title, null, null, null, 56, null)));
    }

    @Override // o.InterfaceC1126Pr
    public void e(String str, VideoType videoType, String str2, String str3, int i, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        a(new WatchVideoShareable(str3, i, new VideoDetailsShareable.VideoDetailsParcelable(str, videoType, str2, null, trackingInfoHolder, null, 40, null)));
    }

    @Override // o.InterfaceC1126Pr
    public void e(String str, VideoType videoType, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) str2, "");
        a(new VideoDetailsShareable(new VideoDetailsShareable.VideoDetailsParcelable(str, videoType, str2, null, null, str3, 24, null)));
    }

    @SuppressLint({"CheckResult"})
    private final <T> void a(Shareable<T> shareable) {
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        if (C1882aRt.d.a()) {
            try {
                d();
                ShareSheetFragment shareSheetFragment = new ShareSheetFragment();
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("Shareable", shareable);
                dpR dpr = dpR.c;
                bundle.putBundle("mavericks:arg", bundle2);
                shareSheetFragment.setArguments(bundle);
                Activity activity = this.a;
                C8632dsu.d(activity);
                ((NetflixActivity) activity).showFullScreenDialog(shareSheetFragment);
                return;
            } catch (Throwable th3) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("Error Sharing", th3, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                    return;
                } else {
                    dVar.e().b(c1596aHd, th);
                    return;
                }
            }
        }
        try {
            d();
            PF pf = new PF();
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("Shareable", shareable);
            bundle3.putBoolean("DismissOnSelection", false);
            pf.setArguments(bundle3);
            Activity activity2 = this.a;
            C8632dsu.d(activity2);
            ((NetflixActivity) activity2).showFullScreenDialog(pf);
        } catch (Throwable th4) {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k2 = dqE.k(d2);
            C1596aHd c1596aHd2 = new C1596aHd("Error Sharing", th4, null, true, k2, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    String c2 = errorType2.c();
                    c1596aHd2.a(c2 + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th2 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th2 = new Throwable(c1596aHd2.b());
            } else {
                th2 = c1596aHd2.i;
                if (th2 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar2.a();
            if (a2 != null) {
                a2.e(c1596aHd2, th2);
            } else {
                dVar2.e().b(c1596aHd2, th2);
            }
        }
    }

    private final void d() {
        File file = new File(C1140Qf.d.d(this.a));
        if (file.exists()) {
            Iterator b = C8621dsj.b(file.listFiles());
            while (b.hasNext()) {
                ((File) b.next()).delete();
            }
        }
    }
}
