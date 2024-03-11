package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C9572sD;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.chromium.net.ConnectionSubtype;
import org.linphone.core.Privacy;

@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class MediaCodecUtil {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Pattern PROFILE_PATTERN;
    private static int a = 1;
    private static int a$s17$497;
    private static boolean b$s19$497;
    private static int c;
    private static char[] d$s16$497;
    private static final HashMap<CodecKey, List<MediaCodecInfo>> decoderInfosCache;
    private static boolean e$s20$497;
    private static int maxH264DecodableFrameSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i);

        boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface ScoreProvider<T> {
        int getScore(T t);
    }

    /* renamed from: $r8$lambda$-YExj2qWGyYInzOCIQVMxMsxt5E  reason: not valid java name */
    public static /* synthetic */ int m2696$r8$lambda$YExj2qWGyYInzOCIQVMxMsxt5E(MediaCodecInfo mediaCodecInfo) {
        int i = 2 % 2;
        int i2 = c + 73;
        a = i2 % 128;
        int i3 = i2 % 2;
        int lambda$applyWorkarounds$2 = lambda$applyWorkarounds$2(mediaCodecInfo);
        int i4 = c + 39;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return lambda$applyWorkarounds$2;
        }
        throw null;
    }

    public static /* synthetic */ int $r8$lambda$FSCp8JLOjPYzMyl8UbrLcfJqyp8(MediaCodecInfo mediaCodecInfo) {
        int lambda$applyWorkarounds$1;
        int i = 2 % 2;
        int i2 = c + 89;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            lambda$applyWorkarounds$1 = lambda$applyWorkarounds$1(mediaCodecInfo);
            int i3 = 97 / 0;
        } else {
            lambda$applyWorkarounds$1 = lambda$applyWorkarounds$1(mediaCodecInfo);
        }
        int i4 = a + 51;
        c = i4 % 128;
        if (i4 % 2 == 0) {
            return lambda$applyWorkarounds$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int $r8$lambda$j9HDDpakw55z3kgXGyludkE7sIw(ScoreProvider scoreProvider, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = a + 61;
        c = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            lambda$sortByScore$3(scoreProvider, obj, obj2);
            obj3.hashCode();
            throw null;
        }
        int lambda$sortByScore$3 = lambda$sortByScore$3(scoreProvider, obj, obj2);
        int i3 = a + 65;
        c = i3 % 128;
        if (i3 % 2 == 0) {
            return lambda$sortByScore$3;
        }
        throw null;
    }

    public static /* synthetic */ int $r8$lambda$jclmsGbkPxwnfkIgRwEFviS4hUs(Format format, MediaCodecInfo mediaCodecInfo) {
        int i = 2 % 2;
        int i2 = c + 83;
        a = i2 % 128;
        int i3 = i2 % 2;
        int lambda$getDecoderInfosSortedByFormatSupport$0 = lambda$getDecoderInfosSortedByFormatSupport$0(format, mediaCodecInfo);
        int i4 = a + 55;
        c = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return lambda$getDecoderInfosSortedByFormatSupport$0;
    }

    private static int av1LevelNumberToConst(int i) {
        int i2 = 2 % 2;
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                int i3 = c + 47;
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 96 / 0;
                }
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return JSONzip.end;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                int i5 = a + 93;
                c = i5 % 128;
                if (i5 % 2 == 0) {
                    return 8192;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 14:
                return 16384;
            case 15:
                return Privacy.DEFAULT;
            case 16:
                return AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                int i6 = c + 53;
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 88 / 0;
                }
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 77;
        int i5 = i4 % 128;
        c = i5;
        if (i4 % 2 == 0) {
            switch (i) {
                case 10:
                    return 1;
                case 11:
                    return 4;
                case 12:
                    return 8;
                case 13:
                    return 16;
            }
        }
        int i6 = 53 / 0;
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
        }
        switch (i) {
            case 20:
                int i7 = i5 + 69;
                a = i7 % 128;
                int i8 = i7 % 2;
                return 32;
            case 21:
                int i9 = i5 + 73;
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    return 64;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 22:
                return 128;
            default:
                switch (i) {
                    case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                        return JSONzip.end;
                    case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                        int i10 = i3 + 39;
                        c = i10 % 128;
                        int i11 = i10 % 2;
                        return 512;
                    case 32:
                        return 1024;
                    default:
                        switch (i) {
                            case JSONzip.substringLimit /* 40 */:
                                return 2048;
                            case 41:
                                int i12 = i3 + 21;
                                c = i12 % 128;
                                int i13 = i12 % 2;
                                return 4096;
                            case 42:
                                return 8192;
                            default:
                                switch (i) {
                                    case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                                        return 16384;
                                    case 51:
                                        return Privacy.DEFAULT;
                                    case 52:
                                        return AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
                                    default:
                                        return -1;
                                }
                        }
                }
        }
    }

    private static int avcLevelToMaxFrameSize(int i) {
        int i2 = 2 % 2;
        if (i == 1 || i == 2) {
            return 25344;
        }
        int i3 = c + 13;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case JSONzip.end /* 256 */:
                return 414720;
            case 512:
                int i6 = i4 + 35;
                c = i6 % 128;
                if (i6 % 2 == 0) {
                    return 921600;
                }
                throw null;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                int i7 = i4 + 79;
                c = i7 % 128;
                int i8 = i7 % 2;
                return 2228224;
            case 16384:
                return 5652480;
            case Privacy.DEFAULT /* 32768 */:
            case AleCryptoBouncyCastle.MAX_RANDOM_BYTES /* 65536 */:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int avcProfileNumberToConst(int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = i3 + 123;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            if (i == 30) {
                return 1;
            }
        } else if (i == 66) {
            return 1;
        }
        if (i != 77) {
            int i5 = i3 + 79;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                if (i == 20) {
                    return 4;
                }
            } else if (i == 88) {
                return 4;
            }
            if (i != 100) {
                if (i != 110) {
                    if (i != 122) {
                        return i != 244 ? -1 : 64;
                    }
                    return 32;
                }
                return 16;
            }
            return 8;
        }
        return 2;
    }

    static void b() {
        e$s20$497 = true;
        d$s16$497 = new char[]{10407};
        a$s17$497 = -286512906;
        b$s19$497 = true;
    }

    private static int mp4aAudioObjectTypeToProfile(int i) {
        int i2 = 2 % 2;
        if (i != 17) {
            int i3 = c + 21;
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            if (i != 20) {
                if (i != 23) {
                    int i6 = i4 + 69;
                    c = i6 % 128;
                    int i7 = i6 % 2;
                    if (i != 29) {
                        int i8 = i4 + 123;
                        c = i8 % 128;
                        if (i8 % 2 != 0) {
                            if (i == 71) {
                                return 46;
                            }
                        } else if (i == 39) {
                            return 39;
                        }
                        if (i != 42) {
                            switch (i) {
                                case 1:
                                    return 1;
                                case 2:
                                    return 2;
                                case 3:
                                    return 3;
                                case 4:
                                    return 4;
                                case 5:
                                    return 5;
                                case 6:
                                    return 6;
                                default:
                                    return -1;
                            }
                        }
                        return 42;
                    }
                    return 29;
                }
                return 23;
            }
            return 20;
        }
        return 17;
    }

    private static int vp9LevelNumberToConst(int i) {
        int i2 = 2 % 2;
        if (i != 10) {
            if (i != 11) {
                if (i != 20) {
                    if (i != 21) {
                        int i3 = a;
                        int i4 = i3 + 31;
                        c = i4 % 128;
                        if (i4 % 2 != 0) {
                            if (i == 10) {
                                return 16;
                            }
                        } else if (i == 30) {
                            return 16;
                        }
                        int i5 = i3 + 113;
                        c = i5 % 128;
                        int i6 = i5 % 2;
                        if (i != 31) {
                            if (i != 40) {
                                int i7 = i3 + 109;
                                c = i7 % 128;
                                if (i7 % 2 != 0) {
                                    if (i == 33) {
                                        return 128;
                                    }
                                } else if (i == 41) {
                                    return 128;
                                }
                                int i8 = i3 + 83;
                                c = i8 % 128;
                                if (i8 % 2 != 0) {
                                    if (i == 38) {
                                        return JSONzip.end;
                                    }
                                } else if (i == 50) {
                                    return JSONzip.end;
                                }
                                if (i != 51) {
                                    switch (i) {
                                        case 60:
                                            return 2048;
                                        case 61:
                                            return 4096;
                                        case 62:
                                            return 8192;
                                        default:
                                            return -1;
                                    }
                                }
                                return 512;
                            }
                            return 64;
                        }
                        return 32;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int vp9ProfileNumberToConst(int i) {
        int i2 = 2 % 2;
        int i3 = a + 77;
        int i4 = i3 % 128;
        c = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        } else if (i != 0) {
            int i5 = i4 + 95;
            a = i5 % 128;
            if (i5 % 2 != 0 ? i == 1 : i == 0) {
                return 2;
            }
            if (i != 2) {
                int i6 = i4 + 19;
                int i7 = i6 % 128;
                a = i7;
                int i8 = i6 % 2;
                if (i != 3) {
                    int i9 = i7 + 37;
                    c = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 8 / 0;
                    }
                    return -1;
                }
                return 8;
            }
            return 4;
        } else {
            return 1;
        }
    }

    /* loaded from: classes2.dex */
    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    static {
        b();
        PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");
        decoderInfosCache = new HashMap<>();
        maxH264DecodableFrameSize = -1;
        int i = a + 77;
        c = i % 128;
        if (i % 2 != 0) {
            int i2 = 53 / 0;
        }
    }

    private MediaCodecUtil() {
    }

    public static MediaCodecInfo getDecryptOnlyDecoderInfo() {
        int i = 2 % 2;
        int i2 = a + 19;
        c = i2 % 128;
        int i3 = i2 % 2;
        MediaCodecInfo decoderInfo = getDecoderInfo("audio/raw", false, false);
        int i4 = c + 97;
        a = i4 % 128;
        int i5 = i4 % 2;
        return decoderInfo;
    }

    public static MediaCodecInfo getDecoderInfo(String str, boolean z, boolean z2) {
        int i = 2 % 2;
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(str, z, z2);
        if (!decoderInfos.isEmpty()) {
            MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
            int i2 = a + 91;
            c = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 3;
                return mediaCodecInfo;
            }
            return mediaCodecInfo;
        }
        int i4 = a + 23;
        int i5 = i4 % 128;
        c = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 117;
        a = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public static List<MediaCodecInfo> getDecoderInfos(String str, boolean z, boolean z2) {
        MediaCodecListCompat mediaCodecListCompatV16;
        synchronized (MediaCodecUtil.class) {
            CodecKey codecKey = new CodecKey(str, z, z2);
            HashMap<CodecKey, List<MediaCodecInfo>> hashMap = decoderInfosCache;
            List<MediaCodecInfo> list = hashMap.get(codecKey);
            if (list != null) {
                return list;
            }
            int i = Util.SDK_INT;
            if (i >= 21) {
                mediaCodecListCompatV16 = new MediaCodecListCompatV21(z, z2);
            } else {
                mediaCodecListCompatV16 = new MediaCodecListCompatV16();
            }
            ArrayList<MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(codecKey, mediaCodecListCompatV16);
            if (z && decoderInfosInternal.isEmpty() && 21 <= i && i <= 23) {
                decoderInfosInternal = getDecoderInfosInternal(codecKey, new MediaCodecListCompatV16());
                if (!decoderInfosInternal.isEmpty()) {
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + decoderInfosInternal.get(0).name);
                }
            }
            applyWorkarounds(str, decoderInfosInternal);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) decoderInfosInternal);
            hashMap.put(codecKey, copyOf);
            return copyOf;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List<MediaCodecInfo> getDecoderInfosSoftMatch(MediaCodecSelector mediaCodecSelector, Format format, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = c + 27;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            List<MediaCodecInfo> decoderInfos = mediaCodecSelector.getDecoderInfos(format.sampleMimeType, z, z2);
            List<MediaCodecInfo> alternativeDecoderInfos = getAlternativeDecoderInfos(mediaCodecSelector, format, z, z2);
            int i3 = 28 / 0;
            return ImmutableList.builder().addAll((Iterable) decoderInfos).addAll((Iterable) alternativeDecoderInfos).build();
        }
        List<MediaCodecInfo> decoderInfos2 = mediaCodecSelector.getDecoderInfos(format.sampleMimeType, z, z2);
        return ImmutableList.builder().addAll((Iterable) decoderInfos2).addAll((Iterable) getAlternativeDecoderInfos(mediaCodecSelector, format, z, z2)).build();
    }

    public static List<MediaCodecInfo> getAlternativeDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = a + 95;
        c = i2 % 128;
        int i3 = i2 % 2;
        String alternativeCodecMimeType = getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType == null) {
            ImmutableList of = ImmutableList.of();
            int i4 = a + 75;
            c = i4 % 128;
            if (i4 % 2 == 0) {
                return of;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return mediaCodecSelector.getDecoderInfos(alternativeCodecMimeType, z, z2);
    }

    public static List<MediaCodecInfo> getDecoderInfosSortedByFormatSupport(List<MediaCodecInfo> list, final Format format) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new ScoreProvider() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda4
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
            public final int getScore(Object obj) {
                return MediaCodecUtil.$r8$lambda$jclmsGbkPxwnfkIgRwEFviS4hUs(Format.this, (MediaCodecInfo) obj);
            }
        });
        int i2 = a + 63;
        c = i2 % 128;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ int lambda$getDecoderInfosSortedByFormatSupport$0(Format format, MediaCodecInfo mediaCodecInfo) {
        int i = 2 % 2;
        int i2 = c + 11;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return mediaCodecInfo.isFormatFunctionallySupported(format) ? 1 : 0;
        }
        mediaCodecInfo.isFormatFunctionallySupported(format);
        throw null;
    }

    public static int maxH264DecodableFrameSize() {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = a + 13;
        c = i3 % 128;
        int i4 = i3 % 2;
        if (maxH264DecodableFrameSize == -1) {
            int i5 = 0;
            MediaCodecInfo decoderInfo = getDecoderInfo("video/avc", false, false);
            if (decoderInfo != null) {
                int i6 = c + 41;
                a = i6 % 128;
                int i7 = i6 % 2;
                MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                if (i7 == 0) {
                    length = profileLevels.length;
                    i = 1;
                } else {
                    length = profileLevels.length;
                    i = 0;
                }
                while (i5 < length) {
                    int i8 = c + 89;
                    a = i8 % 128;
                    if (i8 % 2 == 0) {
                        i = Math.max(avcLevelToMaxFrameSize(profileLevels[i5].level), i);
                        i5 += 115;
                    } else {
                        i = Math.max(avcLevelToMaxFrameSize(profileLevels[i5].level), i);
                        i5++;
                    }
                }
                i5 = Math.max(i, Util.SDK_INT >= 21 ? 345600 : 172800);
            }
            maxH264DecodableFrameSize = i5;
        }
        return maxH264DecodableFrameSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        r1 = r1.split("\\.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        if ("video/dolby-vision".equals(r6.sampleMimeType) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        return getDolbyVisionProfileAndLevel(r6.codecs, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        r4 = r1[0];
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        switch(r4.hashCode()) {
            case 3004662: goto L44;
            case 3006243: goto L41;
            case 3006244: goto L38;
            case 3199032: goto L35;
            case 3214780: goto L32;
            case 3356560: goto L29;
            case 3624515: goto L12;
            default: goto L46;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r4.equals("vp09") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        r3 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r4.equals("mp4a") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        r3 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c + 55;
        androidx.media3.exoplayer.mediacodec.MediaCodecUtil.a = r3 % 128;
        r3 = r3 % 2;
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r4.equals("hvc1") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r4.equals("hev1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
        if (r4.equals("avc2") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        r3 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.a + 29;
        androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c = r3 % 128;
        r3 = r3 % 2;
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
        if (r4.equals("avc1") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
        if (r4.equals("av01") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
        r3 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
        switch(r3) {
            case 0: goto L27;
            case 1: goto L25;
            case 2: goto L25;
            case 3: goto L21;
            case 4: goto L21;
            case 5: goto L19;
            case 6: goto L17;
            default: goto L16;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
        return getVp9ProfileAndLevel(r6.codecs, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b0, code lost:
        return getAacCodecProfileAndLevel(r6.codecs, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
        r6 = getHevcProfileAndLevel(r6.codecs, r1, r6.colorInfo);
        r1 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.a + 105;
        androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if ((r1 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c5, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
        return getAvcProfileAndLevel(r6.codecs, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
        return getAv1ProfileAndLevel(r6.codecs, r1, r6.colorInfo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r1 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getCodecProfileAndLevel(androidx.media3.common.Format r6) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(androidx.media3.common.Format):android.util.Pair");
    }

    public static String getAlternativeCodecMimeType(Format format) {
        Pair<Integer, Integer> codecProfileAndLevel;
        int intValue;
        int i = 2 % 2;
        if ("audio/eac3-joc".equals(format.sampleMimeType)) {
            return "audio/eac3";
        }
        if ((!"video/dolby-vision".equals(format.sampleMimeType)) || (codecProfileAndLevel = getCodecProfileAndLevel(format)) == null) {
            return null;
        }
        int i2 = a + 13;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            intValue = ((Integer) codecProfileAndLevel.first).intValue();
            if (intValue == 70) {
                return "video/hevc";
            }
        } else {
            intValue = ((Integer) codecProfileAndLevel.first).intValue();
            if (intValue == 16) {
                return "video/hevc";
            }
        }
        int i3 = a;
        int i4 = i3 + 87;
        c = i4 % 128;
        int i5 = i4 % 2;
        if (intValue == 256) {
            int i6 = i3 + 113;
            c = i6 % 128;
            int i7 = i6 % 2;
            return "video/hevc";
        } else if (intValue == 512) {
            int i8 = i3 + 79;
            c = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i3 + 41;
            c = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 7 / 0;
            }
            return "video/avc";
        } else {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
        if (r8 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
        if (r23.secure != r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
        if (r23.secure == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
        r18 = r10;
        r19 = r11;
        r20 = r12;
        r2 = r13;
        r21 = r14;
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
        r7.add(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.newInstance(r11, r15, r10, r9, r2, r3, r0, false, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dc, code lost:
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00df, code lost:
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
        r5 = 2 / 5;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfosInternal(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey r23, androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat r24) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosInternal(androidx.media3.exoplayer.mediacodec.MediaCodecUtil$CodecKey, androidx.media3.exoplayer.mediacodec.MediaCodecUtil$MediaCodecListCompat):java.util.ArrayList");
    }

    private static String getCodecMimeType(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        int i = 2 % 2;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            int i2 = c + 81;
            a = i2 % 128;
            int i3 = i2 % 2;
            if (str3.equalsIgnoreCase(str2)) {
                int i4 = c + 23;
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    return str3;
                }
                throw null;
            }
        }
        if (!str2.equals("video/dolby-vision")) {
            if (!str2.equals("audio/alac") || !"OMX.lge.alac.decoder".equals(str)) {
                if (str2.equals("audio/flac")) {
                    int i5 = a + 67;
                    c = i5 % 128;
                    int i6 = i5 % 2;
                    if ("OMX.lge.flac.decoder".equals(str)) {
                        return "audio/x-lg-flac";
                    }
                }
                if (!(!str2.equals("audio/ac3")) && "OMX.lge.ac3.decoder".equals(str)) {
                    return "audio/lg-ac3";
                }
            } else {
                return "audio/x-lg-alac";
            }
        } else if (!"OMX.MS.HEVCDV.Decoder".equals(str)) {
            if (!"OMX.RTK.video.decoder".equals(str)) {
                int i7 = a + 101;
                c = i7 % 128;
                if (i7 % 2 != 0) {
                    boolean equals = "OMX.realtek.video.decoder.tunneled".equals(str);
                    int i8 = 93 / 0;
                    if (equals) {
                        return "video/dv_hevc";
                    }
                } else if ("OMX.realtek.video.decoder.tunneled".equals(str)) {
                    return "video/dv_hevc";
                }
            } else {
                return "video/dv_hevc";
            }
        } else {
            return "video/hevcdv";
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b7, code lost:
        if ("SCV31".equals(r10) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0206, code lost:
        if (r3.startsWith("t0") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        if (r10.startsWith("HM") != true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0137, code lost:
        if ("C1605".equals(r10) == false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo r8, java.lang.String r9, boolean r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.isCodecUsableDecoder(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):boolean");
    }

    private static /* synthetic */ int lambda$applyWorkarounds$1(MediaCodecInfo mediaCodecInfo) {
        int i = 2 % 2;
        String str = mediaCodecInfo.name;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (Util.SDK_INT < 26) {
            int i2 = c + 117;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                str.equals("OMX.MTK.AUDIO.DECODER.RAW");
                throw null;
            } else if (str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                int i3 = c + 7;
                a = i3 % 128;
                int i4 = i3 % 2;
                return -1;
            } else {
                return 0;
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
        if ("OMX.SEC.mp3.dec".equals(r3) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        if ((!"OMX.SEC.mp3.dec".equals(r3)) != true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        r4 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.a + 3;
        androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
        if ((r4 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
        r5 = 76 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
        if ("OMX.SEC.MP3.Decoder".equals(r3) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
        if ("OMX.SEC.MP3.Decoder".equals(r3) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if ("OMX.brcm.audio.mp3.decoder".equals(r3) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
        sortByScore(r13, new androidx.media3.exoplayer.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda7());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void applyWorkarounds(java.lang.String r12, java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> r13) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.applyWorkarounds(java.lang.String, java.util.List):void");
    }

    private static /* synthetic */ int lambda$applyWorkarounds$2(MediaCodecInfo mediaCodecInfo) {
        int i = 2 % 2;
        int i2 = a + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        c = i2 % 128;
        int i3 = i2 % 2;
        boolean startsWith = mediaCodecInfo.name.startsWith("OMX.google");
        int i4 = a + 91;
        c = i4 % 128;
        int i5 = i4 % 2;
        return startsWith ? 1 : 0;
    }

    private static boolean isAlias(android.media.MediaCodecInfo mediaCodecInfo) {
        boolean z;
        int i = 2 % 2;
        if (Util.SDK_INT >= 29) {
            int i2 = a + 39;
            c = i2 % 128;
            int i3 = i2 % 2;
            if (isAliasV29(mediaCodecInfo)) {
                z = true;
                int i4 = c + 103;
                a = i4 % 128;
                int i5 = i4 % 2;
                return z;
            }
        }
        z = false;
        int i42 = c + 103;
        a = i42 % 128;
        int i52 = i42 % 2;
        return z;
    }

    private static boolean isAliasV29(android.media.MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        int i = 2 % 2;
        int i2 = c + 63;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            mediaCodecInfo.isAlias();
            throw null;
        }
        isAlias = mediaCodecInfo.isAlias();
        int i3 = a + 51;
        c = i3 % 128;
        int i4 = i3 % 2;
        return isAlias;
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        int i = 2 % 2;
        int i2 = a + 117;
        c = i2 % 128;
        if (i2 % 2 == 0 ? Util.SDK_INT < 29 : Util.SDK_INT < 79) {
            return !isSoftwareOnly(mediaCodecInfo, str);
        }
        int i3 = a + 25;
        c = i3 % 128;
        if (i3 % 2 == 0) {
            return isHardwareAcceleratedV29(mediaCodecInfo);
        }
        isHardwareAcceleratedV29(mediaCodecInfo);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        int i = 2 % 2;
        int i2 = c + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
            return isHardwareAccelerated;
        }
        mediaCodecInfo.isHardwareAccelerated();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        int i = 2 % 2;
        if (Util.SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (MimeTypes.isAudio(str)) {
            int i2 = c + 123;
            a = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            int i4 = c + 5;
            a = i4 % 128;
            int i5 = i4 % 2;
            return false;
        } else if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return true;
        } else {
            if (lowerCase.startsWith("omx.sec.")) {
                int i6 = c + 73;
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    lowerCase.contains(".sw.");
                    throw null;
                } else if (lowerCase.contains(".sw.")) {
                    return true;
                }
            }
            if (!(!lowerCase.equals("omx.qcom.video.decoder.hevcswvdec")) || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
                return true;
            }
            if (!lowerCase.startsWith("omx.")) {
                int i7 = a + 29;
                c = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 8 / 0;
                    if (!lowerCase.startsWith("c2.")) {
                        return true;
                    }
                } else if (!lowerCase.startsWith("c2.")) {
                    return true;
                }
            }
            return false;
        }
    }

    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        int i = 2 % 2;
        int i2 = c + 55;
        a = i2 % 128;
        int i3 = i2 % 2;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = a + 91;
        c = i5 % 128;
        if (i5 % 2 == 0) {
            return isSoftwareOnly;
        }
        throw null;
    }

    private static boolean isVendor(android.media.MediaCodecInfo mediaCodecInfo) {
        int i = 2 % 2;
        int i2 = c + 41;
        a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (Util.SDK_INT >= 29) {
            int i4 = a + 77;
            c = i4 % 128;
            if (i4 % 2 == 0) {
                return isVendorV29(mediaCodecInfo);
            }
            isVendorV29(mediaCodecInfo);
            throw null;
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (!lowerCase.startsWith("omx.google.")) {
            int i5 = c + 103;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                lowerCase.startsWith("c2.android.");
                obj.hashCode();
                throw null;
            } else if (!lowerCase.startsWith("c2.android.") && !lowerCase.startsWith("c2.google.")) {
                int i6 = c + 83;
                a = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        int i8 = c + 101;
        a = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    private static boolean isVendorV29(android.media.MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        int i = 2 % 2;
        int i2 = a + 37;
        c = i2 % 128;
        if (i2 % 2 == 0) {
            isVendor = mediaCodecInfo.isVendor();
            return isVendor;
        }
        mediaCodecInfo.isVendor();
        throw null;
    }

    private static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = a + 95;
        c = i2 % 128;
        if (i2 % 2 == 0 ? strArr.length < 3 : strArr.length < 2) {
            Log.w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            int i3 = a + 11;
            c = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer dolbyVisionStringToProfile = dolbyVisionStringToProfile(group);
        if (dolbyVisionStringToProfile == null) {
            Log.w("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer dolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (dolbyVisionStringToLevel == null) {
            Log.w("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
            return null;
        }
        return new Pair<>(dolbyVisionStringToProfile, dolbyVisionStringToLevel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
        if (r11 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
        if (r11 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        if (r11.colorTransfer != 6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
        r9 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.a + 1;
        androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if ((r9 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
        r0 = 5659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r0 = 4096;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getHevcProfileAndLevel(java.lang.String r9, java.lang.String[] r10, androidx.media3.common.ColorInfo r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getHevcProfileAndLevel(java.lang.String, java.lang.String[], androidx.media3.common.ColorInfo):android.util.Pair");
    }

    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        int parseInt;
        int i;
        int i2 = 2 % 2;
        if (strArr.length < 2) {
            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            int i3 = a + 47;
            c = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                int i5 = a + 105;
                c = i5 % 128;
                int i6 = i5 % 2;
                i = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i = parseInt2;
            } else {
                Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int avcProfileNumberToConst = avcProfileNumberToConst(i);
            if (avcProfileNumberToConst == -1) {
                Log.w("MediaCodecUtil", "Unknown AVC profile: " + i);
                return null;
            }
            int avcLevelNumberToConst = avcLevelNumberToConst(parseInt);
            if (avcLevelNumberToConst == -1) {
                Log.w("MediaCodecUtil", "Unknown AVC level: " + parseInt);
                return null;
            }
            return new Pair<>(Integer.valueOf(avcProfileNumberToConst), Integer.valueOf(avcLevelNumberToConst));
        } catch (NumberFormatException unused) {
            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> getVp9ProfileAndLevel(String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = a + 101;
        c = i2 % 128;
        if (i2 % 2 == 0 ? strArr.length < 3 : strArr.length < 3) {
            Log.w("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            int i3 = c + 37;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int vp9ProfileNumberToConst = vp9ProfileNumberToConst(parseInt);
            if (vp9ProfileNumberToConst == -1) {
                Log.w("MediaCodecUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int vp9LevelNumberToConst = vp9LevelNumberToConst(parseInt2);
            if (vp9LevelNumberToConst == -1) {
                Log.w("MediaCodecUtil", "Unknown VP9 level: " + parseInt2);
                return null;
            }
            return new Pair<>(Integer.valueOf(vp9ProfileNumberToConst), Integer.valueOf(vp9LevelNumberToConst));
        } catch (NumberFormatException unused) {
            Log.w("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> getAv1ProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = c + 105;
        a = i4 % 128;
        if (i4 % 2 != 0 ? strArr.length < 4 : strArr.length < 5) {
            Log.w("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                Log.w("MediaCodecUtil", "Unknown AV1 profile: " + parseInt);
                return null;
            }
            if (parseInt3 != 8) {
                int i5 = c + 55;
                a = i5 % 128;
                if (i5 % 2 != 0 ? parseInt3 != 10 : parseInt3 != 101) {
                    Log.w("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt3);
                    return null;
                }
            }
            if (parseInt3 == 8) {
                int i6 = c + 11;
                a = i6 % 128;
                int i7 = i6 % 2;
                i2 = 1;
            } else if (colorInfo != null) {
                int i8 = c + 125;
                a = i8 % 128;
                int i9 = i8 % 2;
                if (colorInfo.hdrStaticInfo != null || (i = colorInfo.colorTransfer) == 7 || i == 6) {
                    int i10 = c + 57;
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    i2 = 4096;
                }
            }
            int av1LevelNumberToConst = av1LevelNumberToConst(parseInt2);
            if (av1LevelNumberToConst == -1) {
                Log.w("MediaCodecUtil", "Unknown AV1 level: " + parseInt2);
                return null;
            }
            return new Pair<>(Integer.valueOf(i2), Integer.valueOf(av1LevelNumberToConst));
        } catch (NumberFormatException unused) {
            Log.w("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> getAacCodecProfileAndLevel(String str, String[] strArr) {
        int mp4aAudioObjectTypeToProfile;
        int i = 2 % 2;
        int i2 = a + 35;
        c = i2 % 128;
        int i3 = i2 % 2;
        if (strArr.length != 3) {
            Log.w("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16))) && (mp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]))) != -1) {
                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(mp4aAudioObjectTypeToProfile), 0);
                int i4 = a + 117;
                c = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 12 / 0;
                }
                return pair;
            }
        } catch (NumberFormatException unused) {
            Log.w("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    private static /* synthetic */ int lambda$sortByScore$3(ScoreProvider scoreProvider, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = c + 69;
        a = i2 % 128;
        int i3 = i2 % 2;
        int score = scoreProvider.getScore(obj2);
        int score2 = scoreProvider.getScore(obj);
        return i3 == 0 ? score >>> score2 : score - score2;
    }

    private static <T> void sortByScore(List<T> list, final ScoreProvider<T> scoreProvider) {
        int i = 2 % 2;
        Collections.sort(list, new Comparator() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.$r8$lambda$j9HDDpakw55z3kgXGyludkE7sIw(MediaCodecUtil.ScoreProvider.this, obj, obj2);
            }
        });
        int i2 = a + 99;
        c = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {
        private final int codecKind;
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return true;
        }

        public MediaCodecListCompatV21(boolean z, boolean z2) {
            this.codecKind = (z || z2) ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new MediaCodecList(this.codecKind).getCodecInfos();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return false;
        }

        private MediaCodecListCompatV16() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class CodecKey {
        public final String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public CodecKey(String str, boolean z, boolean z2) {
            this.mimeType = str;
            this.secure = z;
            this.tunneling = z2;
        }

        public int hashCode() {
            int hashCode = this.mimeType.hashCode();
            return ((((hashCode + 31) * 31) + (this.secure ? 1231 : 1237)) * 31) + (this.tunneling ? 1231 : 1237);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != CodecKey.class) {
                return false;
            }
            CodecKey codecKey = (CodecKey) obj;
            return TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure && this.tunneling == codecKey.tunneling;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Integer hevcCodecStringToProfileLevel(String str) {
        char c2;
        int i = 2 % 2;
        int i2 = a + 105;
        int i3 = i2 % 128;
        c = i3;
        int i4 = i2 % 2;
        if (str == null) {
            int i5 = i3 + 109;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 70914:
                if (str.equals("H60")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 70917:
                if (str.equals("H63")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 71007:
                if (str.equals("H90")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 71010:
                if (!str.equals("H93")) {
                    int i6 = a + 81;
                    c = i6 % 128;
                    int i7 = i6 % 2;
                    c2 = 65535;
                    break;
                } else {
                    c2 = 4;
                    break;
                }
            case 74665:
                if (str.equals("L30")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 74758:
                if (str.equals("L60")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 74761:
                if (str.equals("L63")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 74851:
                if (str.equals("L90")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 74854:
                if (str.equals("L93")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                return 64;
            case '\t':
                return Integer.valueOf((int) JSONzip.end);
            case '\n':
                return 2048;
            case 11:
                return 8192;
            case '\f':
                return Integer.valueOf((int) Privacy.DEFAULT);
            case '\r':
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return Integer.valueOf((int) AleCryptoBouncyCastle.MAX_RANDOM_BYTES);
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                int i8 = c + 81;
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 30 / 0;
                }
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
        if (r8.equals("03") == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Integer dolbyVisionStringToProfile(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.dolbyVisionStringToProfile(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Integer dolbyVisionStringToLevel(String str) {
        char c2;
        int i = 2 % 2;
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        switch (hashCode) {
            case 1537:
                if (str.equals("01")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1538:
                if (str.equals("02")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1539:
                if (str.equals("03")) {
                    int i2 = c + 77;
                    a = i2 % 128;
                    int i3 = i2 % 2;
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1540:
                if (str.equals("04")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1541:
                if (str.equals("05")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1542:
                if (str.equals("06")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1543:
                if (str.equals("07")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1544:
                if (!str.equals("08")) {
                    int i4 = c + 123;
                    a = i4 % 128;
                    int i5 = i4 % 2;
                    c2 = 65535;
                    break;
                } else {
                    c2 = 7;
                    break;
                }
            case 1545:
                if (str.equals("09")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            default:
                switch (hashCode) {
                    case 1567:
                        if (str.equals("10")) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1568:
                        if (str.equals("11")) {
                            c2 = '\n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1569:
                        if (str.equals("12")) {
                            c2 = 11;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1570:
                        if (str.equals("13")) {
                            c2 = '\f';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
        }
        switch (c2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                Integer valueOf = Integer.valueOf((int) JSONzip.end);
                int i6 = c + NetflixImageView.DEFAULT_LAYER_GRAVITY;
                a = i6 % 128;
                int i7 = i6 % 2;
                return valueOf;
            case '\t':
                return 512;
            case '\n':
                return 1024;
            case 11:
                return 2048;
            case '\f':
                return 4096;
            default:
                return null;
        }
    }

    private static void d(int[] iArr, int i, byte[] bArr, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        C9572sD c9572sD = new C9572sD();
        char[] cArr2 = d$s16$497;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                cArr3[i4] = (char) (cArr2[i4] ^ (-189645286263740190L));
                i4++;
                int i5 = $11 + 55;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            }
            cArr2 = cArr3;
        }
        int i7 = (int) ((-189645286263740190L) ^ a$s17$497);
        if (e$s20$497) {
            c9572sD.a = bArr.length;
            char[] cArr4 = new char[c9572sD.a];
            c9572sD.e = 0;
            while (c9572sD.e < c9572sD.a) {
                cArr4[c9572sD.e] = (char) (cArr2[bArr[(c9572sD.a - 1) - c9572sD.e] + i] - i7);
                c9572sD.e++;
            }
            objArr[0] = new String(cArr4);
        } else if (b$s19$497) {
            c9572sD.a = cArr.length;
            char[] cArr5 = new char[c9572sD.a];
            c9572sD.e = 0;
            while (c9572sD.e < c9572sD.a) {
                int i8 = $11 + 107;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr5[c9572sD.e] = (char) (cArr2[cArr[(c9572sD.a - 1) - c9572sD.e] - i] - i7);
                c9572sD.e++;
            }
            objArr[0] = new String(cArr5);
        } else {
            c9572sD.a = iArr.length;
            char[] cArr6 = new char[c9572sD.a];
            c9572sD.e = 0;
            while (c9572sD.e < c9572sD.a) {
                int i10 = $10 + 27;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr6[c9572sD.e] = (char) (cArr2[iArr[c9572sD.a >> c9572sD.e] + i] >> i7);
                    i2 = c9572sD.e << 1;
                } else {
                    cArr6[c9572sD.e] = (char) (cArr2[iArr[(c9572sD.a - 1) - c9572sD.e] - i] - i7);
                    i2 = c9572sD.e + 1;
                }
                c9572sD.e = i2;
            }
            objArr[0] = new String(cArr6);
        }
    }
}
