package com.netflix.mediaclient.ui.offline.downloadedforyou;

import android.widget.CompoundButton;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouSettingsController;
import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouSettingsController$buildModels$1;
import kotlin.jvm.internal.Lambda;
import o.C7392cvO;
import o.C8258dgw;
import o.C8632dsu;
import o.InterfaceC4251baw;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class DownloadedForYouSettingsController$buildModels$1 extends Lambda implements drM<ServiceManager, dpR> {
    final /* synthetic */ DownloadedForYouSettingsController b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadedForYouSettingsController$buildModels$1(DownloadedForYouSettingsController downloadedForYouSettingsController) {
        super(1);
        this.b = downloadedForYouSettingsController;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
        d(serviceManager);
        return dpR.c;
    }

    public final void d(ServiceManager serviceManager) {
        boolean z;
        C8632dsu.c((Object) serviceManager, "");
        final InterfaceC4251baw p = serviceManager.p();
        final DownloadedForYouSettingsController downloadedForYouSettingsController = this.b;
        C7392cvO c7392cvO = new C7392cvO();
        c7392cvO.b((CharSequence) "top_model");
        c7392cvO.c(p != null ? p.b() : false);
        z = downloadedForYouSettingsController.isOptedIn;
        c7392cvO.d(z);
        c7392cvO.b(downloadedForYouSettingsController.getDownloadsFeatures().d());
        c7392cvO.e(downloadedForYouSettingsController.getDownloadsFeatures().a());
        c7392cvO.b(new CompoundButton.OnCheckedChangeListener() { // from class: o.cvs
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                DownloadedForYouSettingsController$buildModels$1.a(InterfaceC4251baw.this, compoundButton, z2);
            }
        });
        c7392cvO.c(new CompoundButton.OnCheckedChangeListener() { // from class: o.cvt
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                DownloadedForYouSettingsController$buildModels$1.c(DownloadedForYouSettingsController.this, compoundButton, z2);
            }
        });
        downloadedForYouSettingsController.add(c7392cvO);
        if (this.b.getDownloadsFeatures().a()) {
            this.b.buildProfileItemsForDownloadsForYou();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4251baw interfaceC4251baw, CompoundButton compoundButton, boolean z) {
        if (interfaceC4251baw != null) {
            interfaceC4251baw.d(z);
            CLv2Utils.INSTANCE.b(new Focus(AppView.smartDownloadsSetting, null), (Command) new ChangeValueCommand(Boolean.valueOf(z)), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(DownloadedForYouSettingsController downloadedForYouSettingsController, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) downloadedForYouSettingsController, "");
        C8258dgw.a.e().a(z, downloadedForYouSettingsController.getNetflixActivity());
        CLv2Utils.INSTANCE.b(new Focus(AppView.downloadedForYouSetup, null), (Command) new ChangeValueCommand(Boolean.valueOf(z)), false);
        downloadedForYouSettingsController.isOptedIn = z;
        downloadedForYouSettingsController.requestModelBuild();
    }
}
