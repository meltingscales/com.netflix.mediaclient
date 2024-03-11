package o;

import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import o.dpR;

/* renamed from: o.chl */
/* loaded from: classes.dex */
public interface InterfaceC6675chl {
    AbstractC6677chn a();

    AbstractC6677chn b();

    boolean b(String str);

    boolean c(AbstractC6677chn abstractC6677chn, boolean z);

    boolean d();

    boolean d(String str, drO<dpR> dro);

    DialogFragment e();

    LifecycleOwner e(AbstractC6677chn abstractC6677chn, Integer num, boolean z);

    boolean e(MessagingTooltipScreen messagingTooltipScreen, Integer num, boolean z);

    boolean e(String str);

    /* renamed from: o.chl$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ LifecycleOwner b(InterfaceC6675chl interfaceC6675chl, AbstractC6677chn abstractC6677chn, Integer num, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    num = null;
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                return interfaceC6675chl.e(abstractC6677chn, num, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDialog");
        }

        public static /* synthetic */ boolean a(InterfaceC6675chl interfaceC6675chl, AbstractC6677chn abstractC6677chn, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return interfaceC6675chl.c(abstractC6677chn, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTray");
        }

        public static /* synthetic */ boolean d(InterfaceC6675chl interfaceC6675chl, MessagingTooltipScreen messagingTooltipScreen, Integer num, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                return interfaceC6675chl.e(messagingTooltipScreen, num, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTooltip");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean e(InterfaceC6675chl interfaceC6675chl, String str, drO dro, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.messaging.api.Messaging$closeTooltip$1
                        public final void d() {
                        }

                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            d();
                            return dpR.c;
                        }
                    };
                }
                return interfaceC6675chl.d(str, dro);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeTooltip");
        }
    }
}
