package designPatterns.strategy.scalarQuestions.Q6_VideoStreaming;

public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();
    Video adjustVideoQuality(Video video);
}