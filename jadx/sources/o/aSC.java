package o;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.List;

/* loaded from: classes.dex */
public final class aSC {
    public static boolean e() {
        return false;
    }

    public static InterfaceC5198buI c(InterfaceC5198buI interfaceC5198buI) {
        if (interfaceC5198buI instanceof InterfaceC5198buI) {
            return interfaceC5198buI.K();
        }
        return null;
    }

    public static void b(Context context, String str) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO");
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("renoMessageId", str);
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        C1044Mm.b("FalkorUtils", "Intent REFRESH_HOME sent");
    }

    public static void a(Context context, String str, String str2) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.BA_LIST_REFRESH");
        intent.addCategory(str);
        if (C8168dfL.h(str2)) {
            intent.putExtra("browse_agent_list_refresh_extra_reno_msg_id", str2);
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        C1044Mm.d("FalkorUtils", "Intent BROWSE_AGENT_LIST_REFRESH sent for category %s", str);
    }

    public static void c(Context context, List<InterfaceC5223buh> list, boolean z) {
        String[] strArr = new String[list.size()];
        int i = 0;
        for (InterfaceC5223buh interfaceC5223buh : list) {
            strArr[i] = interfaceC5223buh.getId();
            i++;
        }
        e(context, strArr, z);
    }

    public static void e(final Context context, final String[] strArr, final boolean z) {
        C8187dfe.c(new Runnable() { // from class: o.aSK
            @Override // java.lang.Runnable
            public final void run() {
                aSC.e(z, strArr, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(boolean z, String[] strArr, Context context) {
        Intent intent;
        if (z) {
            intent = new Intent("com.netflix.mediaclient.intent.action.RELOAD_VIDEOS_FROM_NETWORK");
        } else {
            intent = new Intent("com.netflix.mediaclient.intent.action.ACTION_UPDATE_VIDEOS_IN_UI");
        }
        intent.putExtra("video_ids", strArr);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static String e(String str) {
        return str.replaceAll("\\s+", " ");
    }

    public static boolean a() {
        return C8150deu.g() && !C8157dfA.b((Context) AbstractApplicationC1040Mh.getInstance(), "disable_roar", true);
    }

    public static void a(String str) {
        C1913aSx c1913aSx;
        if (str == null || (c1913aSx = (C1913aSx) AbstractApplicationC1040Mh.getInstance().i().g()) == null) {
            return;
        }
        c1913aSx.b(str);
    }

    public static void c(String str, boolean z) {
        C1913aSx c1913aSx = (C1913aSx) AbstractApplicationC1040Mh.getInstance().i().g();
        if (c1913aSx == null || c1913aSx.i() == null || !(c1913aSx.i() instanceof C0954Iz)) {
            return;
        }
        ((C0954Iz) c1913aSx.i()).c(str, z);
    }

    public static void e(String str, boolean z) {
        C1913aSx c1913aSx = (C1913aSx) AbstractApplicationC1040Mh.getInstance().i().g();
        if (c1913aSx == null || c1913aSx.i() == null || !(c1913aSx.i() instanceof C0954Iz)) {
            return;
        }
        ((C0954Iz) c1913aSx.i()).d(str, z);
    }

    public static void a(String str, boolean z) {
        C1913aSx c1913aSx = (C1913aSx) AbstractApplicationC1040Mh.getInstance().i().g();
        if (c1913aSx == null || c1913aSx.i() == null || !(c1913aSx.i() instanceof C0954Iz)) {
            return;
        }
        ((C0954Iz) c1913aSx.i()).b(str, z);
    }

    public static boolean e(InterfaceC8366diy interfaceC8366diy) {
        if (interfaceC8366diy == null) {
            return false;
        }
        String id = interfaceC8366diy.getId();
        return (C8168dfL.g(id) || "-1".equals(id)) ? false : true;
    }
}
