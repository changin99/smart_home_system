public class SpeakerToggleCommand implements Command {
    private SmartSpeaker speaker;

    public SpeakerToggleCommand(SmartSpeaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void execute() {
        speaker.performComplexAction();
    }
}

