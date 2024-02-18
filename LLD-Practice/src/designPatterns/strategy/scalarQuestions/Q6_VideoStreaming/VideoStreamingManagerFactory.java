package designPatterns.strategy.scalarQuestions.Q6_VideoStreaming;

public class VideoStreamingManagerFactory {
    public static QualityAdjustmentStrategy getVideoQuality(VideoQuality videoQuality){
        switch (videoQuality){
            case LOW: return new LowQualitySetter();
            case HIGH: return new HighQualitySetter();
            case MEDIUM: return new MediumQualitySetter();
            default: return null;
        }
    }
}
