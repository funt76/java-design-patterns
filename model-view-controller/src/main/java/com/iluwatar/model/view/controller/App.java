package com.iluwatar.model.view.controller;

import com.iluwatar.model.view.controller.enums.EFatigue;
import com.iluwatar.model.view.controller.enums.EHealth;
import com.iluwatar.model.view.controller.enums.ENourishment;

/**
 * 
 * Model-View-Controller is a pattern for implementing user interfaces. It divides the application
 * into three interconnected parts namely the model, the view and the controller.
 * 
 * The central component of MVC, the model, captures the behavior of the application in terms of its problem 
 * domain, independent of the user interface. The model directly manages the data, logic and rules of the 
 * application. A view can be any output representation of information, such as a chart or a diagram
 * The third part, the controller, accepts input and converts it to commands for the model or view.
 * 
 * In this example we have a giant (GiantModel) with statuses for health, fatigue and nourishment. GiantView
 * can display the giant with its current status. GiantController receives input affecting the model and
 * delegates redrawing the giant to the view.
 *
 */
public class App {
	
    public static void main( String[] args ) {
    	// create model, view and controller
    	GiantModel model = new GiantModel(EHealth.HEALTHY, EFatigue.ALERT, ENourishment.SATURATED);
    	GiantView view = new GiantView();
    	GiantController controller = new GiantController(model, view);
    	// initial display
    	controller.updateView();
    	// controller receives some interactions that affect the giant
    	controller.setHealth(EHealth.WOUNDED);
    	controller.setNourishment(ENourishment.HUNGRY);
    	controller.setFatigue(EFatigue.TIRED);
    	// redisplay
    	controller.updateView();
    }
}
