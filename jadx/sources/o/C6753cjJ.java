package o;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import javax.inject.Inject;
import o.AbstractC6677chn;
import o.InterfaceC6746cjC;

/* renamed from: o.cjJ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6753cjJ implements InterfaceC6748cjE {
    public static final e c = new e(null);
    private final Application b;
    private final C6752cjI d;
    private final MoneyballData e;
    private final C6760cjQ g;

    public final C6752cjI a() {
        return this.d;
    }

    public final MoneyballData c() {
        return this.e;
    }

    public final C6760cjQ e() {
        return this.g;
    }

    @Inject
    public C6753cjJ(Application application) {
        C8632dsu.c((Object) application, "");
        this.b = application;
        this.d = new C6752cjI();
        this.e = new MoneyballData();
        this.g = new C6760cjQ();
    }

    /* renamed from: o.cjJ$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("MultihouseholdNudgeApplicationImpl");
        }
    }

    @Override // o.InterfaceC6748cjE
    public void d() {
        AbstractC6677chn.d dVar = AbstractC6677chn.j;
        dVar.d("VerifyCode.Email.Modal", new b());
        dVar.d("VerifyCode.SMS.Modal", new a());
        dVar.d("VerifyCode.Resent.Modal", new d());
        dVar.d("VerifyCode.Incorrect.Modal", new c());
        dVar.d("Create.Account.Modal", new i());
    }

    /* renamed from: o.cjJ$b */
    /* loaded from: classes4.dex */
    public static final class b implements AbstractC6677chn.a {
        b() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6746cjC.a aVar = InterfaceC6746cjC.c;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC6746cjC b = aVar.b(requireActivity);
            C8632dsu.d(b);
            return ((C6755cjL) b).e(C6753cjJ.this.e().b(C6753cjJ.this.c()), false);
        }
    }

    /* renamed from: o.cjJ$a */
    /* loaded from: classes4.dex */
    public static final class a implements AbstractC6677chn.a {
        a() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6746cjC.a aVar = InterfaceC6746cjC.c;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC6746cjC b = aVar.b(requireActivity);
            C8632dsu.d(b);
            return ((C6755cjL) b).a(C6753cjJ.this.e().b(C6753cjJ.this.c()), false);
        }
    }

    /* renamed from: o.cjJ$d */
    /* loaded from: classes4.dex */
    public static final class d implements AbstractC6677chn.a {
        d() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6746cjC.a aVar = InterfaceC6746cjC.c;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC6746cjC b = aVar.b(requireActivity);
            C8632dsu.d(b);
            return ((C6755cjL) b).c(C6753cjJ.this.e().b(C6753cjJ.this.c()), false);
        }
    }

    /* renamed from: o.cjJ$c */
    /* loaded from: classes4.dex */
    public static final class c implements AbstractC6677chn.a {
        c() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6746cjC.a aVar = InterfaceC6746cjC.c;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC6746cjC b = aVar.b(requireActivity);
            C8632dsu.d(b);
            return ((C6755cjL) b).d(C6753cjJ.this.e().b(C6753cjJ.this.c()), false);
        }
    }

    /* renamed from: o.cjJ$i */
    /* loaded from: classes4.dex */
    public static final class i implements AbstractC6677chn.a {
        i() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6746cjC.a aVar = InterfaceC6746cjC.c;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC6746cjC b = aVar.b(requireActivity);
            C8632dsu.d(b);
            return ((C6755cjL) b).b();
        }
    }
}
