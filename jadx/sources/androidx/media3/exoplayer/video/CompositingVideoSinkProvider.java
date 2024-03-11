package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.FrameInfo;
import androidx.media3.common.PreviewingVideoGraph;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.CompositingVideoSinkProvider;
import androidx.media3.exoplayer.video.VideoSink;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes2.dex */
final class CompositingVideoSinkProvider implements VideoSinkProvider {
    private final Context context;
    private final PreviewingVideoGraph.Factory previewingVideoGraphFactory;
    private boolean released;
    private final VideoSink.RenderControl renderControl;
    private List<Effect> videoEffects;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private VideoSinkImpl videoSinkImpl;

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public boolean isInitialized() {
        return this.videoSinkImpl != null;
    }

    public CompositingVideoSinkProvider(Context context, VideoFrameProcessor.Factory factory, VideoSink.RenderControl renderControl) {
        this(context, new ReflectivePreviewingSingleInputVideoGraphFactory(factory), renderControl);
    }

    CompositingVideoSinkProvider(Context context, PreviewingVideoGraph.Factory factory, VideoSink.RenderControl renderControl) {
        this.context = context;
        this.previewingVideoGraphFactory = factory;
        this.renderControl = renderControl;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void initialize(Format format) {
        Assertions.checkState(!this.released && this.videoSinkImpl == null);
        Assertions.checkStateNotNull(this.videoEffects);
        try {
            VideoSinkImpl videoSinkImpl = new VideoSinkImpl(this.context, this.previewingVideoGraphFactory, this.renderControl, format);
            this.videoSinkImpl = videoSinkImpl;
            VideoFrameMetadataListener videoFrameMetadataListener = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoSinkImpl.setVideoFrameMetadataListener(videoFrameMetadataListener);
            }
            this.videoSinkImpl.setVideoEffects((List) Assertions.checkNotNull(this.videoEffects));
        } catch (VideoFrameProcessingException e) {
            throw new VideoSink.VideoSinkException(e, format);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void release() {
        if (this.released) {
            return;
        }
        VideoSinkImpl videoSinkImpl = this.videoSinkImpl;
        if (videoSinkImpl != null) {
            videoSinkImpl.release();
            this.videoSinkImpl = null;
        }
        this.released = true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public VideoSink getSink() {
        return (VideoSink) Assertions.checkStateNotNull(this.videoSinkImpl);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setVideoEffects(List<Effect> list) {
        this.videoEffects = list;
        if (isInitialized()) {
            ((VideoSinkImpl) Assertions.checkStateNotNull(this.videoSinkImpl)).setVideoEffects(list);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setStreamOffsetUs(long j) {
        ((VideoSinkImpl) Assertions.checkStateNotNull(this.videoSinkImpl)).setStreamOffsetUs(j);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setOutputSurfaceInfo(Surface surface, Size size) {
        ((VideoSinkImpl) Assertions.checkStateNotNull(this.videoSinkImpl)).setOutputSurfaceInfo(surface, size);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void clearOutputSurfaceInfo() {
        ((VideoSinkImpl) Assertions.checkStateNotNull(this.videoSinkImpl)).clearOutputSurfaceInfo();
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        if (isInitialized()) {
            ((VideoSinkImpl) Assertions.checkStateNotNull(this.videoSinkImpl)).setVideoFrameMetadataListener(videoFrameMetadataListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class VideoSinkImpl implements VideoSink, VideoGraph.Listener {
        private final Context context;
        private Pair<Surface, Size> currentSurfaceAndSize;
        private final Handler handler;
        private Format inputFormat;
        private long inputStreamOffsetUs;
        private VideoSink.Listener listener;
        private Executor listenerExecutor;
        private boolean onVideoSizeChangedCalled;
        private long outputStreamOffsetUs;
        private boolean pendingInputStreamOffsetChange;
        private float playbackSpeed;
        private VideoSize processedFrameSize;
        private boolean processedLastFrame;
        private boolean registeredLastFrame;
        private boolean releasedLastFrame;
        private final VideoSink.RenderControl renderControl;
        private boolean renderedFirstFrame;
        private VideoSize reportedVideoSize;
        private final Effect rotationEffect;
        private final ArrayList<Effect> videoEffects;
        private VideoFrameMetadataListener videoFrameMetadataListener;
        private final VideoFrameProcessor videoFrameProcessor;
        private final int videoFrameProcessorMaxPendingFrameCount;
        private final LongArrayQueue processedFramesBufferTimestampsUs = new LongArrayQueue();
        private final TimedValueQueue<Long> streamOffsets = new TimedValueQueue<>();
        private final TimedValueQueue<VideoSize> videoSizeChanges = new TimedValueQueue<>();
        private long lastCodecBufferPresentationTimestampUs = -9223372036854775807L;

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            return this.releasedLastFrame;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady() {
            return this.renderedFirstFrame;
        }

        public void setStreamOffsetUs(long j) {
            this.pendingInputStreamOffsetChange = this.inputStreamOffsetUs != j;
            this.inputStreamOffsetUs = j;
        }

        public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
            this.videoFrameMetadataListener = videoFrameMetadataListener;
        }

        public VideoSinkImpl(Context context, PreviewingVideoGraph.Factory factory, VideoSink.RenderControl renderControl, Format format) {
            ColorInfo colorInfo;
            int i;
            this.context = context;
            this.renderControl = renderControl;
            this.videoFrameProcessorMaxPendingFrameCount = Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
            VideoSize videoSize = VideoSize.UNKNOWN;
            this.processedFrameSize = videoSize;
            this.reportedVideoSize = videoSize;
            this.playbackSpeed = 1.0f;
            Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
            this.handler = createHandlerForCurrentLooper;
            ColorInfo colorInfo2 = format.colorInfo;
            if (colorInfo2 != null && ColorInfo.isTransferHdr(colorInfo2)) {
                colorInfo = format.colorInfo;
            } else {
                colorInfo = ColorInfo.SDR_BT709_LIMITED;
            }
            ColorInfo colorInfo3 = colorInfo;
            ColorInfo build = colorInfo3.colorTransfer == 7 ? colorInfo3.buildUpon().setColorTransfer(6).build() : colorInfo3;
            DebugViewProvider debugViewProvider = DebugViewProvider.NONE;
            Objects.requireNonNull(createHandlerForCurrentLooper);
            PreviewingVideoGraph create = factory.create(context, colorInfo3, build, debugViewProvider, this, new ConcurrencyHelpers$$ExternalSyntheticLambda1(createHandlerForCurrentLooper), ImmutableList.of(), 0L);
            this.videoFrameProcessor = create.getProcessor(create.registerInput());
            Pair<Surface, Size> pair = this.currentSurfaceAndSize;
            if (pair != null) {
                Size size = (Size) pair.second;
                create.setOutputSurfaceInfo(new SurfaceInfo((Surface) pair.first, size.getWidth(), size.getHeight()));
            }
            this.videoEffects = new ArrayList<>();
            this.rotationEffect = (Util.SDK_INT >= 21 || (i = format.rotationDegrees) == 0) ? null : ScaleAndRotateAccessor.createRotationEffect(i);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void flush() {
            this.videoFrameProcessor.flush();
            this.processedFramesBufferTimestampsUs.clear();
            this.streamOffsets.clear();
            this.handler.removeCallbacksAndMessages(null);
            this.renderedFirstFrame = false;
            if (this.registeredLastFrame) {
                this.registeredLastFrame = false;
                this.processedLastFrame = false;
                this.releasedLastFrame = false;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void registerInputStream(int i, Format format) {
            if (i != 1) {
                throw new UnsupportedOperationException("Unsupported input type " + i);
            }
            this.inputFormat = format;
            maybeRegisterInputStream();
            if (this.registeredLastFrame) {
                this.registeredLastFrame = false;
                this.processedLastFrame = false;
                this.releasedLastFrame = false;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setListener(VideoSink.Listener listener, Executor executor) {
            if (Util.areEqual(this.listener, listener)) {
                Assertions.checkState(Util.areEqual(this.listenerExecutor, executor));
                return;
            }
            this.listener = listener;
            this.listenerExecutor = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isFrameDropAllowedOnInput() {
            return Util.isFrameDropAllowedOnSurfaceInput(this.context);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface getInputSurface() {
            return this.videoFrameProcessor.getInputSurface();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public long registerInputFrame(long j, boolean z) {
            Assertions.checkState(this.videoFrameProcessorMaxPendingFrameCount != -1);
            if (this.videoFrameProcessor.getPendingInputFrameCount() < this.videoFrameProcessorMaxPendingFrameCount && this.videoFrameProcessor.registerInputFrame()) {
                long j2 = this.inputStreamOffsetUs;
                long j3 = j + j2;
                if (this.pendingInputStreamOffsetChange) {
                    this.streamOffsets.add(j3, Long.valueOf(j2));
                    this.pendingInputStreamOffsetChange = false;
                }
                if (z) {
                    this.registeredLastFrame = true;
                    this.lastCodecBufferPresentationTimestampUs = j3;
                }
                return j3 * 1000;
            }
            return -9223372036854775807L;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j, long j2) {
            while (!this.processedFramesBufferTimestampsUs.isEmpty()) {
                long element = this.processedFramesBufferTimestampsUs.element();
                if (maybeUpdateOutputStreamOffset(element)) {
                    this.renderedFirstFrame = false;
                }
                long j3 = element - this.outputStreamOffsetUs;
                boolean z = this.processedLastFrame && this.processedFramesBufferTimestampsUs.size() == 1;
                long frameRenderTimeNs = this.renderControl.getFrameRenderTimeNs(element, j, j2, this.playbackSpeed);
                if (frameRenderTimeNs == -3) {
                    return;
                }
                if (j3 == -2) {
                    releaseProcessedFrameInternal(-2L, z);
                } else {
                    this.renderControl.onNextFrame(element);
                    VideoFrameMetadataListener videoFrameMetadataListener = this.videoFrameMetadataListener;
                    if (videoFrameMetadataListener != null) {
                        videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j3, frameRenderTimeNs == -1 ? System.nanoTime() : frameRenderTimeNs, (Format) Assertions.checkNotNull(this.inputFormat), null);
                    }
                    if (frameRenderTimeNs == -1) {
                        frameRenderTimeNs = -1;
                    }
                    releaseProcessedFrameInternal(frameRenderTimeNs, z);
                    maybeNotifyVideoSizeChanged(element);
                }
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPlaybackSpeed(float f) {
            Assertions.checkArgument(((double) f) >= 0.0d);
            this.playbackSpeed = f;
        }

        public void release() {
            this.videoFrameProcessor.release();
            this.handler.removeCallbacksAndMessages(null);
            this.streamOffsets.clear();
            this.processedFramesBufferTimestampsUs.clear();
            this.renderedFirstFrame = false;
        }

        public void setVideoEffects(List<Effect> list) {
            this.videoEffects.clear();
            this.videoEffects.addAll(list);
            maybeRegisterInputStream();
        }

        private void maybeRegisterInputStream() {
            if (this.inputFormat == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Effect effect = this.rotationEffect;
            if (effect != null) {
                arrayList.add(effect);
            }
            arrayList.addAll(this.videoEffects);
            Format format = (Format) Assertions.checkNotNull(this.inputFormat);
            this.videoFrameProcessor.registerInputStream(1, arrayList, new FrameInfo.Builder(format.width, format.height).setPixelWidthHeightRatio(format.pixelWidthHeightRatio).build());
        }

        public void setOutputSurfaceInfo(Surface surface, Size size) {
            Pair<Surface, Size> pair = this.currentSurfaceAndSize;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) this.currentSurfaceAndSize.second).equals(size)) {
                return;
            }
            Pair<Surface, Size> pair2 = this.currentSurfaceAndSize;
            this.renderedFirstFrame = pair2 == null || ((Surface) pair2.first).equals(surface);
            this.currentSurfaceAndSize = Pair.create(surface, size);
            this.videoFrameProcessor.setOutputSurfaceInfo(new SurfaceInfo(surface, size.getWidth(), size.getHeight()));
        }

        public void clearOutputSurfaceInfo() {
            this.videoFrameProcessor.setOutputSurfaceInfo(null);
            this.currentSurfaceAndSize = null;
            this.renderedFirstFrame = false;
        }

        private boolean maybeUpdateOutputStreamOffset(long j) {
            Long pollFloor = this.streamOffsets.pollFloor(j);
            if (pollFloor == null || pollFloor.longValue() == this.outputStreamOffsetUs) {
                return false;
            }
            this.outputStreamOffsetUs = pollFloor.longValue();
            return true;
        }

        private void releaseProcessedFrameInternal(long j, boolean z) {
            this.videoFrameProcessor.renderOutputFrame(j);
            this.processedFramesBufferTimestampsUs.remove();
            if (j == -2) {
                this.renderControl.onFrameDropped();
            } else {
                this.renderControl.onFrameRendered();
                if (!this.renderedFirstFrame) {
                    if (this.listener != null) {
                        ((Executor) Assertions.checkNotNull(this.listenerExecutor)).execute(new Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$VideoSinkImpl$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                CompositingVideoSinkProvider.VideoSinkImpl.this.lambda$releaseProcessedFrameInternal$1();
                            }
                        });
                    }
                    this.renderedFirstFrame = true;
                }
            }
            if (z) {
                this.releasedLastFrame = true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$releaseProcessedFrameInternal$1() {
            ((VideoSink.Listener) Assertions.checkNotNull(this.listener)).onFirstFrameRendered(this);
        }

        private void maybeNotifyVideoSizeChanged(long j) {
            final VideoSize pollFloor;
            if (this.onVideoSizeChangedCalled || this.listener == null || (pollFloor = this.videoSizeChanges.pollFloor(j)) == null) {
                return;
            }
            if (!pollFloor.equals(VideoSize.UNKNOWN) && !pollFloor.equals(this.reportedVideoSize)) {
                this.reportedVideoSize = pollFloor;
                ((Executor) Assertions.checkNotNull(this.listenerExecutor)).execute(new Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$VideoSinkImpl$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        CompositingVideoSinkProvider.VideoSinkImpl.this.lambda$maybeNotifyVideoSizeChanged$2(pollFloor);
                    }
                });
            }
            this.onVideoSizeChangedCalled = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$maybeNotifyVideoSizeChanged$2(VideoSize videoSize) {
            ((VideoSink.Listener) Assertions.checkNotNull(this.listener)).onVideoSizeChanged(this, videoSize);
        }

        /* loaded from: classes2.dex */
        static final class ScaleAndRotateAccessor {
            private static Method buildScaleAndRotateTransformationMethod;
            private static Constructor<?> scaleAndRotateTransformationBuilderConstructor;
            private static Method setRotationMethod;

            public static Effect createRotationEffect(float f) {
                try {
                    prepare();
                    Object newInstance = scaleAndRotateTransformationBuilderConstructor.newInstance(new Object[0]);
                    setRotationMethod.invoke(newInstance, Float.valueOf(f));
                    return (Effect) Assertions.checkNotNull(buildScaleAndRotateTransformationMethod.invoke(newInstance, new Object[0]));
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }

            @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod"})
            private static void prepare() {
                if (scaleAndRotateTransformationBuilderConstructor == null || setRotationMethod == null || buildScaleAndRotateTransformationMethod == null) {
                    Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                    scaleAndRotateTransformationBuilderConstructor = cls.getConstructor(new Class[0]);
                    setRotationMethod = cls.getMethod("setRotationDegrees", Float.TYPE);
                    buildScaleAndRotateTransformationMethod = cls.getMethod("build", new Class[0]);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class ReflectivePreviewingSingleInputVideoGraphFactory implements PreviewingVideoGraph.Factory {
        private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

        public ReflectivePreviewingSingleInputVideoGraphFactory(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
        }

        @Override // androidx.media3.common.PreviewingVideoGraph.Factory
        public PreviewingVideoGraph create(Context context, ColorInfo colorInfo, ColorInfo colorInfo2, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, List<Effect> list, long j) {
            try {
                Constructor<?> constructor = Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class);
                Object[] objArr = new Object[1];
                try {
                    objArr[0] = this.videoFrameProcessorFactory;
                    return ((PreviewingVideoGraph.Factory) constructor.newInstance(objArr)).create(context, colorInfo, colorInfo2, debugViewProvider, listener, executor, list, j);
                } catch (Exception e) {
                    e = e;
                    throw VideoFrameProcessingException.from(e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }
}
