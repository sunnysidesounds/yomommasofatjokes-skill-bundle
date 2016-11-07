package yomommasofatjokes;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public final class YoMommaSoFatJokesSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final Set<String> supportedApplicationIds = new HashSet<String>();

    static {
        supportedApplicationIds.add("amzn1.ask.skill.7ef118b9-43bd-41fd-884a-e1f76854ccee");
    }

    public YoMommaSoFatJokesSpeechletRequestStreamHandler() {
        super(new YoMommaSoFatJokesSpeechlet(), supportedApplicationIds);
    }
}