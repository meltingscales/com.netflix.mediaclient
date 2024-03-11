package com.netflix.mediaclient.ui.notificationpermission.impl;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Inject;
import o.AbstractC4140bXs;
import o.AbstractC6677chn;
import o.C1045Mp;
import o.C7096cpk;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC7088cpc;
import o.InterfaceC7089cpd;
import o.InterfaceC7090cpe;

/* loaded from: classes4.dex */
public final class NotificationPermissionApplicationImpl implements InterfaceC7088cpc {
    private final InterfaceC7089cpd a;
    public static final a e = new a(null);
    public static final int c = 8;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface NotificationPermissionApplicationModule {
        @Binds
        InterfaceC7088cpc c(NotificationPermissionApplicationImpl notificationPermissionApplicationImpl);
    }

    @Inject
    public NotificationPermissionApplicationImpl(InterfaceC7089cpd interfaceC7089cpd) {
        C8632dsu.c((Object) interfaceC7089cpd, "");
        this.a = interfaceC7089cpd;
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NotificationPermissionApplicationImpl");
        }
    }

    @Override // o.InterfaceC7088cpc
    public void b() {
        AbstractC6677chn.d dVar = AbstractC6677chn.j;
        dVar.d("Notification.Permission.Modal", new c());
        dVar.d("Notification.Pretiramisu.Consent.Modal", new d());
        dVar.d("Notification.RemindMe.Permission.Modal", new b());
    }

    /* loaded from: classes4.dex */
    public static final class c implements AbstractC6677chn.a {
        c() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC7090cpe.c cVar = InterfaceC7090cpe.b;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC7090cpe e = cVar.e(requireActivity);
            C8632dsu.d(e);
            return ((NotificationPermissionImpl) e).e();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements AbstractC6677chn.a {
        d() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC7090cpe.c cVar = InterfaceC7090cpe.b;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC7090cpe e = cVar.e(requireActivity);
            C8632dsu.d(e);
            return ((NotificationPermissionImpl) e).e();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements AbstractC6677chn.a {
        b() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC7090cpe.c cVar = InterfaceC7090cpe.b;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC7090cpe e = cVar.e(requireActivity);
            C8632dsu.d(e);
            return ((NotificationPermissionImpl) e).a((String) null);
        }
    }

    @Override // o.InterfaceC7088cpc
    public AbstractC4140bXs b(AbstractC4140bXs.d dVar) {
        C8632dsu.c((Object) dVar, "");
        return new C7096cpk(dVar, this.a);
    }
}
