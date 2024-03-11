package o;

import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.SetThumbRatingCommand;
import com.netflix.mediaclient.ui.details.DetailsActivityAction;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class aKX extends C1705aLe {
    private final DetailsActivityAction b;

    @Override // o.C1705aLe
    protected DetailsActivityAction e() {
        return this.b;
    }

    public aKX(DetailsActivityAction detailsActivityAction, Map<String, String> map) {
        super(map);
        this.b = detailsActivityAction;
    }

    @Override // o.C1705aLe, o.aKP
    public boolean c(List<String> list) {
        return list.size() > 1;
    }

    @Override // o.C1705aLe, o.aKP
    public Command d() {
        return new SetThumbRatingCommand();
    }
}
