package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class AudioCapabilities {
    private final int maxChannelCount;
    private final int[] supportedEncodings;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(new int[]{2}, 10);
    private static final ImmutableList<Integer> EXTERNAL_SURROUND_SOUND_ENCODINGS = ImmutableList.of(2, 5, 6);
    private static final ImmutableMap<Integer, Integer> ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = new ImmutableMap.Builder().put(5, 6).put(17, 6).put(7, 6).put(30, 10).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();

    public static AudioCapabilities getCapabilities(Context context) {
        return getCapabilities(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"InlinedApi"})
    public static AudioCapabilities getCapabilities(Context context, Intent intent) {
        int i = Util.SDK_INT;
        if (i < 23 || !Api23.isBluetoothConnected(context)) {
            ImmutableSet.Builder builder = new ImmutableSet.Builder();
            if (deviceMaySetExternalSurroundSoundGlobalSetting() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                builder.addAll((Iterable) EXTERNAL_SURROUND_SOUND_ENCODINGS);
            }
            if (i >= 29 && (Util.isTv(context) || Util.isAutomotive(context))) {
                builder.addAll((Iterable) Api29.getDirectPlaybackSupportedEncodings());
                return new AudioCapabilities(Ints.toArray(builder.build()), 10);
            } else if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
                int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
                if (intArrayExtra != null) {
                    builder.addAll((Iterable) Ints.asList(intArrayExtra));
                }
                return new AudioCapabilities(Ints.toArray(builder.build()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
            } else {
                ImmutableSet build = builder.build();
                return !build.isEmpty() ? new AudioCapabilities(Ints.toArray(build), 10) : DEFAULT_AUDIO_CAPABILITIES;
            }
        }
        return DEFAULT_AUDIO_CAPABILITIES;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public AudioCapabilities(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.supportedEncodings = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.supportedEncodings = new int[0];
        }
        this.maxChannelCount = i;
    }

    public boolean supportsEncoding(int i) {
        return Arrays.binarySearch(this.supportedEncodings, i) >= 0;
    }

    public boolean isPassthroughPlaybackSupported(Format format) {
        return getEncodingAndChannelConfigForPassthrough(format) != null;
    }

    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format) {
        int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        if (ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(encoding))) {
            if (encoding == 18 && !supportsEncoding(18)) {
                encoding = 6;
            } else if ((encoding == 8 && !supportsEncoding(8)) || (encoding == 30 && !supportsEncoding(30))) {
                encoding = 7;
            }
            if (supportsEncoding(encoding)) {
                int i = format.channelCount;
                if (i == -1 || encoding == 18) {
                    int i2 = format.sampleRate;
                    if (i2 == -1) {
                        i2 = VoipConfiguration.MAX_SAMPLERATE_48K;
                    }
                    i = getMaxSupportedChannelCountForPassthrough(encoding, i2);
                } else if (format.sampleMimeType.equals("audio/vnd.dts.uhd;profile=p2")) {
                    if (i > 10) {
                        return null;
                    }
                } else if (i > this.maxChannelCount) {
                    return null;
                }
                int channelConfigForPassthrough = getChannelConfigForPassthrough(i);
                if (channelConfigForPassthrough == 0) {
                    return null;
                }
                return Pair.create(Integer.valueOf(encoding), Integer.valueOf(channelConfigForPassthrough));
            }
            return null;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioCapabilities) {
            AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
            return Arrays.equals(this.supportedEncodings, audioCapabilities.supportedEncodings) && this.maxChannelCount == audioCapabilities.maxChannelCount;
        }
        return false;
    }

    public int hashCode() {
        return this.maxChannelCount + (Arrays.hashCode(this.supportedEncodings) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", supportedEncodings=" + Arrays.toString(this.supportedEncodings) + "]";
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        if (Util.SDK_INT >= 17) {
            String str = Util.MANUFACTURER;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static int getMaxSupportedChannelCountForPassthrough(int i, int i2) {
        if (Util.SDK_INT >= 29) {
            return Api29.getMaxSupportedChannelCountForPassthrough(i, i2);
        }
        return ((Integer) Assertions.checkNotNull(ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.getOrDefault(Integer.valueOf(i), 0))).intValue();
    }

    private static int getChannelConfigForPassthrough(int i) {
        int i2 = Util.SDK_INT;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(Util.DEVICE) && i == 1) {
            i = 2;
        }
        return Util.getAudioTrackChannelConfig(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Api23 {
        public static final boolean isBluetoothConnected(Context context) {
            AudioDeviceInfo[] devices = ((AudioManager) Assertions.checkNotNull((AudioManager) context.getSystemService("audio"))).getDevices(2);
            ImmutableSet<Integer> allBluetoothDeviceTypes = getAllBluetoothDeviceTypes();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (allBluetoothDeviceTypes.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }

        private static final ImmutableSet<Integer> getAllBluetoothDeviceTypes() {
            ImmutableSet.Builder add = new ImmutableSet.Builder().add((Object[]) new Integer[]{8, 7});
            int i = Util.SDK_INT;
            if (i >= 31) {
                add.add((Object[]) new Integer[]{26, 27});
            }
            if (i >= 33) {
                add.add((ImmutableSet.Builder) 30);
            }
            return add.build();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Api29 {
        private static final AudioAttributes DEFAULT_AUDIO_ATTRIBUTES = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static ImmutableList<Integer> getDirectPlaybackSupportedEncodings() {
            boolean isDirectPlaybackSupported;
            ImmutableList.Builder builder = ImmutableList.builder();
            UnmodifiableIterator it = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (Util.SDK_INT >= Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(VoipConfiguration.MAX_SAMPLERATE_48K).build(), DEFAULT_AUDIO_ATTRIBUTES);
                    if (isDirectPlaybackSupported) {
                        builder.add((ImmutableList.Builder) Integer.valueOf(intValue));
                    }
                }
            }
            builder.add((ImmutableList.Builder) 2);
            return builder.build();
        }

        public static int getMaxSupportedChannelCountForPassthrough(int i, int i2) {
            boolean isDirectPlaybackSupported;
            for (int i3 = 10; i3 > 0; i3--) {
                int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i3);
                if (audioTrackChannelConfig != 0) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(audioTrackChannelConfig).build(), DEFAULT_AUDIO_ATTRIBUTES);
                    if (isDirectPlaybackSupported) {
                        return i3;
                    }
                }
            }
            return 0;
        }
    }
}
