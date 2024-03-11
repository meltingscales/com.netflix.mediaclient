package o;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bbW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4278bbW {
    private static final c b;
    private static final long c;
    private static final long e;
    private final Context a;
    private final d h;
    private boolean i;
    private final Handler j;
    private final Runnable g = new Runnable() { // from class: o.bbX
        @Override // java.lang.Runnable
        public final void run() {
            C4278bbW.this.i();
        }
    };
    private final BroadcastReceiver d = new BroadcastReceiver() { // from class: o.bbW.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                boolean d2 = C4278bbW.this.f.d();
                C1044Mm.c("offlineStorageMonitor", "mExtStorageMountReceiver tooFast=%b action=%s mData=%s", Boolean.valueOf(d2), action, intent.getData());
                if (d2) {
                    return;
                }
                C4278bbW.this.j.removeCallbacks(C4278bbW.this.g);
                if ("android.intent.action.MEDIA_EJECT".equals(action) || "android.intent.action.MEDIA_UNMOUNTED".equals(action)) {
                    C4278bbW.this.j.postDelayed(C4278bbW.this.g, C4278bbW.e);
                } else {
                    C4278bbW.this.j.postDelayed(C4278bbW.this.g, C4278bbW.c);
                }
            }
        }
    };
    private final C8165dfI f = new C8165dfI(5, TimeUnit.MINUTES.toMillis(5));

    /* renamed from: o.bbW$d */
    /* loaded from: classes3.dex */
    public interface d {
        void a();
    }

    public static c a() {
        return b;
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c = timeUnit.toMillis(1L);
        e = timeUnit.toMillis(1L);
        b = new c();
    }

    public C4278bbW(Context context, Looper looper, d dVar) {
        this.h = dVar;
        this.a = context;
        this.j = new Handler(looper);
    }

    public void g() {
        f();
    }

    public void j() {
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<o.C4280bbY> c() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4278bbW.c():java.util.List");
    }

    private void o() {
        if (this.i) {
            this.a.unregisterReceiver(this.d);
        }
        this.i = false;
    }

    private void f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_NOFS");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_SHARED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        this.i = true;
        ContextCompat.registerReceiver(this.a, this.d, intentFilter, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void i() {
        this.h.a();
    }

    private static boolean c(File file) {
        boolean exists;
        File file2 = new File(file.getAbsolutePath() + "nf.test");
        boolean z = false;
        try {
            if (file2.exists()) {
                boolean delete = file2.delete();
                C1044Mm.c("offlineStorageMonitor", "passesNfWriteTest first deleteResult=%b", Boolean.valueOf(delete));
                if (!delete) {
                    return false;
                }
            }
            C1044Mm.c("offlineStorageMonitor", "passesNfWriteTest createNewFile=%b", Boolean.valueOf(file2.createNewFile()));
            exists = file2.exists();
        } catch (IOException e2) {
            e = e2;
        } catch (Exception e3) {
            e = e3;
        }
        try {
            C1044Mm.c("offlineStorageMonitor", "passesNfWriteTest file exists=%b", Boolean.valueOf(exists));
            C1044Mm.c("offlineStorageMonitor", "passesNfWriteTest delete=%b", Boolean.valueOf(file2.delete()));
            return exists;
        } catch (IOException e4) {
            e = e4;
            z = exists;
            C1044Mm.c("offlineStorageMonitor", "passesNfWriteTest IOException ", e);
            return z;
        } catch (Exception e5) {
            e = e5;
            z = exists;
            C1044Mm.c("offlineStorageMonitor", "passesNfWriteTest Exception ", e);
            return z;
        }
    }

    public static JSONObject d() {
        try {
            return new JSONObject(C8118deO.a().toJson(b));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: o.bbW$b */
    /* loaded from: classes3.dex */
    public static class b {
        @SerializedName("primary")
        public final boolean a;
        @SerializedName("dbgInfo")
        public final String b;
        @SerializedName("emulated")
        public final boolean c;
        @SerializedName("freeSpace")
        public final long d;
        @SerializedName("removable")
        public final boolean e;
        @SerializedName("writable")
        public final boolean h;

        public b(boolean z, boolean z2, boolean z3, boolean z4, long j, String str) {
            this.e = z;
            this.a = z2;
            this.h = z3;
            this.c = z4;
            this.d = j;
            this.b = str;
        }
    }

    /* renamed from: o.bbW$c */
    /* loaded from: classes3.dex */
    public static class c {
        public transient long a;
        @SerializedName("storageCount")
        private int c;
        @SerializedName("storageInfoList")
        public final List<b> e = new ArrayList();

        public boolean e(Activity activity) {
            List<b> list;
            return (activity == null || (list = this.e) == null || list.size() <= 0 || this.e.get(0).h || !C8054ddD.c(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) ? false : true;
        }

        public void a(b bVar) {
            if (this.e.size() == 0) {
                this.a = bVar.d;
            }
            this.e.add(bVar);
            this.c = this.e.size();
        }
    }
}
