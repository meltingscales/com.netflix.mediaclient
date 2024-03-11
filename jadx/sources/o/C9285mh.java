package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.bugsnag.android.BreadcrumbType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o.mh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9285mh extends BroadcastReceiver {
    public static final c c = new c(null);
    private final C9191kt a;
    private final Map<String, BreadcrumbType> b = b();
    private final InterfaceC9200lB d;

    public static final void b(Context context, C9285mh c9285mh, InterfaceC9200lB interfaceC9200lB) {
        c.e(context, c9285mh, interfaceC9200lB);
    }

    public final Map<String, BreadcrumbType> e() {
        return this.b;
    }

    public C9285mh(C9191kt c9191kt, InterfaceC9200lB interfaceC9200lB) {
        this.a = c9191kt;
        this.d = interfaceC9200lB;
    }

    /* renamed from: o.mh$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final void e(Context context, C9285mh c9285mh, InterfaceC9200lB interfaceC9200lB) {
            if (!c9285mh.e().isEmpty()) {
                IntentFilter intentFilter = new IntentFilter();
                for (String str : c9285mh.e().keySet()) {
                    intentFilter.addAction(str);
                }
                C9148kC.e(context, c9285mh, intentFilter, interfaceC9200lB);
            }
        }

        public final boolean d(String str) {
            boolean i;
            i = C8691duz.i(str, "android.", false, 2, null);
            return i;
        }

        public final String c(String str) {
            String f;
            if (d(str)) {
                f = duD.f(str, '.', (String) null, 2, (Object) null);
                return f;
            }
            return str;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            HashMap hashMap = new HashMap();
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            String c2 = c.c(action);
            hashMap.put("Intent Action", action);
            b(intent, hashMap, c2);
            BreadcrumbType breadcrumbType = this.b.get(action);
            if (breadcrumbType == null) {
                breadcrumbType = BreadcrumbType.STATE;
            }
            this.a.d(c2, hashMap, breadcrumbType);
        } catch (Exception e) {
            this.d.d(C8632dsu.d("Failed to leave breadcrumb in SystemBroadcastReceiver: ", (Object) e.getMessage()));
        }
    }

    private final void b(Intent intent, Map<String, Object> map, String str) {
        Set<String> keySet;
        Bundle extras = intent.getExtras();
        if (extras == null || (keySet = extras.keySet()) == null) {
            return;
        }
        for (String str2 : keySet) {
            Object obj = extras.get(str2);
            if (obj != null) {
                String obj2 = obj.toString();
                if (c.d(str2)) {
                    map.put("Extra", str + ": " + obj2);
                } else {
                    map.put(str2, obj2);
                }
            }
        }
    }

    private final Map<String, BreadcrumbType> b() {
        HashMap hashMap = new HashMap();
        C9258mG e = this.a.e();
        BreadcrumbType breadcrumbType = BreadcrumbType.USER;
        if (!e.e(breadcrumbType)) {
            hashMap.put("android.appwidget.action.APPWIDGET_DELETED", breadcrumbType);
            hashMap.put("android.appwidget.action.APPWIDGET_DISABLED", breadcrumbType);
            hashMap.put("android.appwidget.action.APPWIDGET_ENABLED", breadcrumbType);
            hashMap.put("android.intent.action.CAMERA_BUTTON", breadcrumbType);
            hashMap.put("android.intent.action.CLOSE_SYSTEM_DIALOGS", breadcrumbType);
            hashMap.put("android.intent.action.DOCK_EVENT", breadcrumbType);
        }
        BreadcrumbType breadcrumbType2 = BreadcrumbType.STATE;
        if (!e.e(breadcrumbType2)) {
            hashMap.put("android.appwidget.action.APPWIDGET_HOST_RESTORED", breadcrumbType2);
            hashMap.put("android.appwidget.action.APPWIDGET_RESTORED", breadcrumbType2);
            hashMap.put("android.appwidget.action.APPWIDGET_UPDATE", breadcrumbType2);
            hashMap.put("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS", breadcrumbType2);
            hashMap.put("android.intent.action.ACTION_POWER_CONNECTED", breadcrumbType2);
            hashMap.put("android.intent.action.ACTION_POWER_DISCONNECTED", breadcrumbType2);
            hashMap.put("android.intent.action.ACTION_SHUTDOWN", breadcrumbType2);
            hashMap.put("android.intent.action.AIRPLANE_MODE", breadcrumbType2);
            hashMap.put("android.intent.action.BATTERY_LOW", breadcrumbType2);
            hashMap.put("android.intent.action.BATTERY_OKAY", breadcrumbType2);
            hashMap.put("android.intent.action.BOOT_COMPLETED", breadcrumbType2);
            hashMap.put("android.intent.action.CONFIGURATION_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.CONTENT_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.DATE_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.DEVICE_STORAGE_LOW", breadcrumbType2);
            hashMap.put("android.intent.action.DEVICE_STORAGE_OK", breadcrumbType2);
            hashMap.put("android.intent.action.INPUT_METHOD_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.LOCALE_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.REBOOT", breadcrumbType2);
            hashMap.put("android.intent.action.SCREEN_OFF", breadcrumbType2);
            hashMap.put("android.intent.action.SCREEN_ON", breadcrumbType2);
            hashMap.put("android.intent.action.TIMEZONE_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.TIME_SET", breadcrumbType2);
            hashMap.put("android.os.action.DEVICE_IDLE_MODE_CHANGED", breadcrumbType2);
            hashMap.put("android.os.action.POWER_SAVE_MODE_CHANGED", breadcrumbType2);
        }
        BreadcrumbType breadcrumbType3 = BreadcrumbType.NAVIGATION;
        if (!e.e(breadcrumbType3)) {
            hashMap.put("android.intent.action.DREAMING_STARTED", breadcrumbType3);
            hashMap.put("android.intent.action.DREAMING_STOPPED", breadcrumbType3);
        }
        return hashMap;
    }
}
