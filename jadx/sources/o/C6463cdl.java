package o;

import android.content.Context;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.PostPlayItem;
import com.netflix.model.leafs.originals.BillboardCTA;
import o.C9834xU;

/* renamed from: o.cdl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6463cdl {
    public static void c(ServiceManager serviceManager, InterfaceC5223buh interfaceC5223buh, BillboardCTA billboardCTA, InterfaceC5094bsK interfaceC5094bsK) {
        if (C8168dfL.g(billboardCTA.name()) || C8168dfL.g(billboardCTA.videoId())) {
            return;
        }
        String lowerCase = billboardCTA.name().toLowerCase();
        if (lowerCase.contains("trailer") || lowerCase.contains("recap")) {
            serviceManager.j().e(billboardCTA.videoId(), null, false, TaskMode.FROM_CACHE_OR_NETWORK, interfaceC5094bsK, "BBCTAPlay.Trailer", Boolean.FALSE);
        } else if (lowerCase.contains("season")) {
            if (lowerCase.contains("continue")) {
                serviceManager.j().b(interfaceC5223buh.getId(), (String) null, interfaceC5094bsK, "BBCTAPlay.CW");
            } else {
                serviceManager.j().b(billboardCTA.videoId(), TaskMode.FROM_CACHE_OR_NETWORK, 0, 1, interfaceC5094bsK);
            }
        } else if (lowerCase.contains(PostPlayItem.POST_PLAY_ITEM_EPISODE) || lowerCase.contains("show")) {
            serviceManager.j().e(billboardCTA.videoId(), null, false, interfaceC5094bsK, "BBCTAPlay");
        } else if (interfaceC5223buh.getType() == VideoType.MOVIE) {
            serviceManager.j().e(billboardCTA.videoId(), null, false, TaskMode.FROM_CACHE_OR_NETWORK, interfaceC5094bsK, "BBCTAPlay", Boolean.FALSE);
        } else {
            serviceManager.j().b(billboardCTA.videoId(), (String) null, interfaceC5094bsK, "BBCTAPlay");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(Context context, String str, String str2, boolean z, boolean z2) {
        char c;
        if (str == null) {
            str = "play";
        }
        switch (str.hashCode()) {
            case -2121234393:
                if (str.equals("playEpisode")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1644011681:
                if (str.equals("playTrailer")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1642704999:
                if (str.equals("rewatchShow")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1119721862:
                if (str.equals("continueWatching")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -906264498:
                if (str.equals("seeAll")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3443508:
                if (str.equals("play")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 109400031:
                if (str.equals("share")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 450861206:
                if (str.equals("listEpisodes")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1568910135:
                if (str.equals("playSeason")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return context.getResources().getString(com.netflix.mediaclient.ui.R.o.ak, str2);
            case 1:
                if (z) {
                    return context.getResources().getString(com.netflix.mediaclient.ui.R.o.ad);
                }
                return context.getResources().getString(com.netflix.mediaclient.ui.R.o.kj);
            case 2:
                return context.getResources().getString(com.netflix.mediaclient.ui.R.o.af);
            case 3:
                return context.getResources().getString(com.netflix.mediaclient.ui.R.o.ae);
            case 4:
                return context.getResources().getString(com.netflix.mediaclient.ui.R.o.aj);
            case 5:
                return context.getResources().getString(com.netflix.mediaclient.ui.R.o.ag);
            case 6:
                return context.getResources().getString(C9834xU.h.t);
            case 7:
                return context.getResources().getString(com.netflix.mediaclient.ui.R.o.gg);
            default:
                if (!z && z2) {
                    return context.getResources().getString(com.netflix.mediaclient.ui.R.o.kj);
                }
                return context.getResources().getString(com.netflix.mediaclient.ui.R.o.ad);
        }
    }

    public static String d(Context context, String str, String str2) {
        return a(context, str, str2, false, false);
    }
}
