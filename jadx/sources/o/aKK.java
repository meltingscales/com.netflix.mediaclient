package o;

import com.netflix.cl.model.event.session.command.AddToPlaylistCommand;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.ui.details.DetailsActivityAction;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class aKK extends C1705aLe {
    public aKK(Map<String, String> map) {
        super(map);
    }

    @Override // o.C1705aLe, o.aKP
    public boolean c(List<String> list) {
        return list.size() > 1;
    }

    @Override // o.C1705aLe
    protected DetailsActivityAction e() {
        return DetailsActivityAction.a;
    }

    @Override // o.C1705aLe, o.aKP
    public Command d() {
        return new AddToPlaylistCommand();
    }
}
