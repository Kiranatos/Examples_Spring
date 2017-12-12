package ru.javabegin.training.spring.impls.pool;

import java.util.Collection;
import java.util.Map;

import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.RobotPool;

public class T1000Pool implements RobotPool {

	private Collection<Robot> robotCollection;
        private Map<String, Robot> robotMapCollection;
        
        //Constructor:
        public T1000Pool() {}
        
        public T1000Pool(Map<String, Robot> robotMapCollection) {
		super();
		this.robotMapCollection = robotMapCollection;
	}

        //Setters and Getters:
	public void setRobotCollection(Collection<Robot> robotCollection) {
		this.robotCollection = robotCollection;
	}

	@Override
	public Collection<Robot> getRobotCollection() {
		return robotCollection;
	}
        
        @Override
	public Map<String, Robot> getRobotMapCollection() {
		return robotMapCollection;
	}

	
        // Other methods
	public void action() {
            if (robotMapCollection==null) {
                for (Robot robot : robotCollection) {
                    robot.action();
                }
            } else {
                for (Map.Entry<String, Robot> entry : robotMapCollection.entrySet()) {
                    System.out.println(entry.getKey());
                    entry.getValue().action();
                }
            }
	}
}
