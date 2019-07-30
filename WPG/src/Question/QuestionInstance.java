package Question;

public class QuestionInstance {
    private QuestionState state;

    public void setState(QuestionState state){
        this.state = state;
    }

    public QuestionState getState(){
        return state;
    }
}