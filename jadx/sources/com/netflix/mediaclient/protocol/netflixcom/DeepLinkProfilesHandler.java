package com.netflix.mediaclient.protocol.netflixcom;

import android.content.Intent;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewProfilesCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.List;
import javax.inject.Inject;
import o.C1044Mm;
import o.aKP;
import o.bEY;

/* loaded from: classes3.dex */
public class DeepLinkProfilesHandler implements aKP {
    @Inject
    bEY deepLinkUtils;

    @Override // o.aKP
    public boolean c(List<String> list) {
        return true;
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        C1044Mm.b("NetflixComProfilesHandler", "Handling Profiles Deeplink");
        if (list.size() > 1 && "icon".equals(list.get(1))) {
            C1044Mm.b("NetflixComProfilesHandler", "Start Profiles Icon Activity");
            DeepLinkUtils.INSTANCE.b(netflixActivity);
            return NflxHandler.Response.HANDLING;
        }
        C1044Mm.b("NetflixComProfilesHandler", "Start Profiles Activity");
        DeepLinkUtils.INSTANCE.c(netflixActivity);
        return NflxHandler.Response.HANDLING;
    }

    @Override // o.aKP
    public Command d() {
        return new ViewProfilesCommand();
    }
}
