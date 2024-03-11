package com.netflix.mediaclient.ui.gamecontrollermagicpath.impl;

import android.view.MenuItem;
import androidx.activity.ComponentActivity;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.api.MagicPathUiType;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.RealDismissedBeaconWatcher$watch$1;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC3855bNd;
import o.C3874bNw;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC3859bNh;
import o.InterfaceC3862bNk;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyS;

/* loaded from: classes4.dex */
public final class RealDismissedBeaconWatcher$watch$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MenuItem a;
    int b;
    final /* synthetic */ C3874bNw c;
    final /* synthetic */ ComponentActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDismissedBeaconWatcher$watch$1(C3874bNw c3874bNw, MenuItem menuItem, ComponentActivity componentActivity, InterfaceC8585dra<? super RealDismissedBeaconWatcher$watch$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c3874bNw;
        this.a = menuItem;
        this.e = componentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new RealDismissedBeaconWatcher$watch$1(this.c, this.a, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((RealDismissedBeaconWatcher$watch$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC3862bNk interfaceC3862bNk;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            C3874bNw.c.getLogTag();
            interfaceC3862bNk = this.c.d;
            dyS<AbstractC3855bNd.c> b = interfaceC3862bNk.b();
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.a, this.c, this.e);
            this.b = 1;
            if (b.collect(anonymousClass5, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }

    /* renamed from: com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.RealDismissedBeaconWatcher$watch$1$5  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass5<T> implements dyQ {
        final /* synthetic */ MenuItem b;
        final /* synthetic */ ComponentActivity c;
        final /* synthetic */ C3874bNw d;

        AnonymousClass5(MenuItem menuItem, C3874bNw c3874bNw, ComponentActivity componentActivity) {
            this.b = menuItem;
            this.d = c3874bNw;
            this.c = componentActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(MenuItem menuItem) {
            C8632dsu.c((Object) menuItem, "");
            return true;
        }

        @Override // o.dyQ
        /* renamed from: a */
        public final Object emit(final AbstractC3855bNd.c cVar, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            C3874bNw.c.getLogTag();
            if ((cVar != null ? cVar.b() : null) != null) {
                this.b.setEnabled(true);
                this.b.setVisible(true);
                MenuItem menuItem = this.b;
                final C3874bNw c3874bNw = this.d;
                final ComponentActivity componentActivity = this.c;
                menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.bNA
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem2) {
                        boolean e;
                        e = RealDismissedBeaconWatcher$watch$1.AnonymousClass5.e(C3874bNw.this, componentActivity, cVar, menuItem2);
                        return e;
                    }
                });
            } else {
                this.b.setEnabled(false);
                this.b.setVisible(false);
                this.b.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.bNE
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem2) {
                        boolean e;
                        e = RealDismissedBeaconWatcher$watch$1.AnonymousClass5.e(menuItem2);
                        return e;
                    }
                });
            }
            return dpR.c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(C3874bNw c3874bNw, ComponentActivity componentActivity, AbstractC3855bNd.c cVar, MenuItem menuItem) {
            InterfaceC3859bNh interfaceC3859bNh;
            C8632dsu.c((Object) c3874bNw, "");
            C8632dsu.c((Object) componentActivity, "");
            C8632dsu.c((Object) menuItem, "");
            interfaceC3859bNh = c3874bNw.e;
            interfaceC3859bNh.d(componentActivity, MagicPathUiType.c, cVar.b());
            return true;
        }
    }
}
