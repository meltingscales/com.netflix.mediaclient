package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.icu.text.MessageFormat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.IllformedLocaleException;
import java.util.Locale;
import java.util.MissingResourceException;

/* renamed from: o.Xq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1333Xq {
    public static C1333Xq b = new C1333Xq("{EMPTY}");
    public static BroadcastReceiver e;
    private final MessageFormat a;
    private HashMap<String, Object> d;

    private C1333Xq(String str) {
        this.d = new HashMap<>();
        MessageFormat messageFormat = new MessageFormat(str);
        this.a = messageFormat;
        Locale locale = messageFormat.getLocale();
        if (locale != null) {
            try {
                messageFormat.setLocale(new Locale.Builder().setLocale(locale).setExtension('u', "nu-latn").build());
            } catch (IllformedLocaleException e2) {
                C1044Mm.e("ICUMessageFormat", "Bad locale won't have nu-latn", e2);
            } catch (MissingResourceException e3) {
                C1044Mm.e("ICUMessageFormat", "SPY-37797 Locale won't have nu-latn", e3);
            }
        }
    }

    public static void a() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        Schedulers.computation().scheduleDirect(new Runnable() { // from class: o.Xq.1
            @Override // java.lang.Runnable
            public void run() {
                new C1333Xq("{value, plural, =0 {} =1 {dummy1} other{dummy {value}}}").d("value", 10).c();
            }
        });
    }

    public static C1333Xq d(int i) {
        String d = C8168dfL.d(i);
        C1044Mm.e("ICUMessageFormat", "Processing ICU string... " + d);
        try {
            return new C1333Xq(d);
        } catch (IllegalArgumentException unused) {
            return b;
        }
    }

    public static C1333Xq e(Context context, int i) {
        String b2 = C8168dfL.b(context, i);
        C1044Mm.e("ICUMessageFormat", "Processing ICU string... " + b2);
        try {
            return new C1333Xq(b2);
        } catch (IllegalArgumentException unused) {
            return b;
        }
    }

    public static C1333Xq d(String str) {
        try {
            return new C1333Xq(str);
        } catch (IllegalArgumentException unused) {
            return b;
        }
    }

    public C1333Xq a(int i) {
        this.d.put("quantity", Integer.valueOf(i));
        return this;
    }

    public C1333Xq d(String str, Object obj) {
        this.d.put(str, obj);
        return this;
    }

    public String c() {
        try {
            MessageFormat messageFormat = this.a;
            return messageFormat != null ? messageFormat.format(this.d) : "";
        } catch (IllegalArgumentException | MissingResourceException unused) {
            return "";
        }
    }

    public String toString() {
        return c();
    }

    private static void b() {
        synchronized (C1333Xq.class) {
            if (e == null) {
                e = new BroadcastReceiver() { // from class: o.Xq.4
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        C1333Xq.e();
                        LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).unregisterReceiver(this);
                    }
                };
                LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).registerReceiver(e, new IntentFilter("com.netflix.mediaclient.intent.action.HOME_TTR_DONE"));
            }
        }
    }
}
