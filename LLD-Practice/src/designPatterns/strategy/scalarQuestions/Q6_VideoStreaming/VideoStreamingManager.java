package designPatterns.strategy.scalarQuestions.Q6_VideoStreaming;

public class VideoStreamingManager {
    private Video video;
    public VideoStreamingManager(Video video) {
        this.video = video;
    }
    public void streamVideo() {
        VideoQuality videoQuality  = video.getVideoQuality();
        QualityAdjustmentStrategy qualityAdjustmentStrategy = VideoStreamingManagerFactory.getVideoQuality(videoQuality);
        if (qualityAdjustmentStrategy != null) {
            qualityAdjustmentStrategy.adjustVideoQuality(video);
        } else {
            throw new IllegalArgumentException("Unsupported video quality: " + videoQuality);
        }
    }
}