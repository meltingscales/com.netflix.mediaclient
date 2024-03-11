package o;

import com.netflix.mediaclient.servicemgr.interface_.user.ProfileType;
import java.util.List;
import org.json.JSONObject;

/* renamed from: o.bvo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5283bvo {
    boolean disableVideoMerchAutoPlay();

    String getAvatarKey();

    String getAvatarUrl();

    String[] getLanguages();

    String getLanguagesInCsv();

    List<String> getLanguagesList();

    List<String> getMaturityLabels();

    int getMaturityValue();

    String getProfileEmail();

    String getProfileGuid();

    String getProfileLockPin();

    String getProfileName();

    ProfileType getProfileType();

    List<String> getSecondaryLanguages();

    InterfaceC5284bvp getSubtitlePreference();

    boolean hasTitleRestrictions();

    boolean isAutoPlayEnabled();

    boolean isDefaultKidsProfile();

    boolean isKidsProfile();

    boolean isMaturityHighest();

    boolean isMaturityLowest();

    boolean isPrimaryProfile();

    boolean isProfileCreationLocked();

    boolean isProfileGuidValid();

    boolean isProfileLocked();

    boolean isProfileValid();

    JSONObject toJsonObject();

    String toLoggingString();
}
