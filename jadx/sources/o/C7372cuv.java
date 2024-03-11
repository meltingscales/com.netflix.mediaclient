package o;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.CloseCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.util.ConnectivityUtils;
import o.C7372cuv;

/* renamed from: o.cuv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7372cuv {
    public static final a a = new a(null);

    /* renamed from: o.cuv$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final void c(Context context, String str, InterfaceC7365cuo interfaceC7365cuo) {
            dpR dpr;
            C8632dsu.c((Object) interfaceC7365cuo, "");
            InterfaceC5206buQ d = C7353cuc.d(str);
            if (d != null) {
                C7372cuv.a.b(context, d, interfaceC7365cuo);
                dpr = dpR.c;
            } else {
                dpr = null;
            }
            if (dpr == null) {
                interfaceC7365cuo.b();
            }
        }

        public final void b(Context context, final InterfaceC5206buQ interfaceC5206buQ, final InterfaceC7365cuo interfaceC7365cuo) {
            C8632dsu.c((Object) interfaceC7365cuo, "");
            if (ConnectivityUtils.l(AbstractApplicationC1040Mh.d()) || interfaceC5206buQ == null || interfaceC5206buQ.C() == WatchState.WATCHING_ALLOWED) {
                interfaceC7365cuo.b();
            } else if (C7353cuc.a(interfaceC5206buQ)) {
                new AlertDialog.Builder(context).setMessage(com.netflix.mediaclient.ui.R.o.fo).setPositiveButton(com.netflix.mediaclient.ui.R.o.fr, new DialogInterface.OnClickListener() { // from class: o.cut
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C7372cuv.a.c(InterfaceC5206buQ.this, interfaceC7365cuo, dialogInterface, i);
                    }
                }).setNegativeButton(com.netflix.mediaclient.ui.R.o.cL, new DialogInterface.OnClickListener() { // from class: o.cus
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C7372cuv.a.c(dialogInterface, i);
                    }
                }).show();
                Logger.INSTANCE.logEvent(new Presented(AppView.bookmarkPastPartialDownload, Boolean.FALSE, null));
            } else {
                C8054ddD.c(context, com.netflix.mediaclient.ui.R.o.fB, 0);
                Logger.INSTANCE.logEvent(new Presented(AppView.insufficientPartialDownload, Boolean.FALSE, null));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC5206buQ interfaceC5206buQ, InterfaceC7365cuo interfaceC7365cuo, DialogInterface dialogInterface, int i) {
            C8632dsu.c((Object) interfaceC7365cuo, "");
            C7353cuc.f(interfaceC5206buQ);
            interfaceC7365cuo.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            CLv2Utils.INSTANCE.e(new Focus(AppView.bookmarkPastPartialDownload, null), new CloseCommand());
        }
    }
}
