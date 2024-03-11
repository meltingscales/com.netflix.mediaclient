package o;

import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.mediaclient.servicemgr.interface_.details.WatchStatus;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.PersonSummary;
import com.netflix.model.leafs.TaglineMessage;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.originals.ContentWarning;
import com.netflix.model.leafs.originals.TagSummary;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;

/* renamed from: o.buI  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5198buI extends InterfaceC5223buh, InterfaceC5158btV, InterfaceC5187bty, InterfaceC5173btk, InterfaceC5197buH, InterfaceC5183btu, InterfaceC5200buK, InterfaceC5201buL {
    SupplementalMessageType A_();

    VideoInfo.TimeCodes B();

    String D();

    int E();

    @Deprecated
    boolean F();

    List<GenreItem> I();

    InterfaceC5198buI K();

    boolean M();

    String R();

    String U();

    VideoInfo.Sharing X();

    String Y();

    String Z();

    InterfaceC5160btX aE_();

    boolean aU_();

    List<TaglineMessage> aa();

    String ab();

    List<TagSummary> ac();

    String ad();

    String ae();

    String af();

    int ag();

    List<PersonSummary> ah();

    boolean am();

    @Deprecated
    boolean ao();

    List<PersonSummary> ao_();

    boolean ap();

    boolean aq();

    boolean as();

    boolean au();

    InteractiveSummary az_();

    List<PersonSummary> bO_();

    String bP_();

    InterfaceC5182btt bQ_();

    String c();

    ContextualText e(ContextualText.TextContext textContext);

    List<Advisory> e();

    @Override // o.InterfaceC5151btO
    boolean isAvailableToPlay();

    @Override // o.InterfaceC5151btO
    boolean isOriginal();

    String j();

    String k();

    String m();

    ContentWarning o();

    String p();

    String q();

    List<PersonSummary> r();

    String v();

    String w();

    List<GenreItem> z();

    default WatchStatus B_() {
        return ao() ? WatchStatus.e : WatchStatus.c;
    }
}
