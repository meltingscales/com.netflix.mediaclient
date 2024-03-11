package o;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import io.reactivex.Single;

/* renamed from: o.bSr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4004bSr extends InterfaceC4007bSu {
    public static final a c = a.e;

    static void b(Context context, String str, String str2, String str3, String str4) {
        c.c(context, str, str2, str3, str4);
    }

    Single<InterfaceC5241buz> b(String str, boolean z);

    void b();

    /* renamed from: o.bSr$a */
    /* loaded from: classes4.dex */
    public static final class a {
        static final /* synthetic */ a e = new a();

        private a() {
        }

        public final void c(Context context, String str, String str2, String str3, String str4) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
            Intent intent = new Intent("com.netflix.mediaclient.ui.home.impl.repository.graphql.intent.action.FALKOR_AGENT_TO_GRAPHQL_LIST_REFRESH");
            intent.putExtra("INTENT_EXTRA_LOLOMO_ID", str2);
            intent.putExtra("INTENT_EXTRA_LIST_ID", str);
            intent.putExtra("INTENT_EXTRA_RENO_MESSAGE_ID", str3);
            intent.putExtra("INTENT_EXTRA_SOURCE_OF_REFRESH", str4);
            localBroadcastManager.sendBroadcast(intent);
        }

        public final void a(Context context, String str) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
            Intent intent = new Intent("RECENTLY_WATCHED_VIDEO_REMOVED_ACTION");
            intent.putExtra("INTENT_EXTRA_RECENTLY_WATCHED_REMOVED_VIDEO_ID", str);
            localBroadcastManager.sendBroadcast(intent);
        }
    }

    /* renamed from: o.bSr$b */
    /* loaded from: classes4.dex */
    public interface b {
        Single<InterfaceC4004bSr> d(String str);

        /* renamed from: o.bSr$b$c */
        /* loaded from: classes4.dex */
        public static final class c {
            public static /* synthetic */ Single b(b bVar, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        str = null;
                    }
                    return bVar.d(str);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
        }
    }
}
