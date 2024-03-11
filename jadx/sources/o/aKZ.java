package o;

import com.netflix.cl.model.event.session.command.AddToPlaylistCommand;
import com.netflix.mediaclient.ui.details.DetailsActivityAction;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aKZ extends C1705aLe {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aKZ(Map<String, String> map) {
        super(map);
        C8632dsu.c((Object) map, "");
    }

    @Override // o.C1705aLe
    protected DetailsActivityAction e() {
        return DetailsActivityAction.j;
    }

    @Override // o.C1705aLe, o.aKP
    /* renamed from: a */
    public AddToPlaylistCommand d() {
        return new AddToPlaylistCommand();
    }
}
