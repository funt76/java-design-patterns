package com.iluwatar.business.delegate;

/**
 * 
 * The Business Delegate pattern adds an abstraction layer between presentation and business tiers.
 * By using the pattern we gain loose coupling between the tiers. The Business Delegate encapsulates
 * knowledge about how to locate, connect to, and interact with the business objects that make up
 * the application.
 * 
 * Some of the services the Business Delegate uses are instantiated directly, and some can be retrieved
 * through service lookups. The Business Delegate itself may contain business logic too potentially tying
 * together multiple service calls, exception handling, retrying etc.
 * 
 * In this example the client (Client) utilizes a business delegate (BusinessDelegate) to execute a task.
 * The Business Delegate then selects the appropriate service and makes the service call.
 *
 */
public class App {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType(EServiceType.EJB);

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType(EServiceType.JMS);
        client.doTask();
    }
}
