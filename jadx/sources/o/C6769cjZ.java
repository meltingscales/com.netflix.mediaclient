package o;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import javax.inject.Inject;
import o.AbstractC6677chn;
import o.InterfaceC6766cjW;

/* renamed from: o.cjZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6769cjZ implements InterfaceC6767cjX {
    private final Application d;

    @Inject
    public C6769cjZ(Application application) {
        C8632dsu.c((Object) application, "");
        this.d = application;
    }

    @Override // o.InterfaceC6767cjX
    public void d() {
        AbstractC6677chn.d dVar = AbstractC6677chn.j;
        dVar.d("ManagePrimaryHomeScreen.Screen", new a());
        dVar.d("UpdatePrimaryHome.Screen", new c());
        dVar.d("UpdateInstructionsScreen.Screen", new e());
        dVar.d("VerifyTravel.Screen", new d());
        dVar.d("CodeEntry.Screen", new b());
        dVar.d("MisdetectionResolutionScreen.Screen", new g());
    }

    /* renamed from: o.cjZ$a */
    /* loaded from: classes4.dex */
    public static final class a implements AbstractC6677chn.a {
        a() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6766cjW.a aVar = InterfaceC6766cjW.a;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            return aVar.c(requireActivity).e();
        }
    }

    /* renamed from: o.cjZ$c */
    /* loaded from: classes4.dex */
    public static final class c implements AbstractC6677chn.a {
        c() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6766cjW.a aVar = InterfaceC6766cjW.a;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            return aVar.c(requireActivity).h();
        }
    }

    /* renamed from: o.cjZ$e */
    /* loaded from: classes4.dex */
    public static final class e implements AbstractC6677chn.a {
        e() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6766cjW.a aVar = InterfaceC6766cjW.a;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            return aVar.c(requireActivity).j();
        }
    }

    /* renamed from: o.cjZ$d */
    /* loaded from: classes4.dex */
    public static final class d implements AbstractC6677chn.a {
        d() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6766cjW.a aVar = InterfaceC6766cjW.a;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            return aVar.c(requireActivity).i();
        }
    }

    /* renamed from: o.cjZ$b */
    /* loaded from: classes4.dex */
    public static final class b implements AbstractC6677chn.a {
        b() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6766cjW.a aVar = InterfaceC6766cjW.a;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            return aVar.c(requireActivity).b();
        }
    }

    /* renamed from: o.cjZ$g */
    /* loaded from: classes4.dex */
    public static final class g implements AbstractC6677chn.a {
        g() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6766cjW.a aVar = InterfaceC6766cjW.a;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            return aVar.c(requireActivity).d();
        }
    }
}
