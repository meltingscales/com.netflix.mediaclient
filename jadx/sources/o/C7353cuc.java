package o;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Base64;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.service.offline.agent.OfflineUnavailableReason;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.DefaultGenreItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C7350cuZ;
import o.C9834xU;

/* renamed from: o.cuc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7353cuc {
    private static int a = 1;
    private static int d = 0;
    private static byte e$ss2$451 = 24;

    public static boolean c(String str) {
        InterfaceC5206buQ c = a().c(str);
        return c != null && c(c);
    }

    public static InterfaceC5206buQ d(String str) {
        return a().c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PlayContext c(InterfaceC5206buQ interfaceC5206buQ, AppView appView) {
        if (interfaceC5206buQ != null) {
            int d2 = d(interfaceC5206buQ);
            PlayLocationType playLocationType = PlayLocationType.DOWNLOADS;
            return C7338cuN.d(new TrackingInfoHolder(playLocationType), interfaceC5206buQ, null, Integer.valueOf(d2)).d(playLocationType, false);
        }
        InterfaceC1598aHf.a("offlinePlayableViewData should not be null");
        return new PlayContextImp("req_offline_playable" + System.currentTimeMillis(), PlayContextImp.k, 0, 0, PlayLocationType.DOWNLOADS, null, null, null, null, null);
    }

    public static int d(InterfaceC5206buQ interfaceC5206buQ) {
        int l = interfaceC5206buQ.l();
        if (interfaceC5206buQ.aT_()) {
            return PlayContextImp.l;
        }
        return !C4295bbn.c(l) ? PlayContextImp.k : l;
    }

    public static boolean h(InterfaceC5206buQ interfaceC5206buQ) {
        return interfaceC5206buQ != null && interfaceC5206buQ.au_() == DownloadState.Complete && interfaceC5206buQ.C().c();
    }

    public static boolean e(InterfaceC5206buQ interfaceC5206buQ) {
        return b().c(interfaceC5206buQ, true) && !interfaceC5206buQ.C().c();
    }

    public static boolean a(InterfaceC5206buQ interfaceC5206buQ) {
        return b().c(interfaceC5206buQ, false) && (interfaceC5206buQ.C() == WatchState.WATCHING_ALLOWED || interfaceC5206buQ.C() == WatchState.NOT_WATCHABLE_DUE_TO_NOT_ENOUGH_DATA);
    }

    public static boolean j(InterfaceC5206buQ interfaceC5206buQ) {
        return !b(interfaceC5206buQ) && e() && (i(interfaceC5206buQ) || interfaceC5206buQ.au_() == DownloadState.Creating || (interfaceC5206buQ.au_() == DownloadState.Stopped && !interfaceC5206buQ.aW_()));
    }

    public static String e(Context context) {
        int i = 2 % 2;
        if (e()) {
            String string = context.getString(com.netflix.mediaclient.ui.R.o.jh);
            if (!(!string.startsWith("'!#+"))) {
                Object[] objArr = new Object[1];
                g(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                int i2 = d + 25;
                a = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = d + 31;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                return string;
            }
            throw null;
        }
        String string2 = context.getString(C7350cuZ.a.s);
        if (string2.startsWith("'!#+")) {
            int i5 = d + 107;
            a = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr2 = new Object[1];
            g(string2.substring(4), objArr2);
            return ((String) objArr2[0]).intern();
        }
        return string2;
    }

    public static boolean e() {
        InterfaceC4208baF c = c();
        if (c == null) {
            return false;
        }
        return c.o() && !ConnectivityUtils.m((Context) C1332Xp.b(Context.class));
    }

    public static void c(NetflixActivity netflixActivity) {
        if (netflixActivity == null) {
            return;
        }
        HomeActivity.e(netflixActivity, new DefaultGenreItem("", "downloadable", GenreItem.GenreType.LOLOMO, "Collection:downloadable", null));
    }

    public static void c(Context context, String str, VideoType videoType, PlayContext playContext) {
        boolean z;
        if (context == null) {
            return;
        }
        NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(context, NetflixActivity.class);
        if (netflixActivity == null) {
            C1044Mm.a("offlineUiHelper", "netflixActivity is null");
        } else if (netflixActivity.getServiceManager() == null) {
            C1044Mm.a("offlineUiHelper", "serviceManager is null");
        } else if (NetflixActivity.getOfflineAgentOrNull(netflixActivity) == null) {
            C1044Mm.a("offlineUiHelper", "offlineAgentInterface is null");
        } else {
            C7460cwd e = e(str);
            if (e == null) {
                C1044Mm.a("offlineUiHelper", "videoDetails is null");
                return;
            }
            InterfaceC5160btX aE_ = e.aE_();
            if (aE_ == null) {
                C1044Mm.a("offlineUiHelper", "playable is null");
            } else if (videoType == null) {
                C1044Mm.a("offlineUiHelper", "type is null");
            } else {
                InterfaceC5206buQ c = a().c(str);
                if (c == null) {
                    C1044Mm.a("offlineUiHelper", "offlinePlayableViewData is null");
                    return;
                }
                boolean c2 = c(c);
                if (c2 || !a(c)) {
                    z = false;
                } else {
                    c2 = true;
                    z = true;
                }
                if (!c2) {
                    C1044Mm.a("offlineUiHelper", "download doesn't have enough data");
                    return;
                }
                long aF_ = aE_.aF_();
                C5096bsM a2 = a(C8126deW.b(netflixActivity), str);
                if (a2 != null) {
                    aF_ = a2.c;
                }
                long b = C8175dfS.b(aF_, aE_.av_(), aE_.aJ_());
                if (z) {
                    b = 0;
                }
                aGH.a(netflixActivity).d(e.aE_(), e.getType(), playContext, new PlayerExtras(b), PlaybackLauncher.c);
            }
        }
    }

    public static void c(Context context, boolean z) {
        C8157dfA.d(context, "prefs_offline_snackbar_user_swiped", z);
    }

    public static boolean c(Context context) {
        return C8157dfA.b(context, "prefs_offline_snackbar_user_swiped", false);
    }

    public static void d(Context context) {
        int a2 = a(context) + 1;
        C1044Mm.c("offlineUiHelper", "incrementSnackBarDownloadCompleteCount count=%d", Integer.valueOf(a2));
        C8157dfA.a(context, "prefs_offline_snackbar_dl_complete_count", a2);
    }

    public static void b(Context context) {
        C1044Mm.a("offlineUiHelper", "resetSnackBarDownloadCompleteCount count=0");
        C8157dfA.a(context, "prefs_offline_snackbar_dl_complete_count", 0);
    }

    public static int a(Context context) {
        return C8157dfA.d(context, "prefs_offline_snackbar_dl_complete_count", 0);
    }

    public static boolean b(InterfaceC5206buQ interfaceC5206buQ) {
        return interfaceC5206buQ.aA_().f() || (interfaceC5206buQ.au_() == DownloadState.Stopped && interfaceC5206buQ.aM_().a());
    }

    public static boolean a(Status status, DownloadState downloadState, StopReason stopReason) {
        return status.f() || (downloadState == DownloadState.Stopped && stopReason.a());
    }

    private static boolean i(InterfaceC5206buQ interfaceC5206buQ) {
        return interfaceC5206buQ.au_() == DownloadState.Stopped && (interfaceC5206buQ.aM_() == StopReason.NotAllowedOnCurrentNetwork || interfaceC5206buQ.aM_() == StopReason.NoNetworkConnectivity);
    }

    public static C5096bsM a(String str, String str2) {
        return ((BookmarkStore) C1332Xp.b(BookmarkStore.class)).getBookmark(str, str2);
    }

    public static void d(String str, C5096bsM c5096bsM) {
        ((BookmarkStore) C1332Xp.b(BookmarkStore.class)).setBookmark(str, c5096bsM);
    }

    public static InterfaceC7281ctJ a() {
        return b().d();
    }

    private static C7359cui b() {
        return (C7359cui) NetflixApplication.getInstance().u();
    }

    public static int d(NetflixActivity netflixActivity, long j) {
        C7359cui b;
        InterfaceC7281ctJ d2;
        InterfaceC7464cwh b2;
        if (netflixActivity == null) {
            return 0;
        }
        InterfaceC5283bvo a2 = C8126deW.a(netflixActivity);
        InterfaceC4208baF c = c();
        if (a2 == null || c == null || (d2 = (b = b()).d()) == null) {
            return 0;
        }
        boolean isKidsProfile = a2.isKidsProfile();
        int i = 0;
        for (int i2 = 0; i2 < d2.c(); i2++) {
            OfflineAdapterData c2 = d2.c(i2);
            List<C7460cwd> arrayList = new ArrayList();
            if (c2.b() != null) {
                arrayList = Arrays.asList(c2.b());
            } else if (c2.a() != null && c2.a().a != null) {
                arrayList = Arrays.asList(c2.a().a);
            }
            for (C7460cwd c7460cwd : arrayList) {
                if (c7460cwd.V() == VideoType.EPISODE.getKey() || c7460cwd.V() == VideoType.MOVIE.getKey()) {
                    InterfaceC5206buQ c3 = d2.c(c7460cwd.getId());
                    if (c3 != null && e(c3) && (!isKidsProfile || (b2 = b.b(c3.u())) == null || b2.b())) {
                        C5096bsM a3 = a(a2.getProfileGuid(), c3.aH_());
                        if (a3 == null || a3.c <= 0) {
                            if (c3.A() >= j) {
                                i++;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    public static InterfaceC4208baF c() {
        return AbstractApplicationC1040Mh.getInstance().i().l();
    }

    public static boolean c(InterfaceC5206buQ interfaceC5206buQ) {
        return b().c(interfaceC5206buQ, true);
    }

    public static C7460cwd e(String str) {
        return a().e(str);
    }

    public static List<C7460cwd> b(String str) {
        return b().e(str);
    }

    public static boolean c(C7460cwd c7460cwd) {
        return (c7460cwd == null || c7460cwd.au_() != DownloadState.Stopped || c7460cwd.aD_() <= 0 || c7460cwd.aM_() == null || c7460cwd.aM_().a()) ? false : true;
    }

    public static void e(final NetflixActivity netflixActivity) {
        if (C8054ddD.l(netflixActivity)) {
            return;
        }
        new AlertDialog.Builder(netflixActivity, C9834xU.o.c).setMessage(netflixActivity.getString(com.netflix.mediaclient.ui.R.o.jm, OfflineUnavailableReason.NA_OFFLINE_STORAGE_NOT_AVAILABLE.d())).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.cuj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C7353cuc.a(NetflixActivity.this, dialogInterface, i);
            }
        }).setNegativeButton(com.netflix.mediaclient.ui.R.o.cL, new DialogInterface.OnClickListener() { // from class: o.cuk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(NetflixActivity netflixActivity, DialogInterface dialogInterface, int i) {
        if (C8054ddD.l(netflixActivity)) {
            return;
        }
        c(2, netflixActivity);
        dialogInterface.dismiss();
    }

    public static void c(int i, NetflixActivity netflixActivity) {
        if (ContextCompat.checkSelfPermission(netflixActivity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            C1044Mm.a("offlineUiHelper", "requestExternalStoragePermission requesting permission.");
            ActivityCompat.requestPermissions(netflixActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, i);
            return;
        }
        C1044Mm.a("offlineUiHelper", "requestExternalStoragePermission already have permission.");
    }

    public static void b(NetflixActivity netflixActivity, int i, String[] strArr, int[] iArr) {
        if (i != 2) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            C1044Mm.a("offlineUiHelper", "permission is granted");
            AbstractApplicationC1040Mh.getInstance().d(netflixActivity, "storage permission");
        } else if (iArr.length <= 0 || iArr[0] != -1) {
        } else {
            C1044Mm.a("offlineUiHelper", "onRequestPermissionsResult denied");
        }
    }

    public static boolean a(NetflixActivity netflixActivity) {
        InterfaceC4208baF l = AbstractApplicationC1040Mh.getInstance().i().l();
        if (l == null || !l.s()) {
            return d(netflixActivity);
        }
        return true;
    }

    private static boolean d(NetflixActivity netflixActivity) {
        InterfaceC4208baF l = AbstractApplicationC1040Mh.getInstance().i().l();
        if (l == null || !l.s()) {
            return C4337bcc.a(netflixActivity);
        }
        return true;
    }

    public static CreateRequest b(String str, VideoType videoType, PlayContext playContext, boolean z) {
        if (z) {
            return new CreateRequest(str, videoType, playContext, "", CreateRequest.DownloadRequestType.Scheduled);
        }
        return new CreateRequest(str, videoType, playContext);
    }

    public static InterfaceC5283bvo a(NetflixActivity netflixActivity, String str) {
        List<? extends InterfaceC5283bvo> b;
        C7460cwd e;
        InterfaceC5206buQ d2 = d(str);
        if (c(d2)) {
            C7460cwd e2 = e(str);
            UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
            InterfaceC5283bvo j = k == null ? null : k.j();
            if (j == null) {
                InterfaceC1598aHf.a("current profile was null during offline playback launch");
            } else if (e2 == null) {
                InterfaceC1598aHf.a("videoDetails was null during offline playback launch");
            } else {
                String u = d2.u();
                if (C8126deW.c().equals(u)) {
                    return null;
                }
                int E = e2.E();
                if (E == 0 && e2.getType() == VideoType.EPISODE && (e = e(e2.aE_().aO_())) != null) {
                    E = e.E();
                }
                if ((E <= 0 || E > j.getMaturityValue()) && (b = k.b()) != null) {
                    for (InterfaceC5283bvo interfaceC5283bvo : b) {
                        if (interfaceC5283bvo.isProfileLocked() && interfaceC5283bvo.getProfileGuid().equals(u)) {
                            return interfaceC5283bvo;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static CharSequence a(Context context, InterfaceC5206buQ interfaceC5206buQ) {
        return C8258dgw.b().e(context, interfaceC5206buQ.au_(), interfaceC5206buQ.C(), interfaceC5206buQ.ax_(), interfaceC5206buQ.aM_(), interfaceC5206buQ.aD_());
    }

    public static void f(InterfaceC5206buQ interfaceC5206buQ) {
        d(C8126deW.a(AbstractApplicationC1040Mh.getInstance().i().k()), C5096bsM.b(interfaceC5206buQ.aH_(), 0L));
    }

    private static void g(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$451);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
