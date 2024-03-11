package o;

import android.app.Activity;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.discrete.PushNotificationAcknowledged;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.action.ProcessStateTransition;
import com.netflix.cl.util.NamedLogSessionLookup;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.service.pushnotification.PushNotificationTrackingInfo;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.NotificationUtils;
import com.netflix.mediaclient.util.PlayContext;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

/* renamed from: o.dfl  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8194dfl {
    public static String e(Map<String, String> map) {
        String str = map.get(SignupConstants.Error.DEBUG_INFO_ACTION);
        if (C8168dfL.g(str)) {
            str = map.get("a");
            if (C8168dfL.g(str)) {
                if (b(map)) {
                    C1044Mm.j("NflxHandler", "Action is empty, but video info is available, default action is video detail!");
                    return "view_details";
                }
                C1044Mm.j("NflxHandler", "Action is empty and video info is NOT available, default action is home ");
                return "home";
            }
        }
        return str;
    }

    public static boolean b(Map<String, String> map) {
        if (C8168dfL.h(map.get("movieid"))) {
            return true;
        }
        return C8168dfL.h(c(map));
    }

    public static String d(Map<String, String> map) {
        return map.get("trkid");
    }

    public static String c(Map<String, String> map) {
        String str = map.get("target_url");
        return C8168dfL.g(str) ? map.get("u") : str;
    }

    public static boolean c(String str) {
        return "genre".equalsIgnoreCase(str) || "g".equalsIgnoreCase(str);
    }

    public static boolean f(String str) {
        return "view_details".equalsIgnoreCase(str) || "v".equalsIgnoreCase(str);
    }

    public static boolean a(String str) {
        return "play".equalsIgnoreCase(str) || "p".equalsIgnoreCase(str);
    }

    public static d d(String str, Map<String, String> map) {
        try {
            str = URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            C1044Mm.e("NflxHandler", "Failed to decode URL", e);
        }
        String c = c(str, "series/");
        if (c != null) {
            return d.b(c);
        }
        String c2 = c(str, "movies/");
        if (c2 != null) {
            return d.c(c2);
        }
        if (!C8198dfp.c(str)) {
            C1044Mm.d("NflxHandler", "Unable to get video id! This should NOT happen!");
            return null;
        } else if (map.containsKey("episodeid")) {
            return d.b(str);
        } else {
            return d.c(str);
        }
    }

    public static String c(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(str2);
        if (lastIndexOf > 0) {
            String substring = str.substring(lastIndexOf + str2.length());
            if (C8168dfL.g(substring)) {
                C1044Mm.b("NflxHandler", "empty video id");
                return null;
            }
            int indexOf = substring.indexOf("/");
            return indexOf > 0 ? substring.substring(indexOf + 1) : substring;
        }
        return null;
    }

    public static String b(String str) {
        if (C8168dfL.g(str)) {
            throw new IllegalArgumentException("Tiny URL can not be empty!");
        }
        if (str.contains("source=android")) {
            str = str.substring(0, str.length() - 14);
        }
        String[] split = str.split("/");
        if (split == null || split.length < 2) {
            throw new IllegalArgumentException("Movie ID not found in tiny URL " + str);
        }
        return split[split.length - 1];
    }

    public static PlayContext d(String str) {
        return c(str, PlayContextImp.j);
    }

    public static PlayContext c(String str, PlayContext playContext) {
        if (C8168dfL.h(str)) {
            try {
                return new PlayContextImp("req_from_deeplink", Integer.parseInt(str), 0, 0, PlayLocationType.DEEPLINK, null, null, null, null, null);
            } catch (Exception unused) {
                C1044Mm.d("NflxHandler", String.format("Error parsing trackId %s", str));
            }
        }
        return playContext;
    }

    public static TrackingInfoHolder a(String str, String str2) {
        return d(str, str2, PlayContextImp.j);
    }

    public static TrackingInfoHolder d(String str, String str2, PlayContext playContext) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            InterfaceC1598aHf.e("Invalid videoId " + str, e);
            i = -1;
        }
        return new TrackingInfoHolder(PlayLocationType.DEEPLINK).d(i, c(str2, playContext));
    }

    public static String a(Map<String, String> map) {
        String str = map.get("episodeid");
        if (C8168dfL.g(str)) {
            C1044Mm.b("NflxHandler", "episode id uri doesn't exist in params map");
            return null;
        }
        try {
            str = URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            C1044Mm.e("NflxHandler", "Failed to decode URL", e);
        }
        return c(str, "programs/");
    }

    public static String e(String str) {
        if (C8168dfL.g(str)) {
            return null;
        }
        return str.substring(str.contains("uuid:") ? str.indexOf("uuid:") + 5 : 0, str.contains("::urn") ? str.indexOf("::urn") : str.length());
    }

    public static void c(NetflixActivity netflixActivity, Map<String, String> map, long j) {
        b(netflixActivity, NflxHandler.Response.HANDLING, true, AppView.profilesGate, j);
    }

    public static void b(NetflixActivity netflixActivity, NflxHandler.Response response, boolean z, AppView appView, long j) {
        if (response == NflxHandler.Response.HANDLING || response == NflxHandler.Response.HANDLING_WITH_DELAY) {
            Logger logger = Logger.INSTANCE;
            logger.startSession(new ProcessStateTransition(Long.valueOf(System.currentTimeMillis()), null, null, null, null));
            if (z) {
                NamedLogSessionLookup.INSTANCE.addSession("UiBrowseStartupSession", logger.startSession(new Presentation(appView, null)));
            }
        }
    }

    public static void c(Activity activity) {
        if (C8054ddD.l(activity)) {
            return;
        }
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.HANDLER_RESULT");
        intent.addCategory("LocalIntentNflxUi");
        LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
        C1044Mm.e("NflxHandler", ".... reportDelayedResponseHandled sending broadcast ...");
    }

    public static void a(Intent intent) {
        C1044Mm.b("NflxHandler", "reportIfSourceIsNotification", intent);
        if (NotificationUtils.c(intent)) {
            C1044Mm.b("NflxHandler", "From push notification, report.");
            MessageData createInstance = MessageData.createInstance(intent);
            if (createInstance == null) {
                C1044Mm.d("NflxHandler", "Unable to report since message data are missing!");
                return;
            } else {
                Logger.INSTANCE.logEvent(new PushNotificationAcknowledged(0L, new PushNotificationTrackingInfo(createInstance)));
                return;
            }
        }
        C1044Mm.e("NflxHandler", "Not from push notification, do not report.");
    }

    /* renamed from: o.dfl$d */
    /* loaded from: classes5.dex */
    public static class d {
        public static d e = new d(true, VideoType.UNAVAILABLE, (String) null);
        private final boolean a;
        private final String b;
        private final String c;
        private final VideoType d;

        public VideoType a() {
            return this.d;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.b;
        }

        public boolean e() {
            return this.a;
        }

        private d(boolean z, VideoType videoType, String str) {
            this.a = z;
            this.d = videoType;
            this.b = str;
            this.c = null;
        }

        private d(boolean z, String str, String str2) {
            this.a = z;
            this.d = VideoType.EPISODE;
            this.b = str2;
            this.c = str;
        }

        private d(boolean z, String str) {
            this.a = z;
            this.d = VideoType.SHOW;
            this.b = str;
            this.c = null;
        }

        public static d b(String str) {
            return new d(false, VideoType.SHOW, str);
        }

        public static d c(String str) {
            return new d(false, VideoType.MOVIE, str);
        }

        public static d a(String str, String str2) {
            if (C8168dfL.d(str, str2)) {
                return new d(false, str);
            }
            return new d(false, str, str2);
        }
    }
}
