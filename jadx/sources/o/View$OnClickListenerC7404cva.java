package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentManager;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import io.reactivex.Single;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C1596aHd;
import o.C7373cuw;
import o.C8258dgw;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4208baF;
import o.InterfaceC5283bvo;
import o.View$OnClickListenerC7404cva;
import o.dpR;
import o.dqE;

/* renamed from: o.cva  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class View$OnClickListenerC7404cva extends NetflixDialogFrag implements View.OnClickListener {
    public static final d c = new d(null);
    public static final int e = 8;
    private List<String> a;
    private C7346cuV b;
    private final float d;
    private float f;
    private PublishSubject<dpR> j;

    public int d() {
        return com.netflix.mediaclient.ui.R.l.a;
    }

    public int e() {
        return C7373cuw.b.c;
    }

    public View$OnClickListenerC7404cva() {
        float e2 = C8258dgw.a.e().e(AbstractApplicationC1040Mh.getInstance().i().l());
        this.d = e2;
        this.f = e2;
    }

    /* renamed from: o.cva$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("DownloadedForYouOptInDialog");
        }

        public final View$OnClickListenerC7404cva d(List<String> list) {
            String[] strArr;
            View$OnClickListenerC7404cva view$OnClickListenerC7404cva = new View$OnClickListenerC7404cva();
            Bundle bundle = new Bundle();
            if (list == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
                strArr = new String[0];
            }
            bundle.putStringArray("VideoInfoExtra", strArr);
            view$OnClickListenerC7404cva.setArguments(bundle);
            view$OnClickListenerC7404cva.a = list;
            return view$OnClickListenerC7404cva;
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        List<String> list;
        super.onCreate(bundle);
        if (bundle != null) {
            String[] stringArray = bundle.getStringArray("VideoInfoExtra");
            if (stringArray != null) {
                C8632dsu.d(stringArray);
                list = C8563dqf.D(stringArray);
            } else {
                list = null;
            }
            this.a = list;
        }
        setStyle(0, d());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        return layoutInflater.inflate(e(), viewGroup, false);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public void onViewCreated(View view, Bundle bundle) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C7346cuV e2 = C7346cuV.e(view);
        this.b = e2;
        C8632dsu.a(e2, "");
        PublishSubject<dpR> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.j = create;
        InterfaceC4208baF l = AbstractApplicationC1040Mh.getInstance().i().l();
        UserAgent k2 = AbstractApplicationC1040Mh.getInstance().i().k();
        InterfaceC5283bvo j = k2 != null ? k2.j() : null;
        if (l != null) {
            l.t();
        }
        e2.a.setOnClickListener(new View.OnClickListener() { // from class: o.cvc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                View$OnClickListenerC7404cva.c(View$OnClickListenerC7404cva.this, view2);
            }
        });
        e2.l.setOnClickListener(new View.OnClickListener() { // from class: o.cvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                View$OnClickListenerC7404cva.i(View$OnClickListenerC7404cva.this, view2);
            }
        });
        e2.k.setOnClickListener(new View.OnClickListener() { // from class: o.cvj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                View$OnClickListenerC7404cva.g(View$OnClickListenerC7404cva.this, view2);
            }
        });
        e2.m.setOnClickListener(new View.OnClickListener() { // from class: o.cvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                View$OnClickListenerC7404cva.h(View$OnClickListenerC7404cva.this, view2);
            }
        });
        List<String> list = this.a;
        if (list != null && !list.isEmpty() && list.size() >= 3) {
            d(list);
        } else if (j != null) {
            Single<List<String>> takeUntil = new C7409cvf().d().b(j, 3).takeUntil(create.ignoreElements());
            C8632dsu.a(takeUntil, "");
            SubscribersKt.subscribeBy(takeUntil, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouOptInDialog$onViewCreated$5
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th2) {
                    d(th2);
                    return dpR.c;
                }

                public final void d(Throwable th2) {
                    Map d3;
                    Map k3;
                    Throwable th3;
                    C8632dsu.c((Object) th2, "");
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d3 = dqE.d();
                    k3 = dqE.k(d3);
                    C1596aHd c1596aHd = new C1596aHd("SPY-34028: DownloadedForYouOptInDialog::onViewCreated: failed to retrieve merch boxarts", th2, null, false, k3, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th3 = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th3 = new Throwable(c1596aHd.b());
                    } else {
                        th3 = c1596aHd.i;
                        if (th3 == null) {
                            th3 = new Throwable("Handled exception with no message");
                        } else if (th3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar.a();
                    if (a2 != null) {
                        a2.e(c1596aHd, th3);
                    } else {
                        dVar.e().b(c1596aHd, th3);
                    }
                }
            }, new drM<List<? extends String>, dpR>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouOptInDialog$onViewCreated$6
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(List<? extends String> list2) {
                    d(list2);
                    return dpR.c;
                }

                public final void d(List<String> list2) {
                    View$OnClickListenerC7404cva view$OnClickListenerC7404cva = View$OnClickListenerC7404cva.this;
                    C8632dsu.d(list2);
                    view$OnClickListenerC7404cva.d(list2);
                }
            });
        } else {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("DownloadedForYouOptInDialog: current profile is null", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        j();
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(View$OnClickListenerC7404cva view$OnClickListenerC7404cva, View view) {
        C8632dsu.c((Object) view$OnClickListenerC7404cva, "");
        view$OnClickListenerC7404cva.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(View$OnClickListenerC7404cva view$OnClickListenerC7404cva, View view) {
        C8632dsu.c((Object) view$OnClickListenerC7404cva, "");
        view$OnClickListenerC7404cva.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(View$OnClickListenerC7404cva view$OnClickListenerC7404cva, View view) {
        C8632dsu.c((Object) view$OnClickListenerC7404cva, "");
        view$OnClickListenerC7404cva.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(View$OnClickListenerC7404cva view$OnClickListenerC7404cva, View view) {
        C8632dsu.c((Object) view$OnClickListenerC7404cva, "");
        view$OnClickListenerC7404cva.f();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        b();
        super.onDestroyView();
        this.b = null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        C8632dsu.c((Object) fragmentManager, "");
        super.show(fragmentManager, str);
        a();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C8632dsu.c((Object) view, "");
        if (view.getId() == C7373cuw.c.d) {
            dismiss();
        }
    }

    private final void o() {
        InterfaceC5203buN c2;
        InterfaceC4208baF t;
        AbstractApplicationC1040Mh.getInstance().i().l();
        ServiceManager c3 = ServiceManager.c(getNetflixActivity());
        InterfaceC5204buO l = (c3 == null || (t = c3.t()) == null) ? null : t.l();
        if ((l != null ? l.c(l.b()) : null) == null) {
            return;
        }
        double d2 = (double) Prefetch.NANOSECONDS_PER_SECOND;
        float j = (float) ((c2.j() * 1.0d) / d2);
        double d3 = this.f * 1.0d;
        float j2 = (float) (((c2.j() * 1.0d) - c2.c()) / d2);
        C7346cuV c7346cuV = this.b;
        if (c7346cuV == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        double d4 = j;
        c7346cuV.t.setSecondaryProgress((int) ((j2 * 100.0d) / d4));
        ProgressBar progressBar = c7346cuV.t;
        progressBar.setProgress(((int) ((100.0d * d3) / d4)) + progressBar.getSecondaryProgress());
        double max = Math.max((j - j2) - d3, 0.0d);
        C1204Sr c1204Sr = c7346cuV.r;
        int i = com.netflix.mediaclient.ui.R.o.bm;
        dsE dse = dsE.b;
        String format = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(max)}, 1));
        C8632dsu.a(format, "");
        c1204Sr.setText(C8168dfL.a(i, format));
        C1204Sr c1204Sr2 = c7346cuV.q;
        int i2 = com.netflix.mediaclient.ui.R.o.bo;
        String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1));
        C8632dsu.a(format2, "");
        c1204Sr2.setText(C8168dfL.a(i2, format2));
    }

    private final void f() {
        InterfaceC4208baF l = AbstractApplicationC1040Mh.getInstance().i().l();
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        C9726vo.d(k != null ? k.j() : null, l, new drX<InterfaceC5283bvo, InterfaceC4208baF, dpR>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouOptInDialog$optIn$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC5283bvo interfaceC5283bvo, InterfaceC4208baF interfaceC4208baF) {
                c(interfaceC5283bvo, interfaceC4208baF);
                return dpR.c;
            }

            public final void c(InterfaceC5283bvo interfaceC5283bvo, InterfaceC4208baF interfaceC4208baF) {
                float f;
                C8632dsu.c((Object) interfaceC5283bvo, "");
                C8632dsu.c((Object) interfaceC4208baF, "");
                C8258dgw e2 = C8258dgw.a.e();
                Context requireContext = View$OnClickListenerC7404cva.this.requireContext();
                C8632dsu.a(requireContext, "");
                String profileGuid = interfaceC5283bvo.getProfileGuid();
                C8632dsu.a(profileGuid, "");
                f = View$OnClickListenerC7404cva.this.f;
                e2.a(requireContext, profileGuid, f, interfaceC4208baF);
                CLv2Utils.INSTANCE.b(new Focus(AppView.downloadedForYouOptInButton, null), (Command) new ChangeValueCommand(Boolean.TRUE), false);
                View$OnClickListenerC7404cva.this.h();
                View$OnClickListenerC7404cva.this.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(List<String> list) {
        C7346cuV c7346cuV = this.b;
        if (c7346cuV == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        c7346cuV.i.showImage(list.get(0));
        c7346cuV.h.showImage(list.get(1));
        c7346cuV.f.showImage(list.get(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        String profileGuid;
        if (this.d == this.f) {
            return;
        }
        HashMap hashMap = new HashMap();
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        InterfaceC5283bvo j = k != null ? k.j() : null;
        String str = "";
        hashMap.put("profile", (j == null || (r3 = j.getProfileGuid()) == null) ? "" : "");
        if (j != null && (profileGuid = j.getProfileGuid()) != null) {
            str = profileGuid;
        }
        hashMap.put("current_profile", str);
        CLv2Utils.INSTANCE.b(new Focus(AppView.downloadedForYouStorageSelector, CLv2Utils.a(hashMap)), (Command) new ChangeValueCommand(Float.valueOf(this.f)), false);
    }

    private final void e(String str) {
        C7346cuV c7346cuV = this.b;
        if (c7346cuV == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        c7346cuV.d.setText(str);
        c7346cuV.d.setContentDescription(C8168dfL.a(com.netflix.mediaclient.ui.R.o.s, str));
    }

    private final void j() {
        C7346cuV c7346cuV = this.b;
        if (c7346cuV == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        dsE dse = dsE.b;
        String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(this.f)}, 1));
        C8632dsu.a(format, "");
        e(format);
        c7346cuV.f13774o.setText(C8168dfL.c(C8168dfL.a(com.netflix.mediaclient.ui.R.o.bl, format, String.valueOf(C8258dgw.a.e().c(this.f)))));
        if (this.f >= 9.5f) {
            c7346cuV.l.setEnabled(false);
            c7346cuV.l.setAlpha(0.2f);
        } else {
            c7346cuV.l.setEnabled(true);
            c7346cuV.l.setAlpha(1.0f);
        }
        if (this.f <= 0.5f) {
            c7346cuV.k.setEnabled(false);
            c7346cuV.k.setAlpha(0.2f);
            return;
        }
        c7346cuV.k.setEnabled(true);
        c7346cuV.k.setAlpha(1.0f);
    }

    private final void g() {
        float f = this.f;
        if (f >= 9.5f) {
            return;
        }
        float f2 = f + 0.5f;
        this.f = f2;
        e(String.valueOf(f2));
        j();
        o();
    }

    private final void i() {
        float f = this.f;
        if (f <= 0.5f) {
            return;
        }
        float f2 = f - 0.5f;
        this.f = f2;
        e(String.valueOf(f2));
        j();
        o();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        C8632dsu.c((Object) dialogInterface, "");
        super.onDismiss(dialogInterface);
        b();
    }

    private final void b() {
        PublishSubject<dpR> publishSubject = this.j;
        if (publishSubject != null) {
            publishSubject.onNext(dpR.c);
        }
        PublishSubject<dpR> publishSubject2 = this.j;
        if (publishSubject2 != null) {
            publishSubject2.onComplete();
        }
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("default_gb", Float.valueOf(this.f));
        Logger.INSTANCE.logEvent(new Presented(AppView.downloadedForYouLanding, Boolean.FALSE, CLv2Utils.a(hashMap)));
    }
}
