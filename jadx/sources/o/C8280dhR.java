package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.accessibility.SwitchDeviceSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.dhR  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8280dhR implements InterfaceC8277dhO {
    private Long a;
    private AccessibilityManager.AccessibilityServicesStateChangeListener b;
    private boolean e;
    public static final c d = new c(null);
    public static final int c = 8;

    /* renamed from: o.dhR$c */
    /* loaded from: classes5.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("SwitchDevice");
        }
    }

    @Override // o.InterfaceC8277dhO
    public void b(Context context) {
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            if (Build.VERSION.SDK_INT < 33) {
                AccessibilityManager c2 = c(context);
                if (c2 != null) {
                    b(c2);
                }
            } else if (this.b != null) {
            } else {
                d.getLogTag();
                AccessibilityManager.AccessibilityServicesStateChangeListener accessibilityServicesStateChangeListener = new AccessibilityManager.AccessibilityServicesStateChangeListener() { // from class: o.dhQ
                    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
                        C8280dhR.d(C8280dhR.this, accessibilityManager);
                    }
                };
                AccessibilityManager c3 = c(context);
                if (c3 != null) {
                    b(c3);
                    c3.addAccessibilityServicesStateChangeListener(accessibilityServicesStateChangeListener);
                    this.b = accessibilityServicesStateChangeListener;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C8280dhR c8280dhR, AccessibilityManager accessibilityManager) {
        C8632dsu.c((Object) c8280dhR, "");
        C8632dsu.c((Object) accessibilityManager, "");
        c8280dhR.b(accessibilityManager);
    }

    @Override // o.InterfaceC8277dhO
    public void e(Context context) {
        AccessibilityManager.AccessibilityServicesStateChangeListener accessibilityServicesStateChangeListener;
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            if (Build.VERSION.SDK_INT >= 33 && (accessibilityServicesStateChangeListener = this.b) != null) {
                AccessibilityManager c2 = c(context);
                if (c2 != null) {
                    c2.removeAccessibilityServicesStateChangeListener(accessibilityServicesStateChangeListener);
                }
                this.b = null;
            }
            Logger.INSTANCE.endSession(this.a);
            this.a = null;
        }
    }

    private final AccessibilityManager c(Context context) {
        return (AccessibilityManager) context.getSystemService("accessibility");
    }

    private final void b(AccessibilityManager accessibilityManager) {
        boolean d2;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        boolean z = false;
        if (enabledAccessibilityServiceList != null) {
            Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String id = it.next().getId();
                C8632dsu.a(id, "");
                d2 = duD.d((CharSequence) id, (CharSequence) "SwitchAccessService", false, 2, (Object) null);
                if (!d2) {
                    i++;
                } else if (i >= 0) {
                    z = true;
                }
            }
        }
        if (this.e != z) {
            this.e = z;
            d.getLogTag();
            Logger logger = Logger.INSTANCE;
            logger.endSession(this.a);
            this.a = this.e ? logger.startSession(new SwitchDeviceSession()) : null;
        }
    }
}
