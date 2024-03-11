package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.os.PowerManager$OnThermalStatusChangedListener;
import androidx.core.content.ContextCompat;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.bny  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4869bny {
    private static boolean b;
    private static boolean c;
    private static int h;
    private static final PowerManager$OnThermalStatusChangedListener i;
    public static final C4869bny a = new C4869bny();
    private static final CopyOnWriteArrayList<C4343bci> d = new CopyOnWriteArrayList<>();
    private static final e e = new e();

    private C4869bny() {
    }

    static {
        i = Build.VERSION.SDK_INT >= 29 ? new PowerManager$OnThermalStatusChangedListener() { // from class: o.bnE
            public final void onThermalStatusChanged(int i2) {
                C4869bny.b(i2);
            }
        } : null;
    }

    public final void d(Context context, C4343bci c4343bci) {
        int currentThermalStatus;
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) c4343bci, "");
            d.add(c4343bci);
            if (!b) {
                try {
                    d(context);
                    ContextCompat.registerReceiver(context, e, C8116deM.d("android.intent.action.ACTION_POWER_CONNECTED", "android.intent.action.ACTION_POWER_DISCONNECTED"), 4);
                    if (Build.VERSION.SDK_INT >= 29 && aQG.b.a()) {
                        PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
                        currentThermalStatus = powerManager.getCurrentThermalStatus();
                        h = currentThermalStatus;
                        PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener = i;
                        C8632dsu.d(powerManager$OnThermalStatusChangedListener);
                        powerManager.addThermalStatusListener(powerManager$OnThermalStatusChangedListener);
                    }
                    b = true;
                } catch (Exception e2) {
                    C1044Mm.b("PowerStatus", e2, "unable to register power status receiver", new Object[0]);
                }
            } else {
                if (c) {
                    c4343bci.b(true);
                }
                if (Build.VERSION.SDK_INT >= 29 && aQG.b.a()) {
                    c4343bci.e(h);
                }
            }
        }
    }

    public final void b(Context context, C4343bci c4343bci) {
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) c4343bci, "");
            CopyOnWriteArrayList<C4343bci> copyOnWriteArrayList = d;
            copyOnWriteArrayList.remove(c4343bci);
            if (copyOnWriteArrayList.isEmpty() && b) {
                context.unregisterReceiver(e);
                if (Build.VERSION.SDK_INT >= 29 && aQG.b.a()) {
                    PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener = i;
                    C8632dsu.d(powerManager$OnThermalStatusChangedListener);
                    ((PowerManager) context.getSystemService(PowerManager.class)).removeThermalStatusListener(powerManager$OnThermalStatusChangedListener);
                }
                b = false;
            }
        }
    }

    private final void d(Context context) {
        IntentFilter d2 = C8116deM.d("android.intent.action.BATTERY_CHANGED");
        C8632dsu.a(d2, "");
        Intent registerReceiver = ContextCompat.registerReceiver(context, null, d2, 2);
        Integer valueOf = registerReceiver != null ? Integer.valueOf(registerReceiver.getIntExtra("status", -1)) : null;
        e((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 5));
    }

    /* renamed from: o.bny$e */
    /* loaded from: classes3.dex */
    public static final class e extends BroadcastReceiver {
        e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
            if (r3.equals("android.intent.action.ACTION_POWER_CONNECTED") == true) goto L7;
         */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
            /*
                r1 = this;
                o.bny r2 = o.C4869bny.a
                if (r3 == 0) goto L14
                java.lang.String r3 = r3.getAction()
                if (r3 == 0) goto L14
                java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
                boolean r3 = r3.equals(r0)
                r0 = 1
                if (r3 != r0) goto L14
                goto L15
            L14:
                r0 = 0
            L15:
                o.C4869bny.e(r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C4869bny.e.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(boolean z) {
        c = z;
        if (z) {
            for (C4343bci c4343bci : d) {
                c4343bci.b(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(int i2) {
        h = i2;
        for (C4343bci c4343bci : d) {
            c4343bci.e(i2);
        }
    }
}
