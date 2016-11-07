package yomommasofatjokes;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public final class YoMommaSoFatJokesSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final Set<String> supportedApplicationIds = new HashSet<String>();

    static {
        supportedApplicationIds.add("<your-appid-here>");
    }

    public YoMommaSoFatJokesSpeechletRequestStreamHandler() {
        super(new YoMommaSoFatJokesSpeechlet(), supportedApplicationIds);
    }
}