package o;

import android.app.Activity;
import android.app.Presentation;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.view.Display;
import com.netflix.cl.Logger;
import com.netflix.cl.model.context.android.MirrorScreen;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.cwG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7437cwG extends C1045Mp {
    private final Runnable a;
    private Activity b;
    private boolean c;
    private List<Display> d;
    private final DisplayManager e;
    private final b f;
    private List<e> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7437cwG(Context context) {
        super("SecondaryDisplay");
        C8632dsu.c((Object) context, "");
        this.d = new ArrayList();
        this.c = true;
        Object systemService = context.getSystemService(InteractiveAnimation.States.display);
        C8632dsu.d(systemService);
        DisplayManager displayManager = (DisplayManager) systemService;
        this.e = displayManager;
        this.i = new ArrayList();
        b bVar = new b();
        this.f = bVar;
        if (displayManager != null) {
            displayManager.registerDisplayListener(bVar, null);
        }
        a();
        this.a = new Runnable() { // from class: o.cwJ
            @Override // java.lang.Runnable
            public final void run() {
                C7437cwG.a(C7437cwG.this);
            }
        };
    }

    /* renamed from: o.cwG$b */
    /* loaded from: classes.dex */
    public static final class b implements DisplayManager.DisplayListener {
        b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
            C7437cwG.this.c();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            C7437cwG.this.c();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
            C7437cwG.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C7437cwG c7437cwG) {
        C8632dsu.c((Object) c7437cwG, "");
        c7437cwG.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        C8187dfe.e(this.a);
        C8187dfe.a(this.a, 2000L);
    }

    private final void a() {
        Display[] displays;
        Collection d;
        this.d.clear();
        DisplayManager displayManager = this.e;
        if (displayManager != null && (displays = displayManager.getDisplays("android.hardware.display.category.PRESENTATION")) != null) {
            d = C8563dqf.d(displays, new ArrayList());
            this.d = (List) d;
        }
        for (Display display : this.d) {
            if (display.getName() != null) {
                String name = display.getName();
                C8632dsu.a(name, "");
                d(name);
            }
        }
        a(this.d);
    }

    private final void d() {
        for (e eVar : this.i) {
            eVar.dismiss();
        }
        this.i.clear();
    }

    public final void c(Activity activity, boolean z) {
        C8632dsu.c((Object) activity, "");
        this.c = z;
        this.b = activity;
        a(this.d);
    }

    public final void d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        if (C8632dsu.c(this.b, activity)) {
            d();
            this.b = null;
        }
    }

    private final void a(List<Display> list) {
        Activity activity;
        Activity activity2 = this.b;
        if (activity2 != null) {
            if ((activity2 == null || !activity2.isDestroyed()) && (activity = this.b) != null) {
                d();
                if (this.c) {
                    return;
                }
                boolean z = false;
                for (Display display : list) {
                    e eVar = new e(this, activity, display);
                    eVar.show();
                    this.i.add(eVar);
                    if (!z) {
                        b();
                        z = true;
                    }
                }
            }
        }
    }

    private final void b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "mobileOnlySecondayDisplayError");
            Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
        } catch (JSONException unused) {
        }
    }

    private final void d(String str) {
        Logger.INSTANCE.addContext(new MirrorScreen(str));
    }

    /* renamed from: o.cwG$e */
    /* loaded from: classes.dex */
    public final class e extends Presentation {
        final /* synthetic */ C7437cwG e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C7437cwG c7437cwG, Activity activity, Display display) {
            super(activity, display);
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) display, "");
            this.e = c7437cwG;
        }

        @Override // android.app.Dialog
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setCancelable(false);
            setCanceledOnTouchOutside(false);
            setContentView(com.netflix.mediaclient.ui.R.i.ax);
        }
    }
}
