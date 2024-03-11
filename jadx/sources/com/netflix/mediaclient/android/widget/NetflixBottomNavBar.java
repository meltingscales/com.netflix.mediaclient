package com.netflix.mediaclient.android.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowInsets;
import com.netflix.android.widgetry.widget.tabs.BadgeView;
import com.netflix.android.widgetry.widget.tabs.BottomTabView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixBottomNavBar;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.ToIntFunction;
import javax.inject.Inject;
import o.AbstractC9927zH;
import o.C1044Mm;
import o.C1870aRh;
import o.C8126deW;
import o.C8141del;
import o.C8150deu;
import o.C8151dev;
import o.C8187dfe;
import o.C9618tM;
import o.C9867yA;
import o.C9870yD;
import o.C9936zQ;
import o.InterfaceC1598aHf;
import o.InterfaceC5283bvo;
import o.InterfaceC5844cKl;
import o.InterfaceC9934zO;
import o.RE;
import o.aIB;
import o.aQT;
import o.cNT;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class NetflixBottomNavBar extends RE {
    private View a;
    protected BottomTabView b;
    @Inject
    public Set<InterfaceC9934zO> bottomTabs;
    private final Runnable c;
    private int d;
    protected NetflixActivity e;
    private ObjectAnimator f;
    private int g;
    private final Set<c> h;
    @Inject
    public InterfaceC5844cKl profileApi;
    @Inject
    public cNT profileSelectionLauncher;

    /* loaded from: classes.dex */
    public interface c {
        void c(boolean z);
    }

    public BottomTabView a() {
        return this.b;
    }

    public static boolean e() {
        return !C8151dev.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        a().setImportantForAccessibility(2);
    }

    public NetflixBottomNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = -1;
        this.d = 0;
        this.c = new Runnable() { // from class: o.RX
            @Override // java.lang.Runnable
            public final void run() {
                NetflixBottomNavBar.this.i();
            }
        };
        this.h = new CopyOnWriteArraySet();
    }

    public NetflixBottomNavBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = -1;
        this.d = 0;
        this.c = new Runnable() { // from class: o.RX
            @Override // java.lang.Runnable
            public final void run() {
                NetflixBottomNavBar.this.i();
            }
        };
        this.h = new CopyOnWriteArraySet();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        a(getContext());
    }

    @SuppressLint({"CheckResult"})
    private void a(Context context) {
        NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
        this.e = netflixActivity;
        if (netflixActivity == null) {
            return;
        }
        this.b = (BottomTabView) findViewById(R.g.W);
        InterfaceC5283bvo b = C8126deW.b();
        if (b != null) {
            this.g = b.getMaturityValue();
        }
        o();
        final ArrayList arrayList = new ArrayList(5);
        ArrayList arrayList2 = new ArrayList(this.bottomTabs);
        arrayList2.sort(Comparator.comparingInt(new ToIntFunction() { // from class: o.RR
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                int a;
                a = NetflixBottomNavBar.a((InterfaceC9934zO) obj);
                return a;
            }
        }));
        if (aQT.j().h() || Config_Ab55851_MobileNav.j().f() || C1870aRh.j().h()) {
            a(arrayList2, InterfaceC9934zO.b.d.c, InterfaceC9934zO.b.c.b);
        }
        if (Config_Ab55851_MobileNav.j().f() || C1870aRh.j().h()) {
            a(arrayList2, InterfaceC9934zO.b.a.c, InterfaceC9934zO.b.c.b);
        }
        for (InterfaceC9934zO interfaceC9934zO : arrayList2) {
            if (interfaceC9934zO.e(this.e)) {
                final C9936zQ b2 = interfaceC9934zO.b();
                arrayList.add(b2);
                ((SingleSubscribeProxy) interfaceC9934zO.a(this.e).observeOn(AndroidSchedulers.mainThread()).as(AutoDispose.b(AndroidLifecycleScopeProvider.c(this.e)))).a(new Consumer() { // from class: o.RV
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        NetflixBottomNavBar.this.a(arrayList, b2, (Boolean) obj);
                    }
                });
            }
        }
        this.b.setTabs(arrayList);
        C9867yA keyboardState = this.e.getKeyboardState();
        keyboardState.c(new C9867yA.b() { // from class: com.netflix.mediaclient.android.widget.NetflixBottomNavBar.2
            @Override // o.C9867yA.b
            public void onKeyboardStateChanged(boolean z) {
                if (z) {
                    NetflixBottomNavBar.this.b(false);
                } else {
                    NetflixBottomNavBar.this.d(false);
                }
            }
        });
        setVisibility(keyboardState.d() ? 8 : 0);
        d(this.e.getIntent());
        this.b.setLabelVisibility(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(InterfaceC9934zO interfaceC9934zO) {
        return interfaceC9934zO.e().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, C9936zQ c9936zQ, Boolean bool) {
        if (bool.booleanValue()) {
            list.remove(c9936zQ);
            this.b.setTabs(list);
            return;
        }
        c9936zQ.e(true);
        this.b.c(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.a != null) {
            int size = View.MeasureSpec.getSize(i);
            this.a.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            int measuredWidth = this.a.getMeasuredWidth();
            if (this.b.e(size - (measuredWidth * 5))) {
                int i3 = measuredWidth * 2;
                C9870yD.d(this.b, 0, i3);
                C9870yD.d(this.b, 2, i3);
                this.a.setVisibility(0);
            } else if (this.b.e(size - measuredWidth)) {
                C9870yD.d(this.b, 0, 0);
                C9870yD.d(this.b, 2, measuredWidth);
                this.a.setVisibility(0);
            } else {
                this.a.setVisibility(8);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C9870yD.d(this, 3, windowInsets.getSystemWindowInsetBottom());
        return windowInsets;
    }

    private void d(Intent intent) {
        String str;
        InterfaceC9934zO interfaceC9934zO;
        this.b.setOnTabSelectedListener(new e(this.e));
        Iterator<InterfaceC9934zO> it = this.bottomTabs.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                interfaceC9934zO = null;
                break;
            }
            interfaceC9934zO = it.next();
            if (interfaceC9934zO.e() == InterfaceC9934zO.b.a.c) {
                break;
            }
        }
        if (intent != null && intent.hasExtra("bottomTab")) {
            try {
                str = intent.getStringExtra("bottomTab");
                Iterator<InterfaceC9934zO> it2 = this.bottomTabs.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC9934zO next = it2.next();
                    if (next.e().toString().equals(str)) {
                        interfaceC9934zO = next;
                        break;
                    }
                }
            } catch (Exception e2) {
                C1044Mm.a("NetflixBottomNavBar", "Couldn't find specified bottom tab", e2);
                InterfaceC1598aHf.a("Tab not found: " + intent.getComponent() + " tab: " + str);
            }
        } else {
            Iterator<InterfaceC9934zO> it3 = this.bottomTabs.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                InterfaceC9934zO next2 = it3.next();
                if (next2.c(this.e)) {
                    interfaceC9934zO = next2;
                    break;
                }
            }
        }
        this.b.setSelectedTabId(interfaceC9934zO.b().b(), false);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            C8187dfe.a(this.c, 1500L);
            return;
        }
        C8187dfe.e(this.c);
        a().setImportantForAccessibility(4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        j();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putInt("profileMaturityLevel", this.g);
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("superState");
            if (this.g == -1) {
                this.g = bundle.getInt("profileMaturityLevel");
                for (InterfaceC9934zO interfaceC9934zO : this.bottomTabs) {
                    if (!interfaceC9934zO.e(this.e)) {
                        this.b.b(interfaceC9934zO.b());
                    }
                }
            }
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @SuppressLint({"CheckResult"})
    protected void j() {
        for (final InterfaceC9934zO interfaceC9934zO : this.bottomTabs) {
            if (interfaceC9934zO.e(this.e)) {
                interfaceC9934zO.b(this.e).takeUntil(C9618tM.d(this)).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: o.RY
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        NetflixBottomNavBar.this.a(interfaceC9934zO, (AbstractC9927zH) obj);
                    }
                });
                interfaceC9934zO.g().takeUntil(C9618tM.d(this)).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: o.Sd
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        NetflixBottomNavBar.this.c(interfaceC9934zO, (Boolean) obj);
                    }
                });
                interfaceC9934zO.f().takeUntil(C9618tM.d(this)).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: o.Se
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        NetflixBottomNavBar.this.d(interfaceC9934zO, (String) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC9934zO interfaceC9934zO, AbstractC9927zH abstractC9927zH) {
        c(interfaceC9934zO.b().b(), abstractC9927zH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(InterfaceC9934zO interfaceC9934zO, Boolean bool) {
        a(interfaceC9934zO.b().b(), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(InterfaceC9934zO interfaceC9934zO, String str) {
        this.b.setTabImageUrl(interfaceC9934zO.b().b(), str);
    }

    private void a(int i, boolean z) {
        BadgeView b = a().b(i);
        if (b != null) {
            b.setBackgroundColor(getContext().getResources().getColor(R.c.u));
            b.setVisibility(z ? 0 : 8);
            b.setShowSmallCenterDot(z);
        }
    }

    private void c(int i, AbstractC9927zH abstractC9927zH) {
        BottomTabView a = a();
        BadgeView d = a.d(i);
        if (d != null) {
            d.setBackgroundColor(getContext().getResources().getColor(R.c.u));
            d.setVisibility(abstractC9927zH == AbstractC9927zH.a.d ? 8 : 0);
            if (abstractC9927zH instanceof AbstractC9927zH.c) {
                d.setDisplayType(BadgeView.DisplayType.TEXT);
                AbstractC9927zH.c cVar = (AbstractC9927zH.c) abstractC9927zH;
                d.setText(cVar.a());
                a.setBadgeContentDescription(i, cVar.d());
            } else if (abstractC9927zH instanceof AbstractC9927zH.d) {
                d.setDisplayType(BadgeView.DisplayType.PROGRESS);
                d.setProgress(((AbstractC9927zH.d) abstractC9927zH).d());
            } else if (abstractC9927zH instanceof AbstractC9927zH.b) {
                d.setDisplayType(BadgeView.DisplayType.DRAWABLE);
                d.setDrawable(((AbstractC9927zH.b) abstractC9927zH).e());
            }
        }
    }

    private void a(int i, final int i2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", i);
        ofFloat.setDuration(150L);
        ofFloat.setAutoCancel(true);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.netflix.mediaclient.android.widget.NetflixBottomNavBar.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == NetflixBottomNavBar.this.f) {
                    NetflixBottomNavBar.this.d = 0;
                    NetflixBottomNavBar.this.setVisibility(i2);
                }
            }
        });
        this.f = ofFloat;
        setVisibility(0);
        this.f.start();
    }

    public boolean g() {
        int i = this.d;
        if (i != 1) {
            return i != 2 && getVisibility() == 0;
        }
        return true;
    }

    public void b(boolean z) {
        boolean g = g();
        if (z && this.d != 2) {
            this.d = 2;
            a(getHeight(), 8);
        } else {
            h();
            setVisibility(8);
        }
        if (g) {
            f();
        }
    }

    public void d(boolean z) {
        NetflixActivity netflixActivity = this.e;
        if (netflixActivity == null || netflixActivity.getKeyboardState().d()) {
            return;
        }
        boolean g = g();
        if (z && this.d != 1) {
            this.d = 1;
            a(0, 0);
        } else {
            h();
            setVisibility(0);
        }
        if (g) {
            return;
        }
        f();
    }

    private void h() {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f = null;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        View findViewById = findViewById(R.g.Y);
        if (!z && findViewById == null) {
            View.inflate(getContext(), R.i.r, this);
        } else if (!z || findViewById == null) {
        } else {
            removeView(findViewById);
        }
    }

    private void o() {
        if (!C8150deu.h() || BrowseExperience.a()) {
            return;
        }
        aIB.b(this.e, new aIB.e() { // from class: o.RW
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                NetflixBottomNavBar.this.a(serviceManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final ServiceManager serviceManager) {
        if (serviceManager.o().isEmpty()) {
            return;
        }
        View inflate = ((ViewStub) findViewById(R.g.cN)).inflate();
        this.a = inflate;
        inflate.setOnClickListener(new View.OnClickListener() { // from class: o.RZ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NetflixBottomNavBar.this.b(serviceManager, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ServiceManager serviceManager, View view) {
        if (this.e == null || !serviceManager.c()) {
            return;
        }
        List<InterfaceC5283bvo> o2 = serviceManager.o();
        if (o2.size() == 1) {
            this.profileApi.a(this.e, o2.get(0));
        } else if (o2.size() > 1) {
            cNT cnt = this.profileSelectionLauncher;
            NetflixActivity netflixActivity = this.e;
            this.e.startActivity(cnt.d(netflixActivity, netflixActivity.getUiScreen()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements BottomTabView.c {
        private final NetflixActivity a;

        e(NetflixActivity netflixActivity) {
            this.a = netflixActivity;
        }

        @Override // com.netflix.android.widgetry.widget.tabs.BottomTabView.c
        public boolean b(C9936zQ c9936zQ) {
            InterfaceC9934zO interfaceC9934zO;
            Iterator<InterfaceC9934zO> it = NetflixBottomNavBar.this.bottomTabs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC9934zO = null;
                    break;
                }
                interfaceC9934zO = it.next();
                if (interfaceC9934zO.b().b() == c9936zQ.b()) {
                    break;
                }
            }
            if (interfaceC9934zO == null) {
                C1044Mm.e("NetflixBottomNavBar", "No matching tab found for: " + c9936zQ);
                return false;
            } else if (interfaceC9934zO.d(NetflixBottomNavBar.this.e)) {
                CLv2Utils.INSTANCE.d(interfaceC9934zO.d(), interfaceC9934zO.a(), null, null, null, true, null);
                d(interfaceC9934zO.b(this.a.getUiScreen()), interfaceC9934zO);
                return false;
            } else {
                return false;
            }
        }

        private void d(Intent intent, InterfaceC9934zO interfaceC9934zO) {
            intent.putExtra("bottomTab", interfaceC9934zO.e().toString());
            intent.putExtra("fromBottomTab", true);
            intent.addFlags(131072);
            this.a.startActivity(intent);
            this.a.overridePendingTransition(0, 0);
        }
    }

    public static boolean e(Intent intent) {
        return intent != null && intent.hasExtra("fromBottomTab");
    }

    private void f() {
        for (c cVar : this.h) {
            cVar.c(g());
        }
    }

    public void e(c cVar) {
        this.h.add(cVar);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    private void a(List<InterfaceC9934zO> list, InterfaceC9934zO.b bVar, InterfaceC9934zO.b bVar2) {
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            InterfaceC9934zO interfaceC9934zO = list.get(i3);
            if (interfaceC9934zO.e() == bVar) {
                i = i3;
            }
            if (interfaceC9934zO.e() == bVar2) {
                i2 = i3;
            }
        }
        if (i < 0 || i2 < 0) {
            return;
        }
        Collections.swap(list, i, i2);
    }
}
