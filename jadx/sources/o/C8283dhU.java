package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.accessibility.VoiceControlSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.dhU  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8283dhU implements InterfaceC8277dhO {
    public static final b a = new b(null);
    public static final int d = 8;
    private AccessibilityManager.AccessibilityServicesStateChangeListener b;
    private boolean c;
    private Long e;

    /* renamed from: o.dhU$b */
    /* loaded from: classes5.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("VoiceControl");
        }
    }

    @Override // o.InterfaceC8277dhO
    public void b(Context context) {
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            if (Build.VERSION.SDK_INT < 33) {
                AccessibilityManager a2 = a(context);
                if (a2 != null) {
                    e(a2);
                }
            } else if (this.b != null) {
            } else {
                a.getLogTag();
                AccessibilityManager.AccessibilityServicesStateChangeListener accessibilityServicesStateChangeListener = new AccessibilityManager.AccessibilityServicesStateChangeListener() { // from class: o.dhW
                    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
                        C8283dhU.b(C8283dhU.this, accessibilityManager);
                    }
                };
                AccessibilityManager a3 = a(context);
                if (a3 != null) {
                    e(a3);
                    a3.addAccessibilityServicesStateChangeListener(accessibilityServicesStateChangeListener);
                    this.b = accessibilityServicesStateChangeListener;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C8283dhU c8283dhU, AccessibilityManager accessibilityManager) {
        C8632dsu.c((Object) c8283dhU, "");
        C8632dsu.c((Object) accessibilityManager, "");
        c8283dhU.e(accessibilityManager);
    }

    @Override // o.InterfaceC8277dhO
    public void e(Context context) {
        AccessibilityManager.AccessibilityServicesStateChangeListener accessibilityServicesStateChangeListener;
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            if (Build.VERSION.SDK_INT >= 33 && (accessibilityServicesStateChangeListener = this.b) != null) {
                AccessibilityManager a2 = a(context);
                if (a2 != null) {
                    a2.removeAccessibilityServicesStateChangeListener(accessibilityServicesStateChangeListener);
                }
                this.b = null;
            }
            Logger.INSTANCE.endSession(this.e);
            this.e = null;
        }
    }

    private final AccessibilityManager a(Context context) {
        return (AccessibilityManager) context.getSystemService("accessibility");
    }

    private final void e(AccessibilityManager accessibilityManager) {
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
                d2 = duD.d((CharSequence) id, (CharSequence) "JustSpeakService", false, 2, (Object) null);
                if (!d2) {
                    i++;
                } else if (i >= 0) {
                    z = true;
                }
            }
        }
        if (this.c != z) {
            this.c = z;
            a.getLogTag();
            Logger logger = Logger.INSTANCE;
            logger.endSession(this.e);
            this.e = this.c ? logger.startSession(new VoiceControlSession()) : null;
        }
    }
}
