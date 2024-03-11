package o;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.ui.messaging.impl.MessagingEpoxyController;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC6677chn;
import o.AbstractC6684chu;
import o.AbstractC6684chu.d;
import o.C6649chL;
import o.C6651chN;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8931fy;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.dpR;
import o.drI;

/* renamed from: o.chu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6684chu<HOLDER extends d> extends bMW {
    private AbstractC6677chn g;
    private final InterfaceC8554dpx i;
    private HOLDER j;
    static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(AbstractC6684chu.class, "messagingViewModel", "getMessagingViewModel$netflix_modules_ui_messaging_impl_release()Lcom/netflix/mediaclient/ui/messaging/impl/mvrx/MessagingViewModel;", 0))};
    public static final b e = new b(null);
    public static final int b = 8;

    public abstract void a(HOLDER holder);

    public final void b(HOLDER holder) {
        this.j = holder;
    }

    public final HOLDER d() {
        return this.j;
    }

    protected abstract HOLDER e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, MessagingEpoxyController messagingEpoxyController);

    public final AbstractC6677chn g() {
        return this.g;
    }

    /* renamed from: o.chu$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC8882fB<AbstractC6684chu<HOLDER>, C6649chL> {
        final /* synthetic */ boolean a;
        final /* synthetic */ InterfaceC8660dtv b;
        final /* synthetic */ InterfaceC8660dtv c;
        final /* synthetic */ drM d;

        public c(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.b = interfaceC8660dtv;
            this.a = z;
            this.d = drm;
            this.c = interfaceC8660dtv2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC8882fB
        public /* bridge */ /* synthetic */ InterfaceC8554dpx<C6649chL> c(Object obj, dtC dtc) {
            return c((Fragment) obj, (dtC<?>) dtc);
        }

        public InterfaceC8554dpx<C6649chL> c(AbstractC6684chu<HOLDER> abstractC6684chu, dtC<?> dtc) {
            C8632dsu.c((Object) abstractC6684chu, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.b;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.c;
            return d.d(abstractC6684chu, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingBaseFrag$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: c */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C6651chN.class), this.a, this.d);
        }
    }

    public AbstractC6684chu() {
        final InterfaceC8660dtv a = dsA.a(C6649chL.class);
        this.i = new c(a, false, new drM<InterfaceC8890fJ<C6649chL, C6651chN>, C6649chL>() { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingBaseFrag$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.chL, o.fS] */
            @Override // o.drM
            /* renamed from: e */
            public final C6649chL invoke(InterfaceC8890fJ<C6649chL, C6651chN> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C6651chN.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a).c((c) this, d[0]);
    }

    /* renamed from: o.chu$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MessagingBaseFrag");
        }
    }

    public final C6649chL j() {
        return (C6649chL) this.i.getValue();
    }

    public final String b() {
        return (String) C8980gu.c(j(), new drM<C6651chN, String>() { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingBaseFrag$group$1
            @Override // o.drM
            /* renamed from: b */
            public final String invoke(C6651chN c6651chN) {
                C8632dsu.c((Object) c6651chN, "");
                AbstractC6677chn e2 = c6651chN.e();
                if (e2 != null) {
                    return e2.g();
                }
                return null;
            }
        });
    }

    public final void b(AbstractC6677chn abstractC6677chn) {
        if (abstractC6677chn != null) {
            AbstractC6677chn.j.d(abstractC6677chn.c());
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
                setArguments(arguments);
            }
            arguments.putString("messaging.api.screen.factory.key", abstractC6677chn.c());
        }
        this.g = abstractC6677chn;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        C8632dsu.a(requireContext2, "");
        MessagingEpoxyController messagingEpoxyController = new MessagingEpoxyController(requireContext2);
        C8632dsu.d(requireContext);
        HOLDER e2 = e(requireContext, layoutInflater, viewGroup, messagingEpoxyController);
        this.j = e2;
        return e2.b();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("messaging.api.screen.factory.key") : null;
        if (string == null) {
            throw new IllegalArgumentException("screen factory key is required in arguments".toString());
        }
        C8632dsu.a(string, "");
        if (this.g == null) {
            b(AbstractC6677chn.j.d(string).d(this));
            AbstractC6677chn abstractC6677chn = this.g;
            if (abstractC6677chn == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Context context = getContext();
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C8632dsu.a(context, "");
            if (!abstractC6677chn.b(context)) {
                dismiss();
            }
        }
        AbstractC6677chn abstractC6677chn2 = this.g;
        if (abstractC6677chn2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        setCancelable(abstractC6677chn2.e());
        j().a(abstractC6677chn2);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public boolean handleBackPressed() {
        return ((Boolean) C8980gu.c(j(), new drM<C6651chN, Boolean>() { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingBaseFrag$handleBackPressed$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(C6651chN c6651chN) {
                C8632dsu.c((Object) c6651chN, "");
                AbstractC6677chn e2 = c6651chN.e();
                return Boolean.valueOf(e2 != null ? e2.h() : false);
            }
        })).booleanValue();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C8980gu.c(j(), new drM<C6651chN, dpR>(this) { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingBaseFrag$onDestroyView$1
            final /* synthetic */ AbstractC6684chu<HOLDER> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.b = this;
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C6651chN c6651chN) {
                b(c6651chN);
                return dpR.c;
            }

            public final void b(C6651chN c6651chN) {
                C8632dsu.c((Object) c6651chN, "");
                AbstractC6677chn e2 = c6651chN.e();
                if (e2 != null) {
                    e2.f();
                }
                super/*com.netflix.mediaclient.android.fragment.NetflixDialogFrag*/.onDestroyView();
                this.b.b((AbstractC6684chu<HOLDER>) null);
            }
        });
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.c(j(), new drM<C6651chN, dpR>(this) { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingBaseFrag$invalidate$1
            final /* synthetic */ AbstractC6684chu<HOLDER> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.a = this;
            }

            @Override // o.drM
            /* renamed from: d */
            public final dpR invoke(C6651chN c6651chN) {
                C8632dsu.c((Object) c6651chN, "");
                AbstractC6684chu.d d2 = this.a.d();
                if (d2 != null) {
                    AbstractC6684chu<HOLDER> abstractC6684chu = this.a;
                    d2.d().setData(c6651chN);
                    abstractC6684chu.a(d2);
                    return dpR.c;
                }
                return null;
            }
        });
    }

    /* renamed from: o.chu$d */
    /* loaded from: classes4.dex */
    public static abstract class d {
        private final MessagingEpoxyController b;

        public abstract View b();

        public final MessagingEpoxyController d() {
            return this.b;
        }

        public d(MessagingEpoxyController messagingEpoxyController) {
            C8632dsu.c((Object) messagingEpoxyController, "");
            this.b = messagingEpoxyController;
        }
    }
}
