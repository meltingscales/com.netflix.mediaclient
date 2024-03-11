package o;

import android.app.Activity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.model.leafs.social.NotificationsListSummary;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import o.C5087bsD;
import o.C5843cKk;
import o.C8632dsu;
import o.InterfaceC5125bsp;
import o.InterfaceC8585dra;
import o.dpR;

/* renamed from: o.cMn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5900cMn {
    private final Activity b;

    @Inject
    public C5900cMn(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.b = activity;
    }

    public final Object b(InterfaceC8585dra<? super C5843cKk> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e;
        b = C8590drf.b(interfaceC8585dra);
        final C8587drc c8587drc = new C8587drc(b);
        C1645aIz.a(this.b, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixLolomoRepository$fetchNotifications$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                e(serviceManager);
                return dpR.c;
            }

            public final void e(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                InterfaceC5125bsp j = serviceManager.j();
                final InterfaceC8585dra<C5843cKk> interfaceC8585dra2 = c8587drc;
                j.a(new C5087bsD() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixLolomoRepository$fetchNotifications$2$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super("myNetflix");
                    }

                    @Override // o.C5087bsD, o.InterfaceC5094bsK
                    public void d(NotificationsListSummary notificationsListSummary, Status status) {
                        List<NotificationSummaryItem> notifications;
                        super.d(notificationsListSummary, status);
                        if (notificationsListSummary == null || (notifications = notificationsListSummary.notifications()) == null) {
                            return;
                        }
                        InterfaceC8585dra<C5843cKk> interfaceC8585dra3 = interfaceC8585dra2;
                        Result.c cVar = Result.e;
                        interfaceC8585dra3.resumeWith(Result.e(new C5843cKk(notifications, notificationsListSummary, 0, 4, null)));
                    }
                });
            }
        });
        Object b2 = c8587drc.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return b2;
    }
}
