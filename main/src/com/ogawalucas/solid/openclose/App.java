package com.ogawalucas.solid.openclose;

public class App {

	public static void main(String[] args) {
		InterviewQuestionProcessor.process(new AIInterviewQuestions());
		InterviewQuestionProcessor.process(new AlgorithmsInterviewQuestions());
		InterviewQuestionProcessor.process(new FinanceInterviewQuestions());
		InterviewQuestionProcessor.process(new CSInterviewQuestions());
	}
}
