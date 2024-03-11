package com.netflix.mediaclient.ui.search;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLListTrackingInfoBase;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.ui.search.SearchEventHandler$Companion$handleSearchItemClickEvent$1;
import kotlin.jvm.internal.Lambda;
import o.C8150deu;
import o.C8171dfO;
import o.C8632dsu;
import o.InterfaceC3643bFl;
import o.InterfaceC5223buh;
import o.InterfaceC8366diy;
import o.drX;

/* loaded from: classes4.dex */
public final class SearchEventHandler$Companion$handleSearchItemClickEvent$1 extends Lambda implements drX<CLListTrackingInfoBase, NetflixActivity, Boolean> {
    final /* synthetic */ PlayerExtras a;
    final /* synthetic */ InterfaceC5223buh b;
    final /* synthetic */ TrackingInfoHolder c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchEventHandler$Companion$handleSearchItemClickEvent$1(InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, String str, PlayerExtras playerExtras) {
        super(2);
        this.b = interfaceC5223buh;
        this.c = trackingInfoHolder;
        this.d = str;
        this.a = playerExtras;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Boolean invoke(CLListTrackingInfoBase cLListTrackingInfoBase, final NetflixActivity netflixActivity) {
        AppView appView;
        boolean post;
        C8632dsu.c((Object) cLListTrackingInfoBase, "");
        C8632dsu.c((Object) netflixActivity, "");
        if (C8171dfO.c() && (this.b instanceof InterfaceC8366diy)) {
            CLv2Utils.INSTANCE.b(new Focus(AppView.boxArt, this.c.g()), (Command) new ViewDetailsCommand(), false);
            Handler handler = netflixActivity.getHandler();
            final InterfaceC5223buh interfaceC5223buh = this.b;
            final TrackingInfoHolder trackingInfoHolder = this.c;
            final PlayerExtras playerExtras = this.a;
            post = handler.post(new Runnable() { // from class: o.cRu
                @Override // java.lang.Runnable
                public final void run() {
                    SearchEventHandler$Companion$handleSearchItemClickEvent$1.e(NetflixActivity.this, interfaceC5223buh, trackingInfoHolder, playerExtras);
                }
            });
        } else {
            if (C8632dsu.c((Object) this.d, (Object) "preQuerySearch") || C8632dsu.c((Object) this.d, (Object) "inQuerySearch")) {
                appView = AppView.boxArt;
            } else if (C8632dsu.c((Object) this.d, (Object) "filters")) {
                appView = AppView.catalogFiltersTitleResults;
            } else {
                appView = AppView.boxArt;
            }
            CLv2Utils.INSTANCE.b(new Focus(appView, this.c.g()), (Command) new ViewDetailsCommand(), true);
            Handler handler2 = netflixActivity.getHandler();
            final InterfaceC5223buh interfaceC5223buh2 = this.b;
            final TrackingInfoHolder trackingInfoHolder2 = this.c;
            final String str = this.d;
            final PlayerExtras playerExtras2 = this.a;
            post = handler2.post(new Runnable() { // from class: o.cRs
                @Override // java.lang.Runnable
                public final void run() {
                    SearchEventHandler$Companion$handleSearchItemClickEvent$1.e(NetflixActivity.this, interfaceC5223buh2, trackingInfoHolder2, str, playerExtras2);
                }
            });
        }
        return Boolean.valueOf(post);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(NetflixActivity netflixActivity, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, PlayerExtras playerExtras) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) playerExtras, "");
        View currentFocus = netflixActivity.getCurrentFocus();
        EditText editText = currentFocus instanceof EditText ? (EditText) currentFocus : null;
        if (editText != null) {
            C8150deu.b(netflixActivity, editText);
        }
        QuickDrawDialogFrag.d dVar = QuickDrawDialogFrag.e;
        String id = ((InterfaceC8366diy) interfaceC5223buh).getId();
        C8632dsu.a(id, "");
        dVar.a(netflixActivity, id, trackingInfoHolder, false, playerExtras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(NetflixActivity netflixActivity, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, String str, PlayerExtras playerExtras) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) playerExtras, "");
        InterfaceC3643bFl a = InterfaceC3643bFl.c.a(netflixActivity);
        VideoType type = interfaceC5223buh.getType();
        String id = interfaceC5223buh.getId();
        C8632dsu.a(id, "");
        a.b(netflixActivity, type, id, interfaceC5223buh.getTitle(), trackingInfoHolder, str, playerExtras);
    }
}
