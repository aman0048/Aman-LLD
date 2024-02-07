package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private final List<OrderPlacedSubscriber> subscriberList;

    public Amazon(){
        this.subscriberList = new ArrayList<>();
    }

    public void orderPlaced(){
        /// order place business logic
        for(OrderPlacedSubscriber o : subscriberList){
            o.orderPlacedEvent();
        }
    }
    public void addSubscriberOrderPlaced(OrderPlacedSubscriber orderPlacedSubscriber){
        subscriberList.add(orderPlacedSubscriber);
    }

    public void removeSubscriberOrderPlaced(OrderPlacedSubscriber orderPlacedSubscriber){
        subscriberList.remove(orderPlacedSubscriber);
    }
}
