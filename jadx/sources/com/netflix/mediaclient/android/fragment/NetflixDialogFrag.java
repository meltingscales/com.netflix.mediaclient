package com.netflix.mediaclient.android.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import o.AbstractC1083Oa;
import o.C1044Mm;
import o.C8187dfe;
import o.InterfaceC1077Nv;
import o.InterfaceC1078Nw;
import o.InterfaceC1573aGh;
import o.InterfaceC1598aHf;
import o.InterfaceC5091bsH;
import o.dpR;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes.dex */
public abstract class NetflixDialogFrag extends AbstractC1083Oa implements InterfaceC1077Nv, InterfaceC5091bsH {
    private static final String TAG = "NetflixDialogFrag";
    protected int actionBarPadding;
    public int bottomPadding;
    private boolean isDestroyed;
    protected InterfaceC1077Nv.e mLoadingStatusCallback;
    private int mSystemUiVisibility;
    public int statusBarPadding;
    @Inject
    public Lazy<InterfaceC1573aGh> uiLatencyTracker;
    public final CompositeDisposable onDestroyDisposable = new CompositeDisposable();
    private final Set<a> dismissOrCancelListeners = new HashSet();

    protected void applyActivityPadding(View view) {
    }

    public AppView getAppView() {
        return null;
    }

    @Override // o.AbstractC1083Oa, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // o.AbstractC1083Oa, androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public /* bridge */ /* synthetic */ ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    public boolean handleBackPressed() {
        return false;
    }

    protected boolean isDestroyed() {
        return this.isDestroyed;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    protected boolean isOptInForUiLatencyTracker() {
        return false;
    }

    @Override // o.AbstractC1083Oa, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle);
    }

    @Override // o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
    }

    @Override // o.InterfaceC5091bsH
    public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
    }

    public void setWindowFlags(int i) {
        this.mSystemUiVisibility = i;
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(NetflixDialogFrag netflixDialogFrag) {
        }

        public void b(NetflixDialogFrag netflixDialogFrag) {
        }

        public void d(NetflixDialogFrag netflixDialogFrag) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(NetflixDialogFrag netflixDialogFrag) {
            b(netflixDialogFrag);
            a(netflixDialogFrag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(NetflixDialogFrag netflixDialogFrag) {
            d(netflixDialogFrag);
            a(netflixDialogFrag);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setupUiLatencyTracker(bundle == null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        applyActivityPadding(view);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        boolean showsDialog = getShowsDialog();
        if (getDialog() == null) {
            C1044Mm.j(TAG, getClass().getSimpleName() + ": Dialog is null upon activity creation! Setting shows dialog to false.");
            setShowsDialog(false);
        } else {
            getDialog().getWindow().getDecorView().setSystemUiVisibility(this.mSystemUiVisibility);
        }
        super.onActivityCreated(bundle);
        setShowsDialog(showsDialog);
        C8187dfe.a(new Runnable() { // from class: com.netflix.mediaclient.android.fragment.NetflixDialogFrag.4
            @Override // java.lang.Runnable
            public void run() {
                if (NetflixDialogFrag.this.getDialog() != null) {
                    NetflixDialogFrag.this.getDialog().getWindow().clearFlags(8);
                }
            }
        }, 1L);
    }

    public ServiceManager getServiceManager() {
        return ServiceManager.c(getNetflixActivity());
    }

    public void addDismissOrCancelListener(a aVar) {
        this.dismissOrCancelListeners.add(aVar);
    }

    public void onDismissOrCancel(final drM<NetflixDialogFrag, dpR> drm) {
        this.dismissOrCancelListeners.add(new a() { // from class: com.netflix.mediaclient.android.fragment.NetflixDialogFrag.2
            @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag.a
            public void a(NetflixDialogFrag netflixDialogFrag) {
                drm.invoke(netflixDialogFrag);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.onDestroyDisposable.clear();
        this.isDestroyed = true;
    }

    @Override // o.InterfaceC1077Nv
    public void setLoadingStatusCallback(InterfaceC1077Nv.e eVar) {
        if (isLoadingData() || eVar == null) {
            this.mLoadingStatusCallback = eVar;
        } else {
            eVar.c(InterfaceC1078Nw.aJ);
        }
    }

    protected void onLoaded(Status status) {
        InterfaceC1077Nv.e eVar = this.mLoadingStatusCallback;
        if (eVar != null) {
            eVar.c(status);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalStateException e) {
            C1044Mm.d(TAG, "Error dismissing dialog", e);
            InterfaceC1598aHf.e("Error dismissing dialog", e);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        for (a aVar : this.dismissOrCancelListeners) {
            aVar.e(this);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        try {
            super.onDismiss(dialogInterface);
            C1044Mm.e(TAG, "NetflixDialogFrag is dismissed");
        } catch (IllegalStateException e) {
            C1044Mm.d(TAG, "Error dismissing dialog", e);
            InterfaceC1598aHf.e("Error dismissing dialog", e);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        for (a aVar : this.dismissOrCancelListeners) {
            aVar.c(this);
        }
    }

    public NetflixActivity requireNetflixActivity() {
        NetflixActivity netflixActivity = (NetflixActivity) getActivity();
        Objects.requireNonNull(netflixActivity);
        return netflixActivity;
    }

    public NetflixActivity getNetflixActivity() {
        return (NetflixActivity) getActivity();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getWindow().addFlags(8);
        return onCreateDialog;
    }

    public void setActivityPadding(int i, int i2, int i3) {
        this.statusBarPadding = i;
        this.actionBarPadding = i2;
        this.bottomPadding = i3;
        dispatchApplyActivityPadding();
    }

    public void setActionBarPadding(int i) {
        this.actionBarPadding = i;
        dispatchApplyActivityPadding();
    }

    public void setStatusBarPadding(int i) {
        this.statusBarPadding = i;
        dispatchApplyActivityPadding();
    }

    public void setBottomPadding(int i) {
        this.bottomPadding = i;
        dispatchApplyActivityPadding();
    }

    private void dispatchApplyActivityPadding() {
        View view = getView();
        if (view != null) {
            applyActivityPadding(view);
        }
    }

    private void setupUiLatencyTracker(boolean z) {
        if (isOptInForUiLatencyTracker()) {
            AppView appView = getAppView();
            if (appView == null) {
                InterfaceC1598aHf.a("appView cannot be null in setupUiLatencyTracker");
            } else {
                this.uiLatencyTracker.get().a(appView, this, requireNetflixActivity()).a(z).b().a();
            }
        }
    }
}
