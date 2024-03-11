package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.common.FileTypes;
import androidx.media3.common.Format;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.avi.AviExtractor;
import androidx.media3.extractor.bmp.BmpExtractor;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.flv.FlvExtractor;
import androidx.media3.extractor.heif.HeifExtractor;
import androidx.media3.extractor.jpeg.JpegExtractor;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.png.PngExtractor;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractor;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;
import androidx.media3.extractor.webp.WebpExtractor;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class DefaultExtractorsFactory implements ExtractorsFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20};
    private static final ExtensionLoader FLAC_EXTENSION_LOADER = new ExtensionLoader(new ExtensionLoader.ConstructorSupplier() { // from class: androidx.media3.extractor.DefaultExtractorsFactory$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
        public final Constructor getConstructor() {
            Constructor flacExtractorConstructor;
            flacExtractorConstructor = DefaultExtractorsFactory.getFlacExtractorConstructor();
            return flacExtractorConstructor;
        }
    });
    private static final ExtensionLoader MIDI_EXTENSION_LOADER = new ExtensionLoader(new ExtensionLoader.ConstructorSupplier() { // from class: androidx.media3.extractor.DefaultExtractorsFactory$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
        public final Constructor getConstructor() {
            Constructor midiExtractorConstructor;
            midiExtractorConstructor = DefaultExtractorsFactory.getMidiExtractorConstructor();
            return midiExtractorConstructor;
        }
    });
    private int adtsFlags;
    private int amrFlags;
    private boolean constantBitrateSeekingAlwaysEnabled;
    private boolean constantBitrateSeekingEnabled;
    private int flacFlags;
    private int fragmentedMp4Flags;
    private int jpegFlags;
    private int matroskaFlags;
    private int mp3Flags;
    private int mp4Flags;
    private boolean textTrackTranscodingEnabled;
    private int tsFlags;
    private ImmutableList<Format> tsSubtitleFormats;
    private int tsMode = 1;
    private int tsTimestampSearchBytes = 112800;
    private SubtitleParser.Factory subtitleParserFactory = new DefaultSubtitleParserFactory();

    public DefaultExtractorsFactory setJpegExtractorFlags(int i) {
        synchronized (this) {
            this.jpegFlags = i;
        }
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        Extractor[] createExtractors;
        synchronized (this) {
            createExtractors = createExtractors(Uri.EMPTY, new HashMap());
        }
        return createExtractors;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        Extractor[] extractorArr;
        Extractor extractor;
        synchronized (this) {
            int[] iArr = DEFAULT_EXTRACTOR_ORDER;
            ArrayList arrayList = new ArrayList(iArr.length);
            int inferFileTypeFromResponseHeaders = FileTypes.inferFileTypeFromResponseHeaders(map);
            if (inferFileTypeFromResponseHeaders != -1) {
                addExtractorsForFileType(inferFileTypeFromResponseHeaders, arrayList);
            }
            int inferFileTypeFromUri = FileTypes.inferFileTypeFromUri(uri);
            if (inferFileTypeFromUri != -1 && inferFileTypeFromUri != inferFileTypeFromResponseHeaders) {
                addExtractorsForFileType(inferFileTypeFromUri, arrayList);
            }
            for (int i : iArr) {
                if (i != inferFileTypeFromResponseHeaders && i != inferFileTypeFromUri) {
                    addExtractorsForFileType(i, arrayList);
                }
            }
            extractorArr = new Extractor[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (this.textTrackTranscodingEnabled) {
                    extractor = new SubtitleTranscodingExtractor(arrayList.get(i2), this.subtitleParserFactory);
                } else {
                    extractor = arrayList.get(i2);
                }
                extractorArr[i2] = extractor;
            }
        }
        return extractorArr;
    }

    private void addExtractorsForFileType(int i, List<Extractor> list) {
        switch (i) {
            case 0:
                list.add(new Ac3Extractor());
                return;
            case 1:
                list.add(new Ac4Extractor());
                return;
            case 2:
                list.add(new AdtsExtractor(this.adtsFlags | (this.constantBitrateSeekingEnabled ? 1 : 0) | (this.constantBitrateSeekingAlwaysEnabled ? 2 : 0)));
                return;
            case 3:
                list.add(new AmrExtractor(this.amrFlags | (this.constantBitrateSeekingEnabled ? 1 : 0) | (this.constantBitrateSeekingAlwaysEnabled ? 2 : 0)));
                return;
            case 4:
                Extractor extractor = FLAC_EXTENSION_LOADER.getExtractor(Integer.valueOf(this.flacFlags));
                if (extractor != null) {
                    list.add(extractor);
                    return;
                } else {
                    list.add(new FlacExtractor(this.flacFlags));
                    return;
                }
            case 5:
                list.add(new FlvExtractor());
                return;
            case 6:
                list.add(new MatroskaExtractor(this.matroskaFlags));
                return;
            case 7:
                list.add(new Mp3Extractor(this.mp3Flags | (this.constantBitrateSeekingEnabled ? 1 : 0) | (this.constantBitrateSeekingAlwaysEnabled ? 2 : 0)));
                return;
            case 8:
                list.add(new FragmentedMp4Extractor(this.fragmentedMp4Flags));
                list.add(new Mp4Extractor(this.mp4Flags));
                return;
            case 9:
                list.add(new OggExtractor());
                return;
            case 10:
                list.add(new PsExtractor());
                return;
            case 11:
                if (this.tsSubtitleFormats == null) {
                    this.tsSubtitleFormats = ImmutableList.of();
                }
                list.add(new TsExtractor(this.tsMode, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(this.tsFlags, this.tsSubtitleFormats), this.tsTimestampSearchBytes));
                return;
            case 12:
                list.add(new WavExtractor());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new JpegExtractor(this.jpegFlags));
                return;
            case 15:
                Extractor extractor2 = MIDI_EXTENSION_LOADER.getExtractor(new Object[0]);
                if (extractor2 != null) {
                    list.add(extractor2);
                    return;
                }
                return;
            case 16:
                list.add(new AviExtractor());
                return;
            case 17:
                list.add(new PngExtractor());
                return;
            case 18:
                list.add(new WebpExtractor());
                return;
            case 19:
                list.add(new BmpExtractor());
                return;
            case 20:
                int i2 = this.mp4Flags;
                if ((i2 & 2) == 0 && (i2 & 4) == 0) {
                    list.add(new HeifExtractor());
                    return;
                }
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends Extractor> getMidiExtractorConstructor() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(Extractor.class).getConstructor(new Class[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends Extractor> getFlacExtractorConstructor() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ExtensionLoader {
        private final ConstructorSupplier constructorSupplier;
        private final AtomicBoolean extensionLoaded = new AtomicBoolean(false);
        private Constructor<? extends Extractor> extractorConstructor;

        /* loaded from: classes2.dex */
        public interface ConstructorSupplier {
            Constructor<? extends Extractor> getConstructor();
        }

        public ExtensionLoader(ConstructorSupplier constructorSupplier) {
            this.constructorSupplier = constructorSupplier;
        }

        public Extractor getExtractor(Object... objArr) {
            Constructor<? extends Extractor> maybeLoadExtractorConstructor = maybeLoadExtractorConstructor();
            if (maybeLoadExtractorConstructor == null) {
                return null;
            }
            try {
                return maybeLoadExtractorConstructor.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }

        private Constructor<? extends Extractor> maybeLoadExtractorConstructor() {
            synchronized (this.extensionLoaded) {
                if (this.extensionLoaded.get()) {
                    return this.extractorConstructor;
                }
                try {
                    return this.constructorSupplier.getConstructor();
                } catch (ClassNotFoundException unused) {
                    this.extensionLoaded.set(true);
                    return this.extractorConstructor;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }
}