package o;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.media.VideoResolutionRange;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import com.netflix.mediaclient.service.offline.agent.OfflineUnavailableReason;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.BwCap;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification;
import com.netflix.mediaclient.service.webclient.model.leafs.OfflineCodecPrefData;
import com.netflix.mediaclient.service.webclient.model.leafs.PartnerIntegrationConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.PdsAndLogblobConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.SearchResultsSimilarityAlgorithm;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.StreamingCodecPrefData;
import com.netflix.mediaclient.service.webclient.model.leafs.UserCookies;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration;
import com.netflix.mediaclient.util.DeviceCategory;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public interface aOV {
    int A();

    String B();

    ImageResolutionClass C();

    int D();

    int E();

    OfflineCodecPrefData F();

    int G();

    InterfaceC1820aPl H();

    String I();

    InterfaceC1827aPs J();

    String K();

    OfflineUnavailableReason L();

    PartnerIntegrationConfig M();

    PdsAndLogblobConfig N();

    int O();

    int P();

    String Q();

    int R();

    int S();

    SearchResultsSimilarityAlgorithm T();

    StreamingCodecPrefData U();

    Collection<String> V();

    SignInConfigData W();

    String X();

    String Y();

    int Z();

    ABTestConfigData a();

    void a(InterfaceC4604bhe interfaceC4604bhe);

    boolean aA();

    boolean aB();

    boolean aD();

    boolean aF();

    List<String> aa();

    VideoResolutionRange ab();

    VoipConfiguration ac();

    boolean ad();

    boolean ae();

    boolean af();

    boolean ag();

    boolean ah();

    boolean ai();

    boolean aj();

    boolean ak();

    boolean al();

    boolean am();

    boolean an();

    boolean ao();

    boolean ap();

    boolean aq();

    boolean ar();

    boolean as();

    @Deprecated
    boolean at();

    boolean au();

    boolean av();

    boolean aw();

    boolean ax();

    boolean ay();

    boolean az();

    BwCap b(StreamProfileType streamProfileType);

    void b();

    void b(ConfigData configData);

    void b(aOX aox, InterfaceC1813aPe interfaceC1813aPe);

    void b(InterfaceC1813aPe interfaceC1813aPe);

    ConsolidatedLoggingSessionSpecification c(String str);

    void c(InterfaceC5093bsJ interfaceC5093bsJ, InterfaceC1813aPe interfaceC1813aPe);

    void c(InterfaceC5093bsJ interfaceC5093bsJ, boolean z, InterfaceC1813aPe interfaceC1813aPe);

    boolean c();

    void d();

    void d(StatusCode statusCode);

    void d(String str);

    void d(C5007bqd c5007bqd, InterfaceC1813aPe interfaceC1813aPe);

    void e(UserCookies userCookies);

    void e(String str);

    boolean e();

    aOP f();

    int g();

    int h();

    int i();

    ApiEndpointRegistry j();

    int k();

    String l();

    String m();

    String n();

    aPY o();

    String p();

    C1817aPi q();

    DeviceCategory r();

    int s();

    int t();

    aOW u();

    String v();

    InterfaceC1843aQh w();

    long x();

    String y();

    int z();
}
