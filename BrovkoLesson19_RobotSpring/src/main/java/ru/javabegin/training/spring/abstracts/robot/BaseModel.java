package ru.javabegin.training.spring.abstracts.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;
import ru.javabegin.training.spring.interfaces.Robot;

public abstract class BaseModel implements Robot {

	@Autowired
        //@Autowired (required = "false") автосвязываение, аналог autowire="" из xml
	@Qualifier("sonyHand")  // позволяет делать связывание по имени
	private Hand hand;

	@Autowired
	@Qualifier("sonyLeg")
	private Leg leg;

	@Autowired
	@Qualifier("sonyGoldenHead") /* можно указать индетификатор <qualifier value="sonyGoldenHead"> в
        sony_context.xml в случае, если есть несколько похожих бинов. В этом случае можо даже опустить
        id="" в xml        */
	private Head head;
        
        /* за счёт аннотиций @Autowired @Qualifier можно опустить конструктор
        BaseModel(Hand hand, Leg leg, Head head)
        т.к. заполняется через spring и xml
        */

	public BaseModel() {
		System.out.println(this + " - BaseModel constructor()");
	}

	// public BaseModel(Hand hand, Leg leg, Head head) {
	// this();
	// this.hand = hand;
	// this.leg = leg;
	// this.head = head;
	// }

	public Hand getHand() {
		return hand;
	}

        //@Required - объязательное заполнение
	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

}
