package o;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.UiLandscapeMode;
import com.netflix.cl.model.event.session.action.ActionFailed;
import com.netflix.cl.model.event.session.action.Play;
import com.netflix.cl.model.event.session.action.StartPlay;
import com.netflix.cl.model.event.session.command.EnterFullscreenCommand;
import com.netflix.cl.model.event.session.command.ExitFullscreenCommand;
import com.netflix.cl.model.event.session.command.PauseCommand;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.SeekCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.IPlayer;
import java.util.LinkedHashMap;
import java.util.Map;
import o.InterfaceC6718cib;

/* renamed from: o.chO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6652chO implements InterfaceC6718cib {
    private final AppView c;
    private final Map<Long, Session> d = new LinkedHashMap();

    @Override // o.InterfaceC6718cib
    public void c(C6728cil c6728cil) {
        C8632dsu.c((Object) c6728cil, "");
    }

    public C6652chO(AppView appView) {
        this.c = appView;
    }

    @Override // o.InterfaceC6718cib
    public void d(C6728cil c6728cil) {
        C8632dsu.c((Object) c6728cil, "");
        CLv2Utils.INSTANCE.e(new Focus(AppView.replayButton, c6728cil.c()), new PlayCommand(null));
    }

    @Override // o.InterfaceC6718cib
    public void e(C6728cil c6728cil) {
        C8632dsu.c((Object) c6728cil, "");
        CLv2Utils.INSTANCE.e(new Focus(AppView.playButton, c6728cil.c()), new PauseCommand());
    }

    @Override // o.InterfaceC6718cib
    public void a(C6728cil c6728cil) {
        C8632dsu.c((Object) c6728cil, "");
        CLv2Utils.INSTANCE.e(new Focus(AppView.playButton, c6728cil.c()), new PlayCommand(null));
    }

    @Override // o.InterfaceC6718cib
    public void b(C6728cil c6728cil) {
        C8632dsu.c((Object) c6728cil, "");
        Logger.INSTANCE.startSession(new SeekCommand());
        ExtLogger.INSTANCE.endCommand("SeekCommand");
    }

    @Override // o.InterfaceC6718cib
    public InterfaceC6718cib.d c(C6728cil c6728cil, long j, boolean z) {
        C8632dsu.c((Object) c6728cil, "");
        Play play = new Play(null, this.c, null, Long.valueOf(j), CLv2Utils.b(c6728cil.c(), z));
        Logger.INSTANCE.startSession(play);
        this.d.put(Long.valueOf(play.getId()), play);
        return new InterfaceC6718cib.d(play.getId());
    }

    @Override // o.InterfaceC6718cib
    public InterfaceC6718cib.d c(C6728cil c6728cil, long j) {
        C8632dsu.c((Object) c6728cil, "");
        StartPlay startPlay = new StartPlay(null, 0L, this.c, null, Long.valueOf(j), c6728cil.c());
        Logger.INSTANCE.startSession(startPlay);
        this.d.put(Long.valueOf(startPlay.getId()), startPlay);
        return new InterfaceC6718cib.d(startPlay.getId());
    }

    @Override // o.InterfaceC6718cib
    public void e(InterfaceC6718cib.d dVar, IPlayer.c cVar) {
        C8632dsu.c((Object) dVar, "");
        Session session = this.d.get(Long.valueOf(dVar.a()));
        if (session != null) {
            if (cVar != null) {
                Logger.INSTANCE.endSession(new ActionFailed(session, CLv2Utils.a(new Error(String.valueOf(cVar), null, null))));
            } else {
                Logger.INSTANCE.endSession(Long.valueOf(dVar.a()));
            }
            this.d.remove(Long.valueOf(dVar.a()));
        }
    }

    @Override // o.InterfaceC6718cib
    public void e(InterfaceC6718cib.d dVar) {
        C8632dsu.c((Object) dVar, "");
        Session session = this.d.get(Long.valueOf(dVar.a()));
        if (session != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(session.getId()));
            this.d.remove(Long.valueOf(dVar.a()));
        }
    }

    @Override // o.InterfaceC6718cib
    public void a() {
        CLv2Utils.d(new EnterFullscreenCommand());
    }

    @Override // o.InterfaceC6718cib
    public void b() {
        CLv2Utils.d(new ExitFullscreenCommand());
    }

    @Override // o.InterfaceC6718cib
    public InterfaceC6718cib.d e() {
        UiLandscapeMode uiLandscapeMode = new UiLandscapeMode();
        Long startSession = Logger.INSTANCE.startSession(uiLandscapeMode);
        if (startSession != null) {
            long longValue = startSession.longValue();
            this.d.put(Long.valueOf(longValue), uiLandscapeMode);
            return new InterfaceC6718cib.d(longValue);
        }
        return null;
    }
}
