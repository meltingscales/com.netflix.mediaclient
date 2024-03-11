package com.netflix.mediaclient.ui.mdx2;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.mdx2.MdxEventProducer;
import io.reactivex.Observable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AbstractApplicationC1040Mh;
import o.AbstractC9766wb;
import o.C1045Mp;
import o.C1332Xp;
import o.C1596aHd;
import o.C8153dex;
import o.C8187dfe;
import o.C8627dsp;
import o.C8632dsu;
import o.C9726vo;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC6616cgf;
import o.dpR;
import o.dqE;
import o.drX;

/* loaded from: classes4.dex */
public final class MdxEventProducer implements DefaultLifecycleObserver {
    private final BroadcastReceiver a;
    private String c;
    private int f;
    private final PublishSubject<AbstractC9766wb.C9784r> h;
    private final Map<Class<? extends AbstractC9766wb.C9784r>, AbstractC9766wb.C9784r> i;
    public static final d d = new d(null);
    public static final int e = 8;
    private static List<MdxEventProducer> b = new ArrayList();

    public static final void b(String str) {
        d.e(str);
    }

    public static final void d(String str) {
        d.b(str);
    }

    public static final void d(String str, Intent intent) {
        d.e(str, intent);
    }

    public MdxEventProducer(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        PublishSubject<AbstractC9766wb.C9784r> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.h = create;
        this.i = new LinkedHashMap();
        BroadcastReceiver c = c();
        this.a = c;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("com.netflix.mediaclient.intent.category.MDX");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_READY");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_PLAYBACKEND");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_NOTREADY");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_AUDIOSUB");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_CAPABILITY");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_DIALOGCANCEL");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_DIALOGSHOW");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_ERROR");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_MOVIEMETADATA_AVAILABLE");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_MOVIEMETADA");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_STATE");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_TARGETLIST");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_NETWORK_CONNECTIVITY_CHANGE");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_PIN_VERIFICATION_INCORRECT_PIN");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_CONSENT_DIALOG_SHOW");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_CONSENT_DIALOG_CANCEL");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REMOTE_LOGIN_STATUS");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_SHOW_TOAST");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REGPAIR_PIN_CONFIRMATION_DIALOG_SHOW");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_REGPAIR_PIN_CONFIRMATION_DIALOG_CANCEL");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_PLAYER_POST_PLAY_ACTION_HIDE");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_PLAYER_POST_PLAY_ACTION_TITLE_END");
        intentFilter.addAction("com.netflix.mediaclient.intent.action.MDX_ACTION_PLAYER_POST_PLAY_ACTION_TITLE_NEXT");
        LocalBroadcastManager.getInstance(AbstractApplicationC1040Mh.d()).registerReceiver(c, intentFilter);
        netflixActivity.registerReceiverWithAutoUnregister(c, "com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_POSTPLAY", true);
        b.add(this);
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MdxEventProducer");
        }

        /* loaded from: classes4.dex */
        public static final class a implements Runnable {
            final /* synthetic */ String e;

            public a(String str) {
                this.e = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1593aHa.c.a("mdx disconnected");
                for (MdxEventProducer mdxEventProducer : MdxEventProducer.b) {
                    mdxEventProducer.e(this.e);
                }
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Runnable {
            final /* synthetic */ String a;

            public b(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1593aHa.c.a("mdx connected");
                for (MdxEventProducer mdxEventProducer : MdxEventProducer.b) {
                    mdxEventProducer.c(this.a);
                }
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Runnable {
            final /* synthetic */ Intent b;
            final /* synthetic */ String c;

            public c(String str, Intent intent) {
                this.c = str;
                this.b = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Map d;
                Map k;
                Throwable th;
                InterfaceC1593aHa.c.a("mdx play");
                if (((dpR) C9726vo.d(this.c, this.b, MdxEventProducer$Companion$notifyPlayVideo$1$1.b)) == null) {
                    d dVar = MdxEventProducer.d;
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    String str = "notifyPlayVideo received a null object : uuid=" + this.c + " intent=" + this.b + " (with " + MdxEventProducer.b.size() + " producers)";
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            c1596aHd.a(errorType.c() + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar2.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar2.e().b(c1596aHd, th);
                    }
                }
            }
        }

        public final void b(String str) {
            C8632dsu.c((Object) str, "");
            if (C8632dsu.c(Looper.getMainLooper(), Looper.myLooper())) {
                InterfaceC1593aHa.c.a("mdx connected");
                for (MdxEventProducer mdxEventProducer : MdxEventProducer.b) {
                    mdxEventProducer.c(str);
                }
                return;
            }
            C8187dfe.c(new b(str));
        }

        public final void e(String str) {
            C8632dsu.c((Object) str, "");
            if (C8632dsu.c(Looper.getMainLooper(), Looper.myLooper())) {
                InterfaceC1593aHa.c.a("mdx disconnected");
                for (MdxEventProducer mdxEventProducer : MdxEventProducer.b) {
                    mdxEventProducer.e(str);
                }
                return;
            }
            C8187dfe.c(new a(str));
        }

        public final void e(String str, Intent intent) {
            Map d;
            Map k;
            Throwable th;
            if (C8632dsu.c(Looper.getMainLooper(), Looper.myLooper())) {
                InterfaceC1593aHa.c.a("mdx play");
                if (((dpR) C9726vo.d(str, intent, MdxEventProducer$Companion$notifyPlayVideo$1$1.b)) == null) {
                    d dVar = MdxEventProducer.d;
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    String str2 = "notifyPlayVideo received a null object : uuid=" + str + " intent=" + intent + " (with " + MdxEventProducer.b.size() + " producers)";
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(str2, null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            c1596aHd.a(errorType.c() + " " + b2);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar2.a();
                    if (a2 != null) {
                        a2.e(c1596aHd, th);
                        return;
                    } else {
                        dVar2.e().b(c1596aHd, th);
                        return;
                    }
                }
                return;
            }
            C8187dfe.c(new c(str, intent));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(drX drx, Object obj, Object obj2) {
        C8632dsu.c((Object) drx, "");
        C8632dsu.c(obj, "");
        C8632dsu.c(obj2, "");
        return ((Boolean) drx.invoke(obj, obj2)).booleanValue();
    }

    public final Observable<AbstractC9766wb.C9784r> e() {
        PublishSubject<AbstractC9766wb.C9784r> publishSubject = this.h;
        final drX<AbstractC9766wb.C9784r, AbstractC9766wb.C9784r, Boolean> drx = new drX<AbstractC9766wb.C9784r, AbstractC9766wb.C9784r, Boolean>() { // from class: com.netflix.mediaclient.ui.mdx2.MdxEventProducer$mdxAgentEvents$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            /* renamed from: c */
            public final Boolean invoke(AbstractC9766wb.C9784r c9784r, AbstractC9766wb.C9784r c9784r2) {
                boolean z;
                Map map;
                Map map2;
                C8632dsu.c((Object) c9784r, "");
                C8632dsu.c((Object) c9784r2, "");
                if (c9784r2.g()) {
                    Class<?> i = c9784r2.i();
                    if (i == null) {
                        i = c9784r2.getClass();
                    }
                    map = MdxEventProducer.this.i;
                    map2 = MdxEventProducer.this.i;
                    map2.put(i, c9784r2);
                    z = C8632dsu.c((AbstractC9766wb.C9784r) map.get(i), c9784r2);
                } else {
                    z = false;
                }
                if (C8153dex.p()) {
                    if (!z) {
                        MdxEventProducer.d.getLogTag();
                        C1332Xp c1332Xp = C1332Xp.b;
                        String a = c9784r2.a();
                        ((InterfaceC6616cgf) C1332Xp.b(InterfaceC6616cgf.class)).b("-> " + a);
                    } else {
                        MdxEventProducer.d.getLogTag();
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        Observable<AbstractC9766wb.C9784r> distinctUntilChanged = publishSubject.distinctUntilChanged(new BiPredicate() { // from class: o.cgg
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                boolean c;
                c = MdxEventProducer.c(drX.this, obj, obj2);
                return c;
            }
        });
        C8632dsu.a(distinctUntilChanged, "");
        return distinctUntilChanged;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) lifecycleOwner, "");
        b.remove(this);
        LocalBroadcastManager.getInstance(AbstractApplicationC1040Mh.d()).unregisterReceiver(this.a);
        super.onDestroy(lifecycleOwner);
    }

    /* loaded from: classes4.dex */
    public static final class e extends BroadcastReceiver {
        e() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:202:0x03a0  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x03a6  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x03b5  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x03dd  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r10, android.content.Intent r11) {
            /*
                Method dump skipped, instructions count: 1180
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mdx2.MdxEventProducer.e.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    private final BroadcastReceiver c() {
        return new e();
    }

    public final void a() {
        this.i.clear();
    }

    public final void c(String str) {
        C8632dsu.c((Object) str, "");
        AbstractC9766wb.C9767a c9767a = new AbstractC9766wb.C9767a(str);
        C1332Xp c1332Xp = C1332Xp.b;
        int i = this.f;
        String a = c9767a.a();
        ((InterfaceC6616cgf) C1332Xp.b(InterfaceC6616cgf.class)).b("#" + i + " _ : " + a);
        this.h.onNext(c9767a);
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r22, android.content.Intent r23) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mdx2.MdxEventProducer.b(java.lang.String, android.content.Intent):void");
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        AbstractC9766wb.C9773g c9773g = new AbstractC9766wb.C9773g(str);
        C1332Xp c1332Xp = C1332Xp.b;
        int i = this.f;
        String a = c9773g.a();
        ((InterfaceC6616cgf) C1332Xp.b(InterfaceC6616cgf.class)).b("#" + i + " _ : " + a);
        this.h.onNext(c9773g);
        this.c = null;
    }
}
