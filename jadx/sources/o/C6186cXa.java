package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaDimensions;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaModalAttributes;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaStyle;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o.ActivityC6219cYg;
import o.C6186cXa;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;

/* renamed from: o.cXa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6186cXa extends NetflixDialogFrag {
    public static final e c = new e(null);
    public static final int d = 8;
    private UmaAlert a;
    private UserMessageAreaView b;
    private C6190cXe e;

    /* renamed from: o.cXa$b */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[UmaAlert.ModalPlacement.values().length];
            try {
                iArr[UmaAlert.ModalPlacement.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UmaAlert.ModalPlacement.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            c = iArr;
            int[] iArr2 = new int[UmaAlert.Template.values().length];
            try {
                iArr2[UmaAlert.Template.WHITE_MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UmaAlert.Template.COLLECTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UmaAlert.Template.FLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr2;
        }
    }

    public static final C6186cXa a(Context context, UmaAlert umaAlert) {
        return c.d(context, umaAlert);
    }

    public static final C6186cXa d(Context context, UmaAlert umaAlert, ImageResolutionClass imageResolutionClass) {
        return c.d(context, umaAlert, imageResolutionClass);
    }

    public final UserMessageAreaView a() {
        return this.b;
    }

    public final void a(UserMessageAreaView userMessageAreaView) {
        this.b = userMessageAreaView;
    }

    /* renamed from: o.cXa$e */
    /* loaded from: classes5.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public final C6186cXa d(Context context, UmaAlert umaAlert) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) umaAlert, "");
            return b(this, context, umaAlert, null, 4, null);
        }

        private e() {
            super("UmaDialogFrag");
        }

        public static /* synthetic */ C6186cXa b(e eVar, Context context, UmaAlert umaAlert, ImageResolutionClass imageResolutionClass, int i, Object obj) {
            if ((i & 4) != 0) {
                imageResolutionClass = null;
            }
            return eVar.d(context, umaAlert, imageResolutionClass);
        }

        public final C6186cXa d(Context context, UmaAlert umaAlert, ImageResolutionClass imageResolutionClass) {
            UserMessageAreaView userMessageAreaView;
            UserMessageAreaView c6201cXp;
            C6198cXm a;
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) umaAlert, "");
            C6186cXa c6186cXa = new C6186cXa();
            InterfaceC1593aHa.c.a("Uma Modal fragment created");
            c6186cXa.a = umaAlert;
            if (umaAlert.getTemplateType() == UmaAlert.Template.WHITE_MODAL) {
                userMessageAreaView = new cXU(context);
            } else if (umaAlert.getTemplateType() == UmaAlert.Template.THEMED_PROMO) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("com.netflix.mediaclient.ui.ums.DISABLE_DEFAULT_BACKGROUND", true);
                c6186cXa.setArguments(bundle);
                if (umaAlert.modalPlacement() != UmaAlert.ModalPlacement.BOTTOM) {
                    a = C6198cXm.c.e(context, imageResolutionClass);
                } else {
                    a = C6198cXm.c.a(context, imageResolutionClass);
                }
                userMessageAreaView = a;
            } else {
                if (umaAlert.getTemplateType() == UmaAlert.Template.COLLECTIONS && umaAlert.modalAlert()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("com.netflix.mediaclient.ui.ums.DISABLE_DEFAULT_BACKGROUND", true);
                    c6186cXa.setArguments(bundle2);
                    c6201cXp = new C6195cXj(context, imageResolutionClass);
                } else if (umaAlert.getTemplateType() == UmaAlert.Template.FLEXIBLE) {
                    c6201cXp = new C6201cXp(context, imageResolutionClass);
                } else {
                    userMessageAreaView = new UserMessageAreaView(context, UserMessageAreaView.MessageType.DIALOG);
                }
                userMessageAreaView = c6201cXp;
            }
            c6186cXa.a(userMessageAreaView);
            UserMessageAreaView a2 = c6186cXa.a();
            if (a2 != null) {
                a2.a(umaAlert, c6186cXa);
            }
            return c6186cXa;
        }
    }

    public final void d(UmaAlert umaAlert) {
        C8632dsu.c((Object) umaAlert, "");
        this.a = umaAlert;
        UserMessageAreaView userMessageAreaView = this.b;
        if (userMessageAreaView != null) {
            userMessageAreaView.e(umaAlert);
        }
        setCancelable(!umaAlert.blocking());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        UmaAlert.ModalPlacement modalPlacement;
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) layoutInflater, "");
        if (this.b == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("umaView=null for Uma Modal", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
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
                return null;
            }
            dVar.e().b(c1596aHd, th);
            return null;
        }
        InterfaceC1593aHa.c.a("Uma Modal onCreateView");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        UmaAlert umaAlert = this.a;
        if (umaAlert != null) {
            setCancelable(!umaAlert.blocking());
        }
        UmaAlert umaAlert2 = this.a;
        if (umaAlert2 == null || (modalPlacement = umaAlert2.modalPlacement()) == null) {
            modalPlacement = UmaAlert.ModalPlacement.CENTER;
        }
        int i = b.c[modalPlacement.ordinal()];
        if (i == 1) {
            View inflate = layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.bB, viewGroup, false);
            C8632dsu.d(inflate);
            View findViewById = inflate.findViewById(com.netflix.mediaclient.ui.R.g.gJ);
            C8632dsu.d(findViewById);
            ((LinearLayout) findViewById).addView(this.b, new LinearLayout.LayoutParams(-1, -2));
            return inflate;
        } else if (i == 2) {
            Context requireContext = requireContext();
            C8632dsu.a(requireContext, "");
            C6190cXe c6190cXe = new C6190cXe(requireContext, new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.ums.UmaDialogFrag$onCreateView$sheet$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(View view) {
                    a(view);
                    return dpR.c;
                }

                public final void a(View view) {
                    C8632dsu.c((Object) view, "");
                    C6186cXa.this.e = null;
                    C6186cXa.this.dismissAllowingStateLoss();
                }
            });
            ((ViewGroup) c6190cXe.findViewById(com.netflix.mediaclient.ui.R.g.fK)).addView(this.b, new FrameLayout.LayoutParams(-1, -2));
            UmaAlert umaAlert3 = this.a;
            if (umaAlert3 != null && !umaAlert3.blocking()) {
                c6190cXe.setOnClickListener(new View.OnClickListener() { // from class: o.cWW
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C6186cXa.e(C6186cXa.this, view);
                    }
                });
            }
            this.e = c6190cXe;
            return c6190cXe;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C6186cXa c6186cXa, View view) {
        ServiceManager serviceManager;
        C8632dsu.c((Object) c6186cXa, "");
        FragmentActivity activity = c6186cXa.getActivity();
        NetflixActivity netflixActivity = activity instanceof NetflixActivity ? (NetflixActivity) activity : null;
        if (netflixActivity != null && (serviceManager = netflixActivity.getServiceManager()) != null) {
            serviceManager.b();
        }
        UserMessageAreaView userMessageAreaView = c6186cXa.b;
        if (userMessageAreaView != null) {
            userMessageAreaView.x();
        }
        c6186cXa.dismissAllowingStateLoss();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C6190cXe c6190cXe;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        UmaAlert umaAlert = this.a;
        if ((umaAlert != null ? umaAlert.modalPlacement() : null) != UmaAlert.ModalPlacement.BOTTOM || (c6190cXe = this.e) == null) {
            return;
        }
        c6190cXe.open();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Dialog dialog;
        Window window;
        super.onResume();
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("com.netflix.mediaclient.ui.ums.DISABLE_DEFAULT_BACKGROUND") || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(17170445);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        UserMessageAreaView userMessageAreaView = this.b;
        ViewParent parent = userMessageAreaView != null ? userMessageAreaView.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.b);
        }
        InterfaceC1593aHa.c.a("Uma Modal onDestroyView");
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        C6190cXe c6190cXe;
        UmaAlert umaAlert = this.a;
        if ((umaAlert != null ? umaAlert.modalPlacement() : null) != UmaAlert.ModalPlacement.BOTTOM || (c6190cXe = this.e) == null) {
            super.dismissAllowingStateLoss();
        } else if (c6190cXe != null) {
            c6190cXe.close();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        C8632dsu.c((Object) dialogInterface, "");
        InterfaceC1593aHa.c.a("Uma Modal dismissed");
        UserMessageAreaView userMessageAreaView = this.b;
        if (userMessageAreaView != null) {
            userMessageAreaView.x();
        }
        super.onDismiss(dialogInterface);
    }

    public final void d(final NetflixActivity netflixActivity) {
        C8187dfe.e.a().post(new Runnable() { // from class: o.cWZ
            @Override // java.lang.Runnable
            public final void run() {
                C6186cXa.c(NetflixActivity.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(NetflixActivity netflixActivity, C6186cXa c6186cXa) {
        C8632dsu.c((Object) c6186cXa, "");
        if (netflixActivity == null || C9737vz.a(netflixActivity) || netflixActivity.getSupportFragmentManager().isStateSaved() || c6186cXa.isAdded()) {
            return;
        }
        UmaAlert umaAlert = c6186cXa.a;
        if ((umaAlert != null ? umaAlert.modalPlacement() : null) == UmaAlert.ModalPlacement.BOTTOM) {
            netflixActivity.showFullScreenDialog(c6186cXa);
        } else {
            c6186cXa.showNow(netflixActivity.getSupportFragmentManager(), "UmaDialogFrag");
        }
        InterfaceC1593aHa.c.a("Uma Modal displayed");
        UserMessageAreaView userMessageAreaView = c6186cXa.b;
        if (userMessageAreaView != null) {
            userMessageAreaView.y();
        }
    }

    public final void b(String str, String str2) {
        if (getContext() == null || str2 == null || str2.length() == 0) {
            return;
        }
        C6220cYh c6220cYh = C6220cYh.c;
        c6220cYh.d(str);
        ActivityC6219cYg.d dVar = ActivityC6219cYg.d;
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        startActivityForResult(dVar.a(requireContext, str2), MP.b);
        c6220cYh.a();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        int dimensionPixelSize;
        Float opacity;
        UmaModalAttributes modalAttributes;
        UmaModalAttributes modalAttributes2;
        UmaDimensions dialogDimensions;
        Integer widthAsInteger;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        UmaAlert umaAlert = this.a;
        UmaStyle umaStyle = null;
        UmaAlert.Template templateType = umaAlert != null ? umaAlert.getTemplateType() : null;
        int i = templateType == null ? -1 : b.a[templateType.ordinal()];
        if (i == 1) {
            dimensionPixelSize = getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.ac);
        } else if (i == 2) {
            dimensionPixelSize = getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.T);
        } else if (i != 3) {
            dimensionPixelSize = getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.W);
        } else {
            UmaAlert umaAlert2 = this.a;
            if (umaAlert2 == null || (modalAttributes2 = umaAlert2.modalAttributes()) == null || (dialogDimensions = modalAttributes2.dialogDimensions()) == null || (widthAsInteger = dialogDimensions.getWidthAsInteger()) == null) {
                dimensionPixelSize = getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.W);
            } else {
                C8632dsu.d(widthAsInteger);
                C1332Xp c1332Xp = C1332Xp.b;
                dimensionPixelSize = (int) TypedValue.applyDimension(1, widthAsInteger.intValue(), ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            }
        }
        if (C8150deu.o(getContext()) > dimensionPixelSize) {
            window.setLayout(dimensionPixelSize, -2);
        } else {
            window.setLayout(-1, -2);
        }
        window.setGravity(17);
        UmaAlert umaAlert3 = this.a;
        if ((umaAlert3 != null ? umaAlert3.getTemplateType() : null) == UmaAlert.Template.COLLECTIONS) {
            window.setDimAmount(0.8f);
            return;
        }
        UmaAlert umaAlert4 = this.a;
        if ((umaAlert4 != null ? umaAlert4.getTemplateType() : null) == UmaAlert.Template.FLEXIBLE) {
            UmaAlert umaAlert5 = this.a;
            if (umaAlert5 != null && (modalAttributes = umaAlert5.modalAttributes()) != null) {
                umaStyle = modalAttributes.scrim();
            }
            if (umaStyle != null && (opacity = umaStyle.opacity()) != null) {
                window.setDimAmount(opacity.floatValue());
            }
            window.getDecorView().getBackground().setAlpha(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == MP.b && i2 == -1) {
            dismiss();
            C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.ums.UmaDialogFrag$onActivityResult$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                    d(serviceManager);
                    return dpR.c;
                }

                public final void d(ServiceManager serviceManager) {
                    C8632dsu.c((Object) serviceManager, "");
                    serviceManager.b();
                }
            });
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public boolean handleBackPressed() {
        ServiceManager serviceManager;
        UmaAlert umaAlert = this.a;
        if ((umaAlert != null ? umaAlert.modalPlacement() : null) == UmaAlert.ModalPlacement.BOTTOM) {
            UmaAlert umaAlert2 = this.a;
            if (umaAlert2 == null || umaAlert2.blocking()) {
                return true;
            }
            FragmentActivity activity = getActivity();
            NetflixActivity netflixActivity = activity instanceof NetflixActivity ? (NetflixActivity) activity : null;
            if (netflixActivity != null && (serviceManager = netflixActivity.getServiceManager()) != null) {
                serviceManager.b();
            }
            UserMessageAreaView userMessageAreaView = this.b;
            if (userMessageAreaView != null) {
                userMessageAreaView.x();
            }
            dismissAllowingStateLoss();
            return true;
        }
        return super.handleBackPressed();
    }
}
