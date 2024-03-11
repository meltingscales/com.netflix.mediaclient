package androidx.mediarouter.media;

import android.annotation.SuppressLint;
import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Bundle;
import androidx.mediarouter.media.MediaRouteDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
class MediaRouter2Utils {
    public static MediaRouteDescriptor toMediaRouteDescriptor(MediaRoute2Info mediaRoute2Info) {
        String id;
        CharSequence name;
        int connectionState;
        int volumeHandling;
        int volumeMax;
        int volume;
        Bundle extras;
        CharSequence description;
        Uri iconUri;
        Bundle extras2;
        if (mediaRoute2Info == null) {
            return null;
        }
        id = mediaRoute2Info.getId();
        name = mediaRoute2Info.getName();
        MediaRouteDescriptor.Builder builder = new MediaRouteDescriptor.Builder(id, name.toString());
        connectionState = mediaRoute2Info.getConnectionState();
        MediaRouteDescriptor.Builder connectionState2 = builder.setConnectionState(connectionState);
        volumeHandling = mediaRoute2Info.getVolumeHandling();
        MediaRouteDescriptor.Builder volumeHandling2 = connectionState2.setVolumeHandling(volumeHandling);
        volumeMax = mediaRoute2Info.getVolumeMax();
        MediaRouteDescriptor.Builder volumeMax2 = volumeHandling2.setVolumeMax(volumeMax);
        volume = mediaRoute2Info.getVolume();
        MediaRouteDescriptor.Builder volume2 = volumeMax2.setVolume(volume);
        extras = mediaRoute2Info.getExtras();
        MediaRouteDescriptor.Builder canDisconnect = volume2.setExtras(extras).setEnabled(true).setCanDisconnect(false);
        description = mediaRoute2Info.getDescription();
        if (description != null) {
            canDisconnect.setDescription(description.toString());
        }
        iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            canDisconnect.setIconUri(iconUri);
        }
        extras2 = mediaRoute2Info.getExtras();
        if (extras2 != null && extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            canDisconnect.setExtras(extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
            canDisconnect.setDeviceType(extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
            canDisconnect.setPlaybackType(extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
            if (parcelableArrayList != null) {
                canDisconnect.addControlFilters(parcelableArrayList);
            }
            return canDisconnect.build();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> getRouteIds(List<MediaRoute2Info> list) {
        if (list == null) {
            return new ArrayList();
        }
        return (List) list.stream().filter(new Predicate() { // from class: androidx.mediarouter.media.MediaRoute2ProviderServiceAdapter$$ExternalSyntheticLambda18
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((MediaRoute2Info) obj);
            }
        }).map(new Function() { // from class: androidx.mediarouter.media.MediaRouter2Utils$$ExternalSyntheticLambda22
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String id;
                id = ((MediaRoute2Info) obj).getId();
                return id;
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RouteDiscoveryPreference toDiscoveryPreference(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        RouteDiscoveryPreference build;
        RouteDiscoveryPreference build2;
        if (mediaRouteDiscoveryRequest == null || !mediaRouteDiscoveryRequest.isValid()) {
            MediaRouter2Utils$$ExternalSyntheticApiModelOutline19.m();
            build = MediaRouter2Utils$$ExternalSyntheticApiModelOutline18.m(new ArrayList(), false).build();
            return build;
        }
        build2 = MediaRouter2Utils$$ExternalSyntheticApiModelOutline18.m((List) mediaRouteDiscoveryRequest.getSelector().getControlCategories().stream().map(new Function() { // from class: androidx.mediarouter.media.MediaRouter2Utils$$ExternalSyntheticLambda23
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MediaRouter2Utils.toRouteFeature((String) obj);
            }
        }).collect(Collectors.toList()), mediaRouteDiscoveryRequest.isActiveScan()).build();
        return build2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String toRouteFeature(String str) {
        char c;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -2065577523) {
            if (str.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 956939050) {
            if (hashCode == 975975375 && str.equals("android.media.intent.category.LIVE_VIDEO")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? str : "android.media.route.feature.LIVE_VIDEO" : "android.media.route.feature.LIVE_AUDIO" : "android.media.route.feature.REMOTE_PLAYBACK";
    }
}
